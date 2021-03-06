<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
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
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/ajaxFree//home">No Ajax Home</a></li>    
                    <li role="presentation"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/stats">Stats</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/addPets">Add Random Pets</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/ajaxFree/add">Add A Pet Form</a></li>
                </ul>    
            </div>

            <div class="col-lg-offset-3 col-lg-6">
                <h1>Edit Pet Record:</h1>
                <sf:form modelAttribute="editThisPet" action="/PetShelterWebApplication/ajaxFree/editWithSpring" method="POST">
                    Name:<sf:input type="text" path="name" placeholer="Pet Name"/><br/>
                    <sf:errors path="name"></sf:errors><br/> 
                    Breed:<sf:input type="text" path="breed" placeholer="Pet Name"/><br/>
                    <sf:errors path="breed"></sf:errors><br/> 
                    Disposition:<sf:input type="text" path="disposition" placeholer="Pet Name"/><br/>
                    <sf:errors path="disposition"></sf:errors><br/> 
                    Vaccinated?:<sf:checkbox path="vacinated" /><br/>
                    <sf:errors path="vacinated"></sf:errors><br/> 
                    <sf:hidden path="id"/>
                    <button type="submit">Edit Pet</button>
                </sf:form>
            </div>

        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>