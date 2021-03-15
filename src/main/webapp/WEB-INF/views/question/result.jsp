<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>QuizPage</title>
</head>
<body>

Użytkownik: <b><span sec:authentication="principal.username">User</span></b><br>
<a href="/"> Powrót do strony głównej</a><br>

<h1>Twój wynik to: </h1>
Score: ${score}


</body>

</html>
