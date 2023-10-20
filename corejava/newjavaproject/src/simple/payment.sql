SELECT * FROM amitdb.payment;
create table payment
(
p_id int,
p_method varchar(15));

insert into payment value(1,"googal_pay"),
                         (2,"phone_pay"),
                         (2,"amezone_pay"),
                         (3,"pay_pal"),
                         (3,"paytm");
select * from payment;
