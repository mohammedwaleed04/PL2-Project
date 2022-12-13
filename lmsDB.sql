create database lmsdb;

use lmsdb;

create table student(
	id int primary key auto_increment,
    name char(50) not null,
    email char(50) unique not null,
    password char(50) not null,
    semester int not null,
    gender char(50) not null
);
alter table student auto_increment = 202100;

create table teacher(
	email char(50) primary key not null,
    password char(50) not null,
    name char(50) not null,
    gender char(50) not null
);

create table users(
	name char(50) not null,
    email char(50) primary key not null,
    password char(50),
    teacher boolean,
    admin boolean,
    gender char(50) not null
);

drop database lmsdb;

select * from users;
select * from student;
select * from teacher;