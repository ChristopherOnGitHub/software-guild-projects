USE PetShelter;

SELECT * FROM Pets;
SELECT * FROM Breeds;
SELECT Pets.*, Breeds.breed FROM Pets LEFT JOIN Breeds ON Pets.breedId = Breeds.id;
SELECT * FROM Pets INNER JOIN Breeds ON Pets.breedId = Breeds.id;
SELECT * FROM Breeds
	RIGHT JOIN Pets ON Pets.breedId = Breeds.id;
SELECT * FROM Pets
	RIGHT JOIN Breeds ON Pets.breedId = Breeds.id;
    
-- Test for hardcoded delete
DELETE FROM Pets WHERE id = 2;
-- For Java
DELETE FROM Pets WHERE id = ?;

-- Test out hardcoded add
INSERT INTO Pets (name, disposition, breedId, vaccinated)
	VALUES("Fluffy", "Mean", 2, true);
SELECT LAST_INSERT_ID();
-- for JAva
INSERT INTO Pets (name, disposition, breedId, vaccinated)
	VALUES(?, ?, ?, ?);
    
    
-- test out select by id
SELECT Pets.*, Breeds.breed FROM Pets 
	LEFT JOIN Breeds ON Pets.breedId = Breeds.id
    WHERE Pets.id = 11;
-- translate to java (aka any hardcoded -> ? )
SELECT Pets.*, Breeds.breed FROM Pets 
	LEFT JOIN Breeds ON Pets.breedId = Breeds.id
    WHERE Pets.id = ?;
    
-- testing w/ hardcoded data for update
UPDATE Pets SET name = "Klondike", 
breedId = 3, disposition = "Friendly",
vaccinated = true WHERE Pets.id = 11;
-- updated for java statement
UPDATE Pets SET name = ?, 
breedId = ?, disposition = ?,
vaccinated = ? WHERE Pets.id = ?;


SELECT * FROM Pets WHERE id = 11;

