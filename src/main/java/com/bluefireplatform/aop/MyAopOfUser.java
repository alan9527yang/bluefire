/*    */ package com.bluefireplatform.aop;
/*    */ 
/*    */ import com.bluefireplatform.model.UserException;
/*    */ import com.bluefireplatform.util.UserExceptionUtil;
/*    */ import org.aopalliance.intercept.MethodInterceptor;
/*    */ import org.aopalliance.intercept.MethodInvocation;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MyAopOfUser
/*    */   implements MethodInterceptor
/*    */ {
/*    */   public Object invoke(MethodInvocation mi)
/*    */     throws Throwable
/*    */   {
/*    */     try
/*    */     {
/* 19 */       return mi.proceed();
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/* 23 */       e.printStackTrace();
/* 24 */       UserException userException = UserExceptionUtil.transformException(e);
/* 25 */       throw userException;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\aop\MyAopOfUser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */