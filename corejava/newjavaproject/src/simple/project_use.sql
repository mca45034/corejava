use amitdb;
create table Electrical4
(
e_id int,
e_name varchar(90),
e_price int);
insert into Electrical4 values (112,"Circuit Theory",1200),
							 (118,"Engineering Electromagnetics",1500),
                             (123,"Power Electronics Devices and Circuits",1400),
                             (138,"Communications Engineering",1400),
                             (142,"Physical Electronics",2900),
                             (149,"Electric Transportation",1800),
                             (156,"Soft Computings",1000),
                             (167,"Sonar System Engineering",1900);
select*from electrical4;

create table It
(
i_id int,
i_name varchar(90),
i_price int );

insert into It value(202,"JAVA",200),
					(212,"C#",240),
                    (235,".NET",300),
                    (256,"C++",210),
                    (267,"C",150),
                    (288,"Python",350),
                    (266,"Compiler Design",500),
                    (292,"NLP",400);
                    
                    select *from It;

create table Mechanical
(
m_id int,
m_name varchar(90),
m_price int);
insert into Mechanical values(304,"Engineering Mathematics",1200),
							(309,"Engineering Graphics",1500),
                            (313,"General Chemistry",1800),
                            (318,"Material Science",1400),
                            (322,"Basic  Electronic Circuits",1900),
                            (327,"Applied Thermodynamics",1600),
                            (336,"Fluid Mechanics",1250),
                            (367,"Measurement and Meteorology",2200);
                            select*from Mechanical;
                            
                            
create table Stories
(
s_id int,
s_name varchar(40),
s_price int);
insert into Stories value(401,"Think and Grow Rich",170),
						(410,"Customer journey management.",350),
                        (421,"Action and Adventure.",250),
                        (445,"Comic Book or Graphic Novel.",500),
                        (461,"Detective and Mystery",450),
                        (467,"Fantasy.",450),
                        (470,"Historical Fiction.",250),
                        (487,"Literary Fiction",170);
                        select*from Stories;