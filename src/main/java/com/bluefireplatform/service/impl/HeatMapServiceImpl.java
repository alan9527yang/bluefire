package com.bluefireplatform.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bluefireplatform.component.ReturnHelper;
import com.bluefireplatform.entity.OutTrajectory;
import com.bluefireplatform.entity.OutTrajectoryExample;
import com.bluefireplatform.mapper.OutTrajectoryMapper;
import com.bluefireplatform.service.HeatMapService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class HeatMapServiceImpl implements HeatMapService {
    @Autowired
    private OutTrajectoryMapper outTrajectoryMapper;
    @Autowired
    private ReturnHelper returnHelper;
    @Override
    public Object queryAllOutdoorTrajectoryDetails(JSONObject queryString) throws Exception{
        String startDate= queryString.getString("startDate") + " 00:00:00";
        String endDate = queryString.getString("endDate") + " 23:59:59";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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
        Map map = new HashMap();
        map.put("list",data);

        return returnHelper.returnNau(map, 1000, "服务器正常");
    }
}
