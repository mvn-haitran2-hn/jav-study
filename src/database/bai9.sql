CREATE TABLE full_year (
  id INT NOT NULL AUTO_INCREMENT,
  newspayper VARCHAR(255),
  subscriber VARCHAR(255),
  PRIMARY KEY (id)
);

CREATE TABLE half_year (
  id INT NOT NULL AUTO_INCREMENT,
  newspayper VARCHAR(255),
  subscriber VARCHAR(255),
  PRIMARY KEY (id)
);


INSERT INTO full_year (newspayper,subscriber)
VALUES ('The Paragon Herald','Crissy Sepe'),
		('The Daily Reporter','Tonie Moreton'),
		('Morningtide Daily','Erwin Chitty'),
		('Daily Breakfast','Tonie Moreton'),
		('Independent Weekly','Lavelle Phu');



INSERT INTO half_year (newspayper,subscriber)
VALUES ('The Daily Reporter','Lavelle Phu'),
		('Daily Breakfast','Tonie Moreton'),
		('The Paragon Herald','Lia Cover'),
		('The Community Gazette','Lavelle Phu'),
		('Nova Daily','Lia Cover'),
		('Nova Daily','Joya Buss');


SELECT subscriber FROM full_year
WHERE newspayper LIKE '%Daily%'
UNION
SELECT subscriber FROM half_year
WHERE newspayper LIKE '%Daily%'
ORDER BY subscriber ASC;