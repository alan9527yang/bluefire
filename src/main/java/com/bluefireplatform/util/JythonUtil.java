package com.bluefireplatform.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class JythonUtil {
    public String mapMatching(String originalSrc, String presentSrc) {
        String pythonPath = "/anaconda3/bin/python3.6 ";
        String filePath = "/Users/yyzmac/Documents/map-matching/test.py ";
        String result = "";
        Process process = null;
        List<String> processList = new java.util.ArrayList();
        String line;
        try {
            process = Runtime.getRuntime().exec(pythonPath + filePath + "--r_path " + originalSrc + " --w_path " + presentSrc);

            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            line = "";
            while ((line = input.readLine()) != null) {
                processList.add(line);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : processList) {
            System.out.println(s);
            result = result + s;
        }
        return result;
    }

    public String userSimilarity(String originalSrc, String presentSrc) {
/*        String pythonPath = "/anaconda3/bin/python3.6 ";
        String filePath = "/Users/yyzmac/Desktop/test/pythoncode/outdoortest.py ";
        String result = "";
        Process process = null;
        List<String> processList = new java.util.ArrayList();
        String line;
        try {
            process = Runtime.getRuntime().exec(pythonPath + filePath + "--r_path " + originalSrc + " --w_path " + presentSrc);

            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            line = "";
            while ((line = input.readLine()) != null) {
                processList.add(line);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : processList) {
            System.out.println(s);
            result = result + s;
        }
        return result;*/
        return "OK";
    }

    public String compression(String originalSrc, String presentSrc) {

        String pythonPath = "/anaconda3/bin/python3.6 ";
        String filePath = "/Users/yyzmac/Documents/KalmanFilter/dp_get_trace.py ";
        String result = "";
        Process process = null;
        List<String> processList = new java.util.ArrayList();
        String line;

        try {

            process = Runtime.getRuntime().exec(pythonPath + filePath + "--r_path " + originalSrc + " --w_path " + presentSrc);


            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            line = "";
            while ((line = input.readLine()) != null) {
                processList.add(line);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : processList) {
            System.out.println(s);
            result = result + s;
        }
        return result;
    }

    public String outdoorMapMatching(String originalSrc, String presentSrc, int type) {
//                     输入你的python环境地址
        String pythonPath = "/anaconda3/bin/python3.6 ";
//                     根据type类型选择地图匹配算法的地址，type类型1，2，3分别代表地图匹配算法1，2，3
        String filePath = "";
        switch (type) {
            case 1:
                filePath = "";
            case 2:
                filePath = "";
            case 3:
                filePath = "";
        }
//                     result用来返回地图匹配算法处理后的控制台信息
        String result = "";
        Process process = null;
        List<String> processList = new java.util.ArrayList();
        String line;
        try {
//                           向控制台输入语句来调用python模块，启动地图匹配算法，语句格式：python环境地址+地图匹配算法地址+原轨迹数据文件地址+即将写入的数据文件地址
            process = Runtime.getRuntime().exec(pythonPath + filePath + "--r_path " + originalSrc + " --w_path " + presentSrc);

            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            line = "";
            while ((line = input.readLine()) != null) {
                processList.add(line);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : processList) {

            result = result + s;
        }

        return result;
    }

    public String dataCompression(String originalSrc) {
        String pythonPath = "/anaconda3/bin/python3.6 ";
        String filePath = "/Users/yyzmac/Documents/map-matching/test.py ";
        String presentSrc = "";

        Process process = null;
        List<String> processList = new java.util.ArrayList();
        String line;
        try {
            process = Runtime.getRuntime().exec(pythonPath + filePath + "--r_path " + originalSrc);

            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            line = "";
            while ((line = input.readLine()) != null) {
                processList.add(line);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : processList) {
            System.out.println(s);
            presentSrc = presentSrc + s;
        }
        return presentSrc;
    }

    public String empiricalandIntegererest(String r_path, String w_path) {
        return "OK";
    }
}


