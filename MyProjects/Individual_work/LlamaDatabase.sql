
-- Create a database to store tables
DROP DATABASE IF EXISTS LlamaHerd;
CREATE DATABASE LlamaHerd;

-- Tell Script interpretator which DB to use 
USE LlamaHerd;

-- Describe the table
CREATE TABLE  `Llamas` (
-- now describe the columns
-- give primary key, sql will provide if we don't
	`llama_id` INT NOT NULL AUTO_INCREMENT,
-- column def is column name, data type, size, and constraints    
    `llama_name` VARCHAR(30) NOT NULL UNIQUE,
    `personality` VARCHAR(100),
    `hungry` BOOLEAN,
    `time_fed` TIMESTAMP,
    `worth` DECIMAL,
    PRIMARY KEY(`llama_id`) -- define a primary key
    
    
);

INSERT INTO `Llamas` (`llama_name`)
	VALUES ("Doctor Who");

INSERT INTO `Llamas` (`llama_id`, `llama_name`, `personality`, `hungry`, `time_fed`, `worth`)
	VALUES(2, "Redd", "Feisty but sweet.", true, NOW(), 20.00);
    
INSERT INTO `Llamas` (`llama_id`, `llama_name`, `personality`, `hungry`, `time_fed`, `worth`)
	VALUES(3, "Xena Warrior Llama", "Feisty.", true, NOW(), 1000.00),
		  (4, "Gabby", "Feisty.", false, NOW(), 1001.00);
    
    