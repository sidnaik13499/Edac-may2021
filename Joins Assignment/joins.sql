use assignments;
SELECT * FROM EMPLOYEES;
SELECT * FROM DEPARTMENTS;
SELECT * FROM LOCATIONS;
SELECT * FROM COUNTRIES;

#1.Write a query to find the addresses (location_id, street_address, city, 
#  state_province, country_name) of all the departments.
SELECT locations.location_id,street_address,city,state_province,country_name 
FROM countries,departments,locations
WHERE locations.location_id=departments.location_id 
AND locations.country_id = countries.country_id
GROUP BY location_id;

#2.Write a query to find the name (first_name, last name), department ID and name of all
#  the employees.
SELECT first_name,last_name,department_name,employees.department_id
FROM departments,employees
WHERE employees.department_id = departments.department_id;

#3.Write a query to find the name (first_name, last_name), job, department ID and name
#  of the employees who works in London.
SELECT first_name,last_name,job_title,departments.department_id,department_name,locations.city
FROM jobs,departments,locations,employees
WHERE employees.department_id = departments.department_id 
AND employees.job_id = jobs.job_id 
AND locations.location_id=departments.location_id
AND locations.city = 'London';

#4.Write a query to find the employee id, name (last_name) along with their manager_id 
#  and name (last_name).
SELECT  emp.employee_id,emp.last_name, mgr.employee_id as 'manager_id', mgr.last_name
FROM employees as emp, employees as mgr 
WHERE  mgr.employee_id = emp.manager_id;

#5.Write a query to find the name (first_name, last_name) and hire date of the employees
#  who was hired after 'Jones.
#Using joins
select comp.first_name, comp.last_name, comp.hire_date
from employees Sort, employees comp 
where comp.hire_date > sort.hire_date and sort.last_name = 'Jones';

#Using subqueries.
SELECT first_name,last_name,hire_date 
from employees where hire_date>
(SELECT hire_date from employees where last_name='Jones');

#6.Write a query to get the department name and number of employees in the department.
SELECT department_name,count(employees.department_id) as "Number of Employees"
FROM departments,employees
WHERE employees.department_id = departments.department_id
group by department_name;

#7.Write a query to find the employee ID, job title, number of days between ending date 
#  and starting date for all jobs in department 90.
SELECT employees.employee_id, job_title, datediff(end_date , start_date) as 'Number of days'
from job_history, employees, jobs
where employees.job_id = jobs.job_id and 
employees.EMPLOYEE_ID= job_history.EMPLOYEE_ID and 
employees.DEPARTMENT_ID=90;

#8.Write a query to display the department ID and name and first name of manager. 
SELECT employees.department_id,departments.department_id, employees.first_name
FROM departments,employees
WHERE departments.department_id = employees.department_id
AND departments.manager_id = employees.employee_id;

#9.Write a query to display the department name, manager name, and city.
SELECT employees.department_id,departments.department_id, employees.first_name,city
FROM departments,employees,locations
WHERE departments.department_id = employees.department_id
AND departments.manager_id = employees.employee_id
AND locations.location_id = departments.location_id;

#10.Write a query to display the job title and average salary of employees.
SELECT job_title,avg(salary) 
FROM jobs,employees
WHERE jobs.job_id = employees.job_id
GROUP BY job_title;

#11.Write a query to display job title, employee name, and the difference between 
#   salary of the employee and minimum salary for the job.
select job_title,first_name,last_name, (SALARY-MIN_SALARY) as diffsal 
from employees,jobs
where employees.JOB_ID=jobs.JOB_ID;

#12.Write a query to display the job history that were done by any employee who is 
#   currently drawing more than 10000 of salary.
select  first_name, employees.JOB_ID, job_history.* 
from employees,job_history
where employees.EMPLOYEE_ID=job_history.EMPLOYEE_ID;

#13.Write a query to display department name, name (first_name, last_name), hire date,
# 	salary of the manager for all managers whose experience is more than 15 years.
select DEPARTMENT_NAME,first_name, last_name,HIRE_DATE,salary from departments,employees
where departments.DEPARTMENT_ID=employees.DEPARTMENT_ID
and employees.EMPLOYEE_ID=departments.MANAGER_ID
and (sysdate()-HIRE_DATE)>(15*365);

















