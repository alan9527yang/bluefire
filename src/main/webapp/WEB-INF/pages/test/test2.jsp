<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>test2.jsp</title>
   

  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"50131",secure:"50132"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-1" data-genuitec-path="/BlueFire-Platform/WebRoot/WEB-INF/pages/test/test2.jsp">
    	<table border="1" width="100%" class="tab" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-1" data-genuitec-path="/BlueFire-Platform/WebRoot/WEB-INF/pages/test/test2.jsp">
    		<tr>
    			<td>轨迹id</td><td>x</td><td>y</td><td>时间戳</td><td>地图id</td><td>POIid</td><td>停留点标识</td>
    		</tr>
    		<c:forEach items="${indoorPoints}" var="point" varStatus="status">
    		<tr>
    			<td>${point.trajectoryId}</td><td>${point.x}</td><td>${point.y}</td><td>${point.timestamp}</td><td>${point.mapId}</td><td>${point.poiId}</td><td>${point.stayMark}</td>
    		</tr>
    		</c:forEach>

    	</table>
  </body>
</html>
