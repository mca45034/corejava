create database book_pro;
use book_pro;
create table book
(
book_id int primary key,
book_name varchar(15),
authore_name varchar(15),
book_price int);
insert into book value(101,"xxx","yyy",120);
select * from book;

