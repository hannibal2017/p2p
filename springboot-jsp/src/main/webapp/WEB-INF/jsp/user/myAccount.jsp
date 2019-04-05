<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ page import="com.test.domain.User"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<%
		//用户失效,跳转登录
		if (request.getSession().getAttribute("user") == null) {
			response.sendRedirect("login");
			return;
		}
	%>
	我的账户：
	<%
		User user = (User) session.getAttribute("user");
	%>
	<%
		if (user == null) {
	%>
	<li style="color:#a6a6a6;"><span class="top_nr_li_span"></span><a
		href="#">免费注册</a></li>
	<li style="color:#a6a6a6;"><span class="top_nr_li_span"></span><a
		href="#">立即登录</a></li>
	<%
		} else {
	%>
	<p>
		hi <span><%=user.getPhone()%></span>, 欢迎回来!
	</p>
	<a class="top_nr_li_span_loginout" href="loginOut">&nbsp;&nbsp;退出</a>
	<%
		}
	%>
</body>
</html>
