/*    */ package com.bluefireplatform.controller;
/*    */ 
/*    */ import com.alibaba.fastjson.JSONObject;
/*    */ import com.bluefireplatform.service.OutTrajectoryService;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.ResponseBody;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Controller
/*    */ public class OutdoorController
/*    */ {
/*    */   @Autowired
/*    */   private OutTrajectoryService outTrajectoryService;
/*    */   
/*    */   @ResponseBody
/*    */   @RequestMapping({"/queryOutUser.action"})
/*    */   public Object queryOutUser()
/*    */   {
/* 25 */     return this.outTrajectoryService.queryAllOutUser();
/*    */   }
/*    */   
/*    */   @ResponseBody
/*    */   @RequestMapping({"/queryOutdoorTrajectoryByUserId.action"})
/*    */   public Object queryOutdoorTrajectoryByUserId() {
/* 31 */     Map map = new HashMap();
/* 32 */     map.put("out_user_id", Integer.valueOf(1));
/* 33 */     JSONObject queryString = new JSONObject(map);
/* 34 */     return this.outTrajectoryService.queryTrajectoryByOutUserId(queryString);
/*    */   }
/*    */   
/*    */   @ResponseBody
/*    */   @RequestMapping({"/queryTrajectoryByOutTrajectoryId.action"})
/* 39 */   public Object queryOutdoorTrajectoryByTrajectoryId() throws Exception { Map map = new HashMap();
/* 40 */     map.put("out_trajectory_id", Integer.valueOf(1));
/* 41 */     JSONObject queryString = new JSONObject(map);
/* 42 */     return this.outTrajectoryService.queryTrajectoryByOutTrajectoryId(queryString);
/*    */   }
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\controller\OutdoorController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */