DROP DATABASE IF EXISTS DVDLibraryTest;
CREATE DATABASE DVDLibraryTest;
USE DVDLibraryTest;

CREATE TABLE `movies`(

`entryNumber` INT NOT NULL AUTO_INCREMENT,
`title` VARCHAR (100) NOT NULL,
`releaseDate` INT NOT NULL,
`rating` VARCHAR (10) NOT NULL,
`director` VARCHAR (100) NOT NULL,
 `studio` VARCHAR (100) NOT NULL,
 `userRating` VARCHAR (350) NOT NULL,
 
 PRIMARY KEY (`entryNumber`)
 );
 
INSERT INTO `movies` (`entryNumber`, `title`, `releaseDate`, `rating`, `director`, `studio`, `userRating`)
VALUES(0, 'The Departed', 2002, 'R', 'John Stamos', 'MGM', '10/10 A very well-made movie');
;
        