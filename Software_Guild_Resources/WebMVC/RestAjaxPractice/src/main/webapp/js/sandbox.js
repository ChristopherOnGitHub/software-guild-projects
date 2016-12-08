
// This right here, is us registering a callback
// to be executed when the DOM is finished loading.
$(document).ready(function (event){
    
    // Registering a callback to be executed
    // when a button called makeLlama is clicked
    $('#makeLlama') // Hey jQuery, find via CSS selectors an element
                    // with the id of makeLlama (which we expect is a button)
            .click( // Then, register a click callback
            function(event){ // Define the function callback
        
        // use .val() to return the value of an input field
        var llamaNameToUse = $('#llamaName').val(); 
        // alert(llamaNameToUse);
        $.ajax({
            url: 'makeLlama/'+llamaNameToUse,
            type: 'POST',
            headers:{
                Accept: 'application/json'
            }
        }).success(function(llama){
            // use .html() to change the internal html of element
            // aka when it is NOT an input field.
            $('#llama').html(llama.name);
        });
        
    });
    
    
//    $.ajax({
//        url: 'test',
//        type: 'GET',
//        headers:{
//            'Accept' : 'application/json'
//        }
//    }).success(function(llama){
//        alert(llama.name);
//    });
    
//    $.ajax({
//        url: 'test',
//        type: 'GET',
//        headers:{
//            'Accept' : 'application/json'
//        }
//    }).success(function(llama){
//        alert(llama.name);
//    });

        
    
});