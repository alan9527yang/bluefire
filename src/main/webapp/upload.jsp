<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"50131",secure:"50132"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-4" data-genuitec-path="/BlueFire-Platform/WebRoot/upload.jsp">
<form action="${pageContext.request.contextPath}/Integererface/data_manage/upload.action" method="post" enctype="multipart/form-data" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-4" data-genuitec-path="/BlueFire-Platform/WebRoot/upload.jsp">
    文件：<input type="file" name="jsonFile"/><br>
    <input type="submit" value="上传"/>
</form>
<form action="${pageContext.request.contextPath}/Integererface/data_manage/mapmatching.action" method="post" enctype="multipart/form-data">
    
    <input type="submit" value="地图匹配"/>
</form>
<form action="${pageContext.request.contextPath}/queryOutUser.action" method="post" enctype="multipart/form-data">
    
    <input type="submit" value="室外用户列表"/>
</form>
<form action="${pageContext.request.contextPath}/queryTrajectoryByOutTrajectoryId.action" method="post" >
    
    <input type="submit" value="查询"/>
</form>
<form action="${pageContext.request.contextPath}/queryTrajectoryForecastResult.action" method="post" >

    <input type="submit" value="查询2"/>
</form>
<form action="${pageContext.request.contextPath}/compression.action" method="post" >

    <input type="submit" value="轨迹压缩"/>
</form>
<form action="${pageContext.request.contextPath}/heatMap.action" method="post" >

    <input type="submit" value="热力图"/>
</form>
<form action="${pageContext.request.contextPath}/Integererface/analysis/getOutdoorSimilarity" method="post" >

    <input type="submit" value="用户相似度"/>
</form>
<form action="${pageContext.request.contextPath}/interest" method="post" >

    <input type="submit" value="兴趣度与经验值"/>
</form>
<form action="${pageContext.request.contextPath}/Integererface/data_manage/queryMapByMapId" method="post">
    <input type="submit" value="查询所有室内地图">

</form>
</body>
</html>