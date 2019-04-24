/*    */ package com.bluefireplatform.interceptor;
/*    */ 
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.springframework.web.servlet.HandlerInterceptor;
/*    */ import org.springframework.web.servlet.ModelAndView;
/*    */ 
/*    */ 
/*    */ public class LoginInterceptor
/*    */   implements HandlerInterceptor
/*    */ {
/*    */   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
/*    */     throws Exception
/*    */   {
/* 15 */     return true;
/*    */   }
/*    */   
/*    */   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
/*    */     throws Exception
/*    */   {}
/*    */   
/*    */   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
/*    */     throws Exception
/*    */   {}
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatform\interceptor\LoginInterceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */