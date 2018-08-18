INSERT INTO movie(id,title,imdbid) VALUES(1,'Tag','tt2854926')

INSERT INTO account(id,first_name,last_name,account_number) VALUES(1,'abc','def','e23f')

INSERT INTO orderfilm(id,account_id,movie) VALUES(1,1,1)

INSERT INTO ticket(id,price,type) VALUES(1,1.5,'CHILD')

INSERT INTO orderticket(id,order_id,ticket,quantity) VALUES(1,1,1,2)