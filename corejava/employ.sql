create database db1;
use db1;
create table employ
(
emp_no int primary key,
salary int);
select*from employ;
insert into employ values(2345,6000),(4567,4000),(6789,9000),(2366,4000),(2235,2000);
-- find the first and second largest employee salary in list
select max(salary) from employ
where salary<(select max(salary)from employ);
select max(salary) from employ;