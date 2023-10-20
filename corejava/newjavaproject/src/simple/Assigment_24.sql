create database forein;
use forein;
create table movie1
(
m_id int primary key,
m_name varchar(15),
t_id int,
foreign key(t_id) references theater1(t_id));

select *from movie;
insert into movie1 value(100,"RRR",101),
                       (200,"Action",102),
                       (300,"Border",103);

create table theater1 
(
t_id int primary key,
t_loc varchar(12));

select *from theater;
insert into theater1 value(101,"Mubai"),
						 (102,"Delhi"),
                         (103,"Indore");
                         
alter table movie1
drop constraint movie1_ibfk_1;

alter table movie1
add constraint movie_theater
foreign key(t_id) 
references theater(t_id);
-- ------------------------------------------------------------------------------------------------------------                         
                         
create table bank
(
b_id int primary key,
b_name varchar(15),
b_loc varchar(12),
c_id int,
foreign key(c_id) references coustomer(c_id));  
insert into bank value(100,"BOI","Mumbai",90),
					  (200,"SBI","Indore",70),
                      (300,"Canra","Indore",40),
                      (400,"Andra","Noida",30);




create table coustomer 
(
c_id int primary key,
c_name varchar(12),
c_acco varchar(15));
                       
insert into coustomer value(90,"Sham","987654345"),
                            (70,"Ram","5789876567"),
                            (40,"Dev","486548646354"),
                            (30,"Lucy","356467577657");
alter table bank
drop constraint bank_ibfk_1; 


alter table bank
add constraint bank_details
foreign key(c_id)
 references coustomer(c_id);
select * from bank;
select * from coustomer;
-- ----------------------------------------------------------------------------------------------
create table school
(
s_id int primary key,
s_name varchar(12),
s_loc varchar(15),
t_id int ,
foreign key(t_id)
references techer(t_id));

insert into school value(101,"SVPS","Indore",20),
						(103,"KKMPS","Mumbai",60),
                        (106,"DPS","Noida",40),
                        (109,"Swami","Delhi",66);

create table techer 
(
t_id int primary key,
t_name varchar(12),
t_contect int );

insert into techer value(20,"Sham",3456543),
						(60,"Dev",4567635),
                        (40,"Rahul",6989789),
                        (66,"lucy",987654323);
                        
alter table school 
drop constraint school_ibfk_1;

alter table school
add constraint school_techer
foreign key(t_id)
references techer(t_id);
-- ----------------------------------------------------------------------------------`assigment-ii24feb``assigment-ii24feb`

create table laibrary
(
l_id int primary key ,
l_name varchar(12),
l_typbook varchar(12),
u_id int,
foreign key(u_id) references users(u_id));

create table users
(
u_id int primary key,
u_name varchar(12),
u_cotect int );

insert into laibrary value(100002,"Shri","IT",201),
							(10006,"Rmos","Machenical",302),
                            (10004,"Raymand","Engineering",406),
                            (10034,"Rathi","historical",508);
                            
insert into users value(201,"kapil",56675201),
							(302,"Rahul",78789679),
                            (406,"Nitish",544565435),
                            (508,"Ankit",567654568);
                            
alter table laibrary
drop constraint laibrary_ibfk_1;

alter table laibrary
add constraint laibrart_user
foreign key(u_id) 
references users(u_id);
select * from laibrary;
select * from users;