package com.bluefireplatform.service;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public interface OutdoorRealTimeService {
    Object OutdoorRealTimeLocationUpload(JSONObject queryString , HttpServletRequest request) throws Exception;
    Object OutdoorRealTimeLocationDownload();
}
