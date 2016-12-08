DROP DATABASE IF EXISTS PetShelterTest;
CREATE DATABASE PetShelterTest;
USE PetShelterTest;
-- Make yer tables
CREATE TABLE `Pets`(
	`id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(50) NOT NULL,
    `disposition` VARCHAR(250),
    `breedId` INT NOT NULL, -- FK to Breeds (eventually)
    `vaccinated` BOOLEAN,
    PRIMARY KEY (`id`)
);

CREATE TABLE `Breeds`(
	`id` INT NOT NULL AUTO_INCREMENT,
    `breed` VARCHAR(50) UNIQUE NOT NULL,
    PRIMARY KEY (`id`)
);

-- Establish any FK constraints
ALTER TABLE `Pets`
	ADD CONSTRAINT `pets_fk_breedId` -- the restraints name (to help give context)
    FOREIGN KEY (`breedId`) -- first the FK reference
    REFERENCES `Breeds` -- then the table where the FK is defined as PK
    (`id`); -- then finally the column that the FK is defined in

-- You can also write it like this:    
-- ALTER TABLE `Pets` ADD CONSTRAINT `pets_fk_breedId`
-- 	FOREIGN KEY (`breedId`) REFERENCES `Breeds` (`id`);

-- Write some insert statements for testing purposes
-- but gotta do the breed inserts first, because of the FK constraints

INSERT INTO `Breeds` (`id`, `breed`)
			  VALUES ( 1, "Dog"),
					 ( 2, "Mammoth"),
                     ( 3, "Ostrich"),
                     ( 4, "Cat"),
                     ( 5, "Ferret"),
                     ( 6, "Beefalo"),
                     ( 7, "Kumquat"),
                     ( 8, "Kiwi"),
                     ( 9, "Emu"),
                     ( 10, "Wren"),
                     ( 11, "Dolphin"),
                     ( 12, "Blue Whale");

INSERT INTO `Pets` (`id`, `name`, `disposition`, `breedId`, `vaccinated`)
		     VALUES(1, "Xerxes", "Friendly", 2, false),
				   (2, "Agammemnon", "Mean", 6, true),
				   (3, "Cleotilde", "Moppet-like", 6, false),
				   (4, "Beans", "Fragrant and fun.", 1, true),
				   (5, "Crusoe", "Difficult", 2, false),
				   (6, "Xena", "Bananas", 7, true),
				   (7, "Zena", "Brainy", 8, false),
				   (8, "Foof", "Silly", 11, true);
    
    
    
    
    
    