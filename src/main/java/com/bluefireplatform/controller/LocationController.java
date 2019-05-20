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


@CrossOrigin
@Controller
@RequestMapping("/Integererface/location")
public class LocationController {
    @Autowired
    private OutdoorRealTimeService outdoorRealTimeService;
    @Autowired
    private IndoorRealTimeService indoorRealTimeService;

    @ResponseBody
    @RequestMapping("/getIndoorLocations")
    public Object getIndoorLocations(@RequestBody  JSONObject queryString) {
        return indoorRealTimeService.IndoorRealTimeLocationDownload(queryString);
    }

    @ResponseBody
    @RequestMapping({"/getOutdoorLocations"})
    public Object getOutdoorLocations() {

        return this.outdoorRealTimeService.OutdoorRealTimeLocationDownload();
    }

    @ResponseBody
    @RequestMapping({"/addIndoorLocation"})
    public Object addIndoorLocation(@RequestBody JSONObject queryString){
        return this.indoorRealTimeService.IndoorRealTimeLocationUpload(queryString);
    }

    @ResponseBody
    @RequestMapping({"/addOutdoorLocation"})
    public Object addOutdoorLocation(@RequestBody JSONObject queryString,HttpServletRequest req) throws Exception {

        return this.outdoorRealTimeService.OutdoorRealTimeLocationUpload(queryString,req);

    }
}


