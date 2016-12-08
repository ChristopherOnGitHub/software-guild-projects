<%-- 
    Document   : response.jsp
    Created on : Oct 20, 2016, 10:25:35 AM
    Author     : ahill
--%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RSVP PAGE!</title>
    </head>
    <body>

        <h1><c:out value="${msgInABottle}" 
               default="How did YOU get here?! Go back and RSVP!!!" /></h1>

        <c:if test="${badInput}">
            <p>I don't appreciate you trying to game the form like that, you PUNK.</p>
        </c:if>

        <c:if test="${!badInput}">
            <h1>TONS of people are interested, but these are folks who have said yes so far...</h1>
            <c:forEach items="${partyList}" var="person">
                ${person}
            </c:forEach>
        
        </c:if>
    </body>
</html>
