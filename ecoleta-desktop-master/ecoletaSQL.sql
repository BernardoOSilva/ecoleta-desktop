CREATE DATABASE ecoleta
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

CREATE TABLE ecoleta(
	id UUID PRIMARY KEY,
	name VARCHAR(100) NOT NULL UNIQUE,
	email VARCHAR(100) NOT NULL,
	city VARCHAR (100) NOT NULL,
	typeOfWaste VARCHAR(30) NOT NULL,
	latitude float(50) NOT NULL,
	longitude float(50) NOT NULL
)