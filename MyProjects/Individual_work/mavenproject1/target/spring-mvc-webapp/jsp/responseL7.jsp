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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>You Lose!</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    </head>

    <body>

        <div class="container">
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/index">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/interestIndex">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/unitIndex">Unit Converter</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/Factorizer">The Factorizer</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/FlooringIndex">Flooring Calculator</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/L7Index">Lucky Sevens</a></li>
                </ul>    
            </div>
        </div>

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
            <h3>Max Won on Roll #<c:out value="${maxWinRoll}"></c:out></h3>
        </c:if>

        <script src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </center>
</body>

</html>