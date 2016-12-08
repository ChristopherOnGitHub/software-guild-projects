<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DVD Library</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="col-md-6">
            <center><h1>DVD Library</h1></center>
            <%@include file="movieTable.jsp"%>
        </div>

        <div>
            <form class="form-horizontal" role="form">

                <div class="container col-md-6">
                    
                    <center><h1>Add New Movie</h1></center>
                    
                    <div class="form-group"
                         <label for="addTitle">Title:</label>
                        <input id="addMovieTitle" name="movieTitle" type="text" class="form-control"/>
                    </div>     


                    <div>
                        <div class="form-group"
                             <label for="addRelease">Release:</label>
                            <input id="addMovieRelease" name="movieRelease" type="number" class="form-control"/>
                        </div>     
                    </div>

                    <div>
                        <div class="form-group">
                            <label for="addRating">Rating:</label>
                            <select id="addMovieRating" name="movieRating" class="form-control"/>
                            <option value="G">G</option>
                            <option value="PG">PG</option>
                            <option value="PG-13">PG-13</option>
                            <option value="R">R</option>
                            <option value="NR">NR</option>
                            </select>
                        </div>     
                    </div>

                    <div>
                        <div class="form-group"
                             <label for="addDirector">Director:</label>
                            <input id="addMovieDirector" name="movieDirector" type="text" class="form-control"/>
                        </div>     
                    </div>

                    <div>
                        <div class="form-group"
                             <label for="addStudio">Studio:</label>
                            <input id="addMovieStudio" name="movieStudio" type="text" class="form-control"/>
                        </div>     
                    </div>

                    <div>
                        <div class="form-group"
                             <label for="addUserRating">User Rating:</label>
                            <input id="addUserRating" name="movieUserRating" type="text" class="form-control"/>
                        </div>     
                    </div>
                    
                    <div>
                        <div class="form-group">
                            <button type="submit" id="add-button" class="btn btn-default">
                                Add to the database
                            </button>
                        </div>
                    </div>

            </form>
            <div id="validationErrors" class="alert alert-danger" style="display:none"></div>
        </div>
                
        <%@include file="movieModal.jsp"%>
        <%@include file="editModal.jsp"%>




        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/functions.js"></script>
    </body>
</html>
