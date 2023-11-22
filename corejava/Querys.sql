use rahul;

create table region(
region_id int primary key,
region_name varchar(25));



select * from region;

insert into region values(1,'India');
insert into region values(2,'Australia');
insert into region values(3,'Indonesia');





create table countries(
country_id char(2) primary key,
country_name varchar(24),
region_id int);

select * from countries;


insert into countries values(10,'india',1);
-- insert into countries values(14,'Australia',2);
insert into countries values(12,'Indonesia',3);
insert into countries values(11,'Australia',2);



create table locations(
location_id  int primary key,
street_address varchar(25),
postal_code varchar(12),
city varchar(30),
state_province varchar(12),
country_id int);

select * from locations;

insert into locations values(101,'old delhi', 110006,'delhi','NCT',1);
insert into locations values(102,'jallan cilaki', 0232,'jakarta','bali',2);
insert into locations values(104,'seaviewcourt', 0200,'sydney','tasmania',3);


create table department(
department_id int primary key,
department_name varchar(30),
manager_id int,
location_id int);

select * from department;

insert into department values(10,'IT',200,101);
insert into department values(20,'HR',201,102);
insert into department values(40,'marketing',202,103);
create table employees(
employee_id int primary key,
first_name varchaR(25),
LAST_NAME varchar(25),
email varchar(45),
ph_no varchar(20),
hire_date date,
job_id varchar (10),
salary int,
comission_pct int,
manager_id int,
department_id int);

select * from employees;

insert into employees values(100,'steven','king','sking@gmail.com',555885,'1992-06-3','ad_vp',24000,0.00,200,10);
insert into employees values(110,'neena,kumar','nking@gmail.com',555005,'1997-05-6','ad_pres',17000,0.00,201,20);
insert into employees values(130,'lex','de','lking@gmail.com',550085,'1998-07-8','it_prog',30000,0.00,202,40);



create table jobs(
job_id varchar(10) primary key,
job_title varchar(25),
min_salary int,
max_salary int);

select * from jobs;




insert into jobs values(11,'director',10000,30000);
insert into jobs values(22,'manager',8000,15000);
insert into jobs values(44,'vise president',10000,50000);




--   Assignment -------

-- 1
select first_name 'first_name',LAST_NAME 'last_name'
from employees;


-- 2 select distinct id
select distinct department_id
from employees;

select * from department;

-- 3 total salaries payable by employees table

select count(salary) from employees;
select sum(salary)  from employees;

-- 4 sorted desc order by name

select * 
from employees order by first_name desc;

-- 5 pf of 12%

select first_name "first name",LAST_NAME 'last name',salary "salary",salary*0.12PF
from employees;

-- 6 get employee id 

select employee_id ,first_name,LAST_NAME,salary
from employees
order by salary;

update employees set salary =26000 where employee_id = 130 ;

select * from employees;

-- 7 max and min salary 
select max(salary), min(salary) from employees;

-- Assignment hw
-- 2 vg salary

select avg(salary) ,count(*)
from employees;


-- 3 job available**

select  count (job_id)
from employees;


-- 4 upper case
select upper(first_name) 
from employees;

select * from employees;