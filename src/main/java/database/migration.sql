DROP DATABASE IF EXISTS adlister_db;

CREATE DATABASE adlister_db;

CREATE USER 'user'@'localhost' IDENTIFIED BY 'codeup';


GRANT ALL ON adlister_db.* TO ‘user’@‘localhost’;


use adlister_db;



DROP TABLE IF EXISTS users;


DROP TABLE IF EXISTS ads;



CREATE TABLE users(
      id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
      username VARCHAR(120) NOT NULL,
      email VARCHAR(120) NOT NULL,
      password VARCHAR(120) NOT NULL,
      PRIMARY KEY (id)
);

CREATE TABLE ads(
    id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
    title VARCHAR(120) NOT NULL,
    description VARCHAR(120),
    user_id INT UNSIGNED NOT NULL ,
    PRIMARY KEY (id),
    FOREIGN KEY(user_id) REFERENCES users(id)
);


