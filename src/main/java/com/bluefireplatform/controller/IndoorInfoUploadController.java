/*    */ package com.bluefireplatform.controller;
/*    */ 
/*    */ import com.alibaba.fastjson.JSONObject;
/*    */ import com.bluefireplatform.service.TrajectoryInfoManangeService;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.ResponseBody;
/*    */ import org.springframework.web.multipart.MultipartFile;
            @CrossOrigin
/*    */ @Controller
/*    */ public class IndoorInfoUploadController
/*    */ {
/*    */   @Autowired
/*    */   private TrajectoryInfoManangeService trajectoryInfoManangeService;
/*    */   
/*    */   @RequestMapping({"/upload.action"})
/*    */   public Object Upload(MultipartFile jsonFile, HttpServletRequest req)
/*    */     throws Exception
/*    */   {
/* 27 */     this.trajectoryInfoManangeService.addIndoorTrajectory(jsonFile, req);
/* 28 */     return "test/test.jsp";
/*    */   }
/*    */   
/*    */   @ResponseBody
/*    */   @RequestMapping({"/mapmatching.action"})
/*    */   public Object mapMatching(MultipartFile jsonFile, HttpServletRequest req) throws Exception {
/* 34 */     Map map = new HashMap();
/* 35 */     map.put("trajectory_id", Integer.valueOf(6));
/* 36 */     JSONObject queryString = new JSONObject(map);
/* 37 */     return this.trajectoryInfoManangeService.indoorMapMatching(queryString, req);
/*    */   }
                @ResponseBody
    /*    */   @RequestMapping({"/compression.action"})
    /*    */   public Object compression(HttpServletRequest req) throws Exception {
        /* 34 */     Map map = new HashMap();
        /* 35 */     map.put("trajectory_id", Integer.valueOf(5));
        /* 36 */     JSONObject queryString = new JSONObject(map);
        /* 37 */     return this.trajectoryInfoManangeService.indoorCompression(queryString, req);
           }
}


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\controller\IndoorInfoUploadController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */