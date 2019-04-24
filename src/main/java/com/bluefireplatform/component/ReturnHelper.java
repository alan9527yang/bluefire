/*    */ package com.bluefireplatform.component;
/*    */ 
/*    */ import com.bluefireplatform.util.NetDataAccessUtil;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Component
/*    */ public class ReturnHelper
/*    */ {
/*    */   public Object returnNau(Object content, int result, String desp)
/*    */   {
/* 21 */     NetDataAccessUtil nau = new NetDataAccessUtil();
/* 22 */     nau.setContent(content);
/* 23 */     nau.setResult(result);
/* 24 */     nau.setResultDesp(desp);
/* 25 */     return nau;
/*    */   }
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\component\ReturnHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */