create database janpepar;
use janpepar;
create table Booksm
(
book_id int primary key,
book_name varchar(15),
author_id int,
price int,
foreign key(author_id) references Authorsm (author_id)
);
select * from Booksm;

insert into Booksm values(010,"Java",1011,1200),
						(020,"C++",1012,1100),
                        (030,".net",1013,800),
                        (040,"C#",1014,900),
                        (050,"Python",1015,1400);


create table Authorsm
(
author_id int primary key,
authore_name varchar(15),
ph_no int,
email varchar(20),
address varchar(25),
city varchar(15));
select * from Authorsm;
insert into Authorsm values(1011,"sham",98765458,"sham@gmail.com","mp","indore"),
							(1012,"dev",9845678,"dev@gmail.com","mp","bhopal"),
                            (1013,"mukesh",7045678,"mukesh@gmail.com","up","lakhnaw"),
                            (1014,"pooja",66765678,"pooja@gmail.com","uk","dehradhun"),
                            (1015,"sneha",23465678,"sneha@gmail.com","tn","trichy");



create table Awards
(
award_id int primary key,
awardType_id int,
authore_id int,
book_id int,
years int,
foreign key (authore_id) references Authorsm(author_id),
foreign key (book_id) references Booksm(book_id),
foreign key (awardType_id) references Awardmaster(awardType_id)

);
select * from Awards;

insert into Awards values(001,1001,1011,010,2018),
						(002,1002,1012,020,2019),
                        (003,1003,1013,030,2012),
                        (004,1004,1014,040,2015),
                        (005,1005,1015,050,2023);





create table Awardmaster
(
awardType_id int primary key,
awardm_name varchar(15),
awardm_price int
);
select * from Awardmaster;
insert into Awardmaster values(1001,"fifa",12000),
								(1002,"oscer",18000),
                                (1003,"T20",15000),
                                (1004,"worldcup",23000),
                                (1005,"chempian",13000);

-- 1.	WAQ which updates book price by 10% if that book has got any award 
select * from emp where salary >any(select avg(salary) from emp group by d_id);


select book_id,price,price*0.10 as "increment" from Booksm;
select * from Awards where years in (select price*0.10 as "increment" from Booksm);

select * from Awards where award_id = (select award_id, book_id,price,price*0.10 as "increment"
from Booksm
group by book_id);

-- 2.	WAQ to print Name & PhNo of those authors who never won any award 
 
select * from Authorsm where authore_name  <any(select awardm_name from  Awardmaster group by awardType_id);


-- 3.	Write a query which gives list of authors who have won same no of awards as "mukesh" 
select award_id from Awards where  authore_id=001;