<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
</head>

<body>
	<form action="user/hello" method="post">
		<table>
			<tr>
				<td>登录名：</td>
				<td><input type="text" name="username" placeholder="请输入登录名"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password" placeholder="请输入登录名"></td>
			</tr>
		</table>
		<input type="reset" value="重置">
		<input type="submit" value="提交">
	</form>
	<p>${requestScope.error }</p>
</body>
</html>
