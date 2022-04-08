CREATE SCHEMA redpill AUTHORIZATION sa;

CREATE SEQUENCE sq_user START WITH 1 INCREMENT BY 1;

DROP TABLE IF EXISTS redpill.tb_user;

CREATE TABLE redpill.tb_user (
                               id INT NOT NULL,
                               name VARCHAR(50) NULL,
                               identifier VARCHAR(14)  NULL,
                               identifiertype VARCHAR(4)  NULL,
                               PRIMARY KEY (id)
);