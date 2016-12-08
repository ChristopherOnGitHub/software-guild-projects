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

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        <div class="container">
            <h1>Spring MVC Application from Archetype</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/stats">Stats</a></li>
                </ul>    

            </div>
            <div class="row">
                <div class="col-md-6">
                    <h2>Search Results</h2>
                    <%@include file="petTableFragment.jsp"%>
                </div>

                <div class="col-md-6">
                    <h2>Search Pets</h2>
                    <form class="form-horizontal" role="form">
                        Pet Name: <input type="text" name="petName" id="search-pet-name" class="form-control"/>
                        Pet Breed: <input type="text" name="petBreed" class="form-control"/>
                        Pet Disposition: <input type="text" name="petDisposition" class="form-control"/>
                        Pet Vaccinated: <input type="checkbox" name="#" class="form-control"/>
                        <button id="search-button" class="btn btn-default">Search Pets</button>
                    </form>
                </div>
            </div>
        </div>

        <%@include file="detailModalFragment.jsp"%>
        <%@include file="editModalFragment.jsp"%>

        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/petShelter.js"></script>

    </body>
</html>