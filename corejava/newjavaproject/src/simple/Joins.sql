SELECT * FROM amitdb.payment;
SELECT * FROM amitdb.user_details;

SELECT * FROM payment1.user_details;
SELECT * FROM payment1.payment;

SELECT * FROM amitdb.user_details;
SELECT * FROM amitdb.payment_mode;
-- inner join----
select user_id,p_id,user_name,payment_modee
from amitdb.user_details u inner join amitdb.payment_mod p
on u.p_id=p.p_id
where user_name;

select user_id,user_name,p_method
from amitdb.user_details u inner join payment p
on u.p_id=p.p_id
where user_name like's%';

select user_id,user_name,p_method
from amitdb.user_details u inner join payment p
on u.p_id=p.p_id
where user_name like'm%';

select user_id,user_name,p_method
from amitdb.user_details u inner join payment p
on u.p_id=p.p_id
where user_name like'___';

-- equi join--
select user_id,user_name,p.p_id,u.p_id,p_method
from amitdb.user_details u,payment p
where u.p_id=p.p_id;

-- no equi---
select user_id,user_name,u.p_id,p.p_id,p_method
from amitdb.user_details u,payment p
where u.p_id<>p.p_id;

-- cross join --
select count(*),user_name,p_method,u.p_id,p.p_id
from amitdb.user_details u,payment p;












SELECT * FROM amitdb.user_details;
SELECT * FROM amitdb.payment_mode;

select user_id,user_name,u.p_id,payment_modee,u1.P_id
from  amitdb.user_details u inner join amitdb.payment_mode u1
on u.p_id=u1.p_id
where payment_modee like 'g_pay';

