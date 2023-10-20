create database foreigne;
use foreigne;
create table employe
(
e_id int primary key,
e_name varchar(20),
e_contect varchar(15),
c_id int,
foreign key(c_id) references company(c_id));

 insert into employe value(100,"Sham","8120213549",101),
                          (200,"Dev","9867453267",104),
                          (300,"Bob","7896569977",105),
                          (400,"Zack","7856981221",108);
select * from employe;





create table company
(
c_id int primary key,
c_name varchar(15),
c_location varchar(12)

 );
 
 insert into company value(101,"Cisco","mumbai"),
						  (104,"tcs","indore"),
                          (105,"infosys","delhi"),
                          (008,"jalyfish","noida");
                        
select * from company;

alter table employe
drop forife
                          