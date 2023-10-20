SELECT * FROM fbuser1.fbuser;
create table post
(
post_id int,
user_id int,
postcontent int,
postimage int,
postvideo int );
use fbuser1;
insert into post value(001,1,6,8,5);
insert into post value(002,2,3,9,7);
insert into post value(003,3,6,8,7);
insert into post value(004,4,4,5,6);
select *from post;

create table friendship
(
friendship_id int,
user_id int,
friend_id int,
friendship_stutas_code int);
use fbuser1;
insert into friendship value(11,001,111,999);
insert into friendship value(12,002,222,888);
insert into friendship value(13,003,333,777);
insert into friendship value(14,004,444,666);
select * from friendship;

create table friendshipStatus
(
status_code int,
stutas varchar(12));
use fbuser1;
insert into friendshipstatus value(1,'family');
insert into friendshipstatus value(2,'friend');
insert into friendshipstatus value(3,'colleagu');
insert into friendshipstatus value(4,'classmat');
select * from  friendshipstatus ;
