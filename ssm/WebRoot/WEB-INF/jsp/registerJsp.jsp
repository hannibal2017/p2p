<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
</head>
<body>
	<!-- form表单方式提交数据 -->
	<form action="registerByForm" method="post">
		<table>
			<tr>
				<td>手机号码:</td>
				<td><input name="phone" size="15"></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input name="password" size="15"></td>
			</tr>
			<tr>
				<td><button type="submit" id="button_submit">提交</button></td>
				<td><button type="reset">重置</button></td>
			</tr>
		</table>
	</form>
</body>
</html>