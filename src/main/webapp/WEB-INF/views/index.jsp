<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>IndexPage</title>
</head>
<body>

<h1>Index</h1>
<div class="container">
    Witaj <b><span sec:authentication="principal.username">User</span></b>
    <br>
    <br>
    <span id="go">Aby przejść do quizu kliknij tutaj: <a href="/quiz">quiz</a></span>
    <br>
    <br>

    <span><b>Informacje o projekcie</b></span><br>

    <span>Użyte technologie:</span><br>
    <li>java</li>
    <li>spring framework</li>
    <li>thymeleaf</li>
    <li>mysql</li>
    <li>maven</li>
    <span>Andrzej Szczap s458010</span><br>

</div>


</body>

</html>
