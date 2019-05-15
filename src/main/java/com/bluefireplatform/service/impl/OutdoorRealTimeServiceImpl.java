package com.bluefireplatform.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bluefireplatform.component.ReturnHelper;

import com.bluefireplatform.entity.OutTrajectory;
import com.bluefireplatform.entity.OutdoorPresentLocation;
import com.bluefireplatform.entity.OutdoorPresentLocationExample;
import com.bluefireplatform.mapper.OutdoorPresentLocationMapper;

import com.bluefireplatform.service.OutdoorRealTimeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
    public Object OutdoorRealTimeLocationUpload(JSONObject queryString , HttpServletRequest req) throws Exception {
        Integer userId = queryString.getInteger("userId");
        Double longitude = queryString.getDouble("longitude");
        Double latitude = queryString.getDouble("latitude");
        Long timeStamp = queryString.getLong("timeStamp");

        OutdoorPresentLocation nextPoint = new OutdoorPresentLocation();
        nextPoint.setUserId(userId);
        nextPoint.setLongitude(longitude);
        nextPoint.setLatitude(latitude);
        nextPoint.setTimeStamp(timeStamp);

        OutdoorPresentLocationExample example = new OutdoorPresentLocationExample();
        OutdoorPresentLocationExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<OutdoorPresentLocation> list = outdoorPresentLocationMapper.selectByExample(example);

        String path = req.getServletContext().getRealPath("/indoorInfo");
        File userIdDir = new File(path +"/"+ userId);
//        定位点表中有该用户的定位信息
        if(list != null){
//            找到上一个定位点
            OutdoorPresentLocation lastPoint = list.get(0);
//            新点与上一个定位点时间差大于3分钟，则重置该用户的定位信息
            if(((timeStamp - lastPoint.getTimeStamp())/60) > 3){
                outdoorPresentLocationMapper.deleteByPrimaryKey(lastPoint.getLocationId());
                outdoorPresentLocationMapper.insertSelective(nextPoint);

                File file = new File(userIdDir,nextPoint.getLocationId()+".json");
                try{
                    file.createNewFile();
                    List data = new ArrayList();
                    data.add(JSONObject.toJSON(nextPoint));
                    Map jythonMap = new HashMap<>();
                    jythonMap.put("data",data);
                    JSONObject json = new JSONObject(jythonMap);
                    FileWriter fw = new FileWriter(file.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);
                    json.writeJSONString(bw);
                    bw.close();
                }catch (IOException ex){
                    ex.printStackTrace();
                }

            }
            else{
//                如果不大于3分钟，则在原来的定位信息中更新新点信息
                example.clear();
                criteria.andLocationIdEqualTo(lastPoint.getLocationId());
                outdoorPresentLocationMapper.updateByExampleSelective(nextPoint,example);
                File file = new File(userIdDir,lastPoint.getLocationId()+".json");
                ObjectMapper mapper = new ObjectMapper();
                Map value =  mapper.readValue(file, Map.class);
                List data = (ArrayList)value.get("data");

                data.add(JSONObject.toJSON(nextPoint));
                Map jythonMap = new HashMap<>();
                jythonMap.put("data",data);
                JSONObject json = new JSONObject(jythonMap);
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                json.writeJSONString(bw);
                bw.close();
            }
        }
//        定位点表中没有该用户的定位信息，则插入新点
        else{
            outdoorPresentLocationMapper.insert(nextPoint);
            if(!userIdDir.exists()){
                userIdDir.mkdir();
                File file = new File(userIdDir,nextPoint.getLocationId()+".json");
                if(!file.exists()){
                    try{
                        file.createNewFile();
                        List data = new ArrayList();
                        data.add(JSONObject.toJSON(nextPoint));
                        Map jythonMap = new HashMap<>();
                        jythonMap.put("data",data);
                        JSONObject json = new JSONObject(jythonMap);
                        FileWriter fw = new FileWriter(file.getAbsoluteFile());
                        BufferedWriter bw = new BufferedWriter(fw);
                        json.writeJSONString(bw);
                        bw.close();
                    }catch (IOException ex){
                        ex.printStackTrace();
                    }
                }

            }



        }

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
