package com.bluefireplatform.util;

import com.alibaba.fastjson.JSONObject;
import com.bluefireplatform.service.UserSimilarityService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

public class test {
    @Test
    public void test01() throws Exception{
        String res;
        String s = "2017-12-09" + " 00:00:00";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);

        long ts = date.getTime();
        System.out.println(ts);
//        res = String.valueOf(ts);
//        return res;
    }
    @Test
    public void test02() throws Exception{
        Map map = new HashMap();
        /*    */
        /* 21 */     map.put("userAID", Integer.valueOf(0));
        /*    */    map.put("userBID", Integer.valueOf(1));
        /* 23 */     JSONObject queryString = new JSONObject(map);
        /* 24 */     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        /* 25 */     UserSimilarityService service = (UserSimilarityService) context.getBean("userSimilarityServiceImpl");
//                    service.userSimilarity(queryString);

    }
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
