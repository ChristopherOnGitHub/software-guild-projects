<%-- 
    Document   : FlooringRespons
    Created on : Oct 25, 2016, 7:58:59 PM
    Author     : apprentice
--%>

<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Floor Calculations</title>
    </head>
    <body>
        <c:if test="${badInput}">
            <h1>
                Bad Input
            </h1>
        </c:if>

        <c:if test="${!badInput}">    
            <h1>Results</h1>
            <br/>
            <br/>
            <h3>Material Cost: $<c:out value="${materialCost}"></c:out></h3>
            <h3>Labor Cost: $<c:out value="${laborCost}"></c:out></h3>
            <h3>Total Cost: $<c:out value="${totalCost}"></c:out></h3>
        </c:if>    
    </body>
</html>
