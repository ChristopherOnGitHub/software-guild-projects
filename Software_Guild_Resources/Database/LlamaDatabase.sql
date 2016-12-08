
-- This is a comment; two dashes and a space start it off
-- Create a database to store our tables
DROP DATABASE IF EXISTS LlamaHerd; -- Drop it like it's hot first!
CREATE DATABASE LlamaHerd; -- Makes a database! And names it!

-- Since we want to work within this new DB
-- Let's make sure that our script interpretator knows that!
USE LlamaHerd;

-- describe the table start
CREATE TABLE `Llamas` (
-- now describe the columns
	`llama_id` INT NOT NULL AUTO_INCREMENT, -- this is going to be our PK
											-- and we're going to have sql
											-- provide it if we don't.
-- column def is column name data type (size) and then constraints
	`llama_name` VARCHAR(30) NOT NULL UNIQUE,
    `personality` VARCHAR(100),
    `hungry` BOOLEAN,
    `time_fed` TIMESTAMP,
    `worth` DECIMAL,
    PRIMARY KEY(`llama_id`) -- define a primary key if you have one
);

-- Now the STRUCTURE is done, but we have no datas.
INSERT INTO `Llamas`   (`llama_name`)
				VALUES ("Doctor Who");
                
INSERT INTO `Llamas` (`llama_id`, `llama_name`, `personality`, `hungry`, `time_fed`, `worth`)
			   VALUES(2,          "Redd",       "Feisty.",      true,     NOW(),      20.00);
               
INSERT INTO `Llamas` (`llama_id`, `llama_name`, `personality`, `hungry`, `time_fed`, `worth`)
			   VALUES(3,"Xena Warrior Llama", "Feisty.", true, '2004-01-01',1000.00),
					 (4,"Gabrielle Not A Warrior Llama", "Feisty.", false, '2004-01-01', 1001.00);
