<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Christopher Floyd</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        <div>
            <center><h1>Welcome to ChristopherFloyd.com</h1></center>
        </div>
        
        <hr style='border-color: black'>

        <div class="col-lg-12" style="padding-top: 50px">
            <div class="col-sm-2"></div>        
            <div class="col-sm-2" id='sg'>
                <img src="img/sg_logo.png" style="width: 100%; height: 240px" class='imgLink'>
            </div>
            <div class="col-sm-2" id='ghub'>
                <img src="img/github_logo.png" style="width: 100%; height: 240px" class='imgLink'>
            </div>
            <div class="col-sm-2" id='lin'>
                <img src="img/linkedInEdit2.png" style="width: 100%; height: 240px" class='imgLink'>
            </div>
            <div class="col-sm-2" id='resume'>
                <img src="img/Resume.png" style="width: 100%; height: 220px" class='imgLink'>
            </div>        
            <div class="col-sm-2"></div>
        </div>

        <div class="col-sm-12" style="padding-top: 50px; padding-bottom: 50px">
            <div class="col-sm-2"></div>
            <div style="">
                <div class="col-sm-8" style="background-color: transparent;border: 3px solid #040404">
                    <h3 id="content">
                        <img src="img/headshot.jpg" style="height: 30%; width: 30%; border-radius: 50%; float: left; padding-bottom: 20px; padding-right: 20px">
                        Hello! and welcome to my professional web-site. My name is Christopher Floyd. 
                        I am currently searching for a junior developer position. Above is some information about myself. Included is information about
                        "The Software Guild" coding boot-camp. I have just recently graduated the java full-stack web development program.
                        Also included are links to my github account, my linkedIn account, and a current version of my resume. Click on
                        one of the above icons to get started.
                    </h3>               
                </div>
            </div>
            <div class="col-sm-2"></div>
        </div>

        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/operations.js"></script>

    </body>
</html>

