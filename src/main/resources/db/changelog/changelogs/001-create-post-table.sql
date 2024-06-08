--liquibase formatted sql

--changeset liquibase-docs:001-create-post-table
CREATE TABLE post
(
    id      BIGSERIAL,
    title   VARCHAR NOT NULL,
    content VARCHAR NOT NULL,
    PRIMARY KEY (id)
);