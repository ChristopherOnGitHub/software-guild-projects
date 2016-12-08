/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// REGISTERING EVENTS (and loading pets @ first)
$(document).ready(function () {
    loadPets();

    $("#search-button").click(function(event){
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        searchPets(); // Then do OUR thing.
    });

    
    $("#add-button").click(function(event){
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        addPet(); // Then do OUR thing.
    });

    $("#edit-button").click(function(event){
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        editPet(); // Then do OUR thing.
    });
    
    // Find the pet details modal, and register a "on show" event listener function
    $("#pet-details-modal").on('show.bs.modal', function(event){
        var element = $(event.relatedTarget); // Hey, go find the thing that made this event happen
        var petId = element.data('pet-id'); // found the a tag, now get the data-pet-id value
        petDetails(petId);
    });
    
    // Find the pet edit modal, and register a "on show" event listener function
    $("#pet-edit-modal").on('show.bs.modal', function(event){
        var element = $(event.relatedTarget); // Hey, go find the thing that made this event happen
        var petId = element.data('pet-id'); // found the a tag, now get the data-pet-id value
        petEditDetails(petId);
    });
    
    
});

// ==========
// FUNCTIONS!
// ==========

function clearPetTable(){
    $('#petRows').empty();
}

function processPetList(pets) {
    clearPetTable();
    
    // jQuery forEach starts with $.each
    var petRows = $('#petRows');

    $.each(pets, function (index, pet) {

        var nameField = $("<td>");
        var breedField = $("<td>");
        var editField = $("<td>");
        var deleteField = $("<td>");

        // <td><a data-toggle="modal" data-target="#pet-details-modal" data-pet-id="0">Fido</a></td>
        var nameLink = $("<a>");
        nameLink.attr({'data-toggle': 'modal',
            'data-target': '#pet-details-modal',
            'data-pet-id': pet.id});
        nameLink.text(pet.name);
        nameField.append(nameLink);

        // <td>Dog</td>
        breedField.text(pet.breed);

        // <td><a data-toggle="modal" data-target="#pet-edit-modal" data-pet-id="0">Edit</a></td>
        var editLink = $("<a>");
        editLink.attr({'data-toggle': 'modal',
            'data-target': '#pet-edit-modal',
            'data-pet-id': pet.id});
        editLink.text("Edit");
        editField.append(editLink);

        // <td><a onclick="adoptPet(0)">Adopt</a></td>
        var deleteLink = $("<a>");
        deleteLink.attr({
            'onclick':'adoptPet('+pet.id+')'
        });
        deleteLink.text("Adopt");
        deleteField.append(deleteLink);
        
        var petRow = $("<tr>");
        petRow.append(nameField);
        petRow.append(breedField);
        petRow.append(editField);
        petRow.append(deleteField);

        petRows.append(petRow);
    });

}

function loadPets() {

    // Generate a REQUEST to get all of the PETS from our REST endpoint
    // Endpoint details: GET @ localhost:8080/PetShelterWebApp/pets 
    $.ajax({
        // Describe the request!
        url: 'pets',
        type: 'GET'
    }).success(function (data) {
        processPetList(data);
    });


}

function addPet(){
    // GO FIND THE FORM INFO ON THE PAGE AND STORE IN A TEMP VARIABLE
    // TO USE LATER IN YOUR AJAX REQUEST
    var petName = $("#add-pet-name").val();
    var petBreed = $("#add-pet-breed").val();
    var petDisp = $("#add-pet-disposition").val();
    var petVacc = $("#add-pet-vaccinated").prop('checked');
    
    // Generate a REQUEST to submit the PET to our REST endpoint
    // Endpoint details: POST @ localhost:8080/PetShelterWebApp/pet
    // REQUESTBODY: PET , RESPONSEBODY : PET (+id)
    
    $.ajax({
        url : 'pet',
        type : 'POST',
        // Describe the information you are sending
        // This is important, because the server WILL reject requests
        // if it doesn't match it's expecations of what is inside
        headers : {
            // MIME TYPES
            'Accept' : 'application/json', //Whatcha want back
            'Content-Type' : 'application/json' // Whatcha sending
        },
        'dataType' : 'json', // Whatcha sending, data type
        
        // NOW ACTUALLY SETUP THE DATA
        data : JSON.stringify({
           // These key/value pairs need to match the propertyName/Values
           // of your Java DTO if that is what you are sending.
           // this is because Spring/Jaxson will try and use 
           // use getters and setters etc to try to translate JSON -> Java
           // If they don't match expected, there can be EXPLOSIONS
           name : petName,
           breed : petBreed,
           disposition : petDisp,
           vaccinated : petVacc
        })
    }).success(function(data){ // Register a PROMISE function to be called on response success
        $("#validationErrors").hide();
        loadPets();
        
        $("#add-pet-name").val('');
        $("#add-pet-breed").val('');
        $("#add-pet-disposition").val('');
        $("#add-pet-vaccinated").prop('checked', false);
    }).error(function(data, status){
        // Find the error div in the DOM
        var errorDiv = $("#validationErrors");
        errorDiv.empty();
        errorDiv.show();
        // the data, should be our field errors
        // which have a message, and a field error
        $.each(data.responseJSON.fieldErrors, function(index, validationError){
            errorDiv.append(validationError.message);
            errorDiv.append("<br>");
        });
        
    });
}

// <td><a onclick="adoptPet(0)">Adopt</a></td>
function adoptPet(id){
    // Generate a REQUEST to submit the PETID to our REST endpoint
    // Endpoint details: DELETE @ localhost:8080/PetShelterWebApp/pet/{petId}
    // PATHVARIABLE : petID
    
    $.ajax({
       type : 'DELETE',
       url : 'pet/' + id
    }).success(function(){
        loadPets();
    });
}

function petDetails(id){
    // Generate a REQUEST to submit the PETID to our REST endpoint
    // Endpoint details: GET @ localhost:8080/PetShelterWebApp/pet/{petId}
    // PATHVARIABLE : petID  , RESPONSEBODY : PET 
    $.ajax({
        type: 'GET',
        url: 'pet/' + id,
        headers:{
            'Accept': 'application/json'
        }
    }).success(function(pet){
        $("#pet-detail-id").text(pet.id);
        $("#pet-detail-name").text(pet.name);
        $("#pet-detail-breed").text(pet.breed);
        $("#pet-detail-disp").text(pet.disposition);
        $("#pet-detail-vacc").text(pet.vaccinated);
    });
}

function petEditDetails(id){
    // Generate a REQUEST to submit the PETID to our REST endpoint
    // Endpoint details: GET @ localhost:8080/PetShelterWebApp/pet/{petId}
    // PATHVARIABLE : petID  , RESPONSEBODY : PET 
    $.ajax({
        type: 'GET',
        url: 'pet/' + id,
        headers:{
            'Accept': 'application/json'
        }
    }).success(function(pet){
        // h2 tags use TEXT
        $("#pet-edit-id").text(pet.id);
        // Inputs use VALUE
        $("#edit-pet-name").val(pet.name);
        $("#edit-pet-breed").val(pet.breed);
        $("#edit-pet-disposition").val(pet.disposition);
        // CHECKBOXES have to be special. Wah.
        $("#edit-pet-vaccinated").prop('checked', pet.vaccinated);
    });
}

function editPet(){
    // GO FIND THE FORM INFO ON THE PAGE AND STORE IN A TEMP VARIABLE
    // TO USE LATER IN YOUR AJAX REQUEST
    var petId = $("#pet-edit-id").text();
    var petName = $("#edit-pet-name").val();
    var petBreed = $("#edit-pet-breed").val();
    var petDisp = $("#edit-pet-disposition").val();
    var petVacc = $("#edit-pet-vaccinated").prop('checked');
    
    // Generate a REQUEST to submit the PET to our REST endpoint
    // Endpoint details: PUT @ localhost:8080/PetShelterWebApp/pet/{petId}
    // REQUESTBODY: PET , PATHVARIABLE: PetID
    
    $.ajax({
        url : 'pet/' + petId,
        type : 'PUT',
        // Describe the information you are sending
        // This is important, because the server WILL reject requests
        // if it doesn't match it's expecations of what is inside
        headers : {
            // MIME TYPES
            'Content-Type' : 'application/json' // Whatcha sending
        },
        'dataType' : 'json', // Whatcha sending, data type
        
        // NOW ACTUALLY SETUP THE DATA
        data : JSON.stringify({
           // These key/value pairs need to match the propertyName/Values
           // of your Java DTO if that is what you are sending.
           // this is because Spring/Jaxson will try and use 
           // use getters and setters etc to try to translate JSON -> Java
           // If they don't match expected, there can be EXPLOSIONS
           name : petName,
           breed : petBreed,
           disposition : petDisp,
           vaccinated : petVacc
        })
    }).success(function(data){ // Register a PROMISE function to be called on response success
        loadPets();
        
    });
}

function searchPets(){
    // GO FIND THE FORM INFO ON THE PAGE AND STORE IN A TEMP VARIABLE
    // TO USE LATER IN YOUR AJAX REQUEST
    var petNameVal = $("#search-pet-name").val();
    var petBreedVal = $("#search-pet-breed").val();
    var petDispVal = $("#search-pet-disp").val();
    var petVaccVal = $("#search-pet-vacc").prop('checked');
    
    // Generate a REQUEST to submit the SEARCH OF PETS to our REST endpoint
    // Endpoint details: POST @ localhost:8080/PetShelterWebApp/search/pets
    // REQUESTBODY: SEARCH MAP
    // RESPONSE BODY : List of PETS that adhered to criteria
    
    $.ajax({
        url : 'search/pets',
        type : 'POST',
        // Describe the information you are sending
        // This is important, because the server WILL reject requests
        // if it doesn't match it's expecations of what is inside
        headers : {
            // MIME TYPES
            'Accept' : 'application/json', // Whatcha want back
            'Content-Type' : 'application/json' // Whatcha sending
        },
        'dataType' : 'json', // Whatcha sending, data type
        
        // NOW ACTUALLY SETUP THE DATA
        data : JSON.stringify({
           // These key/value pairs need to match the propertyName/Values
           // of your Java DTO if that is what you are sending.
           // this is because Spring/Jaxson will try and use 
           // use getters and setters etc to try to translate JSON -> Java
           // If they don't match expected, there can be EXPLOSIONS
           petName : petNameVal,
           petBreed : petBreedVal,
           petDisposition : petDispVal,
           petVacc : petVaccVal
        })
    }).success(function(data){ // Register a PROMISE function to be called on response success
        processPetList(data);
    });
}