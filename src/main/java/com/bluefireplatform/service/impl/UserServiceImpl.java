/*    */ package com.bluefireplatform.service.impl;
/*    */ 
/*    */ import com.alibaba.fastjson.JSONObject;
/*    */ import com.bluefireplatform.component.ReturnHelper;
/*    */ import com.bluefireplatform.entity.User;
/*    */ import com.bluefireplatform.entity.UserExample;
/*    */ import com.bluefireplatform.entity.UserExample.Criteria;
/*    */ import com.bluefireplatform.mapper.UserMapper;
/*    */ import com.bluefireplatform.service.UserService;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class UserServiceImpl
/*    */   implements UserService
/*    */ {
/*    */   @Autowired
/*    */   private UserMapper userMapper;
/*    */   @Autowired
/*    */   private ReturnHelper returnHelper;
/*    */   
/*    */   public Object addUser(JSONObject queryString)
/*    */   {
/* 30 */     String userName = queryString.getString("user_name");
/* 31 */     User user = new User();
/*    */     
/* 33 */     user.setUserName(userName);
/* 34 */     this.userMapper.insert(user);
/* 35 */     return this.returnHelper.returnNau(null, 1000, "服务器正常");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public Object queryUser(JSONObject queryString)
/*    */   {
/* 42 */     String userName = queryString.getString("userName");
/* 43 */     UserExample example = new UserExample();
/* 44 */     UserExample.Criteria criteria = example.createCriteria();
/* 45 */     criteria.andUserNameEqualTo(userName);
/*    */     
/* 47 */     List<User> list = this.userMapper.selectByExample(example);
/* 48 */     Map<String, Object> map = new HashMap();
/* 49 */     map.put("userList", list);
/*    */     
/* 51 */     return this.returnHelper.returnNau(map, 1000, "服务器正常");
/*    */   }
/*    */   
/*    */ 
/*    */   public Object updateUser(JSONObject queryString)
/*    */   {
/* 57 */     return null;
/*    */   }
/*    */   
/*    */ 
/*    */   public Object deleteUser(JSONObject queryString)
/*    */   {
/* 63 */     Integer userId = queryString.getInteger("user_id");
/* 64 */     this.userMapper.deleteByPrimaryKey(userId);
/* 65 */     return this.returnHelper.returnNau(null, 1000, "服务器正常");
/*    */   }
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\service\impl\UserServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */