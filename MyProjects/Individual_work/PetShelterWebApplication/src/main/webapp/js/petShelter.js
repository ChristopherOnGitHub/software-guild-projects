$(document).ready(function () {
    loadPets();

    $("#search-button").click(function (event) {
        event.preventDefault();
        searchPets();
    });

    $("#add-button").click(function (event) {
        event.preventDefault();
        addPet();
    });

    $("#edit-button").click(function (event) {
        event.preventDefault();
        editPet();
    });

    $("#pet-details-modal").on("show.bs.modal", function (event) {
        var element = $(event.relatedTarget);
        var petId = element.data("pet-id");
        petDetails(petId);
    });

    $("#pet-edit-modal").on("show.bs.modal", function (event) {
        var element = $(event.relatedTarget);
        var petId = element.data("pet-id");
        petEditDetails(petId);
    });

});

function clearPetTable() {
    $("#petRows").empty();
}

function processPetList(pets) {
    clearPetTable();
    var petRows = $("#petRows");

    $.each(pets, function (index, pet) {
        var nameField = $("<td>");
        var breedField = $("<td>");
        var editField = $("<td>");
        var deleteField = $("<td>");

        var nameLink = $("<a>");
        nameLink.attr({"data-toggle": "modal",
            "data-target": "#pet-details-modal",
            "data-pet-id": pet.id});
        nameLink.text(pet.name);
        nameField.append(nameLink);

        breedField.text(pet.breed);

        var editLink = $("<a>");
        editLink.attr({"data-toggle": "modal",
            "data-target": "#pet-edit-modal",
            "data-pet-id": pet.id});
        editLink.text("Edit");
        editField.append(editLink);

        var deleteLink = $("<a>");
        deleteLink.attr({
            "onclick": "adoptPet(" + pet.id + ")"
        });
        deleteLink.text("Delete");
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
    var petContents = $("#petRows");

    clearPetTable();

    $.ajax({
        url: "pets",
        type: "GET"
    }).success(function (data) {
        processPetList(data);
    });

}

function addPet() {

    var petName = $("#add-pet-name").val();
    var petBreed = $("#add-pet-breed").val();
    var petDisp = $("#add-pet-disposition").val();
    var petVacc = $("#add-pet-vaccinated").prop("checked");

    $.ajax({
        url: "pet",
        type: "POST",
        headers: {
            'Accept': "application/json",
            "Content-Type": "application/json"
        },
        "dataType": "json",
        data: JSON.stringify({
            name: petName,
            breed: petBreed,
            disposition: petDisp,
            vacinated: petVacc

        })

    }).success(function (data) {
        loadPets();
        $("#add-pet-name").val("");
        $("#add-pet-breed").val("");
        $("#add-pet-disposition").val("");
        $("#add-pet-vaccinated").prop("checked", false);

    }).error(function (data, status) {
        var errorDiv = $("#validationErors");
        errorDiv.empty();
        errorDiv.show();
        $.each(data.responseJSON.fieldErrors, function (index, validationError) {
            errorDiv.append(validationError.message);
            errorDiv.append("<br>");
        });
    });

}

function adoptPet(id) {
    $.ajax({
        type: "DELETE",
        url: "pet/" + id
    }).success(function () {
        loadPets();
    });
}

function petDetails(id) {
    $.ajax({
        url: "pet/" + id,
        type: "GET",
        headers: {
            "Accept": "application/json"
        }
    }).success(function (pet) {
        $("#pet-detail-id").text(pet.id);
        $("#pet-detail-name").text(pet.name);
        $("#pet-detail-breed").text(pet.breed);
        $("#pet-detail-disp").text(pet.disposition);
        $("#pet-detail-vacc").text(pet.vacinated);
    });
}

function petEditDetails(id) {
    $.ajax({
        url: "pet/" + id,
        type: "GET",
        headers: {
            "Accept": "application/json"
        }
    }).success(function (pet) {
        $("#edit-pet-id").text(pet.id);
        $("#edit-pet-name").val(pet.name);
        $("#edit-pet-breed").val(pet.breed);
        $("#edit-pet-disp").val(pet.disposition);
        $("#edit-pet-vacc").prop("checked", pet.vacinated);
    });
}


function editPet() {

    var petId = $("#edit-pet-id").text();
    var petName = $("#edit-pet-name").val();
    var petBreed = $("#edit-pet-breed").val();
    var petDisp = $("#edit-pet-disposition").val();
    var petVacc = $("#edit-pet-vaccinated").prop("checked");

    $.ajax({
        url: "pet/" + petId,
        type: "PUT",
        headers: {
            "Content-Type": "application/json"
        },
        "dataType": "json",
        data: JSON.stringify({
            name: petName,
            breed: petBreed,
            disposition: petDisp,
            vacinated: petVacc

        })

    }).success(function (data) {
        loadPets();
    });

}

function searchPets() {

    var petNameVal = $("#search-pet-name").val();
    var petBreedVal = $("#search-pet-breed").val();
    var petDispVal = $("#search-pet-disposition").val();
    var petVaccVal = $("#search-pet-vaccinated").prop("checked");

    $.ajax({
        url: "search/pets",
        type: "POST",
        headers: {
            "Accept" : "application/json",
            "Content-Type": "application/json"
        },
        "dataType": "json",
        data: JSON.stringify({
            petName: petNameVal,
            petBreed: petBreedVal,
            petDisposition: petDispVal,
            petVacc: petVaccVal

        })

    }).success(function (data) {
        processPetList(data);
    });

}