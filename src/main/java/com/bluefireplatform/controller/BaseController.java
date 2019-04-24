/*    */ package com.bluefireplatform.controller;
/*    */ 
/*    */ import java.sql.Date;
/*    */ import java.text.DateFormat;
/*    */ import java.text.SimpleDateFormat;
/*    */ import org.springframework.beans.propertyeditors.CustomDateEditor;
/*    */ import org.springframework.web.bind.WebDataBinder;
/*    */ import org.springframework.web.bind.annotation.InitBinder;
/*    */ 
/*    */ public class BaseController
/*    */ {
/*    */   @InitBinder
/*    */   public void initBinder(WebDataBinder binder)
/*    */   {
/* 15 */     DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
/* 16 */     dateFormat.setLenient(true);
/* 17 */     binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
/*    */   }
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\controller\BaseController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */