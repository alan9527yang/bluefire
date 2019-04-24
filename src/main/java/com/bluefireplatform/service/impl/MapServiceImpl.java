/*    */ package com.bluefireplatform.service.impl;
/*    */ 
/*    */ import com.alibaba.fastjson.JSONObject;
/*    */ import com.bluefireplatform.component.ReturnHelper;
/*    */ import com.bluefireplatform.mapper.MapMapper;
/*    */ import com.bluefireplatform.service.MapService;
/*    */ import java.io.File;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import javax.servlet.ServletContext;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ import org.springframework.web.multipart.MultipartFile;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class MapServiceImpl
/*    */   implements MapService
/*    */ {
/*    */   @Autowired
/*    */   private MapMapper mapMapper;
/*    */   @Autowired
/*    */   private ReturnHelper returnHelper;
/*    */   
/*    */   public Object queryAllMap()
/*    */   {
/* 34 */     List mapList = this.mapMapper.selectByExample(null);
/* 35 */     java.util.Map map = new HashMap();
/* 36 */     map.put("mapList", mapList);
/*    */     
/* 38 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
/*    */   }
/*    */   
/*    */ 
/*    */   public Object addMap(MultipartFile jsonFile, HttpServletRequest req, JSONObject queryString)
/*    */     throws Exception
/*    */   {
/* 45 */     String path = req.getServletContext().getRealPath("/map");
/*    */     
/* 47 */     File file = new File(path, jsonFile.getOriginalFilename());
/* 48 */     jsonFile.transferTo(file);
/*    */     
/*    */ 
/* 51 */     String mapSrc = file.getAbsolutePath();
/*    */     
/* 53 */     String mapName = queryString.getString("map_name");
/*    */     
/* 55 */     com.bluefireplatform.entity.Map map = new com.bluefireplatform.entity.Map();
/* 56 */     map.setMapName(mapName);
/* 57 */     map.setMapSrc(mapSrc);
/* 58 */     map.setIndoorMark(Boolean.valueOf(true));
/* 59 */     this.mapMapper.insertSelective(map);
/*    */     
/* 61 */     return this.returnHelper.returnNau(null, 1000, "服务器正常");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public Object updateMap(JSONObject queryString)
/*    */   {
/* 68 */     return null;
/*    */   }
/*    */   
/*    */ 
/*    */   public Object deleteMap(JSONObject queryString)
/*    */   {
/* 74 */     Integer mapId = queryString.getInteger("map_id");
/* 75 */     this.mapMapper.deleteByPrimaryKey(mapId);
/* 76 */     return this.returnHelper.returnNau(null, 1000, "服务器正常");
/*    */   }
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\service\impl\MapServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */