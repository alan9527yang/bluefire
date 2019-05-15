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
    public String indoorUserSimilarity(String originalSrc, String presentSrc) {
        String pythonPath = "python ";
        // filePath	指的是你本地的算法主函数地址--室内算法
        String filePath = "/root/apache-tomcat-7.0.94/webapps/bluefire/Algorithm/indoor/indoortest.py ";
        String result = "";
        Process process = null;
        List<String> processList = new java.util.ArrayList();
        String line;
        // 这里是将originalSrc和presentSrc传给python，python通过r_path和w_path两个变量接收（实质上下面的代码是在控制台上打一行命令，启动python算法）
        try {
            String commend = pythonPath + filePath + "--r_path " + originalSrc + " --w_path " + presentSrc;
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

        // 这里python处理完之后，返回控制台一个字符串存储在result里，比如“OK”，说明算法处理成功，
        for (String s : processList) {
            System.out.println(s);
            result = result + s;
        }

        return result;

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


