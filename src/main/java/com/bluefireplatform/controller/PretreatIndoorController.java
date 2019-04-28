/*    */ package com.bluefireplatform.controller;
/*    */ 
/*    */

import com.alibaba.fastjson.JSONObject;
import com.bluefireplatform.service.MapService;
import com.bluefireplatform.service.TrajectoryInfoManangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


         @CrossOrigin
/*    */ @Controller("/Integererface/pretreatment")
/*    */ public class PretreatIndoorController
/*    */ {
/*    */   @Autowired
/*    */   private TrajectoryInfoManangeService trajectoryInfoManangeService;
           @Autowired
           private MapService mapService;

/*    */   @ResponseBody
/*    */   @RequestMapping({"/correctIndoorTrajectory"})
/*    */   public Object mapMatching(@RequestBody JSONObject queryString, HttpServletRequest req) throws Exception {
/* 37 */     return this.trajectoryInfoManangeService.indoorMapMatching(queryString, req);
/*    */   }
           @ResponseBody
/*    */   @RequestMapping({"/compressIntdoorTrajectory"})
/*    */   public Object compression(@RequestBody JSONObject queryString ,HttpServletRequest req) throws Exception {

/* 37 */     return this.trajectoryInfoManangeService.indoorCompression(queryString, req);
  }
}
