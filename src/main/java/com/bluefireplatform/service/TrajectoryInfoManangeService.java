package com.bluefireplatform.service;

import com.alibaba.fastjson.JSONObject;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;

public interface TrajectoryInfoManangeService
{
  Object addIndoorTrajectory(MultipartFile paramMultipartFile, HttpServletRequest paramHttpServletRequest)
    throws Exception;
  
  Object queryTrajectoryByUserIdAndMapId(JSONObject paramJSONObject);
  
  Object queryTrajectoryByTrajectoryId(JSONObject paramJSONObject)
    throws Exception;
  
  Object deleteTrajectoryByUserIdAndMapId(JSONObject paramJSONObject);
  
  Object deleteTrajectoryByTrajectoryId(JSONObject paramJSONObject);
  
  Object queryUserByMapId(JSONObject paramJSONObject);
  
  Object indoorMapMatching(JSONObject paramJSONObject, HttpServletRequest paramHttpServletRequest)
    throws Exception;
}


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\service\TrajectoryInfoManangeService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */