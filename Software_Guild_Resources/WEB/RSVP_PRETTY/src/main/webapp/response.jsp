<%-- 
    Document   : rsvp
    Created on : Oct 21, 2016, 10:19:51 AM
    Author     : apprentice
--%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <!-- 2.2.4 compiled and minified jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-sm-offset-2 col-sm-8">
                <ul class="nav nav-pills">
                    <li class="nav-item">
                        <a class="nav-link" href="/RSVP_PRETTY">RSVP</a>

                </ul>
            </div>
            <div class="col-sm-offset-2 col-sm-8">

                <div class="jumbotron">
                    <h1 class="display-3"><c:out value="${msg}" default="Why are YOU here???"/></h1>
                </div>
                <c:if test="${!badInput}">
                    <h2 class="row">So far, there are going to be <c:out value="${llamas}" default="NO" /> llamas at this party!</h2>
                    <hr/>
                </c:if>
                <c:if test="${!badInput && isComing}">
                    <h2 class="row">Here's the other people who are coming!</h2>
                    <!-- The below is how you iterate over a list attribute -->
                    <c:forEach items="${partyList}" var="attendee" varStatus="status">
                        <!-- Here's a fancy if/else setup for JSTL -->
                        <c:choose>
                            <c:when test="${status.count % 7 == 0}">
                                <div class="col-sm-1 bg-danger">
                            </c:when>
                            <c:when test="${status.count % 5 == 0}">
                                <div class="col-sm-1 bg-info">
                            </c:when>
                            <c:when test="${status.count % 3 == 0}">
                                <div class="col-sm-1 bg-warning">
                            </c:when>
                            <c:when test="${status.count % 2 == 0}">
                                <div class="col-sm-1 bg-success">
                            </c:when>
                            <c:otherwise>
                               <div class="col-sm-1">
                            </c:otherwise>
                        </c:choose>
                            ${attendee} 
                        </div>
                    </c:forEach>

                </c:if>


            </div>

        </div>

    </body>
</html>
