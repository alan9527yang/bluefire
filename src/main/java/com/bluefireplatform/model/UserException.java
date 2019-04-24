/*    */ package com.bluefireplatform.model;
/*    */ 
/*    */ public class UserException
/*    */   extends RuntimeException
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private Integer code;
/*    */   private String message;
/*    */   
/*    */   public Integer getCode()
/*    */   {
/* 12 */     return this.code;
/*    */   }
/*    */   
/* 15 */   public void setCode(Integer code) { this.code = code; }
/*    */   
/*    */   public String getMessage() {
/* 18 */     return this.message;
/*    */   }
/*    */   
/* 21 */   public void setMessage(String message) { this.message = message; }
/*    */   
/*    */   public UserException(Integer code, String message)
/*    */   {
/* 25 */     this.code = code;
/* 26 */     this.message = message;
/*    */   }
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\model\UserException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */