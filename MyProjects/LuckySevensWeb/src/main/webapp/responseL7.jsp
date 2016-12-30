<%-- 
    Document   : response
    Created on : Oct 22, 2016, 3:29:31 PM
    Author     : apprentice
--%>

<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="/LuckySevensWeb/Stylesheet/LuckySevensStylesheet.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lucky Sevens Results</title>
    </head>

    <body>
    <center>

        <c:if test="${badInput}">
            <h1>
                Bad Input
            </h1>
        </c:if>

        <c:if test="${!badInput}">
            <h1>You Lose!</h1>
            <h3>Starting Bet: $<c:out value="${beginningBet}"></c:out></h3>
            <h3>Number of Rolls Before Broke: <c:out value="${rolls}"></c:out></h3>
            <h3>Maximum Won: $<c:out value="${maxWin}"></c:out></h3>
            <h3>Max Won on Roll: <c:out value="${maxWinRoll}"></c:out></h3>
        </c:if>

        <a href="http://localhost:8080/LuckySevensWeb">
            Play Again!
        </a>

    </center>
</body>

</html>