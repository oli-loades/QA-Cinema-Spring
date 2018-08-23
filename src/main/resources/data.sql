INSERT INTO movie(id,title,imdbid) VALUES(1,'Tag','tt2854926')
INSERT INTO movie(id,title,imdbid) VALUES(2,'Supporting the Girls','tt6859352')
INSERT INTO movie(id,title,imdbid) VALUES(3,'The Meg','tt4779682')
INSERT INTO movie(id,title,imdbid) VALUES(4,'Mission: Impossible - Fallout','tt4912910')
INSERT INTO movie(id,title,imdbid) VALUES(5,'Slender Man','tt5690360')
INSERT INTO movie(id,title,imdbid) VALUES(6,'Incredibles 2','tt3606756')
INSERT INTO movie(id,title,imdbid) VALUES(7,'Antman and the Wasp','tt5095030')
INSERT INTO movie(id,title,imdbid) VALUES(8,'The Equalizer 2','tt3766354')
INSERT INTO movie(id,title,imdbid) VALUES(9,'Mile 22','tt4560436')
INSERT INTO movie(id,title,imdbid) VALUES(10,'Searching','tt7668870')
INSERT INTO movie(id,title,imdbid) VALUES(11,'The Festival','tt7460806')
INSERT INTO movie(id,title,imdbid) VALUES(12,'The Happytime Murders','tt1308728')
INSERT INTO movie(id,title,imdbid) VALUES(13,'Christopher Robin','tt4575576')
INSERT INTO movie(id,title,imdbid) VALUES(14,'BlacKkKlansman ','tt7349662')
INSERT INTO movie(id,title,imdbid) VALUES(15,'Alpha','tt4244998')

INSERT INTO account(id,first_name,last_name,account_number,email) VALUES(1,'abc','def','e23f','pass@email.com')

INSERT INTO orderfilm(id,account_id,movie) VALUES(1,1,1)

INSERT INTO ticket(id,price,type) VALUES(1,3,'CHILD')
INSERT INTO ticket(id,price,type) VALUES(2,5,'ADULT')

INSERT INTO orderticket(id,order_id,ticket,quantity) VALUES(1,1,1,2)