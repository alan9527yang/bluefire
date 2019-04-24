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
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
  <!-- <script type="text/javascript">
  	function requestByJson() {

         $.ajax({

                   type : 'post',

                   url : '${pageContext.request.contextPath}/query_user.action',

                   //设置contentType类型为json

                   contentType : 'application/json;charset=utf-8',

                   //json数据

                   data : '{"username":"杨一桢"}',

                   //请求成功后的回调函数

                   success : function(data) {

                            alert(data.username);

                   }

         });

};
		
  </script> -->
   
<script>
  $(':submit').on('click',function(){
		
		      $.ajax({
            url:"${pageContext.request.contextPath}/queryOutdoorTrajectoryByUserId.action",
            type:"POST",
            data:JSON.stringify($('form').serializeObject()),
            contentType:"application/json",  //缺失会出现URL编码，无法转成json对象
            success:function(){
                alert("成功");
            }
        });
		});
		
		 $.fn.serializeObject = function() {
        var o = {};
        var a = this.serializeArray();
        $.each(a, function() {
            if (o[this.name]) {
                if (!o[this.name].push) {
                    o[this.name] = [ o[this.name] ];
                }
                o[this.name].push(this.value || '');
            } else {
                o[this.name] = this.value || '';
            }
        });
        return o;
    };</script>
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"50131",secure:"50132"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-2" data-genuitec-path="/BlueFire-Platform/WebRoot/index.jsp">
    	<form action="user/findUser.action" method="POST" enctype='application/json' data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-2" data-genuitec-path="/BlueFire-Platform/WebRoot/index.jsp">
    		用户姓名：<input type="text" name="username"/><br>
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
    	<input type="button" value="json" onclick="requestByJson()"> 
    	<br>
    	<form action="${pageContext.request.contextPath}/queryOutdoorTrajectoryByUserId.action" method="post" onclick="click()">
    <input type="text" name="out_user_id">
    <input type="submit" value="查询"/>
</form>
  </body>
  
</html>
