use db1;
create table department
(
d_id int primary key,
d_name varchar(20));
insert into department values(11,"it"),(12,"testing"),(13,"coding"),(14,"hr"),(15,"color");
select*from department;

create table employee
(
e_id int primary key,
e_name varchar(30),
salary int ,
d_id int,
foreign key(d_id)references department(d_id)); 
insert into employee values(10,"sham",13000,11),(20,"rahul",12000,12),(30,"ankit",18000,13),(40,"ram",11000,14),(50,"",20000,15);
select*from employee;


select*from empoloyee
where salary>13000
order by salary;