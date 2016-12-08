<%-- 
    Document   : responseFctr
    Created on : Oct 22, 2016, 5:00:34 PM
    Author     : apprentice
--%>

<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factorizer Results</title>
    </head>
    <body>
    <center>
        <c:if test="${badInput}">
            <h1>
                Bad Input
            </h1>
        </c:if>

        <c:if test="${!badInput}">
            <h1>Factors: </h1>
            <c:forEach items="${factors}" var="factor">
                ${factor}
                </br>
            </c:forEach>

            <c:if test="${prime==1}">
                <h6>This is a prime number</h6>
            </c:if>

            <c:if test="${perfTracker==0}">
                <h6>This is a perfect square</h6>
            </c:if>

            <c:if test="${badInput}">
                <h6>You have entered bad input</h6>
            </c:if>
        </c:if>

        <a href="http://localhost:8080/FactorizerWeb/Factorizer.html">
            Factorizerrrrrrrrrrrrrrrrr
        </a>
    </center>

</body>
</html>
