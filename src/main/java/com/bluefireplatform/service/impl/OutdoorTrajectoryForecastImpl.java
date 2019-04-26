package com.bluefireplatform.service.impl;

import com.alibaba.fastjson.JSONObject;


import com.bluefireplatform.component.ReturnHelper;
import com.bluefireplatform.entity.TrajectoryForecast;
import com.bluefireplatform.mapper.TrajectoryForecastMapper;
import com.bluefireplatform.service.OutdoorTrajectoryForecast;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class OutdoorTrajectoryForecastImpl implements OutdoorTrajectoryForecast
{

    @Autowired
    private TrajectoryForecastMapper trajectoryForecastMapper;
    @Autowired
    private ReturnHelper returnHelper;
    @Override
    public Object queryForecastResult(JSONObject queryString) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        Integer resultId = queryString.getInteger("result_id");
        TrajectoryForecast trajectoryForecast = trajectoryForecastMapper.selectByPrimaryKey(resultId);

        String resultSrc = trajectoryForecast.getResultSrc();
        Map value = objectMapper.readValue(new File(resultSrc), Map.class);
        List data = (ArrayList)value.get("data");

        Map<String,Object> map= new HashMap<String, Object>();
        map.put("resultList",data);
        return returnHelper.returnNau(map,100,"服务器正常");
    }
}
