SELECT * FROM emp.employe;
select * from emp.employe
order by e_id desc;
select*from payment;

-- subquery    query within query  (outer query (inner query))
-- find out those employees whose salary is equal to ram

select  *from emp.employe where slary=( select  slary  from emp.employe where e_name='Ram');

-- find out those employees whose salary is not equal to ram

select * from  emp.employe  where slary>=(select slary from  emp.employe  where e_name='Ram');

-- fine out those employees who are hired after sham

select * from emp.employe where hire_date<( select hire_date from emp.employe where e_name='Sham');

-- fine out those employees who are hired before rohit
select * from emp.employe where hire_date< (select hire_date from emp.employe where e_name='rohit');

-- if subquery contains more than 1 value den use in
select * from emp.employe where city_name =( select city_name from emp.employe where e_id=199);

-- find out those employees whose salary is greater than avg salary of emp table
select * from emp.employe where slary>( select avg(slary) from emp.employe);

-- find out those employees whose salary is less than avg salary of emp table
select * from emp.employe where slary<( select avg(slary) from emp.employe);

-- find out those employees whose salary is less than avg salary of emp table

select * from emp.employe where slary>any( select sum(slary) from emp.employe);

-- find out those employees whose  salasy should be gretart average salary from ech derpartmennt

select * from emp.employe where slary <any( select avg(slary) from emp.employe group by d_id);


-- Write a query to find the names (first_name, last_name) of the employees who
--  have a manager and work for a department based in the United States.
-- Hint : Write single-row and multiple-row subqueries
SELECT * FROM default_db1.employees;
SELECT * FROM default_db1.departments;
SELECT * FROM default_db1.locations;
select * from default_db1.employees where manager_id is not null and department_id in ( select department_id from default_db1.departments where location_id in (select location_id from default_db1.locations where city='London'));

select * from default_db1.employees where department_id  in(select department_id from default_db1.departments where location_id in (select location_id from default_db1.locations where city='Seattle'));


-- find out sum of salary of department    table
SELECT * FROM amitdb.company;
SELECT * FROM emp.employe;
alter table emp.employe
add column  d_idd int;
alter table amitdb.company
add column  d_idd int;

SELECT * FROM default_db1.employees;
SELECT * FROM default_db1.departments;


