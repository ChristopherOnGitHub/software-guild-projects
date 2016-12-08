$(document).ready(function () {
    loadMovies();

    $("#add-button").click(function (event) {
        event.preventDefault();
        addMovie();
    });

    $("#edit-button").click(function (event) {
        event.preventDefault();
        editMovie();
    });

    $("#movieModal").on("show.bs.modal", function (event) {
        var element = $(event.relatedTarget);
        var entryNumber = element.data("dvd-entrynumber");
        movieDetails(entryNumber);
    });

    $("#editModal").on("show.bs.modal", function (event) {
        var element = $(event.relatedTarget);
        var entryNumber = element.data("dvd-entrynumber");
        movieEditDetails(entryNumber);
    });

});

//load all of it function

function loadMovies() {
    var tableContents = $("#movieTableRows");

    clearTable();

    $.ajax({
        url: "movies",
        type: "GET"
    }).success(function (data) {
        processMovieList(data);
    });

}

//Clear the table function

function clearTable() {
    $("#movieTableRows").empty();
}

//process the table function

function processMovieList(movies) {
    clearTable();
    var tableRows = $("#movieTableRows");

    $.each(movies, function (index, DVD) {
        var titleField = $("<td>");
        var releaseField = $("<td>");
        var ratingField = $("<td>");
        var editField = $("<td>");
        var deleteField = $("<td>");

        var titleLink = $("<a>");
        titleLink.attr({"data-toggle": "modal",
            "data-target": "#movieModal",
            "data-dvd-entrynumber": DVD.entryNumber});
        titleLink.text(DVD.title);
        titleField.append(titleLink);

        releaseField.text(DVD.releaseDate);

        var editLink = $("<a>");
        editLink.attr({"data-toggle": "modal",
            "data-target": "#editModal",
            "data-dvd-entrynumber": DVD.entryNumber});
        editLink.text("Edit");
        editField.append(editLink);
        
        ratingField.text(DVD.rating);
        

        var deleteLink = $("<a>");
        deleteLink.attr({
            "onclick": "deleteMovie(" + DVD.entryNumber + ")"
        });
        deleteLink.text("Delete");
        deleteField.append(deleteLink);

        var tableRow = $("<tr>");
        tableRow.append(titleField);
        tableRow.append(releaseField);
        tableRow.append(ratingField);
        tableRow.append(editField);
        tableRow.append(deleteField);

        tableRows.append(tableRow);
    });
}

//add a new movie function

function addMovie() {

    var movieTitle = $("#addMovieTitle").val();
    var movieRelease = $("#addMovieRelease").val();
    var movieRating = $("#addMovieRating").val();
    var movieDirector = $("#addMovieDirector").val();
    var movieStudio = $("#addMovieStudio").val();
    var movieUserRating = $("#addUserRating").val();


    $.ajax({
        url: "movie",
        type: "POST",
        headers: {
            'Accept': "application/json",
            "Content-Type": "application/json"
        },
        "dataType": "json",
        data: JSON.stringify({
            title: movieTitle,
            releaseDate: movieRelease,
            rating: movieRating,
            director: movieDirector,
            studio: movieStudio,
            userRating: movieUserRating

        })

    }).success(function (data) {
        loadMovies();
        $("#addMovieTitle").val("");
        $("#addMovieRelease").val("");
        $("#addMovieRating").val("");
        $("#addMovieDirector").val("");
        $("#addMovieStudio").val("");
        $("#addUserRating").val("");

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

//delete movie function

function deleteMovie(entryNumber) {
    $.ajax({
        type: "DELETE",
        url: "movie/" + entryNumber
    }).success(function () {
        loadMovies();
    });
}

//edit staging

function movieEditDetails(entryNumber) {
    $.ajax({
        url: "movie/" + entryNumber,
        type: "GET",
        headers: {
            "Accept": "application/json"
        }
    }).success(function (movie) {
        $("#movie-edit-entry").val(movie.entryNumber);
        $("#movie-edit-title").val(movie.title);
        $("#movie-edit-releaseDate").val(movie.releaseDate);
        $("#movie-edit-rating").val(movie.rating);
        $("#movie-edit-director").val(movie.director);
        $("#movie-edit-studio").val(movie.studio);
        $("#movie-edit-userRating").val(movie.userRating);
    });
}

//edit movie function

function editMovie() {

    var movieEntryNumber = $("#movie-edit-entry").val();
    var movieTitle = $("#movie-edit-title").val();
    var movieDate = $("#movie-edit-releaseDate").val();
    var movieRating = $("#movie-edit-rating").val();
    var movieDirector = $("#movie-edit-director").val();
    var movieStudio = $("#movie-edit-studio").val();
    var movieUserRating = $("#movie-edit-userRating").val();

    $.ajax({
        url: "movie/" + movieEntryNumber,
        type: "PUT",
        headers: {
            "Content-Type": "application/json"
        },
        "dataType": "json",
        data: JSON.stringify({
            entryNumber: movieEntryNumber,
            title: movieTitle,
            releaseDate: movieDate,
            rating: movieRating,
            director: movieDirector,
            studio: movieStudio,
            userRating: movieUserRating

        })

    }).success(function (data) {
        loadMovies();
    });

}

function movieDetails(entryNumber) {
    $.ajax({
        url: "movie/" + entryNumber,
        type: "GET",
        headers: {
            "Accept": "application/json"
        }
    }).success(function (movie) {
        $("#movie-detail-entrynumber").text(movie.entryNumber);
        $("#movie-detail-title").text(movie.title);
        $("#movie-detail-releaseDate").text(movie.releaseDate);
        $("#movie-detail-rating").text(movie.rating);
        $("#movie-detail-director").text(movie.director);
        $("#movie-detail-studio").text(movie.studio);
        $("#movie-detail-userRating").text(movie.userRating);
    });
}