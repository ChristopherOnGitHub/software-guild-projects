/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(event){
    
    // Step1 find the button
    var btn = $("#getAllLlamas");
    // Step2 register a click callback
    btn.click(function(event){
        //Step3 Start AJAX Request
        
        $.ajax({
            // Step4 define ajax info
            url: "allLlamas", // URL should match @RM value
            type: "GET", // type should match @RM method
            // describes what we want back
            headers:{
                Accept: "application/json" 
            }
            // Step5 register a success promise
            // that is going to process the resulting COLLECTION (now array)
            // of llamas
        }).success(function(llamaList){
            // Step6a
            var llamaHerdDiv = $("#llamaHerd");
            // Step6b iterate over this list
            
            $.each(llamaList, function(index, llama){
                // alert(llama.name);
                // Step7 add all my llama names to the llama div html
                llamaHerdDiv.text(llama.name + ", " +llamaHerdDiv.text());
            });
        });
        
        
    });
    
});