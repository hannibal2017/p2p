<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body>
  注册信息：<br>
  <form action = "register" method = "post">
  手机号码：<input type = "text" name = "mobile"><br>
  密码：<input type = "password" name = "pass"><br>
  身份证：<input type = "text" name = "IDCard"><br>
  邀请人：<input type = "text" name = "invitor"><br>
    <input type = "submit" value = "register"><br>
  </form>
</body>
</html>