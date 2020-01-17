select first_name, last_name, department_name
from employees join departments
using (department_id); 

select first_name, last_name, job title
from employees join jobs
using (job_id);

select first_name, last_name
from employees join jobs
using (job_id) 
where (salary = min_salary or salary = MAX_SALARY);

select first_name, last_name
from employees join departments using (department_id )
join locations using (location_id)
where (country_id = 'uk');

select first_name, last_name, department_name
from departments d join employees
on(d.manager_id= EMPLOYEE_ID);


select department_name
from departments 
where (manager_id is null);

-- se voglio una colonna unica scrivo concat
select e.first_name, e.last_name as employee, m.last_name, m.first_name as manager 
from employees e left outer join employees m
on (e.manager_id=m.employee_id); 

select last_name, salary, truncate(salary + salary /100 * 8.5,2) as 'new salary', truncate(salary /100 * 8.5,2) as 'difference' 
from employees;

select datediff(curdate(), hire_date) as 'difference'
from employees;

select last_name, ifnull(commission_pct, 'no value') as 'commission percentage'
from employees;

















