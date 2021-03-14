<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>QuizPage</title>
</head>
<body>

Użytkownik: <b><span sec:authentication="principal.username">User</span></b><br>
<a href="/"> Powrót do strony głównej</a><br>

<h1>Quiz</h1>
<form method="post" action="${pageContext.request.contextPath}/question/submit">
    <ol type="1">
        <c:forEach var="question" items="${questions}">
            <li>${question.content}
                <input type="hidden" name="questionId" value="${question.id}">
                <ol type="a">
                    <c:forEach var="answer" items="${question.answers}">
                        <li>
                            <input type="radio" name="question_${question.id}" value="${answer.id}">
                                ${answer.content}
                        </li>
                    </c:forEach>
                </ol>
            </li>
        </c:forEach>
    </ol>
    <br>
    <input type="submit" value="Potwierdź">
</form>

</body>

</html>
