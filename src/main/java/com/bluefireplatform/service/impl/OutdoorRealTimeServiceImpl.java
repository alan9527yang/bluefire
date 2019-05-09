package com.bluefireplatform.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bluefireplatform.component.ReturnHelper;

import com.bluefireplatform.entity.OutdoorPresentLocation;
import com.bluefireplatform.mapper.OutdoorPresentLocationMapper;

import com.bluefireplatform.service.OutdoorRealTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OutdoorRealTimeServiceImpl implements OutdoorRealTimeService {
    @Autowired
    private OutdoorPresentLocationMapper outdoorPresentLocationMapper;
    @Autowired
    private ReturnHelper returnHelper;

    @Override
    public Object OutdoorRealTimeLocationUpload(JSONObject queryString) {
        Integer userId = queryString.getInteger("userId");
        Double longitude = queryString.getDouble("longitude");
        Double latitude = queryString.getDouble("latitude");
        Long timeStamp = queryString.getLong("timeStamp");

        OutdoorPresentLocation point = new OutdoorPresentLocation();
        point.setUserId(userId);

        point.setLongitude(longitude);
        point.setLatitude(latitude);
        point.setTimeStamp(timeStamp);

        outdoorPresentLocationMapper.insertSelective(point);

        return returnHelper.returnNau(null,1000,"服务器正常");
    }

    @Override
    public Object OutdoorRealTimeLocationDownload() {

        List<OutdoorPresentLocation> points = outdoorPresentLocationMapper.selectByExample(null);
        List pointList = new ArrayList();
        Map resultMap = new HashMap();

        for (OutdoorPresentLocation point: points) {
            Map map = new HashMap();
            map.put("userId",point.getUserId());
            map.put("longitude",point.getLongitude());
            map.put("latitude",point.getLatitude());
            pointList.add(map);
        }

        resultMap.put("list",pointList);

        return returnHelper.returnNau(resultMap,1000,"服务器正常");
    }
}
