SELECT * FROM rahul.print;
insert into print values(2,"sham","kumar","noida",2334678943);
select * from print;
delete from print where id=1;
alter table print
add primary key (id);
insert into print values(5,"ram","lumar","indore",9834678943),(7,"ram","lumar","indore",9834678943);
insert into print values(12,"ram","lumar","indore",9834678943),(13,"ram","lumar","indore",9834678943),(14,"ram","lumar","indore",9834678943),
(15,"ram","lumar","indore",9834678943),(16,"ram","lumar","indore",9834678943);

alter table print add column email varchar(25) after mob_number;
update print set email="rahulkirar@1234" where id=5;
update print set email="rahulkirar@1234" where id=2;

use rahul;
create table Employees
(
id int primary key,
first_name varchar(20),
last_name varchar(20),
email varchar(30),
salary varchar(20),
d_id int,
foreign key(d_id) references Department(d_id)
);
select * from Disp;
insert into Disp values(101,"ram","sharma"),(102,"rahul","kirar");
select*from Employees;
insert into Employees values(111,"sham","kumar","rahul@123",23000,100),(222,"ram","sing","ram@123",22600,200),
(333,"kumar","kasyap","rkumar@123",28000,300),(444,"ankit","namdev","ankit@123",21000,400),(555,"nitish","lokhande","nitish@123",27000,500);
select*from Employees;

create table Department
(
d_id int primary key,
d_name varchar(20));

insert into Department values(100,"it"),(200,"testing"),(300,"hr"),(400,"java dev."),(500,"coder");
select*from Employees;
select*from Department;
select first_name,last_name,email,salary,d_id  from Employees where salary>27000;
select first_name,last_name,email,salary,d_id from Employees where first_name="ankit";
select first_name,last_name,email,salary,d_id from Employees where salary;
select first_name,last_name,salary,email,d_id from Employees where salary<27000;

select first_name,last_name,salary d_id from Employees where first_name like 'r%';
select first_name,last_name,salary d_id from Employees where first_name like 'a%';