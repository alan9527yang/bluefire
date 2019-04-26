package com.bluefireplatform.service;

import com.alibaba.fastjson.JSONObject;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;

public interface TrajectoryInfoManangeService
{
  public Object addIndoorTrajectory(MultipartFile paramMultipartFile, HttpServletRequest paramHttpServletRequest)
    throws Exception;
  
  public Object queryTrajectoryByUserIdAndMapId(JSONObject paramJSONObject);
  
  public Object queryTrajectoryByTrajectoryId(JSONObject paramJSONObject)
    throws Exception;
  
  public Object deleteTrajectoryByUserIdAndMapId(JSONObject paramJSONObject);
  
  public Object deleteTrajectoryByTrajectoryId(JSONObject paramJSONObject);
  
  public Object queryUserByMapId(JSONObject paramJSONObject);
  
  public Object indoorMapMatching(JSONObject paramJSONObject, HttpServletRequest paramHttpServletRequest)throws Exception;
  public Object indoorCompression(JSONObject queryString,HttpServletRequest req) throws Exception;
}


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\service\TrajectoryInfoManangeService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */