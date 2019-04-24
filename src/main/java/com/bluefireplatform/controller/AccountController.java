/*    */ package com.bluefireplatform.controller;
/*    */ 
/*    */ import com.alibaba.fastjson.JSONObject;
/*    */ import com.bluefireplatform.component.ReturnHelper;
/*    */ import com.bluefireplatform.model.UserException;
/*    */ import com.bluefireplatform.service.AccountService;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.web.bind.annotation.RequestBody;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.ResponseBody;
/*    */ 
/*    */ @Controller
/*    */ @RequestMapping({"/interface/account"})
/*    */ public class AccountController
/*    */ {
/*    */   @Autowired
/*    */   private ReturnHelper returnHelper;
/*    */   @Autowired
/*    */   private AccountService accountService;
/*    */   
/*    */   @RequestMapping({"/login"})
/*    */   @ResponseBody
/*    */   public Object login(@RequestBody JSONObject queryString)
/*    */   {
/*    */     try
/*    */     {
/* 28 */       return this.accountService.login(queryString);
/*    */     } catch (UserException e) {
/* 30 */       return this.returnHelper.returnNau(null, e.getCode().intValue(), e.getMessage());
/*    */     }
/*    */   }
/*    */   
/*    */   @RequestMapping({"/register"})
/*    */   @ResponseBody
/*    */   public Object Register(@RequestBody JSONObject queryString) {
/*    */     try {
/* 38 */       return this.accountService.register(queryString);
/*    */     }
/*    */     catch (UserException e) {
/* 41 */       return this.returnHelper.returnNau(null, e.getCode().intValue(), e.getMessage());
/*    */     }
/*    */   }
/*    */   
/*    */   @RequestMapping({"/add_account"})
/*    */   @ResponseBody
/*    */   public Object addAccount(@RequestBody JSONObject queryString)
/*    */   {
/*    */     try {
/* 50 */       return this.accountService.addAccount(queryString);
/*    */     }
/*    */     catch (UserException e) {
/* 53 */       return this.returnHelper.returnNau(null, e.getCode().intValue(), e.getMessage());
/*    */     }
/*    */   }
/*    */   
/*    */   @RequestMapping({"/delete_account"})
/*    */   @ResponseBody
/*    */   public Object deleteAccount(@RequestBody JSONObject queryString)
/*    */   {
/*    */     try {
/* 62 */       return this.accountService.deleteAccount(queryString);
/*    */     }
/*    */     catch (UserException e) {
/* 65 */       return this.returnHelper.returnNau(null, e.getCode().intValue(), e.getMessage());
/*    */     }
/*    */   }
/*    */   
/*    */   @RequestMapping({"/update_account"})
/*    */   @ResponseBody
/*    */   public Object updateAccount(@RequestBody JSONObject queryString)
/*    */   {
/*    */     try {
/* 74 */       return this.accountService.updateAccount(queryString);
/*    */     }
/*    */     catch (UserException e) {
/* 77 */       return this.returnHelper.returnNau(null, e.getCode().intValue(), e.getMessage());
/*    */     }
/*    */   }
/*    */   
/*    */   @RequestMapping({"/query_account"})
/*    */   @ResponseBody
/*    */   public Object queryAccount(@RequestBody JSONObject queryString)
/*    */   {
/*    */     try {
/* 86 */       return this.accountService.queryAccount(queryString);
/*    */     }
/*    */     catch (UserException e) {
/* 89 */       return this.returnHelper.returnNau(null, e.getCode().intValue(), e.getMessage());
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\controller\AccountController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */