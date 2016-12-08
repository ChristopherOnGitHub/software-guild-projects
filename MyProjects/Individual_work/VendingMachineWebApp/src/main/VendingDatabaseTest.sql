DROP DATABASE IF EXISTS VendingDatabaseTest;
CREATE DATABASE VendingDatabaseTest;
USE VendingDatabaseTest;

CREATE TABLE `itemTable` (

`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR (100) NOT NULL,
`price` double NOT NULL,
`stock` INT NOT NULL,

primary key (`id`)

);

INSERT INTO `itemTable` (`id`, `name`, `price`, `stock`)
	VALUES(1, 'Chippies', .85, 13),
    (2, 'Gummy Yums', 1.25, 6);
    
UPDATE itemTable SET name = 'gum', price = 3.45, stock = 3 WHERE id = 1;