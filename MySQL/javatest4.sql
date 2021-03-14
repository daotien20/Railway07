/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/
DROP DATABASE IF EXISTS FinalExam1;
CREATE DATABASE FinalExam1;
USE FinalExam1;

/*============================== CREATE TABLE===========================================*/
/*======================================================================================*/

DROP TABLE IF EXISTS manager;
CREATE TABLE IF NOT EXISTS manager (
	manager_id		INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	full_name		VARCHAR(50) UNIQUE KEY NOT NULL,
    email			VARCHAR(50) UNIQUE KEY NOT NULL,
	`password`		VARCHAR(50) NOT NULL,
    exp_in_year		INT UNSIGNED
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
    FOREIGN KEY (project_id) REFERENCES project (project_id) 
);




/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/
INSERT INTO manager		(full_name			, email							, `password`	,  exp_in_year)
VALUES					('Nguyen Van A'		,'nguyenvana@gmail.com'			, 'nvanA123'	,  5			),
						('Leuu Mac Thanh'	,'leumacthanh@gmail.com'		, 'lmT2512'		,  6			),
                        ('Do Hai Nam'		,'hainam23@gmail.com'			, 'Hk12n23'		,  2			);
                        
INSERT INTO project		(team_size		, manager_id	)
VALUES					(3				,	2			),
                        (5				,	1			),
                        (6				,	2			),
                        (4				,	3			),
                        (5				, 	3			),
                        (3				,	1			),
                        (4				,	2			);
                        
INSERT INTO employee	(full_name			, email							, `password`	,  pro_skill, project_id)
VALUES					('Nguyen Kieu Van1'	,'vankieunguyen12@gmail.com'	, 'vanKieu'		,  	'dev'	,	2		),
                        ('Nguyen Kieu Van2'	,'vankieunguyen2@gmail.com'		, 'Vankeu'		,  	'java'	,	3		),
                        ('Ca Dolphin'		,'dolphinca@gmail.com'			, 'Dolphin'		,  	'dev'	,	3		),
                        ('Nguyen Van'		,'nguyenvan@gmail.com'			, 'nvAn5'		,  	'sql'	,	5		),
						('Dao Thu Thuy'		,'elliedao@gmail.com'			, 'ellIe201'	,  	'test'	,	1		),
                        ('Doan Ninh Thao'	,'vanninhn12@gmail.com'			, 'ninHninh'	,  	'java'	,	2		),
                        ('Le Thuy'			,'jklovot@gmail.com'			, 'llovOt'		,  	'sql'	,	4		),
                        ('Nhan Ly Di'		,'doubledouble@gmail.com'		, 'doubleD'		,  	'test'	,	2		);
                        
/* ========== */

                                              