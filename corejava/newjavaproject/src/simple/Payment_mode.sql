create database payment1;
use payment1;
create table user_details
(
u_id int primary key,
u_name varchar(15),
p_id int,
foreign key (p_id) references payment(p_id));




create table payment
(
p_id int primary key,
p_mode varchar(15)
);
select * from payment;
insert into payment value(1,"G_pay"),
                         (2,"a_pay"),
                         (3,"paytm"),
                         (4,"pay_pal");
