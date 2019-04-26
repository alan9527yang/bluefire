package com.bluefireplatform.util;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
         Map value= (Map)mapper.readValue(new File("/Users/yyzmac/Library/apache-tomcat-7.0.90/webapps/bluefire/outdoorTrajectories/Data/176/Trajectory/20071209063433.json"), Map.class);
         List list = (ArrayList)value.get("data");

                System.out.println(list.get(list.size() - 1 ));


//            JSONObject b = new JSONObject((Map)a);
//            String c = b.getString("date") + " " +b.getString("time");
//            long time = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(c, new ParsePosition(0)).getTime()/ 1000;
//
//            System.out.println(time);

    }
}
