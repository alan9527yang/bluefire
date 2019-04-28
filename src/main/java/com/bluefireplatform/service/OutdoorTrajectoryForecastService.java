package com.bluefireplatform.service;

import com.alibaba.fastjson.JSONObject;

import java.io.IOException;

public interface OutdoorTrajectoryForecastService {
    public Object queryForecastResult(JSONObject queryString) throws IOException, Exception;
}
