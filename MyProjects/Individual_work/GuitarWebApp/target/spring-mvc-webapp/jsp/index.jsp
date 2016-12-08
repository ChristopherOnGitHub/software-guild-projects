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
            <h1>Super Cool Guitar Thing</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/index">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/addGuitar">Add a guitar</a></li>
                </ul>    
            </div>
                <h2>Inventory: </h2><hr/>
            <c:forEach items="${guitarMap}" var="guitar">

                <s:url value="/editForm" var="editOrderLink">
                    <s:param name="serial" value="${guitar.serial}">
                    </s:param>
                </s:url>
                
                <s:url value="/deleteOrder" var="deleteOrderLink">
                    <s:param name="serial" value="${guitar.serial}">
                    </s:param>
                </s:url>
                
                ${guitar.make} - ${guitar.model} 
                - <a href="${editOrderLink}">Edit Product</a>
                - <a href="${deleteOrderLink}">Delete Product</a>
                <br/>

            </c:forEach>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>