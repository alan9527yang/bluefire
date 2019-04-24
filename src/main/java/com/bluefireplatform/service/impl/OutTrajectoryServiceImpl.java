/*     */ package com.bluefireplatform.service.impl;
/*     */ 
/*     */ import com.alibaba.fastjson.JSONObject;
/*     */ import com.bluefireplatform.component.ReturnHelper;
/*     */ import com.bluefireplatform.entity.OutTrajectory;
/*     */ import com.bluefireplatform.entity.OutTrajectoryExample;
/*     */ import com.bluefireplatform.entity.OutdoorMapmatching;
/*     */ import com.bluefireplatform.entity.OutdoorMiddleTab;
/*     */ import com.bluefireplatform.entity.OutdoorMiddleTabExample;
/*     */ import com.bluefireplatform.mapper.OutTrajectoryMapper;
/*     */ import com.bluefireplatform.mapper.OutdoorCompressionMapper;
/*     */ import com.bluefireplatform.mapper.OutdoorMapmatchingMapper;
/*     */ import com.bluefireplatform.mapper.OutdoorMiddleTabMapper;
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
/*  56 */     Integer outUserId = queryString.getInteger("out_user_id");
/*  57 */     System.out.println(outUserId);
/*     */     
/*  59 */     OutTrajectoryExample example = new OutTrajectoryExample();
/*  60 */     OutTrajectoryExample.Criteria criteria = example.createCriteria();
/*  61 */     if (outUserId != null) {
/*  62 */       criteria.andOutUserIdEqualTo(outUserId);
/*     */     }
/*  64 */     List<OutTrajectory> list = this.outTrajectoryMapper.selectByExample(example);
/*  65 */     Map<String, Object> map = new HashMap();
/*  66 */     map.put("trajectoryList", list);
/*     */     
/*  68 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
/*     */   }
/*     */   
/*     */   public Object queryTrajectoryByOutTrajectoryId(JSONObject queryString)
/*     */     throws Exception
/*     */   {
/*  74 */     Integer outTrajectoryId = queryString.getInteger("out_trajectory_id");
/*     */     
/*     */ 
/*  77 */     OutTrajectoryExample example = new OutTrajectoryExample();
/*  78 */     OutTrajectoryExample.Criteria criteria = example.createCriteria();
/*  79 */     if (outTrajectoryId != null) {
/*  80 */       criteria.andOutTrajectoryIdEqualTo(outTrajectoryId);
/*     */     }
/*  82 */     List<OutTrajectory> list = this.outTrajectoryMapper.selectByExample(example);
/*     */     
/*  84 */     OutTrajectory trajectory = (OutTrajectory)list.get(0);
/*  85 */     ObjectMapper mapper = new ObjectMapper();
/*  86 */     Map<String, Object> value = (Map)mapper.readValue(new File(trajectory.getOutTrajectorySrc()), Map.class);
/*  87 */     List data = (ArrayList)value.get("data");
/*     */     
/*  89 */     Map<String, Object> map = new HashMap();
/*  90 */     map.put("trajectoryPointList", data);
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
/* 110 */     for (OutTrajectory outTrajectory : trajectories) {
/* 111 */       Integer outUserId = outTrajectory.getOutUserId();
/* 112 */       if (!outUserIdList.contains(outUserId))
/* 113 */         outUserIdList.add(outUserId);
/*     */     }
/* 115 */     Map map = new HashMap();
/* 116 */     map.put("outUserIdList", outUserIdList);
/* 117 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
/*     */   }
/*     */   
/*     */   public Object outdoorMapMatching(JSONObject queryString, HttpServletRequest req)
/*     */     throws Exception
/*     */   {
/* 123 */     ObjectMapper mapper = new ObjectMapper();
/* 124 */     List data = new ArrayList();
/*     */     
/*     */ 
/* 127 */     Integer originalId = queryString.getInteger("out_trajectory_id");
/* 128 */     OutdoorMiddleTabExample example = new OutdoorMiddleTabExample();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */     OutdoorMiddleTabExample.Criteria criteria = example.createCriteria();
/* 138 */     criteria.andOriginalIdEqualTo(originalId);
/* 139 */     List<OutdoorMiddleTab> middleList = this.outdoorMiddleTabMapper.selectByExample(example);
/* 140 */     JythonUtil jythonUtil; if (middleList.isEmpty()) {
/* 141 */       OutTrajectory outTrajectory = this.outTrajectoryMapper.selectByPrimaryKey(originalId);
/* 142 */       jythonUtil = new JythonUtil();
/* 143 */       String originalSrc = outTrajectory.getOutTrajectorySrc();
/* 144 */       File file = new File(originalSrc);
/* 145 */       String newName = "mm" + file.getName();
/* 146 */       String presentSrc = req.getServletContext().getRealPath("/outdoorInfo") + "/" + newName;
/*     */       
/* 148 */       String result = jythonUtil.mapMatching(originalSrc, presentSrc);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 153 */       if (result.contains("OK")) {
/* 154 */         System.out.println("1111111111111111111111111");
/* 155 */         OutdoorMapmatching presentTrajectory = new OutdoorMapmatching();
/* 156 */         presentTrajectory.setOutUserId(outTrajectory.getOutUserId());
/* 157 */         presentTrajectory.setOutTrajectoryType(Integer.valueOf(1));
/* 158 */         presentTrajectory.setOutTrajectorySrc(presentSrc);
/* 159 */         int presentId = this.outdoorMapmatchingMapper.insert(presentTrajectory);
/*     */         
/* 161 */         OutdoorMiddleTab outdoorMiddleTab = new OutdoorMiddleTab();
/* 162 */         outdoorMiddleTab.setOriginalId(originalId);
/* 163 */         outdoorMiddleTab.setPresentId(Integer.valueOf(presentId));
/* 164 */         outdoorMiddleTab.setPresentType(Integer.valueOf(1));
/* 165 */         this.outdoorMiddleTabMapper.insertSelective(outdoorMiddleTab);
/*     */         
/*     */ 
/* 168 */         Map<String, Object> value = (Map)mapper.readValue(new File(presentSrc), Map.class);
/* 169 */         data = (ArrayList)value.get("data");
/*     */       }
/*     */       
/*     */     }
/*     */     else
/*     */     {
/* 175 */       for (OutdoorMiddleTab middle : middleList) {
/* 176 */         if (middle.getPresentType().intValue() == 1)
/*     */         {
/* 178 */           int presentId = middle.getPresentId().intValue();
/*     */           
/* 180 */           OutdoorMapmatching presentTrajectory = this.outdoorMapmatchingMapper.selectByPrimaryKey(Integer.valueOf(presentId));
/*     */           
/*     */ 
/* 183 */           File newfile = new File(presentTrajectory.getOutTrajectorySrc());
/*     */           
/* 185 */           Map<String, Object> value = (Map)mapper.readValue(newfile, Map.class);
/*     */           
/* 187 */           data = (ArrayList)value.get("data");
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 193 */     Map<String, Object> map = new HashMap();
/* 194 */     map.put("trajectoryPointList", data);
/*     */     
/* 196 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
/*     */   }
/*     */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\service\impl\OutTrajectoryServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */