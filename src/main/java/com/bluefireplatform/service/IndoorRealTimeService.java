package com.bluefireplatform.service;

import com.alibaba.fastjson.JSONObject;

public interface IndoorRealTimeService {
    Object IndoorRealTimeLocationUpload(JSONObject queryString);
    Object IndoorRealTimeLocationDownload(JSONObject queryString);
}
