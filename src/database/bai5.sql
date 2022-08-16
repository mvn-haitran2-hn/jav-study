CREATE TABLE Suspect (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255),
  surname VARCHAR(255),
  height INT UNSIGNED,
  weight INT UNSIGNED,
  PRIMARY KEY (id)
);
INSERT INTO Suspect (name,surname,height,weight)
VALUES ('John','Doe',165,60),
        ('Bill','Green',170,67),
        ('Baelfire','Grehn',172,70),
        ('Bill','Gretan',165,55),
        ('Brendon','Grewn',150,50),
        ('bill','Green',169,50);

SELECT id, name, surname FROM Suspect
WHERE height <= 170 and name LIKE 'B%' and surname LIKE 'Gre_n';
