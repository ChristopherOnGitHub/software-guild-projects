DROP DATABASE IF EXISTS PetShelter;
CREATE DATABASE PetShelter;
USE PetShelter;

CREATE TABLE `Pets`(

`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(50) NOT NULL,
`disposition` VARCHAR(250),
`breedId` INT NOT NULL,
`vaccinated` BOOLEAN,

PRIMARY KEY (`id`)

);

CREATE TABLE `Breeds`(
`id` INT NOT NULL AUTO_INCREMENT,
`breed` VARCHAR(50) NOT NULL,
PRIMARY KEY(`id`)
);

-- Establish any foreign key restraints

ALTER TABLE `Pets`
	ADD CONSTRAINT `pets_fk_breedId`
    FOREIGN KEY (`breedId`) REFERENCES `Breeds` 
    (`id`);
     
INSERT INTO `Breeds` (`id` , `breed`)
 VALUES (1, "Dog"),
        (2, "Mammoth"),
        (3, "Ostrich"),
        (4, "Cat"),
        (5, "Ferret"),
        (6, "Beefalo"),
        (7, "Kumquat"),
        (8, "Kiwi"),
        (9, "Emu"),
        (10, "Wren"),
        (11, "Dolphin"),
        (12, "Blue Whale");
        
INSERT INTO `Pets` (`id`, `name`, `disposition`, `breedId`, `vaccinated`)
			VALUES(1, "Xerxes", "Friendly", 2, false),
            (2, "Agammemnon", "Mean", 6, true),
            (3, "Cleotilde", "Moppet-like", 6, false),
            (4, "Beans", "Fragrant and fun.", 1, true),
            (5, "Crusoe", "Difficult", 2, false),
            (6, "Xena", "Bananas", 7, true),
            (7, "Zena", "Brainy", 8, false),
            (8, "Foof", "Silly", 11, true);