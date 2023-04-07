create database cource_en;
use cource_en;

create table co(
	usn varchar(15) PRIMARY KEY,
	name varchar(15) NOT NULL,
	phone varchar(15) NOT NULL,
    dept varchar(50) NOT NULL,
	gender varchar(15) NOT NULL,
	pelective varchar(50) NOT NULL,
    oelective varchar(50) NOT NULL
);
