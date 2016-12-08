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
            <h1 class="rainbow">Pets Available For Adoption!</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/stats">Stats</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/j_spring_security_logout">Logout</a></li>
                </ul>    
            </div>
            <!-- we're going to add in the new display for our pets -->
            <div class="row">
                <!-- pet display table -->
                <div class="col-md-6">
                    <h2 class="rainbow">Pets!!</h2>
                    <%@include file="petTableFragment.jsp" %>
                </div>
                <!-- our pet add form -->
                <div class="col-md-6">
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="add-pet-name" class="col-md-4 control-label">Pet Name:</label>
                            <div class="col-md-8">
                                <input id="add-pet-name" name="petName" type="text" class="form-control" placeholder="Pet Name" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-pet-breed" class="col-md-4 control-label">Pet Breed</label>
                            <div class="col-md-8">
                                <input id="add-pet-breed" name="petBreed" type="text" class="form-control" placeholder="Breed" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-pet-disposition" class="col-md-4 control-label">Pet Disposition:</label>
                            <div class="col-md-8">
                                <input id="add-pet-disposition" name="petDisp" type="text" class="form-control" placeholder="Disposition" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-pet-vaccinated" class="col-md-4 control-label">Vaccinated?:</label>
                            <div class="col-md-8">
                                <input id="add-pet-vaccinated" name="petVacc" type="checkbox" class="form-control"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-offset-4 col-md-8">
                                <button type="submit" id="add-button" class="rainbow btn btn-default">Add Pet Record</button>
                            </div>
                        </div>                        
                    </form>
                    <!-- make a new div, to hold our add form field errors, make it RED w/ class alert, alert-danger, but don't show immediately w/ style display:none -->
                    <div id="validationErrors" class="alert alert-danger" style="display:none"></div>
                </div>
            </div>
        </div>

        <%@include file="detailModalFragment.jsp" %>
        <%@include file="editModalFragment.jsp" %>

        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/petShelter.js"></script>

    </body>
</html>

