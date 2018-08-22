INSERT INTO movie(id,title,imdbid) VALUES(1,'Tag','tt2854926')

INSERT INTO movie(id,title,imdbid) VALUES(2,'Supporting the Girls','tt6859352')

INSERT INTO movie(id,title,imdbid) VALUES(3,'The Meg','tt4779682')

INSERT INTO movie(id,title,imdbid) VALUES(4,'Mission: Impossible - Fallout','tt4912910')

INSERT INTO movie(id,title,imdbid) VALUES(5,'Slender Man','tt5690360')

INSERT INTO account(id,first_name,last_name,account_number,email) VALUES(1,'abc','def','e23f','pass@email.com')

INSERT INTO orderfilm(id,account_id,movie) VALUES(1,1,1)

INSERT INTO ticket(id,price,type) VALUES(1,1.5,'CHILD')

INSERT INTO orderticket(id,order_id,ticket,quantity) VALUES(1,1,1,2)