package com.bluefireplatform.service;


import com.alibaba.fastjson.JSONObject;

public interface HeatMapService {

    public Object queryAllOutdoorTrajectoryDetails(JSONObject queryString) throws Exception;
}
