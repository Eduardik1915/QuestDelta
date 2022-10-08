<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Quest</title>
</head>
<body>

<form>
    <b>${requestScope.question.text}</b>
    <br>
    <c:forEach var="answer" items="${requestScope.answers}">
        <button name="questId" value="${answer.nextQuestion}" type="submit">${answer.text}</button>
    </c:forEach>
</form>

</body>
</html>