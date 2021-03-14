

SELECT * FROM project
WHERE project_id = 3;

SELECT * FROM manager
JOIN project USING (manager_id)
WHERE project_id =2;

SELECT * FROM employee
JOIN project USING (project_id)
WHERE project_id =2;

SELECT * FROM manager
WHERE user_id = 2;

SELECT * FROM employee 
WHERE user_id = 2;





SELECT * FROM manager, employee;
SELECT * FROM manager;
SELECT * FROM employee;