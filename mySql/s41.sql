-- average salary for each department
select department_id, truncate(avg(salary), 0) as 'avg salary'
from employees
group by department_id
order by 2 desc, 1; -- nel caso il salario sia uguale (2), con l'1 dico di ordinarli anche in base al dipartimento