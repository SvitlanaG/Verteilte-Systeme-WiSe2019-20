DROP TABLE IF EXISTS C_USER;
DROP TABLE IF EXISTS C_ADDRESS;
CREATE TABLE C_USER
(
    id        INTEGER PRIMARY KEY auto_increment,
    first_name VARCHAR(64),
    last_name  VARCHAR(64)
);

CREATE TABLE C_ADDRESS
(
    id      INTEGER PRIMARY KEY auto_increment,
    city    VARCHAR(64),
    zip     VARCHAR(64),
    street  VARCHAR(64),
    user_id integer,
    FOREIGN KEY (user_id) REFERENCES c_user (id)
);