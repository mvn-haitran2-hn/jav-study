CREATE TABLE answers (
  id INT NOT NULL AUTO_INCREMENT,
  correct_answer VARCHAR(255),
  given_answer VARCHAR(255),
  PRIMARY KEY (id)
);

INSERT INTO answers (correct_answer,given_answer)
VALUES ('a','a'),('b',''),('c','b');

SELECT id,(
	CASE
		WHEN given_answer = '' THEN 'no_answer'
		WHEN given_answer = correct_answer THEN 'correct'
		WHEN given_answer != correct_answer THEN 'incorrect'
	END) AS checks
FROM answers
ORDER BY id;