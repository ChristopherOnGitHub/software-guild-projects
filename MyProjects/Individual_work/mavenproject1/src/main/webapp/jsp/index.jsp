<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Index Page</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        
        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        <div class="container">
            <h1>Home</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                	<li role="presentation" class="active"><a href="${pageContext.request.contextPath}/index">Home</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/interestIndex">Interest Calculator</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/unitIndex">Unit Converter</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/Factorizer">The Factorizer</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/FlooringIndex">Flooring Calculator</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/L7Index">Lucky Sevens</a></li>
                </ul>    
            </div>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

