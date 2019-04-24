/*    */ package com.bluefireplatform.util;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NetDataAccessUtil
/*    */ {
/*    */   private Object content;
/*    */   private int result;
/*    */   private Object resultDesp;
/*    */   
/*    */   public Map<String, Object> generateResultSet()
/*    */   {
/* 22 */     Map<String, Object> map = new HashMap();
/* 23 */     map.put("content", this.content);
/* 24 */     map.put("resultDesp", this.resultDesp);
/* 25 */     map.put("result", Integer.valueOf(this.result));
/* 26 */     return map;
/*    */   }
/*    */   
/*    */   public void setContent(Object content) {
/* 30 */     this.content = content;
/*    */   }
/*    */   
/*    */   public void setResult(int result) {
/* 34 */     this.result = result;
/*    */   }
/*    */   
/*    */   public void setResultDesp(Object resultDesp) {
/* 38 */     this.resultDesp = resultDesp;
/*    */   }
/*    */   
/*    */   public Object getContent() {
/* 42 */     return this.content;
/*    */   }
/*    */   
/*    */   public int getResult() {
/* 46 */     return this.result;
/*    */   }
/*    */   
/*    */   public Object getResultDesp() {
/* 50 */     return this.resultDesp;
/*    */   }
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatfor\\util\NetDataAccessUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */