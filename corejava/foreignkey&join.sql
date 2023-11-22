use rahul;

create table orders
(
o_id int primary key,
o_name varchar(50),
o_price int );
insert into orders values(10,"sugar",1200),(20,"oil",2300),(30,"grocry",800),(40,"cloths",1400),(50,"vichals",145000);
select*from orders;
create table customer
(
c_id int primary key,
c_name varchar(50),
o_id int,
foreign key(o_id) references orders(o_id));
insert into customer values(1,"sham",10),(2,"ram",20),(3,"ankit",30),(4,"nitish",40),(5,"ashish",10);
select*from customer;


-- inner joins 
select  o_name,status,c_name
from  orders o inner join customer c
on o.o_id =c.c_id
where o_name like 'oil'; 
select * from orders
 join customer 
 on orders.o_id=customer.o_id;
select * from orders
    join customer
     on orders.o_id=customer.o_id;
     
     
     
select  c_name,o_name,orders.o_id
from orders
inner join customer
on orders.o_id=customer.o_id
where o_name like 'oil';

select c_name,o_name,o_price,customer.o_id
from orders
inner join customer
on orders.o_id=customer.o_id
where c_name like 'a%';

-- update with joins
-- update price of book who beloongs to author AAA
update customer r inner join orders o 
on b.o_id=o.o_id
set o_price=o_price-o_price*0.5
where c_name like 'a%';


