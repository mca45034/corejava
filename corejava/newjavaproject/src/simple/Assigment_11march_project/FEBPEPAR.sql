create database FebPeparss;
use FebPeparss;
create table FBUser
(
user_id int  primary key,
user_name varchar(15),
email varchar(20),
phone_no int);

insert into FBUser values(11,"sham","sham@gmail.com",98765493),
						(12,"ram","ram@gmail.com",9984893),
                        (13,"kapil","kapil@gmail.com",62276543),
                        (14,"nitish","nitish@gmail.com",6326593);
	select * from FBUser;					



create table Frienshipstutas
(
status_code int primary key,
statuss varchar(12)
);
insert into  Frienshipstutas values(1,"family"),
									(2,"friend"),
                                    (3,"colleague"),
                                    (4,"classmate");
select * from  Frienshipstutas;


create table Post(
post_id int primary key,
user_id int,
post_content int,
post_image int,
post_video int,
foreign key(user_id) references FBUser(user_id));
select * from Post;

insert into  Post values(001,11,12,13,16),
						(002,12,15,10,11),
                        (003,13,21,09,13),
                        (004,14,19,08,27);
 

create table Friendship 
(
friend_id int primary key,
user_id int,
status_code int,
foreign key (status_code) references Frienshipstutas(status_code),
foreign key(user_id) references FBUser(user_id));
select * from Friendship;

insert into Friendship values(001,11,1),
							 (002,12,2),
                             (003,13,3),
                             (004,14,4);
                             
                             
-- -	Write a query to update post count in users table. Should be total posts from post table for that user.
select * from emp where salary >any(select avg(salary) from emp group by d_id);
select * from Post where post_image >any(select count(post_image) from Post group by user_id);
select count(post_video) ,count(post_image),count(post_content) from Post  group by post_id;

-- -	List names of users who have not created any posts yet


