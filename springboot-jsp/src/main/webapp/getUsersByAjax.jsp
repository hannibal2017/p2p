<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>test jquery ajax json</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/scripts/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		/* $.post("getUserListToJsonString", function(data, status) {
			$("#users").html(data);
		}); */

		$.ajax({
			type : "POST",
			url : "getUserListToJsonString",
			dataType : "json",
			cache : false,
			async : false,
			data : "",
			success : function(data) {
				$("#users").html(JSON.stringify(data));
				<!--循环获取json的值 -->
				var con="";
				$.each(data, function(index, value1) {
					$.each(value1, function(index, value2) {
						$.each(value2, function(index, value3) {
							con += "<tr><td>" + index + "&nbsp;&nbsp;" + "</td><td>" + value3 + "</td></tr>"
						});
						$("#users").html(con);
					});
				});
			}
		});

		$("a:eq(0)").click(function() {
			$.get("getUserListToJsonString", function(data, status) {
				alert("数据get userList：" + data + "\n状态：" + status);
			});
			return false;
		});
		$("a:eq(1)").click(function() {
			$.post("getUserListToJsonString", function(data, status) {
				/* alert("数据post userList：" + data + "\n状态：" + status); */
				$("#users").html(data);
			});
			return false;
		});
	});
</script>
</head>

<body>
	<a href="#">get userList</a>
	<a href="#">post userList</a>
	<div id="users"></div>
</body>
</html>
