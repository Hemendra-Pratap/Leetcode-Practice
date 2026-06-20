-- we have to uupate the table so we are going to use the update table 
update Salary
set sex = 
case 
    when sex = 'f' then 'm'
    when sex = 'm' then 'f'
end;

-- # Write your MySQL query statement below
-- select id, name, 
-- case
--     when sex = 'f' then 'm'
--     when sex = 'm' then 'f'
-- end as sex, salary
-- from Salary