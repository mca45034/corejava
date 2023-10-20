
CREATE FUNCTION  `fect` (num int)
RETURNS INTEGER deterministic
BEGIN
set @set=0;
while num>=0 do
set @set=@set+num;
set num=num-1;
end while;

RETURN @sum;
END$$


select fact(5);
