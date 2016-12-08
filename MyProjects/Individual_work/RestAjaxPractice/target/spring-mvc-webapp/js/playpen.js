
$(document).ready(function (event) {

    var btn = $("#getAllLlamas");
    btn.click(function (event) {
        $.ajax({
            url: "allLlamas",
            type: "GET",
            headers: {
                Accept: "application/json"
            }
        }).success(function (llamaList) {
            
            var llamaHerdDiv = $("#llamaHerd");
            
            $.each(llamaList, function(index, llama){
                llamaHerdDiv.text(llama.name + ", " + llamaHerdDiv.text());
            });
            
        });
    });

});