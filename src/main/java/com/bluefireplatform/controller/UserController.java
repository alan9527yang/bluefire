/*    */ package com.bluefireplatform.controller;
/*    */ 
/*    */ import com.alibaba.fastjson.JSONObject;
/*    */ import com.bluefireplatform.service.TrajectoryInfoManangeService;
/*    */ import com.bluefireplatform.service.UserService;
/*    */ import java.io.PrintStream;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.ResponseBody;
/*    */ 
/*    */ @org.springframework.stereotype.Controller
/*    */ public class UserController
/*    */ {
/*    */   @Autowired
/*    */   private UserService userService;
/*    */   @Autowired
/*    */   private TrajectoryInfoManangeService trajectoryService;
/*    */   
/*    */   @ResponseBody
/*    */   @RequestMapping({"/query_user.action"})
/*    */   public Object queryUser(@org.springframework.web.bind.annotation.RequestBody String username)
/*    */   {
/* 23 */     System.out.println(username);
/* 24 */     String user_name = username;
/* 25 */     System.out.println(user_name);
/* 26 */     JSONObject bodyJson = JSONObject.parseObject(user_name);
/*    */     
/* 28 */     return this.userService.queryUser(bodyJson);
/*    */   }
/*    */   
/*    */   @ResponseBody
/*    */   @RequestMapping({"/query_t.action"})
/*    */   public Object queryT(@org.springframework.web.bind.annotation.RequestBody String username) throws Exception {
/* 34 */     System.out.println(username);
/* 35 */     String user_name = username;
/* 36 */     System.out.println(user_name);
/* 37 */     JSONObject bodyJson = JSONObject.parseObject(user_name);
/*    */     
/* 39 */     return this.trajectoryService.queryTrajectoryByTrajectoryId(bodyJson);
/*    */   }
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\controller\UserController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */