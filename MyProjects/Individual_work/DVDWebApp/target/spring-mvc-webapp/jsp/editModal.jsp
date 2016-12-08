<div class="modal fade" id="editModal" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    &times;
                </button>
            </div>
            <div class="modal-body">
                <h3 id="movie-edit-entry"></h3>
                <form class="form-horizontal" role="form">
                    <div class="form-group">
                        <label for="movie-edit-title" class="col-md-4 control-label">Title: </label>
                        <div class="col-md-8">
                            <input id="movie-edit-title" name="movieTitle" type="text" class="form-control"/>
                        </div>    
                    </div>

                    <div class="form-group">
                        <label for="movie-edit-releaseDate" class="col-md-4 control-label">Release Date: </label>
                        <div class="col-md-8">
                            <input id="movie-edit-releaseDate" name="movieDate" type="number" class="form-control"/>
                        </div>    
                    </div>

                    <div class="form-group">
                        <label for="movie-edit-rating" class="col-md-4 control-label">Rating: </label>
                        <div class="col-md-8">
                            <select id="movie-edit-rating" name="movieRating" type="text" class="form-control"/>
                            <option value="G">G</option>
                            <option value="PG">PG</option>
                            <option value="PG-13">PG-13</option>
                            <option value="R">R</option>
                            <option value="NR">NR</option>
                            </select>
                        </div>    
                    </div>

                    <div class="form-group">
                        <label for="movie-edit-director" class="col-md-4 control-label">Director: </label>
                        <div class="col-md-8">
                            <input id="movie-edit-director" name="movieDirector" type="text" class="form-control" />
                        </div>    
                    </div>

                    <div class="form-group">
                        <label for="movie-edit-studio" class="col-md-4 control-label">Studio: </label>
                        <div class="col-md-8">
                            <input id="movie-edit-studio" name="movieStudio" type="text" class="form-control" />
                        </div>    
                    </div>

                    <div class="form-group">
                        <label for="movie-edit-userRating" class="col-md-4 control-label">User Rating: </label>
                        <div class="col-md-8">
                            <input id="movie-edit-userRating" name="movieUserRating" type="text" class="form-control" />
                        </div>    
                    </div>

                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-8">
                            <button type="submit" id="edit-button" class="btn btn-default" data-dismiss="modal">Update This Movie</button>
                        </div>    
                    </div>


                </form>
            </div>
            <div class="modal-footer">

                <button type="button" class="close" data-dismiss="modal">
                    Close
                </button>
            </div>    
        </div>
    </div>
</div>