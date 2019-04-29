package com.bluefireplatform.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bluefireplatform.component.ReturnHelper;
import com.bluefireplatform.entity.OutTrajectory;
import com.bluefireplatform.entity.OutTrajectoryExample;
import com.bluefireplatform.entity.Trajectory;
import com.bluefireplatform.entity.TrajectoryExample;
import com.bluefireplatform.mapper.OutTrajectoryMapper;
import com.bluefireplatform.mapper.TrajectoryMapper;
import com.bluefireplatform.service.HeatMapService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class HeatMapServiceImpl implements HeatMapService {
    @Autowired
    private OutTrajectoryMapper outTrajectoryMapper;
    @Autowired
    private TrajectoryMapper trajectoryMapper;
    @Autowired
    private ReturnHelper returnHelper;
    @Override
    public Object queryAllOutdoorTrajectoryDetails(JSONObject queryString) throws Exception{
        String startDate= queryString.getString("startDate");
        String endDate = queryString.getString("endDate") ;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean convertSuccess=true;
        try {
              format.setLenient(false);
             format.parse(startDate);
             format.parse(endDate);
          } catch (ParseException e) {
              // e.printStackTrace();
     // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
               convertSuccess=false;

        }
        Map map = new HashMap();
        if(convertSuccess == true ){
            long startTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(startDate, new ParsePosition(0)).getTime()/ 1000;
            long endTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(endDate, new ParsePosition(0)).getTime()/ 1000;

            System.out.println(startTime);
            System.out.println(endTime);

            ObjectMapper mapper = new ObjectMapper();

            OutTrajectoryExample example = new OutTrajectoryExample();
            OutTrajectoryExample.Criteria criteria = example.createCriteria();
            criteria.andStartTimeGreaterThanOrEqualTo(startTime).andEndTimeLessThanOrEqualTo(endTime);
            List<OutTrajectory> trajectories = outTrajectoryMapper.selectByExample(example);
            List data = new ArrayList();
            for (OutTrajectory trajectory:trajectories) {
                File trajectoryFile = new File(trajectory.getTrajectorySrc()) ;
                Map value = (Map)mapper.readValue(trajectoryFile , Map.class);
                List list = (ArrayList)value.get("data");
                data.addAll(list);
            }

            map.put("list",data);
        }


        return returnHelper.returnNau(map, 1000, "服务器正常");
    }

    @Override
    public Object queryAllIndoorTrajectoryDetails(JSONObject queryString) throws Exception {
        String startDate= queryString.getString("startDate");
        String endDate = queryString.getString("endDate") ;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean convertSuccess=true;
        try {
            format.setLenient(false);
            format.parse(startDate);
            format.parse(endDate);
        } catch (ParseException e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess=false;

        }
        Map map = new HashMap();
        if(convertSuccess == true ){
            long startTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(startDate, new ParsePosition(0)).getTime()/ 1000;
            long endTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(endDate, new ParsePosition(0)).getTime()/ 1000;

            System.out.println(startTime);
            System.out.println(endTime);

            ObjectMapper mapper = new ObjectMapper();

            TrajectoryExample example = new TrajectoryExample();
            TrajectoryExample.Criteria criteria = example.createCriteria();
            criteria.andStartTimeGreaterThanOrEqualTo(startTime).andEndTimeLessThanOrEqualTo(endTime);
            List<Trajectory> trajectories = trajectoryMapper.selectByExample(example);
            List data = new ArrayList();
            for (Trajectory trajectory:trajectories) {
                File trajectoryFile = new File(trajectory.getTrajectorySrc()) ;
                Map value = (Map)mapper.readValue(trajectoryFile , Map.class);
                List list = (ArrayList)value.get("data");
                data.addAll(list);
            }

            map.put("list",data);
        }


        return returnHelper.returnNau(map, 1000, "服务器正常");
    }
}
