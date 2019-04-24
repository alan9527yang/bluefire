/*    */ package com.bluefireplatform.util;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStreamReader;
/*    */ import java.util.List;
/*    */ 
/*    */ public class JythonUtil
/*    */ {
/*    */   public String mapMatching(String originalSrc, String presentSrc)
/*    */   {
/* 12 */     String pythonPath = "/anaconda3/bin/python3.6 ";
/* 13 */     String filePath = "/Users/yyzmac/Documents/map-matching/test.py ";
/* 14 */     String result = "";
/* 15 */     Process process = null;
/* 16 */     List<String> processList = new java.util.ArrayList();
/*    */     String line;
/* 18 */     try { process = Runtime.getRuntime().exec(pythonPath + filePath + "--r_path " + originalSrc + " --w_path " + presentSrc);
/*    */       
/* 20 */       BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
/* 21 */       line = "";
/* 22 */       while ((line = input.readLine()) != null) {
/* 23 */         processList.add(line);
/*    */       }
/* 25 */       input.close();
/*    */     } catch (IOException e) {
/* 27 */       e.printStackTrace();
/*    */     }
/*    */     
/* 30 */     for (String s : processList)
/*    */     {
/* 32 */       System.out.println(s);
/* 33 */       result = result + s;
/*    */     }
/* 35 */     return result;
/*    */   }
/*    */   
/*    */   public String DataCompression(String originalSrc) {
/* 39 */     String pythonPath = "/anaconda3/bin/python3.6 ";
/* 40 */     String filePath = "/Users/yyzmac/Documents/map-matching/test.py ";
/* 41 */     String presentSrc = "";
/*    */     
/* 43 */     Process process = null;
/* 44 */     List<String> processList = new java.util.ArrayList();
/*    */     String line;
/* 46 */     try { process = Runtime.getRuntime().exec(pythonPath + filePath + "--r_path " + originalSrc);
/*    */       
/* 48 */       BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
/* 49 */       line = "";
/* 50 */       while ((line = input.readLine()) != null) {
/* 51 */         processList.add(line);
/*    */       }
/* 53 */       input.close();
/*    */     } catch (IOException e) {
/* 55 */       e.printStackTrace();
/*    */     }
/*    */     
/* 58 */     for (String s : processList)
/*    */     {
/* 60 */       System.out.println(s);
/* 61 */       presentSrc = presentSrc + s;
/*    */     }
/* 63 */     return presentSrc;
/*    */   }
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatfor\\util\JythonUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */