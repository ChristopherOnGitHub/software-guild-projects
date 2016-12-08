<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pet Shelter Of Awesomeness Web Application</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/rainbow.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        <div class="container">
            <h1 class="rainbow">Please Log In!</h1>
            <hr/>

            <c:if test="${param.login_error == 1}" >
                <h3>WRONG ID OR PASSWORD! PLEASE TRY AGAIN!</h3>
            </c:if>
            <div class="row">
                <form method="POST" action="j_spring_security_check">
                    UseName:<input name="j_username"/> <!-- userName -->
                    Password:<input name="j_password"/> <!-- passWord -->
                    <input type="submit" value="Sign In"/> <!-- button -->
                </form>
                
            </div>
        </div>

        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

