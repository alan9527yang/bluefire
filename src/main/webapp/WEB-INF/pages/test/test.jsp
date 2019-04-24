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
    
    <title>test.jsp</title>
   

  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"50131",secure:"50132"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-0" data-genuitec-path="/BlueFire-Platform/WebRoot/WEB-INF/pages/test/test.jsp">
    	<form action="user/findUser.action" method="POST" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-0" data-genuitec-path="/BlueFire-Platform/WebRoot/WEB-INF/pages/test/test.jsp">
    		用户姓名：<input type="text" name="username"/></br>
    		<input type="submit" value="查询"/>
    	</form>
    	<table border="1" width="100%" class="tab">
    		<tr>
    			<td>用户id</td><td>姓名</td><td>用户分析表id</td>
    		</tr>
    		<c:forEach items="${userlist}" var="user" varStatus="status">
    		<tr>
    			<td>${user.userId}</td><td>${user.username}</td><td>${user.userAnalysisId}</td>
    		</tr>
    		</c:forEach>

    	</table>
  </body>
</html>
