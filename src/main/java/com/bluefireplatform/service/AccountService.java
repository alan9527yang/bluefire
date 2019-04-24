package com.bluefireplatform.service;

import com.alibaba.fastjson.JSONObject;

public interface AccountService
{
  Object login(JSONObject paramJSONObject);
  
  Object register(JSONObject paramJSONObject);
  
  Object addAccount(JSONObject paramJSONObject);
  
  Object deleteAccount(JSONObject paramJSONObject);
  
  Object updateAccount(JSONObject paramJSONObject);
  
  Object queryAccount(JSONObject paramJSONObject);
}


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\service\AccountService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */