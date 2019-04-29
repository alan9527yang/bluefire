/*    */ package com.bluefireplatform.controller;

import com.alibaba.fastjson.JSONObject;
import com.bluefireplatform.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/*    */ @CrossOrigin
/*    */ @Controller
         @RequestMapping("/Integererface/pretreatment")
/*    */ public class PretreatOutdoorController
/*    */ {
/*    */   @Autowired
/*    */   private OutTrajectoryService outTrajectoryService;
            @Autowired
            private OutdoorTrajectoryForecastService outdoorTrajectoryForecastService;
            @Autowired
            private HeatMapService heatMapService;
            @Autowired
            private UserSimilarityService userSimilarityService;
            @Autowired
            private EmpiricalandIntegererestService empiricalandIntegererestService;

           @ResponseBody
           @RequestMapping({"/queryTrajectoryForecastResult.action"})
           public Object queryTrajectoryForecastResult() throws Exception {
            Map map = new HashMap();
            map.put("result_id", Integer.valueOf(1));
            JSONObject queryString = new JSONObject(map);
            return this.outdoorTrajectoryForecastService.queryForecastResult(queryString);

            }
    /*    */   @ResponseBody
    /*    */   @RequestMapping({"/correctOutdoorTrajectory"})
    /*    */   public Object outdoorMapMatching(JSONObject queryString, HttpServletRequest req) throws Exception {
        /* 37 */     return this.outTrajectoryService.outdoorMapMatching(queryString, req);
        /*    */   }
    /*    */   @ResponseBody
    /*    */   @RequestMapping({"/heatMap.action"})
    /*    */   public Object heatMap() throws Exception {
                      Map map= new HashMap();
                      map.put("startDate","2008-07-04");
                        map.put("endDate","2009-09-04");
                        JSONObject queryString = new JSONObject(map);
        /* 37 */     return this.heatMapService.queryAllOutdoorTrajectoryDetails(queryString);
        /*    */   }
                @ResponseBody
    /*    */   @RequestMapping({"/userSimilarity.action"})
    /*    */   public Object userSimilarity(HttpServletRequest req) throws Exception {
                        Map map= new HashMap();
                        map.put("userAID","0");
                        map.put("userBID","1");
                        JSONObject queryString = new JSONObject(map);
        /* 37 */     return this.userSimilarityService.userSimilarity(queryString ,req);
        /*    */   }
                @ResponseBody
    /*    */   @RequestMapping({"/interest"})
    /*    */   public Object EmpiricalandIntegererestTest(HttpServletRequest req) throws Exception {


        /* 37 */     return this.empiricalandIntegererestService.getAllEmpiricalandIntegererestService(req);
        /*    */   }
}


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\controller\OutdoorController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */