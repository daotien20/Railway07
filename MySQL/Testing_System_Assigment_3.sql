/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/
DROP DATABASE IF EXISTS Testing_System_Assignment_3;
CREATE DATABASE Testing_System_Assignment_3;
USE Testing_System_Assignment_3;

/*============================== CREATE TABLE=== =======================================*/
/*======================================================================================*/
DROP TABLE IF EXISTS department;
CREATE TABLE IF NOT EXISTS department (
	department_id	TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	department_name	NVARCHAR(50) UNIQUE KEY NOT NULL
);

DROP TABLE IF EXISTS position;
CREATE TABLE IF NOT EXISTS position (
	position_id		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	position_name	ENUM('Dev', 'Test', 'Scum Master', 'PM', 'BA', 'BrSE', 'Intern', 'Comtor', 'Reviewer')
);

DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
	account_id		SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	email			VARCHAR(100) UNIQUE KEY NOT NULL,
	user_name		VARCHAR(50) UNIQUE KEY,
	full_name		NVARCHAR(50) NOT NULL,
	department_id	TINYINT UNSIGNED,
	position_id		TINYINT UNSIGNED,
	create_date		DATE,
    FOREIGN KEY (department_id)	REFERENCES department (department_id),
    FOREIGN KEY (position_id)	REFERENCES position (position_id)
);

DROP TABLE IF EXISTS `group`;
CREATE TABLE IF NOT EXISTS `group` (
	group_id		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	group_name		VARCHAR(200),
	creator_id		SMALLINT UNSIGNED,
	create_date		DATE,
	FOREIGN KEY (creator_id) REFERENCES `account` (account_id) 
);

DROP TABLE IF EXISTS group_account;
CREATE TABLE IF NOT EXISTS group_account (
	group_id		TINYINT UNSIGNED,
	account_id		SMALLINT UNSIGNED,
	join_date		DATE,
	PRIMARY KEY (group_id,account_id)
);

DROP TABLE IF EXISTS type_question;
CREATE TABLE IF NOT EXISTS type_question (
	type_id			SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	type_name		ENUM('Essay', 'Multiple-Choice')
);

DROP TABLE IF EXISTS category_question;
CREATE TABLE IF NOT EXISTS category_question (
	category_id		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	category_name	VARCHAR(200)
);

DROP TABLE IF EXISTS question;
CREATE TABLE IF NOT EXISTS question (
	question_id		SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	content			TEXT,
	category_id		TINYINT UNSIGNED,
	type_id			SMALLINT UNSIGNED,
	creator_id		SMALLINT UNSIGNED,
	create_date		DATE,
	FOREIGN KEY (category_id)	REFERENCES category_question(category_id),
	FOREIGN KEY (type_id)		REFERENCES type_question (type_id),
	FOREIGN KEY (creator_id) 	REFERENCES `account` (account_id) 
);

DROP TABLE IF EXISTS answer;
CREATE TABLE IF NOT EXISTS answer (
	answer_id		SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	content			TEXT,
	question_id		SMALLINT UNSIGNED,
	is_correct		ENUM('True', 'False'),
	FOREIGN KEY (question_id)	REFERENCES question (question_id)
);

DROP TABLE IF EXISTS exam;
CREATE TABLE IF NOT EXISTS exam (
	exam_id			SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	`code`			VARCHAR(50) UNIQUE KEY NOT NULL,
	title			VARCHAR(100),
	category_id		TINYINT UNSIGNED,
	duration		TINYINT UNSIGNED,
	creator_id		SMALLINT UNSIGNED,
	create_date		DATE,
	FOREIGN KEY (category_id)	REFERENCES category_question (category_id),
	FOREIGN KEY (creator_id) 	REFERENCES `account` (account_id) 
);

DROP TABLE IF EXISTS exam_question;
CREATE TABLE IF NOT EXISTS exam_question (
	exam_id			SMALLINT UNSIGNED,
	question_id		SMALLINT UNSIGNED,
    PRIMARY KEY (exam_id,question_id),
    FOREIGN KEY (exam_id)		REFERENCES exam (exam_id),
    FOREIGN KEY (question_id)	REFERENCES question (question_id)
);

/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/
-- Add data departmet
INSERT INTO department	(department_name	)
VALUES					(N'Marketing'		),
						(N'Sale'			),
						(N'Bảo vệ'			),
						(N'Nhân sự'			),
						(N'Kỹ thuật'		),
						(N'Tài chính'		),
						(N'Phó giám đốc'	),
						(N'Giám đốc'		),
						(N'Thư ký'			),
						(N'Bán hàng'		);
        
