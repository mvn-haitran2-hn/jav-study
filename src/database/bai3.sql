 CREATE TABLE users (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(255),
    score int,
    PRIMARY KEY (id)
 );

 INSERT INTO users (name, score)
 VALUE ('1', 1),
       ('2', 2),
       ('3', 3),
       ('5', 5),
       ('11', 11),
       ('52', 52),
       ('53', 53),
       ('60', 60),
       ('20', 20),
       ('9', 9);

 SELECT name FROM users
 ORDER BY score DESC LIMIT 3,5;