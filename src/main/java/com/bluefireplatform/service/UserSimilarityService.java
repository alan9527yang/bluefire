package com.bluefireplatform.service;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;

public interface UserSimilarityService {
    public Object userSimilarity(JSONObject queryString , HttpServletRequest req) throws Exception;
}
