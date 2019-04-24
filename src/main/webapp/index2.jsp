<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	<script type="text/javascript" src="./js/jquery-1.8.3.js"></script>
	<script type="text/javascript">
		$(function() {
			$("button").click(function() {
				$.ajax({
				   type : 'post',
					url:'query_t.action',
					contentType : 'application/json;charset=utf-8',

                   //json数据

                   data : '{"trajectory_id":1}',

                   //请求成功后的回调函数

                 /*   success : function(data) {

                            alert(data.userName);

                   } */
					
				});
			});
		});
	</script>
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"50131",secure:"50132"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-3" data-genuitec-path="/BlueFire-Platform/WebRoot/index2.jsp">
    <button data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-3" data-genuitec-path="/BlueFire-Platform/WebRoot/index2.jsp">提交Ajax请求</button>
  </body>
</html>
