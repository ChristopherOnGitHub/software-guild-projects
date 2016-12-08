<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hello Controller Page</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        <div class="container">
            <h1></h1>
            <hr/>
            <div class="navbar">
                 <ul class="nav nav-tabs">
                 <li role="presentation"><a href="${pageContext.request.contextPath}/index">Home</a></li>
                <li role="presentation"><a href="${pageContext.request.contextPath}/addGuitar">Add Guitar</a></li>
                <li role="presentation" class="active"><a href="#">Edit Order</a></li>
                </ul>
            </div>
                <h2>Edit this order</h2>
                <form method="POST" action="editForm">
                    <input name="specialSerial" type="hidden" value="${editThisOne.serial}"/>
                    Make: <input type="text" name="make" value="${editThisOne.make}"/><br/>
                    Model: <input type="text" name="model" value="${editThisOne.model}"/><br/>
                    Finish: <input type="text" name="finish" value="${editThisOne.finish}"/><br/>
                    <br/>
                    <input type="submit" value="Add to system">
                </form>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>