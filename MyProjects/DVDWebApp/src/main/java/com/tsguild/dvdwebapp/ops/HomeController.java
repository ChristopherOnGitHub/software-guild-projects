/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapp.ops;

import com.tsguild.dvdwebapp.dao.DVDLibraryDAO;
import com.tsguild.dvdwebapp.dto.DVD;
import java.util.List;
import javax.inject.Inject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author apprentice
 */
@Controller
public class HomeController {

    private final DVDLibraryDAO dao;

    @Inject
    public HomeController(DVDLibraryDAO dao) {
        this.dao = dao;
    }

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String displayHomePage() {
        return "home";
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/movie", method = RequestMethod.POST)
    public DVD createMovie(@RequestBody DVD newDVD) {
        dao.addDVD(newDVD);
        return newDVD;
    }

    @ResponseBody
    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<DVD> getAllMovies() {
        return dao.getAllMovies();
    }

    @ResponseBody
    @RequestMapping(value = "/movie/{entryNumber}", method = RequestMethod.GET)
    public DVD getDVDByEntryNumber(@PathVariable("entryNumber") int DVDEntryNumber) {
        return dao.getDVDByEntryNumber(DVDEntryNumber);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/movie/{entryNumber}", method = RequestMethod.DELETE)
    public void removeMovie(@PathVariable int entryNumber) {
        dao.removeMovie(entryNumber);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/movie/{entryNumber}", method = RequestMethod.PUT)
    public void updateMovie(@PathVariable int entryNumber, @RequestBody DVD updatedDVD) {
        updatedDVD.setEntryNumber(entryNumber);
        dao.updateMovie(updatedDVD);
    }

}
