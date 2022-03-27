-- liquibase formatted sql

-- changeset liquibase:1
CREATE TABLE book (id INT, book_id VARCHAR, name VARCHAR(128),description TEXT, PRIMARY KEY (id));