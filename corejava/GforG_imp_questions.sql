create database questions;
use questions;
-- 1. max and highest selary in student list 
create table  student
(
s_id int primary key,
s_fee int);

insert into student values(234,45000),(342,65432),(765,98765),(7899,765432);
select * from student;
select max(s_fee) from student
where s_fee <(select max(s_fee) from student);

-- maximum and minimum fee student
select max(s_fee) from student;
select min(s_fee) from student;


-- using foreing key employe and dep
create table emp
(
e_id int primary key,
e_sal int,
d_id int,
foreign key(d_id) references dep(d_id));
insert into emp values(234,765432,10),(654,876545,20),(987,34565,30),(333,87654,40),(123,23454,50);
select*from emp;

create table dep
(
d_id int primary key,
d_sal int,
d_name varchar(30));
insert into dep values(10,55555,"king"),(20,2222,"sham"),(30,66666,"dev"),(40,44444,"rahul"),(50,8888,"lucy");
select*from dep;

-- 2.highest payed employee in each department
 select max(e_sal),d_id
 from emp
 group by d_id;
 
 -- count rows
 select count(*) from emp;
 select count(*),d_id
 from dep
 group by d_id;
 
 create table empss
 (
  e_id int primary key,
  e_name varchar(30),
  job varchar(40),
  mgr int,
  hire_date varchar(40),
  sal int,
  comm varchar(30),
  dep_no int );
  select*from empss;
 insert into empss values(3452,"king","president",123,"17-nov-81",5000,"-",11);
  insert into empss values(5674,"rahul","manager",921,"16-feb-87",6700,"-",12),(9211,"dev","manager",921,"19-feb-87",4700,"-",13),(8796,"ankit","manager",921,"10-feb-87",9700,"-",14),(9904,"blacks","analysis",456,"21-jan-90",9700,"-",15),(9867,"lucy","analysis",456,"25-jan-90",9800,"-",16);
   insert into empss values(3474,"rahul","manager",921,"18-feb-87",6700,"-",17),(3211,"dev","manager",921,"15-feb-87",4700,"-",18);
 -- 3 display alternate record in sempss table
 select  e_id,sal,e_name from empss
 order by sal desc;
 
 -- find dublicate values and its frequency of a column
 select e_name from empss;
-- dublicate emps count
 select e_name,count(*) from empss
 group by  e_name;
 ----
 select e_name,count(*) from empss
 group by e_name
 having count(*)>1;
 
 -- dispay the name start from 'r'
 select e_name from empss
 where e_name like 'r%';
 
  select e_name , hire_date from empss
 where  hire_date like '_____';
 
  select e_name from empss
 where e_name like '_i%';
 
 select e_name,job,  hire_date from empss
 where  hire_date like '%feb%';
 
  select e_name,job,  hire_date from empss
 where  e_name like 'k%g';
 
 
 -- union and intersaction find
 create table semple1
 (
 city varchar(30) ,
 country varchar(30));
 insert into semple1 values("hyderabad","india"),("hyderabad","india"),("bhutan","thimpu");
 create table semple2
 (
 city varchar(30),
 country varchar(30));
  insert into semple2 values("hyderabad","india"),("landon","uk"),("california","usa");
  
  
 select * from semple1
 union
select * from semple2; 

select  city from semple1
 union
select city  from semple2; 

select  city from semple1
 union all
select city  from semple2; 
select*from empss;

create table department
(
dep_no int primary key,
dep_name varchar(30));
select*from department;
insert into department values(18,"hr"),(11,"it"),(17,"tester"),(12,"hr"),(14,"coder"),(13,"it"),(16,"tester"),(15,"finence");

select  max(sal) from empss where dep_no=18;
select dep_no,sum(e_id) from empss
group by dep_no;

select dep_no,max(sal) from empss
group by dep_no
order by max(sal) desc;

select dep_no, sum(sal) from empss group by dep_no;
select sum(sal) from empss;

select e_name,job,hire_date ,sal,sal*0.15 as "pf" from empss;
select*from empss;

-- inner join
-- thre are first table is foreign key and second table primary key is inner join
select e_id,e_name,job,hire_date,comm,sal,dep_name
from empss e inner join department d
on e.dep_no=d.dep_no;


-- find the rahul employee
select e_name,job,sal,e_name
from empss e inner join department d
on e.dep_no=d.dep_no
where e_name like '%a%';

select e_name,job,sal,e_name
from empss e inner join department d
on e.dep_no=d.dep_no
where dep_name like '%hr%';


select e_name,job,sal,e_name
from empss e inner join department d
on e.dep_no=d.dep_no
where dep_name like '%tester%';


--
-------------------------------------------------------------------
-- equi join 
select e_name,job,sal,e.dep_no,d.dep_no
from empss e,department d
where e.dep_no=d.dep_no;

-- non equi join
select e_name,job,sal,e.dep_no,d.dep_no
from empss e,department d
where e.dep_no<>d.dep_no;

---------------------------------------------------
-- cross join
select e_name,job,sal,e.dep_no,d.dep_no
from empss e,department d;
select*from empss;
-- equery
select e_id,e_name,job,sal,hire_date from empss where dep_no in(  select dep_no from department where dep_name like 'it');
-- 1.	Write a query to find the names (e_name, job,sal) of the employees who are tester .
select e_name,job,sal from empss where dep_no in( select dep_no from department where dep_name like 'tester');
select e_name,job,max(Dep_sal) from empss where dep_no in( select dep_no  from department );

select*from department;
-- select e_name,job,hire_date,dep_no from empss where dep_no in( select dep_no ,dep_name from department where dep_sal =56000);

----------------------------------------------------------------------------------------------------------------
-- 2.	Write a query to find the names (first_name, job,hire_date) and the salaries of the employees who have a higher salary than the employee whose e_name='rahul'.
select sal,job,hire_date from empss where e_name like 'rahul';

