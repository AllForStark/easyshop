<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生列表</title>
</head>
<body>
	<c:forEach items ="${students }" var = "s">
	
		id：${s.id}
		姓名：${s.name}
		年龄：${s.age}
		生日：${s.birthday}
		邮箱：${s.email}
	</c:forEach>
</body>
</html>