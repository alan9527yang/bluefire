/*    */ package com.bluefireplatform.util;
/*    */ 
/*    */ import com.bluefireplatform.entity.OutTrajectory;
/*    */ import com.bluefireplatform.service.OutTrajectoryService;
/*    */ import java.io.File;
/*    */ import java.text.DecimalFormat;
/*    */ import java.util.ArrayList;
/*    */ import org.springframework.context.ApplicationContext;
/*    */ import org.springframework.context.support.ClassPathXmlApplicationContext;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AddOutdoorTrajectoryUtil
/*    */ {
/*    */   public ArrayList<File> getFiles(String path)
/*    */   {
/* 18 */     ArrayList<File> fileList = new ArrayList();
/* 19 */     File file = new File(path);
/* 20 */     if (file.isDirectory()) {
/* 21 */       File[] files = file.listFiles();
/* 22 */       File[] arrayOfFile1; int j = (arrayOfFile1 = files).length; for (int i = 0; i < j; i++) { File fileIndex = arrayOfFile1[i];
/* 23 */         if (fileIndex.isDirectory())
/*    */         {
/* 25 */           getFiles(fileIndex.getPath());
/*    */ 
/*    */ 
/*    */         }
/* 29 */         else if (fileIndex.getName().endsWith(".json")) {
/* 30 */           fileList.add(fileIndex);
/*    */         }
/*    */       }
/*    */     }
/* 34 */     return fileList;
/*    */   }
/*    */   
/*    */   public static void main(String[] args) {
/* 38 */     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
/* 39 */     OutTrajectoryService outTrajectoryService = (OutTrajectoryService)context.getBean("outTrajectoryServiceImpl");
/* 40 */     for (int i = 0; i < 182; i++) {
/* 41 */       DecimalFormat df = new DecimalFormat("000");
/* 42 */       String str = df.format(i);
/* 43 */       AddOutdoorTrajectoryUtil addOutdoorTrajectoryUtil = new AddOutdoorTrajectoryUtil();
/* 44 */       ArrayList<File> fileList = addOutdoorTrajectoryUtil.getFiles("/Users/yyzmac/Library/apache-tomcat-7.0.90/webapps/BlueFire-Platform/outdoorTrajectories/Data/" + str + "/Trajectory");
/* 45 */       ArrayList<String> filePaths = new ArrayList();
/* 46 */       for (File file : fileList) {
/* 47 */         filePaths.add(file.getPath());
/*    */       }
/*    */       
/* 50 */       for (String filePath : filePaths) {
/* 51 */         OutTrajectory outTrajectory = new OutTrajectory();
/* 52 */         outTrajectory.setOutTrajectorySrc(filePath);
/* 53 */         outTrajectory.setOutTrajectoryType(Integer.valueOf(0));
/* 54 */         outTrajectory.setOutUserId(Integer.valueOf(i));
/*    */         
/* 56 */         outTrajectoryService.insertTrajectory(outTrajectory);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\com\bluefireplatfor\\util\AddOutdoorTrajectoryUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */