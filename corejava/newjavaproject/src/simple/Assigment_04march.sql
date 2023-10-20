SELECT * FROM default_db1.employees;

-- Assignments CW

-- 1.	Write a query to find the names (first_name, last_name) of the employees who are managers.

select first_name,last_name from default_db1.employees where manager_id =100;


-- 2.	Write a query to find the names (first_name, last_name) and the salaries of the employees who have a higher salary than the employee whose last_name='Bull'.
select max(salary)as 'maximum' from default_db1.employees where salary =(select salary from default_db1.employees where last_name ='bull');

-- 3.	Write a query to find the 5th maximum salary in the employees table.

select distinct salary
from default_db1.employees e1
where 6=(select count(distinct  salary)
from default_db1.employees e2
where e2.salary>=e1.salary);




-- 4.	Write a query to find the names (first_name, last_name) of the employees who have a manager and work for a department based in the United States. Hint : Write single-row and multiple-row subqueries
SELECT * FROM default_db1.departments;
select first_name,last_name from default_db1.employees where DEPARTMENT_ID>( select manager_id,department_id,DEPARTMENT_NAME from default_db1.departments where department_name='Construction');
select first_name,last_name from default_db1.employees where MANAGER_ID=100;

SELECT * FROM default_db1.employees;
-- 5.	Write a query to fetch even numbered records from employees table.
select first_name,last_name,EMPLOYEE_ID from default_db1.employees 
where EMPLOYEE_ID%2=0 
order by salary desc;

-- 6.	Write a query to find the 5th minimum salary in the employees table.
select distinct salary
from default_db1.employees u1
where 5=(select count(salary)
from default_db1.employees u2
where u1.salary>u2.salary);

-- 7.	Write a query to get nth max salaries of employees.

select  distinct salary
from default_db1.employees u2
where 1=(select count(salary)
from default_db1.employees u1
where u2.salary>u1.salary);


-- Assignments HW

SELECT * FROM default_db1.employees;


-- 1.	Write a query to find the names (first_name, last_name) of all employees who works in the IT department.

select first_name,last_name from default_db1.employees where department_id=( select department_id,job_id from default_db1.employees where job_id like 'it_prog');
select first_name,last_name,job_id,department_id from default_db1.employees where job_id like 'it_prog';



-- 2.	Write a query to find the names (first_name, last_name), the salary of the employees whose salary is greater than the average salary.
select  first_name,last_name,avg(salary) as 'avg' ,max(salary) as 'maximum'
from  default_db1.employees
group by first_name,last_name
order by max(salary)>avg(salary);

-- 3.	Write a query to find the names (first_name, last_name), the salary of the employees whose salary is equal to the minimum salary for their job grade.
select *from default_db1.employees where job_id=( select min(salary),job_id
from default_db1.employees
where salary
group by job_id);



SELECT * FROM default_db1.employees;
-- 4.	Write a query to find the names (first_name, last_name), the salary of the employees who earn more than the average salary and who works in any of the IT departments.

select * from default_db1.employees where salary>( select avg(salary) from default_db1.employees where job_id ='it_prog');



-- 5.	Write a query to find the names (first_name, last_name), the salary of the employees who earn more than Mr. Bull.

select * from default_db1.employees where salary>( select salary from default_db1.employees where last_name like 'bull');


-- 6.	Write a query to get 3 minimum salaries.
select distinct salary
from default_db1.employees e1
where 3 <=(select count(distinct salary)
from default_db1.employees e2
where e1.salary>=e2.salary);




select *from default_db1.employees where salary=( 
select min(salary),job_id
 from default_db1.employees where salary
 group by job_id );


