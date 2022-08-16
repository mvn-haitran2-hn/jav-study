CREATE TABLE answers (
  id INT NOT NULL AUTO_INCREMENT,
  correct_answer VARCHAR(255),
  given_answer VARCHAR(255),
  PRIMARY KEY (id)
);

INSERT INTO answers (correct_answer,given_answer)
VALUES ('a','a'),('b',''),('c','b');

SELECT id, 'no_answer' AS checks FROM answers WHERE given_answer = ''
UNION
SELECT id, 'correct' AS checks FROM answers WHERE given_answer = correct_answer
UNION
SELECT id, 'incorrect' AS checks FROM answers WHERE given_answer != correct_answer AND given_answer != ''
ORDER by id;