package com.tsguild.dvdlibrary.ops;

import com.tsguild.dvdlibrary.dao.DVDDAO;
import com.tsguild.dvdlibrary.dto.Movie;
import com.tsguild.dvdlibrary.ui.ConsoleIO;
import java.io.IOException;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DVDController {

    private ConsoleIO console;
    private DVDDAO dao;
    private Movie dto;
    boolean keepRunning = true;

    public void runApplication() throws IOException {

        console = new ConsoleIO();
        dao = new DVDDAO();
        dao.loadMovies();

        while (keepRunning) {
            System.out.println(" ");

            System.out.println("---WELCOME TO THE MOVIE DATABASE---");
            System.out.println(" ");
            System.out.println("1. ADD A MOVIE");
            System.out.println("2. REMOVE A MOVIE");
            System.out.println("3. MOVIE INFO");
            System.out.println("4. LIST ALL MOVIES");
            System.out.println("5. SEARCH FOR A MOVIE");
            System.out.println("6. EDIT AN ENTRY");
            System.out.println("7. SAVE AND EXIT");
            int userChoice = console.readInt("Please choose an operation", 1, 7);

            switch (userChoice) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    removeMovie();
                    break;
                case 3:
                    retrieveMovie();
                    break;
                case 4:
                    listAll();
                    break;
                case 5:
                    searchMovie();
                    break;
                case 6:
                    editMovie();
                    break;
                case 7:
                    try {
                        dao.saveExit();
                        keepRunning = false;
                    } catch (IOException ex) {
                        console.print("Unable to save to file.");
                        String ans = console.readString("Are you sure you want to quit?(y/n)");
                        if (ans.equalsIgnoreCase("y")) {
                            keepRunning = false;
                        }
                    }
                    break;
                default:
            }
        }
        System.out.println("Goodbye!");
    }

    private void addMovie() {
        Movie newMovie = new Movie();

        String a = console.readString("What is the title of the movie?");
        String b = console.readString("What is the release date of the movie?");
        String c = console.readString("What is the MPAA rating of the movie?");
        String d = console.readString("Who is the movie's director?");
        String e = console.readString("What studio produced the movie?");
        String f = console.readString("User rating and comments:");

        newMovie.setTitle(a);
        newMovie.setReleaseDate(b);
        newMovie.setRating(c);
        newMovie.setDirector(d);
        newMovie.setStudio(e);
        newMovie.setUserRating(f);

        dao.addAMovie(newMovie);
        System.out.println("The movie has been added");
        System.out.println(" ");

    }

    private void removeMovie() {
        String removedMovie = console.readString("What movie is being removed from the system?");
        Movie asdf = dao.removeMovie(removedMovie);
        System.out.println(asdf + " has been removed from the system");
    }

    private void retrieveMovie() {

        String retrievedMovie = console.readString("Name of movie: ");
        Collection<Movie> movieMap = dao.listAll();
        int foundMovies = 0;
        for (Movie x : movieMap) {
            if (x.getTitle().equalsIgnoreCase(retrievedMovie)) {

                foundMovies++;
                String retrievedMovieTitle = dto.getTitle();
                String retrievedMovieReleaseDate = dto.getReleaseDate();
                String retrievedMovieRating = dto.getRating();
                String retrievedMovieDirector = dto.getDirector();
                String retrievedMovieStudio = dto.getStudio();
                String retrievedUserRating = dto.getUserRating();

                System.out.println(retrievedMovieTitle + ": " + retrievedMovieReleaseDate);
                System.out.println("Directed by: " + retrievedMovieDirector);
                System.out.println("Rated: " + retrievedMovieRating + " property of: " + retrievedMovieStudio);
                System.out.println(retrievedUserRating);
                System.out.println(" ");
            }

            if (foundMovies == 0) {
                System.out.println("No movies found with that title");
            }
        }
    }

    private void listAll() {
        System.out.println("  ");
        Collection<Movie> movieMap = dao.listAll();
        for (Movie x : movieMap) {
            System.out.println(x.getTitle() + " : " + x.getReleaseDate() + " "
                    + x.getRating());
        }
    }

    private void editMovie() {
        String movieToEdit = console.readString("What movie do you want to edit?");
        System.out.println("What movie do you want to edit?");
        Collection<Movie> movieMap = dao.listAll();
        int foundMovies = 0;
        for (Movie x : movieMap) {
            if (x.getTitle().equalsIgnoreCase(movieToEdit)) {
                foundMovies++;
                System.out.println("What attribute would you like to edit?");
                System.out.println("1. Title    2. Release date 3. Rating");
                System.out.println("4. Director 5. Studio       6.UserRating  ");
                int y = console.readInt("", 1, 6);
                switch (y) {
                    case 1:
                        String newTitle = console.readString("Enter new title");
                        x.setTitle(newTitle);
                        break;
                    case 2:
                        String newDate = console.readString("Enter new release date");
                        x.setReleaseDate(newDate);
                        break;
                    case 3:
                        String newRating = console.readString("Enter new MPAA rating");
                        x.setRating(newRating);
                        break;
                    case 4:
                        String newDirector = console.readString("Enter new director");
                        x.setDirector(newDirector);
                        break;
                    case 5:
                        String newStudio = console.readString("Enter new studio");
                        x.setStudio(newStudio);
                        break;
                    case 6:
                        String newUserRating = console.readString("Enter new user rating");
                        x.setUserRating(newUserRating);
                        break;
                    default:
                }

            }
        }
        if (foundMovies == 0) {
            System.out.println("No movies found with that title");
        }

    }

    public void searchMovie() {
        System.out.println("  ");
        Collection<Movie> movieMap = dao.listAll();
        String userSearch = console.readString("Search query");
        for (Movie x : movieMap) {
            boolean searchContains = (x.getTitle()).toLowerCase().contains(userSearch.toLowerCase());
            if (searchContains) {
                System.out.println(x.getTitle() + " " + x.getReleaseDate() + " " + x.getRating());
            }
        }
    }

}
