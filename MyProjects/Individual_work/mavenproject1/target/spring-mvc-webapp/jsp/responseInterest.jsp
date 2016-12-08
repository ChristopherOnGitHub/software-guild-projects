<%-- 
    Document   : responseInterest
    Created on : Oct 22, 2016, 6:23:02 PM
    Author     : apprentice
--%>

<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Interest Achieved!</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <div class="container">
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/index">Home</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/interestIndex">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/unitIndex">Unit Converter</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/Factorizer">The Factorizer</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/FlooringIndex">Flooring Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/L7Index">Lucky Sevens</a></li>
                </ul>    
            </div>
        </div>

        <c:if test="${badInput}">
            <h1>
                Bad Input!
            </h1>
        </c:if>

        <c:if test="${!badInput}">
            <h2>Current Year: </h2><h3><c:out value="${currentYear}"></c:out></h3>
                </br>
                <h2>Final Account Balance: </h2><h3>$<c:out value="${beginYearPrinciple}"></c:out></h3>
                </br>
                <h2>Interest Earned: </h2><h3>$<c:out value="${totalEarned}"></c:out></h3>
                </br>
                <h2>Interest Earned Final Year: </h2><h3>$<c:out value="${interestEarnedThisYear}"></c:out></h3>
                </br>
                <h3>With Just A : $<c:out value="${initialPrinciple}"></c:out> investment</h3>
                </br>
        </c:if>

        <a href=http://localhost:8080/InterestCalculator/index.html>
            Do another calculation
        </a>
    </body>

    <script src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

</html>
