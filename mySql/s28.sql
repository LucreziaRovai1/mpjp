-- left outer join
select first_name, department_name
from employees right outer join departments
using(department_id)
where last_name= 'Grant';
