package com.bluefireplatform.service;

import com.alibaba.fastjson.JSONObject;

public interface OutdoorRealTimeService {
    Object OutdoorRealTimeLocationUpload(JSONObject queryString);
    Object OutdoorRealTimeLocationDownload();
}
