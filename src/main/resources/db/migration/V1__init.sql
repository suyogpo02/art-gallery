--CREATE ROLE artist SUPERUSER PASSWORD 'artist123';
CREATE SCHEMA art AUTHORIZATION artist;

CREATE TABLE IF NOT EXISTS USERS (
 id UUID NOT NULL,
 first_name TEXT NOT NULL,
 last_name TEXT NOT NULL,
 email_id TEXT NOT NULL,
 created_date TEXT NOT NULL,
 PRIMARY KEY (id)
);