package com.bluefireplatform.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bluefireplatform.component.ReturnHelper;
import com.bluefireplatform.entity.OutTrajectory;
import com.bluefireplatform.entity.OutTrajectoryExample;
import com.bluefireplatform.entity.Trajectory;
import com.bluefireplatform.entity.TrajectoryExample;
import com.bluefireplatform.mapper.OutTrajectoryMapper;
import com.bluefireplatform.mapper.TrajectoryMapper;
import com.bluefireplatform.service.UserSimilarityService;
import com.bluefireplatform.util.JythonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserSimilarityServiceImpl implements UserSimilarityService {

    @Autowired
    private OutTrajectoryMapper outTrajectoryMapper;
    @Autowired
    private TrajectoryMapper trajectoryMapper;

    @Autowired
    private ReturnHelper returnHelper;

    @Override
    public Object userSimilarity(JSONObject queryString , HttpServletRequest req) throws Exception {
        Integer userAId= queryString.getInteger("userAID") ;
        System.out.println(userAId);
        Integer userBId= queryString.getInteger("userBID") ;
        System.out.println(userBId);
        String startDate= queryString.getString("startDate") + " 00:00:00";
        String endDate = queryString.getString("endDate") + " 23:59:59";
        long startTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(startDate, new ParsePosition(0)).getTime()/ 1000;
        long endTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(endDate, new ParsePosition(0)).getTime()/ 1000;
        List outTrajectoriesAJson = new ArrayList();
        List outTrajectoriesBJson = new ArrayList();
        OutTrajectoryExample example = new OutTrajectoryExample();
        OutTrajectoryExample.Criteria criteria = example.createCriteria();

        OutTrajectoryExample example2 = new OutTrajectoryExample();
        OutTrajectoryExample.Criteria criteria2 = example2.createCriteria();

        criteria.andUserIdEqualTo(userAId).andStartTimeGreaterThanOrEqualTo(startTime).andEndTimeLessThanOrEqualTo(endTime);
        List<OutTrajectory> outTrajectoriesA = outTrajectoryMapper.selectByExample(example);
        System.out.println(outTrajectoriesA);
        example.clear();
        criteria2.andUserIdEqualTo(userBId).andStartTimeGreaterThanOrEqualTo(startTime).andEndTimeLessThanOrEqualTo(endTime);
        List<OutTrajectory> outTrajectoriesB = outTrajectoryMapper.selectByExample(example2);
        System.out.println(outTrajectoriesB);
        for (OutTrajectory outTrajectory:outTrajectoriesA) {
             outTrajectoriesAJson.add(JSONObject.toJSON(outTrajectory));
        }
        for (OutTrajectory outTrajectory:outTrajectoriesB) {
            outTrajectoriesBJson.add(JSONObject.toJSON(outTrajectory));
        }
        Map jythonMap = new HashMap<>();
        jythonMap.put("userA",outTrajectoriesAJson);
        jythonMap.put("userB",outTrajectoriesBJson);
        JSONObject json = new JSONObject(jythonMap);
        String r_path = req.getServletContext().getRealPath("/usersimilarity") + "/UserSimilarityServiceRead.json";
        File r_file = new File(r_path);
        if (!r_file.exists()) {
            r_file.createNewFile();
        }
        FileWriter fw = new FileWriter(r_file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        json.writeJSONString(bw);
        bw.close();

        String w_path = req.getServletContext().getRealPath("/usersimilarity") + "/UserSimilarityServiceWrite.json";
        JythonUtil jythonUtil = new JythonUtil();
        String result  = jythonUtil.userSimilarity(r_path,w_path);
        Map resultMap = new HashMap();
        if(result.contains("OK")){
            File w_file = new File(w_path);
            ObjectMapper mapper = new ObjectMapper();
            Map value = (Map)mapper.readValue(w_file,Map.class);
            resultMap.put("userSimilarity",value.get("userSimilarity"));
            resultMap.put("trajectory",(ArrayList)value.get("trajectory"));

        }

        return returnHelper.returnNau(resultMap,1000,"服务器正常");
    }

    @Override
    public Object indoorUserSimilarity(JSONObject queryString, HttpServletRequest req) throws Exception {
        Integer mapId = queryString.getInteger("mapID");
        Integer userAId= queryString.getInteger("userAID") ;
        Integer userBId= queryString.getInteger("userBID") ;
        String startDate= queryString.getString("startDate") + " 00:00:00";
        String endDate = queryString.getString("endDate") + " 23:59:59";
        long startTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(startDate, new ParsePosition(0)).getTime()/ 1000;
        long endTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(endDate, new ParsePosition(0)).getTime()/ 1000;
        List trajectoriesAJson = new ArrayList();
        List trajectoriesBJson = new ArrayList();
        TrajectoryExample example = new TrajectoryExample();
        TrajectoryExample.Criteria criteria = example.createCriteria();

        TrajectoryExample example2 = new TrajectoryExample();
        TrajectoryExample.Criteria criteria2 = example2.createCriteria();

        criteria.andUserIdEqualTo(userAId).andMapIdEqualTo(mapId).andStartTimeGreaterThanOrEqualTo(startTime).andEndTimeLessThanOrEqualTo(endTime);
        List<Trajectory> trajectoriesA = trajectoryMapper.selectByExample(example);
        example.clear();
        criteria2.andUserIdEqualTo(userBId).andMapIdEqualTo(mapId).andStartTimeGreaterThanOrEqualTo(startTime).andEndTimeLessThanOrEqualTo(endTime);
        List<Trajectory> trajectoriesB = trajectoryMapper.selectByExample(example2);

        for (Trajectory outTrajectory:trajectoriesA) {
            trajectoriesAJson.add(JSONObject.toJSON(outTrajectory));
        }
        for (Trajectory outTrajectory:trajectoriesB) {
            trajectoriesBJson.add(JSONObject.toJSON(outTrajectory));
        }
        Map jythonMap = new HashMap<>();
        jythonMap.put("userA",trajectoriesAJson);
        jythonMap.put("userB",trajectoriesBJson);
        JSONObject json = new JSONObject(jythonMap);
        String r_path = req.getServletContext().getRealPath("/usersimilarity") + "/IndoorUserSimilarityServiceRead.json";
        File r_file = new File(r_path);
        if (!r_file.exists()) {
            r_file.createNewFile();
        }
        FileWriter fw = new FileWriter(r_file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        json.writeJSONString(bw);
        bw.close();

        String w_path = req.getServletContext().getRealPath("/usersimilarity") + "/IndoorUserSimilarityServiceWrite.json";
        JythonUtil jythonUtil = new JythonUtil();
        String result  = jythonUtil.indoorUserSimilarity(r_path,w_path);
        Map resultMap = new HashMap();
        if(result.contains("OK")){
            File w_file = new File(w_path);
            ObjectMapper mapper = new ObjectMapper();
            Map value = (Map)mapper.readValue(w_file,Map.class);
            resultMap.put("userSimilarity",value.get("userSimilarity"));
            resultMap.put("trajectory",(ArrayList)value.get("trajectory"));

        }

        return returnHelper.returnNau(resultMap,1000,"服务器正常");
    }
}
