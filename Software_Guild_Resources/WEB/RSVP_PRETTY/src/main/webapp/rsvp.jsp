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
                        <a class="nav-link active" href="/RSVP_PRETTY">RSVP</a>
                    </li>
                </ul>
            </div>
            <div class="col-sm-offset-2 col-sm-8">
                <form class="form-horizontal" action="RSVP" method="POST">
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="name">What's your name?</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="name" id="name" placeholder="NAME">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="name">Can you come to my party?!</label>
                        <div class="col-sm-10">
                            <label class="radio-inline"><input type="radio" name="RSVP" value="fosho">YES!</label>
                            <label class="radio-inline"><input type="radio" name="RSVP" value="nah">no</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="llamas">How many llamas can you bring?</label>
                        <div class="col-sm-10">
                            <input type="number" name="llamas" id="llamas" min="0" max="100" step="10" value="30">
                        </div>
                    </div>                    
                    <div class="form-group"> 
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default">Submit</button>
                        </div>
                    </div>
                </form>
            </div>

        </div>

    </body>
</html>
