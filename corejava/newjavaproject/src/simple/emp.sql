create database emp;
use emp;
create table employe
(
e_id int primary key,
e_name varchar(20),
email varchar(29),
job_id int ,
d_id int ,
slary int );
select * from employe;
insert  into employe value(100,"Sham","sham@gmail.com",304,003,40000);
select * from employe;
insert  into employe value(112,"Ram","Ram@gmail.com",313,008,45000);
insert  into employe value(156,"Bob","bob@gmail.com",327,009,50000);
insert  into employe value(199,"Alex","alex@gmail.com",367,016,70000);
insert  into employe value(206,"Rohit","rohit@gmail.com",380,045,67000);
insert  into employe value(256,"Zacks","zacks@gmail.com",407,078,99000);
insert  into employe value(278,"Lucy","lucy@gmail.com",456,0112,400800);
insert  into employe value(304,"Rahul","rahul@gmail.com",502,0123,567000);
insert  into employe value(356,"Ankit","ankit@gmail.com",607,0231,87600);
insert  into employe value(400,"mance","mance@gmail.com",684,00321,40987000);
