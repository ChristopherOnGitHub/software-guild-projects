<!DOCTYPE html>
<html>
    <head>
        <title>Interest Calculator</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>

        <div class="container">
            <h1>Interested in the interest calculator, are we?</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/index">Home</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/interestIndex">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/unitIndex">Unit Converter</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/Factorizer">The Factorizer</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/FlooringIndex">Flooring Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/L7Index">Lucky Sevens</a></li>
                </ul>    
            </div>
        </div>

    <center>
        <h1>Welcome to the <i>~Interest Calculator~</i></h1>
        <form method="POST" action="InterestCalculator">
            Beginning balance: <input type="text" name="beginYearPrinciple">
            </br>
            </br>
            Years until account close: <input type="text" name="yearsUntilClose">
            </br>
            </br>
            Interest period:
            <select name="timePeriod">
                <option value="1">Yearly</option>
                <option value="2">Quarterly</option>
                <option value="3">Monthly</option>
                <option value="4">Daily</option>
            </select>
            </br>
            </br>
            Period interest rate: <input type="text" name="interestRate">
            </br>
            </br>
            <input type="submit" value="Just, DO IT!!!">
        </form>
    </center>

    <script src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

</body>
</html>