-- Add data position
INSERT INTO position	(position_name	)
VALUES					('Dev'			),
						('Test'			),
						('Scum Master'	),
						('PM'			),
						('BA'			),
						('BrSE'			),
						('Intern'		),
						('Comtor'		),
						('Reviewer'		);
        
-- Add data account
INSERT INTO `account`	(email							, user_name		, full_name			, department_id	, position_id	, create_date	)
VALUES					('nguyenvana@gmail.com'			, 'nva123'		, 'Nguyen Van A'	, 4				, 7				, '2017-04-21'	),
						('leumacthanh@gmail.com'		, 'lmt2512'		, 'Leu Mac Thanh'	, 3				, 9				, '2020-09-25'	),
                        ('vankieunguyen12@gmail.com'	, 'vankieu'		, 'Nguyen Kieu Van'	, 1				, 2				, '2018-05-14'	),
                        ('hainam23@gmail.com'			, 'hn23'		, 'Do Hai Nam'		, 2				, 1				, '2015-12-12'	),
                        ('dolphinca@gmail.com'			, 'dolphin'		, 'Ca Dolphin'		, 1				, 7				, '2016-11-23'	),
                        ('nguyenvan@gmail.com'			, 'nvan_'		, 'Nguyen Van'		, 3				, 9				, '2017-07-21'	),
						('elliedao@gmail.com'			, 'ellie201'	, 'Dao Thu Thuy'	, 2				, 5				, '2020-12-25'	),
                        ('vanninhn12@gmail.com'			, 'ninhninh'	, 'Doan Ninh Thao'	, 3				, 1				, '2018-05-09'	),
                        ('jklovot@gmail.com'			, 'lovot'		, 'Le Thuy'			, 2				, 4				, '2015-10-12'	),
                        ('doubledouble@gmail.com'		, 'doubleD'		, 'Nhan Ly Di'		, 10			, 2				, '2016-05-23'	);
                        
-- Add data group
INSERT INTO `group` (group_name	, creator_id	, create_date	)
VALUES				('group_a'	, 2				, '2018-10-07'	),
					('group_b'	, 5				, '2017-10-03'	),
					('group_c'	, 3				, '2020-02-14'	),
                    ('group_d'	, 1				, '2016-09-07'	),
					('group_e'	, 2				, '2010-10-07'	),
					('group_g'	, 10			, '2020-02-16'	),
                    ('group_h'	, 9				, '2020-02-15'	),
                    ('group_i'	, 8				, '2016-09-23'	),
					('group_k'	, 7				, '2010-07-07'	),
					('group_l'	, 6				, '2019-10-16'	);
                    
-- Add data group_account
INSERT INTO group_account	(group_id	, account_id	,join_date		)
VALUES						(1			, 5				,'2019-10-07'	),
							(2			, 4				,'2019-10-03'	),
							(7			, 6				,'2020-02-14'	),
							(1			, 2				,'2016-09-07'	),
							(5			, 4				,'2017-10-07'	),
							(2			, 10			,'2020-02-16'	),
							(3			, 4				,'2020-02-15'	),
							(4			, 8				,'2016-09-23'	),
							(5			, 9				,'2010-07-07'	),
							(6			, 2				,'2020-10-16'	);
                            
-- Add data type_question
INSERT INTO type_question	(type_name			) 
VALUES 						('Essay'			), 
							('Multiple-Choice'	); 
				
-- Add data category_question
INSERT INTO category_question	(category_name	)
VALUES 							('Java'			),
								('.NET'			),
								('NodeJS'		),
								('SQL'			),
								('Postman'		),
								('Ruby'			),
								('Python'		),
								('C++'			),
								('C#'			),
								('PHP'			);

-- Add data question
INSERT INTO question	(content					, category_id	, type_id	, creator_id	, create_date	)
VALUES					('Câu hỏi về Java'			, 1				, 1			, 3				, '2019-01-02'	),
                        ('Question about .NET'		, 2				, 1			, 3				, '2019-10-07'	),
                        ('Question about NodeJS'	, 3				, 1			, 3				, '2019-12-03'	),
						('Question about SQL'		, 4				, 1			, 3				, '2020-01-02'	),
						('Câu hỏi về Postman'		, 5				, 1			, 3				, '2020-05-06'	),
                        ('Question about Ruby'		, 6				, 1			, 3				, '2018-01-02'	),
                        ('Question about Python'	, 7				, 1			, 3				, '2017-11-02'	),
                        ('Câu hỏi về C++'			, 8				, 1			, 3				, '2017-05-22'	),
						('Question about C#'		, 9				, 1			, 3				, '2019-09-12'	),
						('Question about PHP'		, 10			, 1			, 3				, '2019-01-23'	);
                        
