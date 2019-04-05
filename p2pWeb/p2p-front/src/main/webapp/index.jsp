<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ page import="com.aluo.domain.User"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>网站前台首页</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/css/index.css" />

</head>

<body>
	<div id="head">
		<div id="top">
		<div id = "contact" ></div>
		  <div id="userArea">
			<%
				User user = (User) session.getAttribute("user");
			%>
			<%
				if (user == null) {
			%>
			<li style="color:#a6a6a6;"><span class="top_nr_li_span"></span><a
				href="user/registerJsp" target="_blank">免费注册</a></li>
			<li style="color:#a6a6a6;"><span class="top_nr_li_span"></span><a
				href="user/loginJsp" target="_blank">立即登录</a></li>
			<%
				} else {
			%>
			<p>
				hi <span><%=user.getMobile()%></span>, 欢迎回来!
			</p>
			<a class="top_nr_li_span_loginout" href="user/loginOut">&nbsp;&nbsp;退出</a>
			<%
				}
			%>
			</div>
		</div>
		<div id="navigator">  
		 <div id = "logo"></div>   
		<ul>
		<li><a href = "#">首页</a></li>
		<li><a href = "#">我要出借</a></li>
		<li><a href = "#">我的账户</a></li>
		<li><a href = "#">信息披露</a></li>
		<li><a href = "#">安全中心</a></li>
		<li><a href = "#">关于我们</a></li>
		</ul>
		</div>
	</div>
	<div id="content">
	 <div id = "banner">banner</div>
	标的信息</div>
	<div id="foot">帮助中心 新手指引 常见问题 自助服务 联系客服 关于我们 公司简介 管理团队 招贤纳士 联系我们
	</div>
</body>
</html>
