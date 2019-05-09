package com.bluefireplatform.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bluefireplatform.component.ReturnHelper;
import com.bluefireplatform.entity.IndoorPresentLocation;
import com.bluefireplatform.entity.IndoorPresentLocationExample;
import com.bluefireplatform.mapper.IndoorPresentLocationMapper;
import com.bluefireplatform.service.IndoorRealTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IndoorRealTimeServiceImpl implements IndoorRealTimeService {
    @Autowired
    private IndoorPresentLocationMapper indoorPresentLocationMapper;
    @Autowired
    private ReturnHelper returnHelper;

    @Override
    public Object IndoorRealTimeLocationUpload(JSONObject queryString) {
         Integer userId = queryString.getInteger("userId");
         Integer mapId = queryString.getInteger("mapId");
         Double x = queryString.getDouble("x");
         Double y = queryString.getDouble("y");
         Long timeStamp = queryString.getLong("timeStamp");
         String locationPOI = queryString.getString("locationPOI");

        IndoorPresentLocation point = new IndoorPresentLocation();
        point.setUserId(userId);
        point.setMapId(mapId);
        point.setX(x);
        point.setY(y);
        point.setLocationPoi(locationPOI);
        point.setTimeStamp(timeStamp);

        indoorPresentLocationMapper.insertSelective(point);

        return returnHelper.returnNau(null,1000,"服务器正常");

    }

    @Override
    public Object IndoorRealTimeLocationDownload(JSONObject queryString) {
         Integer mapId= queryString.getInteger("mapId");
        IndoorPresentLocationExample example = new IndoorPresentLocationExample();
        IndoorPresentLocationExample.Criteria criteria = example.createCriteria();
        criteria.andMapIdEqualTo(mapId);
        List<IndoorPresentLocation> points = indoorPresentLocationMapper.selectByExample(example);
        List pointList = new ArrayList();
        Map resultMap = new HashMap();

        for (IndoorPresentLocation point: points) {
            Map map = new HashMap();
            map.put("userId",point.getUserId());
            map.put("x",point.getX());
            map.put("y",point.getY());
            pointList.add(map);
        }

        resultMap.put("list",pointList);

        return returnHelper.returnNau(resultMap,1000,"服务器正常");
    }
}
