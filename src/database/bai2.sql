
CREATE TABLE product (
    id int,
    username varchar(255),
    price int,
    quantity int
 );

INSERT INTO product (id, username, price, quantity)
VALUES (1,'Hai',10,4),
        (2,'Hai2',23,4),
	    (3,'Hai3',43,5),
		(4,'Hai4',23,8),
		(5,'Hai5',12,6),
		(6,'Hai6',53,1),
		(7,'Hai7',23,8),
		(8,'Hai8',23,9),
		(9,'Hai9',34,7),
		(10,'Hai10',32,3);

 SELECT username FROM product
 WHERE price*quantity = (SELECT MAX(price*quantity) FROM product)
 ORDER BY username ASC;