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
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <div class="container">
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/index">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/interestIndex">Interest Calculator</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/unitIndex">Unit Converter</a></li>
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
            <h1>Conversion success</h1>
            <br/>
            <h2><c:out value="${amount}"></c:out></h2>
        </c:if>

        <script src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
