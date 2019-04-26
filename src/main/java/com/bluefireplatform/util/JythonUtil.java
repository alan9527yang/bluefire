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
            public String compression(String originalSrc, String presentSrc)
                 {

                             String pythonPath = "/anaconda3/bin/python3.6 ";
                             String filePath = "/Users/yyzmac/Documents/KalmanFilter/dp_get_trace.py ";
                             String result = "";
                /* 15 */     Process process = null;
                /* 16 */     List<String> processList = new java.util.ArrayList();
                /*    */     String line;

                /* 18 */     try {

                                    process = Runtime.getRuntime().exec(pythonPath + filePath + "--r_path " + originalSrc + " --w_path " + presentSrc);
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
    /*    */   public String outdoorMapMatching(String originalSrc, String presentSrc , int type)
    /*    */   {
//                     输入你的python环境地址
        /* 12 */     String pythonPath = "/anaconda3/bin/python3.6 ";
//                     根据type类型选择地图匹配算法的地址，type类型1，2，3分别代表地图匹配算法1，2，3
        /* 13 */     String filePath ="";
                     switch(type){
                         case 1:
                             filePath = "";
                         case 2:
                             filePath = "";
                         case 3:
                             filePath = "";
                     }
//                     result用来返回地图匹配算法处理后的控制台信息
        /* 14 */     String result = "";
        /* 15 */     Process process = null;
        /* 16 */     List<String> processList = new java.util.ArrayList();
        /*    */     String line;
        /* 18 */     try {
//                           向控制台输入语句来调用python模块，启动地图匹配算法，语句格式：python环境地址+地图匹配算法地址+原轨迹数据文件地址+即将写入的数据文件地址
                           process = Runtime.getRuntime().exec(pythonPath + filePath + "--r_path " + originalSrc + " --w_path " + presentSrc);
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

            /* 33 */       result = result + s;
            /*    */     }

        /* 35 */     return result;
        /*    */   }
/*    */   
/*    */   public String dataCompression(String originalSrc) {
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