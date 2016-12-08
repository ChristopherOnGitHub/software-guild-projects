<%-- 
    Document   : responseTip
    Created on : Oct 22, 2016, 7:47:30 PM
    Author     : apprentice
--%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tip 'em real good</title>
    </head>
    <body>

        <c:if test="${badInput}">
            <h1>
                Bad Input
            </h1>
        </c:if>

        <c:if test="${!badInput}">
            <h1>Total to tip: $<c:out value="${result}"></c:out></h1>
        </c:if>
        <a href="http://localhost:8080/TipCalcWeb/index.html">
            Tip 'em Again!
        </a>

    </body>
</html>
