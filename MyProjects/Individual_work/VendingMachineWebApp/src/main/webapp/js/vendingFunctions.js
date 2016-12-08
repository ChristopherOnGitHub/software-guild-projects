

$(document).ready(function () {
    var oldMoney = 0.00;
    loadStock();
    document.getElementById("currentMoney").innerHTML = oldMoney.toFixed(2);

    $("#addNickel").click(function (event) {
        event.preventDefault();
        oldMoney = parseFloat(document.getElementById("currentMoney").innerHTML);
        oldMoney = oldMoney + 0.05;
        document.getElementById("currentMoney").innerHTML = oldMoney.toFixed(2);
    });

    $("#addDime").click(function (event) {
        event.preventDefault();
        oldMoney = parseFloat(document.getElementById("currentMoney").innerHTML);
        oldMoney = oldMoney + 0.10;
        document.getElementById("currentMoney").innerHTML = oldMoney.toFixed(2);
    });

    $("#addQuarter").click(function (event) {
        event.preventDefault();
        oldMoney = parseFloat(document.getElementById("currentMoney").innerHTML);
        oldMoney = oldMoney + 0.25;
        document.getElementById("currentMoney").innerHTML = oldMoney.toFixed(2);
    });

    $("#addDollar").click(function (event) {
        event.preventDefault();
        oldMoney = parseFloat(document.getElementById("currentMoney").innerHTML);
        oldMoney = oldMoney + 1;
        document.getElementById("currentMoney").innerHTML = oldMoney.toFixed(2);
    });

    $("#reset").click(function (event) {
        event.preventDefault();
        oldMoney = 0;
        document.getElementById("currentMoney").innerHTML = oldMoney.toFixed(2);
    });

    $("#priceButton").click(function (event) {
        event.preventDefault();

        buyItem();
    });

});

function loadStock() {
    clearStock();

    $.ajax({
        url: "getAll",
        type: "GET"
    }).success(function (data) {
        currentItems(data);
    });
}

function clearStock() {
    $("#stockTable").empty();
}

function currentItems(data) {
    var vendingStock = $("#stockTable");

    $.each(data, function (index, Item) {
        var nameField = $("<td>");
        var priceField = $("<td>");
        var stockField = $("<td>");

        nameField.text(Item.name);
        stockField.text(Item.stock);

        var priceButton = $("<button>");

        priceButton.attr({
            'onclick': "buyItem(" + Item.id + ", " + Item.price +", " +Item.stock+ ")"
        });

        priceButton.text("$" + Item.price);
        priceField.append(priceButton);

        if (index % 4 === 0) {
            tableRow = $("<tr>");
        }

        tableRow.append(nameField);
        tableRow.append("(");
        tableRow.append(stockField);
        tableRow.append(")");
        tableRow.append(priceField);

        vendingStock.append(tableRow);

    });
}

function buyItem(id, price, stock) {

    var currentMoney = parseFloat(document.getElementById("currentMoney").innerHTML);
    if(stock<=0){
        alert("SOLD OUT!");
    }else if (currentMoney >= price) {

        $.ajax({
            url: "updateStockId/" + id,
            type: "PUT",
            headers: {
                "Accept": "application/json"
            }
        }).success(function (data) {
            loadStock();
        });
        
        var change = currentMoney - price;
        
        document.getElementById("currentMoney").innerHTML = change.toFixed(2);
        
    }else{
        alert("You need more money!");
    }
}
