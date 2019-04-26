package com.bluefireplatform.service;

import com.alibaba.fastjson.JSONObject;

import java.io.IOException;

public interface OutdoorTrajectoryForecast {
    public Object queryForecastResult(JSONObject queryString) throws IOException, Exception;
}
