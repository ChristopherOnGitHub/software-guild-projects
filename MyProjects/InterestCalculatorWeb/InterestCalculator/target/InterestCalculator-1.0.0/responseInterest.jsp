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
        <title>JSP Page</title>
    </head>
    <body>

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
</html>
