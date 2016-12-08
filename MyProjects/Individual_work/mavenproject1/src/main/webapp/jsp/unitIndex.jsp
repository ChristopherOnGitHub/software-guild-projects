<!DOCTYPE html>
<html>
    <head>
        <title>Unit Converter</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        
                <div class="container">
            <h1>Because 1 mile sounds better than 5,280 feet</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                	<li role="presentation"><a href="${pageContext.request.contextPath}/index">Home</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/interestIndex">Interest Calculator</a></li>
                	<li role="presentation" class="active"><a href="${pageContext.request.contextPath}/unitIndex">Unit Converter</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/Factorizer">The Factorizer</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/FlooringIndex">Flooring Calculator</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/L7Index">Lucky Sevens</a></li>
                </ul>    
            </div>
        </div>
        
        <h1>Imperial Unit Converter</h1>
        <form method="POST" action="convert">
            Unit type:
            <select id="measurements" name="measurements" onchange="display()">
                <option value="0">---</option>
                <option value="1">Distance</option>
                <option value="2">Volume</option>
                <option value="3">Mass</option>
            </select>
            <br/>
            <br/>

            <script type="text/javascript">

                function display() {
                    var x = document.getElementById("measurements").value;

                    if (x === "1") {
                        document.getElementById("distance").style = "visible";
                        document.getElementById("volume").style = "visibility: hidden";
                        document.getElementById("mass").style = "visibility: hidden";

                    } else if (x === "2") {
                        document.getElementById("volume").style = "visible";
                        document.getElementById("mass").style = "visibility: hidden";
                        document.getElementById("distance").style = "visibility: hidden";

                    } else if (x === "3") {
                        document.getElementById("mass").style = "visible";
                        document.getElementById("distance").style = "visibility: hidden";
                        document.getElementById("volume").style = "visibility: hidden";

                    } else {
                        document.getElementById("mass").style = "visibility: hidden";
                        document.getElementById("distance").style = "visibility: hidden";
                        document.getElementById("volume").style = "visibility: hidden";
                    }
                }
            </script>

            <div style="visibility: hidden" id="distance">
                <select id="dUnit1" name="dUnit1">
                    <option value="1">Inches</option>
                    <option value="2">Feet</option>
                    <option value="3">Yards</option>
                    <option value="4">Miles</option>
                </select>
                to
                <select id="dUnit2" name="dUnit2">
                    <option value="1">Inches</option>
                    <option value="2">Feet</option>
                    <option value="3">Yards</option>
                    <option value="4">Miles</option>
                </select>
            </div>

            <div id='volume' style="visibility: hidden">
                <select id="vUnit1" name="vUnit1">
                    <option value="1">Cups</option>
                    <option value="2">Pints</option>
                    <option value="3">Quarts</option>
                    <option value="4">Gallons</option>
                </select>
                to
                <select id="vUnit2" name="vUnit2">
                    <option value="1">Cups</option>
                    <option value="2">Pints</option>
                    <option value="3">Quarts</option>
                    <option value="4">Gallons</option>
                </select>
            </div>

            <div id='mass' style="visibility: hidden">
                <select id="mUnit1" name="mUnit1">
                    <option value="1">Grams</option>
                    <option value="2">Ounces</option>
                    <option value="3">Pounds</option>
                    <option value="4">Tons</option>
                </select>
                to
                <select id="mUnit2" name="mUnit2">
                    <option value="1">Grams</option>
                    <option value="2">Ounces</option>
                    <option value="3">Pounds</option>
                    <option value="4">Tons</option>
                </select>
            </div>
            
            <div>
                <input type="text" name="amount">
            </div>    

            <input type="submit" value="submit">
        </form>

        <script src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        
    </body>
</html>
