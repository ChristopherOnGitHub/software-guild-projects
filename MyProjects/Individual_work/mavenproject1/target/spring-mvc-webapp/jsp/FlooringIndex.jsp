<!DOCTYPE html>
<html>
    <head>
        <title>Flooring Calculator</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>

        <div class="container">
            <h1>Floor Me!</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/index">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/interestIndex">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/unitIndex">Unit Converter</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/Factorizer">The Factorizer</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/FlooringIndex">Flooring Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/L7Index">Lucky Sevens</a></li>
                </ul>    
            </div>
        </div>

        <h1>Flooring Calculator</h1>
        <br/>
        <br/>
        <form method="POST" action="calculate">
            Width of project area: <input type="text" name="width"><br/><br/>
            Length of project area: <input type="text" name="length"><br/><br/>
            Cost per square foot of project area: <input type="text" name="costSqFt"><br/><br/>
            <input type="submit" value="Calculate">
        </form>

        <script src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>
