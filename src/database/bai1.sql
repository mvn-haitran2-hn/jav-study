CREATE TABLE user (
    id int,
    username varchar(255),
    role varchar(255),
    email varchar(255)
 );

INSERT INTO user (id, usernam, role, email)
VALUES (1,'Hai','premium','1@role.com'),
		(2,'Hai2','regular','2@role.com'),
		(3,'Hai3','guru','3@role.com'),
		(4,'Hai4','admin','4@role.com'),
		(5,'Hai5','regular','5@role.com'),
		(6,'Hai6','pRemium','6@role.com'),
		(7,'Hai7','guru','7@role.com'),
		(8,'Hai8','premium','8@role.com'),
		(9,'Hai9','premium','9@role.com');

Select email From user
WHERE lower(role)!='premium' AND lower(role) != 'admin'
ORDER BY email ASC;