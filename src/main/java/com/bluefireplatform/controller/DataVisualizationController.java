package com.bluefireplatform.controller;
import com.alibaba.fastjson.JSONObject;
import com.bluefireplatform.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/*    */ @CrossOrigin
/*    */ @Controller("/Integererface/dataVisualization")
/*    */ public class DataVisualizationController
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


    /*    */   @ResponseBody
    /*    */   @RequestMapping({"/getAllOutdoorTrajectoryDetails"})
    /*    */   public Object heatMap(@RequestBody JSONObject queryString) throws Exception {
        /* 37 */     return this.heatMapService.queryAllOutdoorTrajectoryDetails(queryString);
        /*    */   }
}


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\controller\OutdoorController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */