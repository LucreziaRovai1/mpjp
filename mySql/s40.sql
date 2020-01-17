-- average

use me;

select avg(salary)
from employees
where department_id = 50;


-- count, count distinct
-- ho 106 dipendenti che hanno un manager, 18 sono i manager. se faccio count(*) conta anche quelli che hanno null, tutte le righe di employees.
select count(manager_id), count(distinct manager_id) 
from employees;



-- max, min
select max(salary), min(salary)
from employees;

-- sum
select sum(salary)
from employees
where department_id = 50;

-- standar deviation, variance
select stddev(salary), variance(salary)
from employees;
