<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>QuizPage</title>
</head>
<body>

Użytkownik: <b><security:authentication property="principal.username"/></b><br>
<a href="/"> Powrót do strony głównej</a><br>

<h3>Wynik: ${score}/10</h3>

</body>

</html>
