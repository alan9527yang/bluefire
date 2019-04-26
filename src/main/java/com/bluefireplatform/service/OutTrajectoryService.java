package com.bluefireplatform.service;

import com.alibaba.fastjson.JSONObject;
import com.bluefireplatform.entity.OutTrajectory;


import javax.servlet.http.HttpServletRequest;

public interface OutTrajectoryService
{
  Object insertTrajectory(OutTrajectory paramOutTrajectory);
  
  Object queryTrajectoryByOutUserId(JSONObject paramJSONObject);
  
  Object queryTrajectoryByOutTrajectoryId(JSONObject paramJSONObject)
    throws Exception;
  
  Object deleteTrajectoryByOutUserId(JSONObject paramJSONObject);
  
  Object deleteTrajectoryByOutTrajectoryId(JSONObject paramJSONObject);
  
  Object queryAllOutUser();
  
  Object outdoorMapMatching(JSONObject paramJSONObject, HttpServletRequest paramHttpServletRequest)
    throws Exception;
}


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\service\OutTrajectoryService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */