create database booktable;
use booktable;
create table book
(
book_id int ,
book_name varchar(12),
bookauthore_id int,
book_price int);

select * from book; 
use booktable;
insert into book values(1,"sham",101,1200);
insert into book values(2,"ram",102,1300);
insert into book values(3,"dev",103,1000);
insert into book values(4,"lucy",104,1500);
insert into book values(5,"sam",105,1800);
select * from book;