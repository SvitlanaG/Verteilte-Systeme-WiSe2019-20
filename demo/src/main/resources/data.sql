INSERT INTO c_user (id, first_name, last_name) VALUES (1, 'foo', 'bar');
INSERT INTO c_user (id, first_name, last_name) VALUES (2, 'jon', 'smith');
INSERT INTO c_user (id, first_name, last_name) VALUES (3, 'mariah', 'musterfrau');


INSERT into c_address (id, city, zip, street, user_id) VALUES (1, 'foo', '12345', 'bar street', 1);
INSERT into c_address (id, city, zip, street, user_id) VALUES (2, 'bar', '54321', 'foo street', 1);
INSERT into c_address (id, city, zip, street, user_id) VALUES (3, 'beverly hills', '90210', 'i know it from the TV', 2);
INSERT into c_address (id, city, zip, street, user_id) VALUES (4, 'Berlin', '10002', 'Goetestrasse 1', 3);
INSERT into c_address (id, city, zip, street, user_id) VALUES (5, 'Freundenstadt', '23564', 'Happy-Street 12', 3);
INSERT into c_address (id, city, zip, street, user_id) VALUES (6, 'Musterhausen', '70190', 'Musterstrasse 0815', 3);