<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Index Page</title>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

    </head>
    <body>
        <div class="container">
            <center><h1>VENDING MACHINE DELUXE</h1></center>
            <hr>
        </div>

        <!-- stock table -->

        <div class="col-md-9">
            <table>
            <tbody id="stockTable"></tbody>
            </table>
        </div>

        <!-- money and change -->

        <div class="col-md-3">
            <div>
                <h1 style="display:inline">$</h1>
                <h1 style="display:inline" id="currentMoney"></h1>
            </div>
            <br/>
            <button id="addNickel">$0.05</button>
            <button id="addDime">$0.10</button>
            <button id="addQuarter">$0.25</button>
            <button id="addDollar">$1.00</button>
            <button id="reset">Reset</button>
        </div>

        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/vendingFunctions.js"></script>

    </body>
</html>

