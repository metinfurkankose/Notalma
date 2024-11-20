<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
deneme deneme
<br>
<c:forEach begin="0" step="1" end="10">
    a
</c:forEach>
<p>Temp Attr : ${tempattr}</p>
<p>Sayı : ${sayi}</p>
</body>
</html>