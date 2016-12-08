/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapp;

import com.tsguild.dvdwebapp.dao.DVDLibraryDAO;
import com.tsguild.dvdwebapp.dto.DVD;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author apprentice
 */
public class DatabaseTests {

    private DVDLibraryDAO testDao;

    public DatabaseTests() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        testDao = factory.getBean(DVDLibraryDAO.class);
        JdbcTemplate cleaner = factory.getBean("jdbcTemplateBean", JdbcTemplate.class);
    }

    @After
    public void tearDown() {
    }

    DVD[] testArray = {
        new DVD(0, "sample movie", 1000, "R", "Me", "sample studio", "generic rhetoric"),
        //1
        new DVD(1, "sample movie?", 00, "PG", "Me,", "sample studio", "generic rhetoric"),
        //2
        new DVD(2, "sample movie.", 1000, "NR", "M,e", "sample studio", "generic rhetoric"),
        //3
        new DVD(3, " s a m p l e m o v i e ", -1000, "r", "Me.", "sample studio", "generic rhetoric"),
        //4
        new DVD(4, "sample, movie", 34, "R", ",Me", "sample studio", "generic rhetoric"),
        //5
        new DVD(5, " ", 999999, "PG-13", "Me?", "sample studio", "generic rhetoric"),
        //6
        new DVD(6, "12344567", 1000, "4", "Me", "sample studio", "generic rhetoric"),
        //7
        new DVD(7, "[(,?$$$@@asdf)]", 1000, "R", "Me", "sample studio", "generic rhetoric")
    };


    @Test
    public void addOne() {
        DVD x = new DVD(999, "title", 1234, "R", "director", "studio", "comments");
        testDao.addDVD(x);
        DVD y = testDao.getDVDByEntryNumber(x.getEntryNumber());
        Assert.assertEquals(x, y);
    }

    @Test
    public void notNull() {
        Assert.assertNotNull(testDao.getAllMovies());
    }

    @Test
    public void simpleGet() {
        DVD x = testArray[1];
        testDao.addDVD(x);
        DVD y = testDao.getDVDByEntryNumber(x.getEntryNumber());
        Assert.assertEquals(x, y);
    }
    
    @Test
    public void deleteThatDVD(){
        DVD x = testArray[3];
        testDao.addDVD(x);
        testDao.removeMovie(x.getEntryNumber());
        DVD y = testDao.getDVDByEntryNumber(x.getEntryNumber());
        Assert.assertNull(y);
    }
    
    @Test
    public void addableMovies(){
        testDao.addDVD(testArray[0]);
        testDao.addDVD(testArray[1]);
        testDao.addDVD(testArray[2]);
        testDao.addDVD(testArray[3]);
        testDao.addDVD(testArray[4]);
        testDao.addDVD(testArray[5]);
        testDao.addDVD(testArray[6]);
        testDao.addDVD(testArray[7]);
    }
    
    @Test
    public void updatingMovie(){
        DVD x = testArray[2];
        DVD y = testArray[7];
        testDao.addDVD(x);
        x.setTitle("[(,?$$$@@asdf)]");
        x.setRating("R");
        x.setDirector("Me");
        x.setStudio("sample studio");
        x.setReleaseDate(1000);
        x.setUserRating("generic rhetoric");
        testDao.updateMovie(x);
        Assert.assertEquals(x.getDirector(), y.getDirector());
        Assert.assertEquals(x.getRating(), y.getRating());
        Assert.assertEquals(x.getReleaseDate(), y.getReleaseDate());
        Assert.assertEquals(x.getTitle(), y.getTitle());
        Assert.assertEquals(x.getUserRating(), y.getUserRating());
    }

}
