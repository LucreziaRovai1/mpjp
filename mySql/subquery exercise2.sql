select department_name, street_address, postal_code, city, state_province, country_name
from departments join locations using (location_id)
join countries using (country_id);

select first_name, last_name as employee, department_name 
from employees join departments
using (department_id);

-- solo per chi è basato a Toronto
select first_name, last_name, department_name 
from employees join departments using (department_id)
join locations using (location_id)
where city = 'Toronto';

-- assunti dopo David Lee
select first_name, last_name, hire_date
from employees 
where hire_date > (select hire_date from employees where FIRST_NAME = 'David' and LAST_NAME = 'Lee');

-- questo è per controllare quanti David Lee ci sono
select count(employee_id)
from employees
where first_name = 'David' and last_name= 'Lee';


-- assunti prima del manager
select e.first_name, e.last_name, e.hire_date
from employees e join employees m
on (e.manager_id=m.employee_id)
where (e.hire_date < m.hire_date); 

select first_name, last_name
from employees 
where manager_id in (select manager_id from employees where FIRST_NAME = 'Lisa' and LAST_NAME = 'Ozer');

select first_name, last_name
from employees 
where department_id in (select distinct department_id from employees where last_name like '%u%');


select first_name, last_name
from employees join departments using (department_id)
where DEPARTMENT_NAME like 'Shipping';

select first_name, last_name
from employees 
where manager_id in (select employee_id from employees where FIRST_NAME = 'Steven' and LAST_NAME = 'King'); 