-- Add data answer
INSERT INTO answer	(content		, question_id	, is_correct	)
VALUES				('Answer AB'	, 2				, 'True'		),
					('Answer CD'	, 3				, 'False'		),
					('Answer EF'	, 3				, 'False'		),     
					('Answer GH'	, 7				, 'True'		),       
                    ('Answer IK'	, 3				, 'False'		),    
					('Answer MN'	, 3				, 'False'		),
					('Answer PQ'	, 8				, 'False'		),
					('Answer XY'	, 3				, 'True'		),     
					('Answer BD'	, 3				, 'True'		),       
                    ('Answer OI'	, 2				, 'True'		);
                    
-- Add data exam
INSERT INTO exam	(`code`		, title					, category_id	, duration	, creator_id	, create_date	)
VALUES				('EX001'	, 'Python Final Exam'	, 7				, 60		, 5				, '2018-10-21'	),
                    ('EX002'	, 'C# Final Exam'		, 9				, 60		, 6				, '2019-10-22'	),
                    ('EX003'	, 'PHP Final Exam'		, 10			, 50		, 7				, '2017-10-13'	),
                    ('EX004'	, 'C++ Final Exam'		, 8				, 60		, 8				, '2020-10-23'	),
                    ('EX005'	, 'Postman Final Exam'	, 5				, 60		, 1				, '2019-09-21'	),
                    ('EX006'	, 'Ruby Final Exam'		, 6				, 60		, 2				, '2018-07-01'	),
                    ('EX007'	, 'Java Final Exam'		, 1				, 120		, 3				, '2017-06-06'	),
                    ('EX008'	, 'SQL Final Exam'		, 4				, 120		, 4				, '2020-11-21'	),
                    ('EX009'	, '.NET Final Exam'		, 2				, 60		, 9				, '2019-12-21'	),
                    ('EX010'	, 'NodeJS Final Exam'	, 3				, 60		, 10			, '2020-10-31'	);
                    
-- Add data exam_question
INSERT INTO exam_question	(exam_id	, question_id	)
VALUES						(1			, 5				),
							(2			, 6				),
							(3			, 7				),
							(4			, 8				),
                            (5			, 9				),
							(6			, 5				),
                            (7			, 2				),
							(8			, 3				),
                            (9			, 7				),
							(10			, 1				);
                            

/*===================== Bài tập của Testing_System_Assignment_3 ========================*/
/*======================================================================================*/
-- Q2:
SELECT * 
FROM department;

-- Q3:
SELECT department_id
FROM department
WHERE department_name = 'Sale';

-- Q4 - cách 1: use the MAX() function
SELECT *
FROM `account`
WHERE LENGTH(full_name) = (
	SELECT MAX(LENGTH(full_name))
    FROM`account`
	);
    
-- Q4 - cách 2: sort the table
SELECT *
FROM `account`
ORDER BY LENGTH(full_name) DESC
LIMIT 1;

-- Q5:
SELECT *
FROM `account`
WHERE department_id = 3
ORDER BY LENGTH(full_name) DESC
LIMIT 1;

-- Q6:
SELECT group_name 
FROM `group`
WHERE create_date < '2019-12-20';

-- Q7:
SELECT question_id, COUNT(*) AS 'Sum of each question_id'
FROM answer
GROUP BY question_id
HAVING COUNT(*) >= 4;

-- Q8:
SELECT `code`
FROM exam
WHERE duration >= 60 && create_date < '2019-12-20';

 -- Q9:
SELECT create_date
FROM `group`
ORDER BY create_date DESC
LIMIT 5;
 
 -- Q10:
SELECT department_id, COUNT(department_id) 
FROM `account`
WHERE department_id = 2
GROUP BY department_id;

-- Q11:
SELECT *
FROM `account`
WHERE full_name LIKE 'D%o';
    
-- Q12:
SET SQL_SAFE_UPDATES = 0;
SET FOREIGN_KEY_CHECKS = 0;
DELETE
FROM exam
WHERE create_date < '2019-12-20';
                        
-- Q13:
DELETE
FROM question
WHERE content LIKE 'câu hỏi%';

-- Q14:
UPDATE `account`
SET	full_name	= 'Nguyễn Bá Lộc',
	email		= 'loc.nguyenba@vti.com.vn'
WHERE account_id = 5;

-- Q15:
UPDATE `group`
SET	creator_id = 5
WHERE group_id = 4;


                        
                        
                        