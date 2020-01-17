select max(salary) as 'max', min(salary) as 'min', sum(salary) as 'sum', avg(salary) as'avg'
from employees
group by job_id;

select count(employee_id) as 'count', job_id as 'jobs'
from employees 
group by job_id;

select last_name, job_id as 'jobs'
from employees 
where job_id ='it_prog';

select distinct count(manager_id) as 'managers'
from employees;

select distinct first_name, last_name
from employees
where employee_id not in(select distinct manager_id from employees where manager_id is not null);

select max(salary) - min(salary) as 'difference'
from employees;

select job_id, max(salary) - min(salary) as 'salary difference'
from employees
group by job_id
having max(salary) - min(salary) != '0';

select manager_id, min(salary)
from employees
where manager_id is not null
group by manager_id
having min(salary) < 6000;












