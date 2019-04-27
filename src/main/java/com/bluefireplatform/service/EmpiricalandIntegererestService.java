package com.bluefireplatform.service;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;

public interface EmpiricalandIntegererestService {
    public Object getEmpiricalandIntegererestService(JSONObject queryString, HttpServletRequest req) throws Exception;
    public Object getAllEmpiricalandIntegererestService(HttpServletRequest req) throws Exception;
}
