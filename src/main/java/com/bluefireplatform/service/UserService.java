package com.bluefireplatform.service;

import com.alibaba.fastjson.JSONObject;

public interface UserService
{
  Object queryUser(JSONObject paramJSONObject);
  
  Object addUser(JSONObject paramJSONObject);
  
  Object updateUser(JSONObject paramJSONObject);
  
  Object deleteUser(JSONObject paramJSONObject);
}


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\service\UserService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */