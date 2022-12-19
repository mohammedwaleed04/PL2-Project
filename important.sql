create database lmsdb;

use lmsdb;

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

create table LectureTable(
WeekNO int primary key not null,
courseTittle1 nvarchar(50),
courseTittle2 nvarchar(50),
courseTittle3 nvarchar(50),
courseTittle4 nvarchar(50),
Content nvarchar(50)
);

select * from users;
select * from student;
select * from teacher;


create table student(
	id int primary key auto_increment,
    name char(50) not null,
    email char(50) unique not null,
    password char(50) not null,
    semester int not null,
    gender char(50) not null,
    pl int,
    ds int,
    logic int,
    maths int,
    course1 nvarchar(50) default('-'),
course2 nvarchar(50) default('-'),
course3 nvarchar(50) default('-'),
course4 nvarchar(50) default('-')
);
alter table student auto_increment = 202100;
