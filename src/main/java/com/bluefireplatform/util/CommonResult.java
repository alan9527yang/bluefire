/*     */ package com.bluefireplatform.util;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CommonResult
/*     */   implements Serializable
/*     */ {
/*     */   private static final int SUCCESS = 1000;
/*     */   private static final String ResultDesp = "服务器正常";
/*  37 */   private Map<String, Object> header = new HashMap();
/*  38 */   private Map<String, Object> body = new HashMap();
/*     */   
/*     */   public static CommonResult ok(String resultDesp, Object data) {
/*  41 */     return new CommonResult(resultDesp, data);
/*     */   }
/*     */   
/*     */   public static CommonResult ok(Object data) {
/*  45 */     return new CommonResult("服务器正常", data);
/*     */   }
/*     */   
/*     */   public static CommonResult ok(String resultDesp) {
/*  49 */     return new CommonResult(Integer.valueOf(1000), resultDesp);
/*     */   }
/*     */   
/*     */   public static CommonResult ok() {
/*  53 */     return new CommonResult(Integer.valueOf(1000), "服务器正常");
/*     */   }
/*     */   
/*     */   public static CommonResult fail(Integer result, String resultDesp) {
/*  57 */     return new CommonResult(result, resultDesp);
/*     */   }
/*     */   
/*     */ 
/*     */   public CommonResult() {}
/*     */   
/*     */   public static CommonResult build(Integer result, String resultDesp)
/*     */   {
/*  65 */     return new CommonResult(result, resultDesp, null);
/*     */   }
/*     */   
/*     */   public static CommonResult build(Integer result, String resultDesp, Object data) {
/*  69 */     return new CommonResult(result, resultDesp, data);
/*     */   }
/*     */   
/*     */   public CommonResult(Integer result, String resultDesp, Object data) {
/*  73 */     this.body.put("result", result);
/*  74 */     this.body.put("content", data);
/*  75 */     this.body.put("resultDesp", resultDesp);
/*     */   }
/*     */   
/*     */   public CommonResult(String resultDesp, Object data) {
/*  79 */     this.body.put("result", Integer.valueOf(1000));
/*  80 */     this.body.put("content", data);
/*  81 */     this.body.put("resultDesp", resultDesp);
/*     */   }
/*     */   
/*     */   public CommonResult(Integer result, String resultDesp) {
/*  85 */     this.body.put("result", result);
/*  86 */     this.body.put("content", null);
/*  87 */     this.body.put("resultDesp", resultDesp);
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/*  92 */     return 
/*     */     
/*     */ 
/*  95 */       "CommonResult{header=" + this.header + ", body=" + this.body + '}';
/*     */   }
/*     */   
/*     */   public CommonResult putHeader(String key, Object value) {
/*  99 */     this.header.put(key, value);
/* 100 */     return this;
/*     */   }
/*     */   
/*     */   public CommonResult putBody(String key, Object value) {
/* 104 */     this.body.put(key, value);
/* 105 */     return this;
/*     */   }
/*     */   
/*     */   public Map<String, Object> getHeader() {
/* 109 */     return this.header;
/*     */   }
/*     */   
/*     */   public void setHeader(Map<String, Object> header) {
/* 113 */     this.header = header;
/*     */   }
/*     */   
/*     */   public Map<String, Object> getBody() {
/* 117 */     return this.body;
/*     */   }
/*     */   
/*     */   public void setBody(Map<String, Object> body) {
/* 121 */     this.body = body;
/*     */   }
/*     */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatfor\\util\CommonResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */