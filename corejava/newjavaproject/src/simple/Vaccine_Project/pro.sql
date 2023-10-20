create database Vaccine;
use Vaccine;
create table Centers
(
centre_id int primary key,
centre_name varchar(20),
city_id int,
foreign key(city_id) references City(city_id)
);
select*from Centers;
insert into Centers values(101,"BombayHospital",20),
						  (102,"AshokaHospital",21),
                          (103,"ApolloHospital",22),
                          (104,"KokilabenHospital",23),
                          (105,"CHLHospital",24);
select*from Centers;
insert into Centers values(106,"SharmaHospital",20);
insert into Centers values(107,"AdityaHospital",20),
						  (108,"NobleHospital",20),
                            (109,"MayurHospital",21),
                              (110,"VedantHospital",21),
                                (111,"SuyashHospital",24),
                                  (112,"MohakHospital",23),
                                    (113,"DolphinHospital",22);
insert into Centers values(114,"DevHospital",25),
						   (115,"RudraHospital",26),
                           (116,"BhishmaHospital",27);

                          












create table City
(
city_id int primary key,
city_name varchar(25),
state_id int,
foreign key(state_id) references State(state_id)
);
select*from City;
insert into City values(20,"Indore",11),
						(21,"Banglore",12),
                        (22,"Mumbai",13),
                        (23,"Amritsar",14),
                        (24,"Jaipur",15);
                        
 insert into City values(25,"Bhopal",11),
                          (26,"Hampi",12),
                            (27,"pune",12);










create table State
(
state_id int primary key,
state_name varchar(20));
select *from State;
insert into State values(11,"MadhyaPradesh"),
						(12,"Karnataka"),
                        (13,"Maharastra"),
                        (14,"Punjab"),
                        (15,"Rajsthan");
						
                        
create table Slot
(
slot_id int primary key,
slot_starttime varchar(20),
slot_endtime varchar(20));
select*from Slot;
insert into Slot values(1001,"09:15:00","09:30:00"),
						(1002,"09:45:00","10:00:00"),
                        (1003,"10:00:00","10:15:00"),
                        (1004,"10:15:00","10:30:00"),
                        (1005,"10:30:00","10:45:00"),
                        (1006,"03:00:00","03:15:00"),
                        (1007,"03:15:00","09:30:00");
                        
create table Login1
(
user_id  varchar(20) primary key,
user_pass int);
select*from Login1;
insert into Login1 values("Rahul",9211),
						("Ankit",9918),
                        ("Nitish",101020),
                        ("Kapil",171734),
                        ("Ashish",181836),
                        ("Vedic",203050),
                        ("Kuldip",353570),
                        ("Rajkumar",404080);
                        
    select *from State;
    select*from City;
    
    
    
select city_name
from State u inner join City p
on u.state_id=p.state_id
where state_name='MadhyaPradesh';

select state_name from state;

select*from Centers;
 select*from City;
 
 
 
 select centre_name
 from City c inner join Centers ce
 on c.city_id=ce.city_id
 where city_name='indore';
 
 select city_name from city;
 
 
 create table Holiday
 (
 h_id int,
 h_date date,
 h_fastival varchar(30));
 select*from Holiday;
 insert into Holiday values(1,'2023-08-15','independence day');
 insert into Holiday values(2,'2023-01-26','Dependence day'),
							(3,'2023-01-30','Mahatma gandhi jaynti'),
                            (2,'2023-07-07','Krishna janmastami'),
                            (2,'2023-08-24','Dasehra'),
                            (2,'2023-09-07','Dipawali');
                           


