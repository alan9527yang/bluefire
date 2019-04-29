/*     */ package com.bluefireplatform.service.impl;
/*     */
/*     */ import com.alibaba.fastjson.JSONObject;
/*     */ import com.bluefireplatform.component.ReturnHelper;
/*     */ import com.bluefireplatform.entity.*;
/*     */
/*     */
/*     */
/*     */
/*     */ import com.bluefireplatform.mapper.*;
/*     */
/*     */
/*     */
/*     */ import com.bluefireplatform.service.OutTrajectoryService;
/*     */ import com.bluefireplatform.util.JythonUtil;
/*     */ import com.fasterxml.jackson.databind.ObjectMapper;
/*     */ import java.io.File;
/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.servlet.ServletContext;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Service;
/*     */
/*     */
/*     */ @Service
/*     */ public class OutTrajectoryServiceImpl
        /*     */   implements OutTrajectoryService
        /*     */ {
    /*     */   @Autowired
    /*     */   private OutTrajectoryMapper outTrajectoryMapper;
    /*     */   @Autowired
    /*     */   private ReturnHelper returnHelper;
    /*     */   @Autowired
    /*     */   private OutdoorMiddleTabMapper outdoorMiddleTabMapper;
    /*     */   @Autowired
    /*     */   private OutdoorMapmatchingMapper outdoorMapmatchingMapper;
    /*     */   @Autowired
    /*     */   private OutdoorCompressionMapper outdoorCompressionMapper;
                @Autowired
                private UserMapper userMapper;
    /*     */
    /*     */   public Object insertTrajectory(OutTrajectory outTrajectory)
    /*     */   {
        /*  48 */     this.outTrajectoryMapper.insert(outTrajectory);
        /*     */
        /*  50 */     return this.returnHelper.returnNau(null, 1000, "插入成功");
        /*     */   }
    /*     */
    /*     */
    /*     */   public Object queryTrajectoryByOutUserId(JSONObject queryString)
    /*     */   {
        /*  56 */     Integer outUserId = queryString.getInteger("userId");
        /*     */
        /*  59 */     OutTrajectoryExample example = new OutTrajectoryExample();
        /*  60 */     OutTrajectoryExample.Criteria criteria = example.createCriteria();
        /*  61 */     if (outUserId != null) {
            /*  62 */       criteria.andUserIdEqualTo(outUserId);
            /*     */     }
        /*  64 */     List<OutTrajectory> list = this.outTrajectoryMapper.selectByExample(example);
        /*  65 */     Map<String, Object> map = new HashMap();
        /*  66 */     map.put("list", list);
        /*     */
        /*  68 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
        /*     */   }
    /*     */
    /*     */   public Object queryTrajectoryByOutTrajectoryId(JSONObject queryString)
    /*     */     throws Exception
    /*     */   {
        /*  74 */     Integer outTrajectoryId = queryString.getInteger("trajectoryId");
        /*     */
        /*     */
        /*  77 */     OutTrajectoryExample example = new OutTrajectoryExample();
        /*  78 */     OutTrajectoryExample.Criteria criteria = example.createCriteria();
        /*  79 */     if (outTrajectoryId != null) {
            /*  80 */       criteria.andTrajectoryIdEqualTo(outTrajectoryId);
            /*     */     }
        /*  82 */     List<OutTrajectory> list = this.outTrajectoryMapper.selectByExample(example);
        /*     */
        /*  84 */     OutTrajectory trajectory = (OutTrajectory)list.get(0);
        /*  85 */     ObjectMapper mapper = new ObjectMapper();
        /*  86 */     Map<String, Object> value = (Map)mapper.readValue(new File(trajectory.getTrajectorySrc()), Map.class);
        /*  87 */     List data = (ArrayList)value.get("data");
        /*     */
        /*  89 */     Map<String, Object> map = new HashMap();
        /*  90 */     map.put("list", data);
        /*  91 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
        /*     */   }
    /*     */
    /*     */
    /*     */   public Object deleteTrajectoryByOutUserId(JSONObject queryString)
    /*     */   {
        /*  97 */     return null;
        /*     */   }
    /*     */
    /*     */
    /*     */   public Object deleteTrajectoryByOutTrajectoryId(JSONObject queryString)
    /*     */   {
        /* 103 */     return null;
        /*     */   }
    /*     */
    /*     */   public Object queryAllOutUser()
    /*     */   {
        /* 108 */     List<OutTrajectory> trajectories = this.outTrajectoryMapper.selectByExample(null);
        /* 109 */     List<Integer> outUserIdList = new ArrayList();
                      List userList = new ArrayList();
        /* 110 */     for (OutTrajectory outTrajectory : trajectories) {
            /* 111 */       Integer outUserId = outTrajectory.getUserId();
            /* 112 */       if (!outUserIdList.contains(outUserId))
                /* 113 */         outUserIdList.add(outUserId);
            /*     */     }
                        for (Object userId : outUserIdList) {
            /* 178 */       User user = this.userMapper.selectByPrimaryKey((Integer)userId);
            /* 179 */       userList.add(user);
            /*     */     }
        /* 115 */     Map map = new HashMap();
        /* 116 */     map.put("list", userList);
        /* 117 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
        /*     */   }




    ///*     */   室外地图匹配
    /*     */   public Object outdoorMapMatching(JSONObject queryString, HttpServletRequest req)
    /*     */     throws Exception
    /*     */   {
//             json解析工具
        /* 123 */     ObjectMapper mapper = new ObjectMapper();
//                data用来存储解析后的轨迹数据
        /* 124 */     List data = new ArrayList();
        /*     */
///*     */     获得室外轨迹轨迹id
        /* 127 */     Integer originalId = queryString.getInteger("trajectoryId");
//                获得地图匹配算法类型:
        Integer presentType = queryString.getInteger("trajectoryType");

//                建立室外轨迹中间表的查询载体
        /* 128 */     OutdoorMiddleTabExample example = new OutdoorMiddleTabExample();
        /* 137 */     OutdoorMiddleTabExample.Criteria criteria = example.createCriteria();

//                设置查询条件：从前台拿到的轨迹id和中间表的原始轨迹id进行比对，同时比对地图匹配类型，查询是否该轨迹被地图匹配过，如果有地图匹配过，中间表会有记录
        /* 138 */     criteria.andOriginalIdEqualTo(originalId).andPresentTypeEqualTo(presentType);
//                进行查询，获得查询结果，用middleList进行存储
        /* 139 */     List<OutdoorMiddleTab> middleList = this.outdoorMiddleTabMapper.selectByExample(example);
//                创建Java与Python通信的实体类
        /* 140 */     JythonUtil jythonUtil;
//                如果查询结果为空，说明地图没有被地图匹配过
        if (middleList.isEmpty()) {
//                    那么就查询原始轨迹的id，返回查询结果到outTrajectory
            /* 141 */       OutTrajectory outTrajectory = this.outTrajectoryMapper.selectByPrimaryKey(originalId);
//                实例化jythonUtil
            /* 142 */       jythonUtil = new JythonUtil();
//                获得该轨迹的原始地址
            /* 143 */       String originalSrc = outTrajectory.getTrajectorySrc();
//                根据该地址创建File实体类，也就是说现在的file可以获得该轨迹数据文件的一些信息
            /* 144 */       File file = new File(originalSrc);
//                通过getName获得原始轨迹数据的文件名字，加上mm作为新的文件名（地图匹配后的文件名）
            /* 145 */       String newName = "mm" + file.getName();
//                获得服务器地址，加上该服务器地址下的outdoorinfo文件夹，再加上新的文件名，就形成新的文件地址了，也就是说地图匹配后的文件存储到这个地址下
            /* 146 */       String presentSrc = req.getServletContext().getRealPath("/outdoorInfo") + "/" + newName;
            /*     */
//                    调用地图匹配算法，进行地图匹配，并返回地图匹配的处理结果
            /* 148 */       String result = jythonUtil.outdoorMapMatching(originalSrc, presentSrc, presentType);
            /*     */
            /*     */
            /*     */
///*     */       地图匹配算法完成后,会向控制台传一个"OK"字符串，如果结果中包含这个字符串，说明算法运行成功
                   if (result.contains("OK")) {
//          创建地图匹配后的轨迹实例，用来做数据库的插入操作
                        OutdoorMapmatching presentTrajectory = new OutdoorMapmatching();
//                    设置新实例的用户id
                        presentTrajectory.setUserId(outTrajectory.getUserId());
                        presentTrajectory.setStartTime(outTrajectory.getStartTime());
                        presentTrajectory.setEndTime(outTrajectory.getEndTime());
//                    设置地图匹配算法的类型：1，2，3分别代表地图匹配算法1，2，3
                        presentTrajectory.setTrajectoryType(presentType);
//                    设置新的文件地址
                        presentTrajectory.setTrajectorySrc(presentSrc);
//                    在outdoor_mapmatching表中插入这个新实例，就可以对表进行更新了，同时返回新记录的id
                      int presentId = this.outdoorMapmatchingMapper.insert(presentTrajectory);
//                    拿到新纪录的id后，创建中间表的实例，更新中间表的记录
                       OutdoorMiddleTab outdoorMiddleTab = new OutdoorMiddleTab();
//                    设置原始轨迹的id
                       outdoorMiddleTab.setOriginalId(originalId);
//                    设置新纪录的id
                        outdoorMiddleTab.setPresentId(Integer.valueOf(presentId));
//                    设置地图匹配算法的类型
                        outdoorMiddleTab.setPresentType(presentType);
//                    插入新实例，更新中间表
                this.outdoorMiddleTabMapper.insertSelective(outdoorMiddleTab);

//            从新地址中读取地图匹配后的轨迹数据的信息
                        Map<String, Object> value = (Map)mapper.readValue(new File(presentSrc), Map.class);
                         data = (ArrayList)value.get("data");
                       }
                 }
//                查询结果不为空，说明中间表存有地图匹配后的记录，直接从中间表中读取地图匹配后的轨迹id，根据这个轨迹id查询outdoor_mapmatching表
            else
                {
                  for (OutdoorMiddleTab middle : middleList) {

//           获得地图匹配后的轨迹id
                          int presentId = middle.getPresentId().intValue();
//           根据轨迹id查询这条轨迹的详细信息
                          OutdoorMapmatching presentTrajectory = this.outdoorMapmatchingMapper.selectByPrimaryKey(Integer.valueOf(presentId));

//           用详细信息中的地址新建file实例，用来读取文件的详细内容
                           File newfile = new File(presentTrajectory.getTrajectorySrc());

//                        读取文件的详细内容，即轨迹详情
                           Map<String, Object> value = (Map)mapper.readValue(newfile, Map.class);
                           data = (ArrayList)value.get("data");

                       }
                 }

//       把轨迹详细信息封装到map里，用来向前台返回
             Map<String, Object> map = new HashMap();
             map.put("list", data);
             return this.returnHelper.returnNau(map, 1000, "服务器正常");
           }
    }

