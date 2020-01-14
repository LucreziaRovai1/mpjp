select first_name, last_name, email, phone_number, hire_date 
from employees
order by last_name, first_name;

select first_name, last_name
from employees
where first_name = 'David' or first_name = 'Peter';

select first_name, last_name
from employees
where department_id = 60;


select first_name, last_name
from employees
where (department_id = 30) or (department_id = 50);

select first_name, last_name, salary
from employees
where salary > 10.000;

select first_name, last_name
from employees
where (salary < 4.000) or (salary >15.000);

select first_name, last_name, salary 
from employees
where (salary < 4.000 or salary > 15.000) and (department_id in 50,80); 


select first_name, last_name
from employees
where hire_date between '2005-01-01' and '2005-31-12';

select distinct job_id
from employees
order by job_id;

select first_name, last_name, commission_pct 
from employees
where (commission_pct is not null); 

select last_name 
from employees 
where last_name like '_a%';

select department_name
from departments
order by department_name;

select street_address, postal_code, city, state_province
from locations
where country_id = 'IT';

select first_name, last_name, hire_date
from employees
where last_name like 'Mc%'
order by hire_date;

select first_name, last_name, hire_date
from employees
where last_name or first_name like '_h%'
order by hire_date;




