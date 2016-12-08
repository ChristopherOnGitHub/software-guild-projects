DROP DATABASE IF EXISTS VendingDatabase;
CREATE DATABASE VendingDatabase;
USE VendingDatabase;

CREATE TABLE `itemTable` (

`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR (100) NOT NULL,
`price` DOUBLE NOT NULL,
`stock` INT NOT NULL,

primary key (`id`)

);

INSERT INTO `itemTable` (`id`, `name`, `price`, `stock`)
	VALUES(1, 'Chippies', .85, 13),
    (2, 'Gummy Yums', 1.25, 6),
    (3, 'Mintsssss', .45, 12),
    (4, 'Chocolate bar', 1.00, 19),
    (5, 'Animal crackers', 1.25, 20),
    (6, 'Amaze-balls!', 2.65, 17),
    (7, 'Yonuts', .75, 10),
    (8, 'CA$H-EWS', 1.50, 9),
    (9, 'FREE FOOD!', 0, 7),
    (10, 'Fr00t SnH4x', 3.33, 14),
    (11, 'A single gumball', .25, 15),
    (12, 'Prime-Rib Steak Dinner', 12, 1);