/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/
DROP DATABASE IF EXISTS FinalExam;
CREATE DATABASE FinalExam;
USE FinalExam;

/*============================== CREATE TABLE===========================================*/
/*======================================================================================*/

DROP TABLE IF EXISTS manager;
CREATE TABLE IF NOT EXISTS manager (
	manager_id		INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	full_name		VARCHAR(50) UNIQUE KEY NOT NULL,
    email			VARCHAR(50) UNIQUE KEY NOT NULL,
	`password`		VARCHAR(50) NOT NULL,
    exp_in_year		INT UNSIGNED,
    `role`			VARCHAR(50) DEFAULT 'Manager'
);

DROP TABLE IF EXISTS project;
CREATE TABLE IF NOT EXISTS project (
	project_id		INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	team_size		INT UNSIGNED,
    manager_id		INT UNSIGNED,
    FOREIGN KEY (manager_id) REFERENCES manager (manager_id)
    
);

DROP TABLE IF EXISTS employee;
CREATE TABLE IF NOT EXISTS employee (
	employee_id		INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	full_name		VARCHAR(50) UNIQUE KEY NOT NULL,
    email			VARCHAR(50) UNIQUE KEY NOT NULL,
	`password`		VARCHAR(50) NOT NULL,
    pro_skill		VARCHAR(50),
    project_id		INT UNSIGNED,
    `role`			VARCHAR(50) DEFAULT 'Employee',
    FOREIGN KEY (project_id) REFERENCES project (project_id) 
);




/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/
INSERT INTO manager		(full_name			, email							, `password`	,  exp_in_year	, `role`	)
VALUES					('Nguyen Van A'		,'nguyenvana@gmail.com'			, 'nvanA123'	,  5			, 'Manager'	),
						('Leuu Mac Thanh'	,'leumacthanh@gmail.com'		, 'lmT2512'		,  6			, 'Manager'	),
                        ('Do Hai Nam'		,'hainam23@gmail.com'			, 'Hk12n23'		,  2			, 'Manager'	);
                        
INSERT INTO project		(team_size		, manager_id	)
VALUES					(3				,	2			),
                        (5				,	1			),
                        (6				,	2			),
                        (4				,	3			),
                        (5				, 	3			),
                        (3				,	1			),
                        (4				,	2			);
                        
INSERT INTO employee	(full_name			, email							, `password`	,  pro_skill, project_id, `role`	)
VALUES					('Nguyen Kieu Van1'	,'vankieunguyen12@gmail.com'	, 'vanKieu'		,  	'dev'	,	2		,'Employee'),
                        ('Nguyen Kieu Van2'	,'vankieunguyen2@gmail.com'		, 'Vankeu'		,  	'java'	,	3		,'Employee'),
                        ('Ca Dolphin'		,'dolphinca@gmail.com'			, 'Dolphin'		,  	'dev'	,	3		,'Employee'),
                        ('Nguyen Van'		,'nguyenvan@gmail.com'			, 'ngvAn5'		,  	'sql'	,	5		,'Employee'),
						('Dao Thu Thuy'		,'elliedao@gmail.com'			, 'ellIe201'	,  	'test'	,	1		,'Employee'),
                        ('Doan Ninh Thao'	,'vanninhn12@gmail.com'			, 'ninHninh'	,  	'java'	,	2		,'Employee'),
                        ('Le Thuy'			,'jklovot@gmail.com'			, 'llovOt'		,  	'sql'	,	4		,'Employee'),
                        ('Nhan Ly Di'		,'doubledouble@gmail.com'		, 'doubleD'		,  	'test'	,	2		,'Employee');
                        
/* ========== */
DROP PROCEDURE IF EXISTS show_all_of_users;
DELIMITER $$
CREATE PROCEDURE show_all_of_users ()
	BEGIN
		WITH all_of_users AS (
			SELECT manager_id AS user_id, full_name, email, `password`, `role` FROM manager
			UNION
			SELECT employee_id AS user_id, full_name, email, `password`, `role` FROM employee
		)
        SELECT * FROM all_of_users;
    END $$
DELIMITER ;

DROP PROCEDURE IF EXISTS show_users_of_project;
DELIMITER $$
CREATE PROCEDURE show_users_of_project (IN in_project_no INT)
	BEGIN
		WITH all_users_of_project AS (
			SELECT project_id, manager_id AS user_id, full_name, email, `password`, `role` FROM manager
			JOIN project USING (manager_id)
			UNION
			SELECT project_id, employee_id AS user_id, full_name, email, `password`, `role` FROM employee
		)
        SELECT * FROM all_users_of_project
		WHERE project_id = in_project_no;
    END $$
DELIMITER ;

DROP PROCEDURE IF EXISTS log_in;
DELIMITER $$
CREATE PROCEDURE log_in (IN user_email VARCHAR(50), IN user_password VARCHAR(50))
	BEGIN
		WITH all_users AS (
			SELECT manager_id AS user_id, full_name, email, `password`,`role` FROM manager
			UNION
			SELECT employee_id AS user_id, full_name, email, `password`, `role` FROM employee
		)
        SELECT *
        FROM all_users
        WHERE email = user_email AND `password` = user_password;
    END $$
DELIMITER ;              

SELECT DISTINCT manager_id, full_name, email, `password`, exp_in_year, `role` FROM project
JOIN manager USING (manager_id);                               