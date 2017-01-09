<%-- 
    Document   : UnitConverterRespons
    Created on : Oct 27, 2016, 6:54:39 PM
    Author     : apprentice
--%>

<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversion results</title>
    </head>
    <body>

        <c:if test="${badInput}">
            <h1>
                Bad Input!
            </h1>
        </c:if>

        <c:if test="${!badInput}">
            <h1>Conversion success</h1>
            <br/>
            <h2><c:out value="${amount}"></c:out></h2>
        </c:if>
            
        <a href="http://localhost:8080/UnitConverter/">Make another conversion</a>
    </body>
</html>
