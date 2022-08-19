CREATE TABLE Grades (
    Name varchar(255),
    ID INT UNSIGNED NOT NULL,
    Midterm1 TINYINT UNSIGNED,
    CHECK (Midterm1 between 0 and 100),
    Midterm2 TINYINT UNSIGNED,
    CHECK (Midterm2 between 0 and 100),
    Final TINYINT UNSIGNED,
	CHECK (Final between 0 and 200),
    PRIMARY KEY (ID)
 );

INSERT INTO Grades
VALUES ('David',42334,34,54,124),
       ('Anthony',54528,100,10,50),
       ('Jonathan',58754,49,58,121),
       ('Jonty',11000,25,30,180);

SELECT Name, ID FROM Grades
WHERE Final > (Midterm1 + Midterm2)
ORDER BY LEFT(NAME, 3), id ASC;

