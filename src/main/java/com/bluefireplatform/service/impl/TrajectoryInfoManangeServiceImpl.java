/*     */ package com.bluefireplatform.service.impl;
/*     */ 
/*     */ import com.alibaba.fastjson.JSONObject;
/*     */ import com.bluefireplatform.component.ReturnHelper;
/*     */ import com.bluefireplatform.entity.*;
/*     */
/*     */
/*     */ import com.bluefireplatform.entity.IndoorMiddleTabExample.Criteria;
/*     */
/*     */
/*     */
/*     */ import com.bluefireplatform.mapper.IndoorCompressionMapper;
/*     */ import com.bluefireplatform.mapper.IndoorMapmatchingMapper;
/*     */ import com.bluefireplatform.mapper.IndoorMiddleTabMapper;
/*     */ import com.bluefireplatform.mapper.TrajectoryMapper;
/*     */ import com.bluefireplatform.mapper.UserMapper;
/*     */ import com.bluefireplatform.service.TrajectoryInfoManangeService;
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
/*     */ import org.springframework.web.multipart.MultipartFile;


/*     */ @Service
/*     */ public class TrajectoryInfoManangeServiceImpl implements TrajectoryInfoManangeService
/*     */ {
/*     */   @Autowired
/*     */   private TrajectoryMapper trajectoryMapper;
/*     */   @Autowired
/*     */   private IndoorMiddleTabMapper indoorMiddleTabMapper;
/*     */   @Autowired
/*     */   private IndoorMapmatchingMapper indoorMapmatchingMapper;
/*     */   @Autowired
/*     */   private IndoorCompressionMapper indoorCompressionMapper;
/*     */   @Autowired
/*     */   private UserMapper userMapper;
/*     */   @Autowired
/*     */   private ReturnHelper returnHelper;
/*     */   
/*     */   public Object addIndoorTrajectory(MultipartFile jsonFile, HttpServletRequest req)
/*     */     throws Exception
/*     */   {
/*  69 */     String path = req.getServletContext().getRealPath("/indoorInfo");
/*     */     
/*  71 */     File file = new File(path, jsonFile.getOriginalFilename());
/*  72 */     jsonFile.transferTo(file);
/*     */     
/*     */ 
/*  75 */     ObjectMapper mapper = new ObjectMapper();
/*  76 */     Map<String, Object> value = (Map)mapper.readValue(file, Map.class);
/*  77 */     List data = (ArrayList)value.get("data");
/*  78 */     Long startTime = (Long)((HashMap)data.get(0)).get("timeStamp");
/*  79 */     Long endTime = (Long)((HashMap)data.get(data.size() - 1)).get("timeStamp");
/*  80 */     int userId = Integer.parseInt((String)value.get("userId"));
/*  81 */     int mapId = Integer.parseInt((String)value.get("mapId"));
/*  82 */     String trajectorySrc = file.getAbsolutePath();
/*     */     
/*     */ 
/*  85 */     Trajectory trajectory = new Trajectory();
/*  86 */     trajectory.setUserId(Integer.valueOf(userId));
/*  87 */     trajectory.setMapId(Integer.valueOf(mapId));
/*  88 */     trajectory.setTrajectoryType(Integer.valueOf(0));
/*  89 */     trajectory.setTrajectorySrc(trajectorySrc);
/*  90 */     trajectory.setStartTime(startTime);
/*  91 */     trajectory.setEndTime(endTime);
/*  92 */     this.trajectoryMapper.insertSelective(trajectory);
/*     */     
/*  94 */     return this.returnHelper.returnNau(null, 1000, "服务器正常");
/*     */   }
/*     */
            @Override
/*     */   public Object queryTrajectoryByUserIdAndMapId(JSONObject queryString)
/*     */   {
/*  99 */     Integer userId = queryString.getInteger("userId");
/* 100 */     Integer mapId = queryString.getInteger("mapId");
/*     */
/* 102 */     TrajectoryExample trajectoryExample = new TrajectoryExample();
/* 103 */     TrajectoryExample.Criteria criteria = trajectoryExample.createCriteria();
/* 104 */     if ((userId != null) && (mapId != null)) {
/* 105 */       criteria.andUserIdEqualTo(userId).andMapIdEqualTo(mapId).andTrajectoryTypeEqualTo(Integer.valueOf(0));
/*     */     }
/* 107 */     List<Trajectory> list = this.trajectoryMapper.selectByExample(trajectoryExample);
/* 108 */     Map<String, Object> map = new HashMap();
/* 109 */     map.put("list", list);
/*     */
/* 111 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
/*     */   }
/*     */
/*     */   public Object queryTrajectoryByTrajectoryId(JSONObject queryString)
/*     */     throws Exception
/*     */   {
/* 117 */     Integer trajectoryId = queryString.getInteger("trajectoryId");
/*     */     
/* 119 */     TrajectoryExample trajectoryExample = new TrajectoryExample();
/* 120 */     TrajectoryExample.Criteria criteria = trajectoryExample.createCriteria();
/* 121 */     if (trajectoryId != null) {
/* 122 */       criteria.andTrajectoryIdEqualTo(trajectoryId);
/*     */     }
/* 124 */     List<Trajectory> list = this.trajectoryMapper.selectByExample(trajectoryExample);
/*     */     
/* 126 */     Trajectory trajectory = (Trajectory)list.get(0);
/* 127 */     ObjectMapper mapper = new ObjectMapper();
/* 128 */     Map<String, Object> value = (Map)mapper.readValue(new File(trajectory.getTrajectorySrc()), Map.class);
/* 129 */     List data = (ArrayList)value.get("data");
/*     */     
/* 131 */     Map<String, Object> map = new HashMap();
/* 132 */     map.put("list", data);
/* 133 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
/*     */   }
/*     */   
/*     */ 
/*     */   public Object deleteTrajectoryByUserIdAndMapId(JSONObject queryString)
/*     */   {
/* 139 */     Integer userId = queryString.getInteger("user_id");
/* 140 */     Integer mapId = queryString.getInteger("map_id");
/*     */     
/* 142 */     TrajectoryExample trajectoryExample = new TrajectoryExample();
/* 143 */     TrajectoryExample.Criteria criteria = trajectoryExample.createCriteria();
/* 144 */     if ((userId != null) && (mapId != null)) {
/* 145 */       criteria.andUserIdEqualTo(userId).andMapIdEqualTo(mapId);
/*     */     }
/* 147 */     this.trajectoryMapper.deleteByExample(trajectoryExample);
/*     */     
/* 149 */     return this.returnHelper.returnNau(null, 1000, "服务器正常");
/*     */   }
/*     */   
/*     */ 
/*     */   public Object deleteTrajectoryByTrajectoryId(JSONObject queryString)
/*     */   {
/* 155 */     Integer trajectoryId = queryString.getInteger("trajectory_id");
/* 156 */     this.trajectoryMapper.deleteByPrimaryKey(trajectoryId);
/* 157 */     return this.returnHelper.returnNau(null, 1000, "服务器正常");
/*     */   }
/*     */   
/*     */ 
/*     */   public Object queryUserByMapId(JSONObject queryString)
/*     */   {
/* 163 */     List userIdList = new ArrayList();
/* 164 */     List userList = new ArrayList();
/*     */     
/* 166 */     Integer mapId = queryString.getInteger("mapId");
/* 167 */     TrajectoryExample trajectoryExample = new TrajectoryExample();
/* 168 */     TrajectoryExample.Criteria criteria = trajectoryExample.createCriteria();
/* 169 */     criteria.andMapIdEqualTo(mapId);
/* 170 */     List<Trajectory> trajectoryList = this.trajectoryMapper.selectByExample(trajectoryExample);
/* 171 */     for (Trajectory trajectory : trajectoryList) {
/* 172 */       Integer userId = trajectory.getUserId();
/* 173 */       if (!userIdList.contains(userId)) {
/* 174 */         userIdList.add(userId);
/*     */       }
/*     */     }
/* 177 */     for (Object userId : userIdList) {
/* 178 */       User user = this.userMapper.selectByPrimaryKey((Integer)userId);
/* 179 */       userList.add(user);
/*     */     }
/* 181 */     Map<String, Object> map = new HashMap();
/* 182 */     map.put("list", userList);
/*     */     
/* 184 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
/*     */   }
/*     */   
/*     */   public Object indoorMapMatching(JSONObject queryString, HttpServletRequest req) throws Exception
/*     */   {
/* 189 */     ObjectMapper mapper = new ObjectMapper();
/* 190 */     List data = new ArrayList();

/* 193 */     Integer originalId = queryString.getInteger("trajectoryId");
/* 194 */     IndoorMiddleTabExample example = new IndoorMiddleTabExample();
/* 203 */     IndoorMiddleTabExample.Criteria criteria = example.createCriteria();
/* 204 */     criteria.andOriginalIdEqualTo(originalId).andPresentTypeEqualTo(1);
/* 205 */     List<IndoorMiddleTab> middleList = this.indoorMiddleTabMapper.selectByExample(example);
/* 206 */     JythonUtil jythonUtil;
                if (middleList.isEmpty()) {
/* 207 */       Trajectory trajectory = this.trajectoryMapper.selectByPrimaryKey(originalId);
/* 208 */       jythonUtil = new JythonUtil();
/* 209 */       String originalSrc = trajectory.getTrajectorySrc();
/* 210 */       File file = new File(originalSrc);
/* 211 */       String newName = "mm" + file.getName();
/* 212 */       String presentSrc = req.getServletContext().getRealPath("/indoorInfo") + "/" + newName;
/*     */       
/* 214 */       String result = jythonUtil.mapMatching(originalSrc, presentSrc);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 219 */       if (result.contains("OK")) {
/* 221 */         IndoorMapmatching presentTrajectory = new IndoorMapmatching();
/* 222 */         presentTrajectory.setUserId(trajectory.getUserId());
/* 223 */         presentTrajectory.setMapId(trajectory.getMapId());
/* 224 */         presentTrajectory.setTrajectoryType(Integer.valueOf(1));
/* 225 */         presentTrajectory.setTrajectorySrc(presentSrc);
/* 226 */         presentTrajectory.setStartTime(trajectory.getStartTime());
/* 227 */         presentTrajectory.setEndTime(trajectory.getEndTime());
/* 228 */         int presentId = this.indoorMapmatchingMapper.insert(presentTrajectory);
/*     */         
/* 230 */         IndoorMiddleTab indoorMiddleTab = new IndoorMiddleTab();
/* 231 */         indoorMiddleTab.setOriginalId(originalId);
/* 232 */         indoorMiddleTab.setPresentId(Integer.valueOf(presentId));
/* 233 */         indoorMiddleTab.setPresentType(Integer.valueOf(1));
/* 234 */         this.indoorMiddleTabMapper.insertSelective(indoorMiddleTab);
/*     */         
/*     */ 
/* 237 */         Map<String, Object> value = (Map)mapper.readValue(new File(presentSrc), Map.class);
/* 238 */         data = (ArrayList)value.get("data");
/*     */       }
/*     */       
/*     */     }
/*     */     else
/*     */     {
/* 244 */       for (IndoorMiddleTab middle : middleList) {
/* 245 */         if (middle.getPresentType().intValue() == 1)
/*     */         {
/* 247 */           int presentId = middle.getPresentId().intValue();
/*     */           
/* 249 */           IndoorMapmatching presentTrajectory = this.indoorMapmatchingMapper.selectByPrimaryKey(Integer.valueOf(presentId));
/*     */           
/*     */ 
/* 252 */           File newfile = new File(presentTrajectory.getTrajectorySrc());
/*     */           
/* 254 */           Map<String, Object> value = (Map)mapper.readValue(newfile, Map.class);
/*     */           
/* 256 */           data = (ArrayList)value.get("data");
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 262 */     Map<String, Object> map = new HashMap();
/* 263 */     map.put("list", data);
/*     */     
/* 265 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
/*     */   }

    @Override
    public Object indoorCompression(JSONObject queryString ,HttpServletRequest req) throws Exception{

                      ObjectMapper mapper = new ObjectMapper();
        /* 190 */     List data = new ArrayList();
        /* 193 */     Integer originalId = queryString.getInteger("trajectoryId");
        /* 194 */     IndoorMiddleTabExample example = new IndoorMiddleTabExample();
        /* 203 */     IndoorMiddleTabExample.Criteria criteria = example.createCriteria();
        /* 204 */     criteria.andOriginalIdEqualTo(originalId).andPresentTypeEqualTo(2);
        /* 205 */     List<IndoorMiddleTab> middleList = this.indoorMiddleTabMapper.selectByExample(example);
        /* 206 */     JythonUtil jythonUtil;
                        if (middleList.isEmpty()) {
            /* 207 */       Trajectory trajectory = this.trajectoryMapper.selectByPrimaryKey(originalId);
            /* 208 */       jythonUtil = new JythonUtil();
            /* 209 */       String originalSrc = trajectory.getTrajectorySrc();
            /* 210 */       File file = new File(originalSrc);
            /* 211 */       String newName = "dp" + file.getName();
            /* 212 */       String presentSrc = req.getServletContext().getRealPath("/indoorInfo") + "/" + newName;

            /* 214 */       String result = jythonUtil.compression(originalSrc, presentSrc);

            /* 219 */       if (result.contains("OK")) {
                /* 221 */         IndoorCompression presentTrajectory = new IndoorCompression();
                /* 222 */         presentTrajectory.setUserId(trajectory.getUserId());
                /* 223 */         presentTrajectory.setMapId(trajectory.getMapId());
                /* 224 */         presentTrajectory.setTrajectoryType(Integer.valueOf(2));
                /* 225 */         presentTrajectory.setTrajectorySrc(presentSrc);
                /* 226 */         presentTrajectory.setStartTime(trajectory.getStartTime());
                /* 227 */         presentTrajectory.setEndTime(trajectory.getEndTime());
                /* 228 */         int presentId = this.indoorCompressionMapper.insert(presentTrajectory);
                /*     */
                /* 230 */         IndoorMiddleTab indoorMiddleTab = new IndoorMiddleTab();
                /* 231 */         indoorMiddleTab.setOriginalId(originalId);
                /* 232 */         indoorMiddleTab.setPresentId(Integer.valueOf(presentId));
                /* 233 */         indoorMiddleTab.setPresentType(Integer.valueOf(2));
                /* 234 */         this.indoorMiddleTabMapper.insertSelective(indoorMiddleTab);

                /* 237 */         Map<String, Object> value = (Map)mapper.readValue(new File(presentSrc), Map.class);
                /* 238 */         data = (ArrayList)value.get("data");
                /*     */       }
            /*     */
            /*     */     }
        /*     */     else
            /*     */     {
            /* 244 */       for (IndoorMiddleTab middle : middleList) {
                /* 245 */         if (middle.getPresentType().intValue() == 2)
                    /*     */         {
                    /* 247 */           int presentId = middle.getPresentId().intValue();
                    /*     */
                    /* 249 */           IndoorMapmatching presentTrajectory = this.indoorMapmatchingMapper.selectByPrimaryKey(Integer.valueOf(presentId));
                    /*     */
                    /*     */
                    /* 252 */           File newfile = new File(presentTrajectory.getTrajectorySrc());
                    /*     */
                    /* 254 */           Map<String, Object> value = (Map)mapper.readValue(newfile, Map.class);
                    /*     */
                    /* 256 */           data = (ArrayList)value.get("data");
                    /*     */         }
                /*     */       }
            /*     */     }
        /*     */
        /*     */
        /* 262 */     Map<String, Object> map = new HashMap();
        /* 263 */     map.put("list", data);
        /*     */
        /* 265 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
    }
    /*     */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\service\impl\TrajectoryInfoManangeServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */