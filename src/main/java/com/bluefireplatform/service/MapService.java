package com.bluefireplatform.service;

import com.alibaba.fastjson.JSONObject;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;

public interface MapService
{
    Object queryAllMap();

    Object addMap(MultipartFile paramMultipartFile, HttpServletRequest paramHttpServletRequest, JSONObject paramJSONObject) throws Exception;

    Object updateMap(JSONObject paramJSONObject);

    Object deleteMap(JSONObject paramJSONObject);
}


