CREATE TABLE expressions (
  id INT NOT NULL AUTO_INCREMENT,
  a INT,
  b INT,
  operation CHAR,
  c INT,
  PRIMARY KEY (id)
);

INSERT INTO expressions (a,b,operation,c)
VALUES (2,3,'+',5),
       (2,3,'+',6),
		(3,2,'/',1),
		(4,7,'*',28),
		(54,2,'-',27),
		(3,0,'/',0);


SELECT * FROM expressions
WHERE (operation = '+' AND a + b = c)
	OR (operation = '-' AND a - b = c)
	OR (operation = '*' AND a * b = c)
	OR (operation = '/' AND a / b = c);