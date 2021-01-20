/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/
DROP DATABASE IF EXISTS Testing_Assignment_4;
CREATE DATABASE Testing_Assignment_4;
USE Testing_Assignment_4;

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
	q_content			TEXT,
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
	a_content			TEXT,
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
						(N'Bán hàng'		),
                        (N'Lao công'		);
        
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
SET FOREIGN_KEY_CHECKS = 0;
INSERT INTO `account`	(email							, user_name		, full_name			, department_id	, position_id	, create_date	)
VALUES					('nguyenvana@gmail.com'			, 'nva123'		, 'Nguyen Van A'	, 4				, 7				, '2017-04-21'	),
						('leumacthanh@gmail.com'		, 'lmt2512'		, 'Leu Mac Thanh'	, 3				, 9				, '2007-09-25'	),
                        ('vankieunguyen12@gmail.com'	, 'vankieu'		, 'Nguyen Kieu Van'	, 13			, 2				, '2018-05-14'	),
                        ('hainam23@gmail.com'			, 'hn23'		, 'Do Hai Nam'		, 2				, 1				, '2015-12-12'	),
                        ('dolphinca@gmail.com'			, 'dolphin'		, 'Ca Dolphin'		, 1				, 7				, '2016-11-23'	),
                        ('nguyenvan@gmail.com'			, 'nvan_'		, 'Nguyen Van'		, 3				, 9				, '2009-07-21'	),
						('elliedao@gmail.com'			, 'ellie201'	, 'Dao Thu Thuy'	, 3				, 5				, '2020-12-25'	),
                        ('vanninhn12@gmail.com'			, 'ninhninh'	, 'Doan Ninh Thao'	, 3				, 1				, '2011-05-07'	),
						('muavaban12@gmail.com'			, 'muaban'		, 'Doan Ninh Thao'	, 12			, 1				, '2018-05-09'	),
                        ('jklovot@gmail.com'			, 'lovot'		, 'Le Thuy'			, 2				, 4				, '2015-10-12'	),
                        ('doubledouble@gmail.com'		, 'doubleD'		, 'Nhan Ly Di'		, NULL			, 2				, '2016-05-23'	),
						('hohuynh@gmail.com'			, 'hhbabe'		, 'Ho Huynh'		, 1				, 7				, '2016-11-23'	),
                        ('nvanson@gmail.com'			, 'vosong'		, 'Vo Vi'			, 4				, 9				, '2009-08-21'	),
						('elliedata@gmail.com'			, 'elliedt201'	, 'D Pele'			, 3				, 5				, '2020-12-25'	),
                        ('joebiden@gmail.com'			, 'jbiden'		, 'Joe Biden'		, 4				, 1				, '2011-05-09'	),
						('muavaban122@gmail.com'		, '12145'		, 'Di Deu Buoc'		, NULL			, 1				, '2018-05-09'	),
                        ('jklovot56@gmail.com'			, 'lovot56'		, 'Le Thuy OB'		, 2				, 4				, '2015-12-12'	),
						('bobidi@gmail.com'				, 'bbdi'		, 'Bo Bi Di'		, 4				, 9				, '2009-07-21'	),
						('kamathanhchuong@gmail.com'	, 'kamatc'		, 'Kama J'			, 4				, 5				, '2020-12-25'	);
                       
                        
-- Add data group
INSERT INTO `group` (group_name		, creator_id	, create_date	)
VALUES				('group_a'		, 2				, '2018-10-07'	),
					('group_b'		, 5				, '2017-10-03'	),
					('group_c'		, 3				, '2020-02-14'	),
                    ('group_d'		, 1				, '2016-09-07'	),
					('group_e'		, 2				, '2010-10-07'	),
					('group_g'		, 10			, '2020-02-16'	),
                    ('group_h'		, 7				, '2020-02-15'	),
                    ('group_i'		, 8				, '2016-09-23'	),
					('group_k'		, 7				, '2010-07-07'	),
					('group_l'		, 7				, '2019-10-16'	),
                    ('G Bán cá'		, 2				, '2018-10-07'	),
					('G Bán thịt'	, 5				, '2017-10-03'	),
					('G Rau cải'	, 3				, '2020-02-14'	),
                    ('G Rau đay'	, 7				, '2016-09-07'	),
					('G Rau muống'	, 2				, '2010-10-07'	),
					('G Mồng tơi'	, 7				, '2020-02-16'	),
                    ('G Bánh trái'	, 9				, '2020-02-15'	),
                    ('G Rau ngót'	, 8				, '2016-09-23'	),
					('G Rau dền'	, 7				, '2010-07-07'	);
                    
-- Add data group_account
INSERT INTO group_account	(group_id	, account_id	,join_date		)
VALUES						(19			, 14			,'2017-10-07'	),
							(2			, 14			,'2019-10-03'	),
							(7			, 14			,'2020-02-14'	),
							(3			, 14			,'2016-09-07'	),
							(5			, 14			,'2007-10-07'	),
							(2			, 12			,'2020-12-16'	),
							(3			, 10			,'2020-02-15'	),
							(4			, 14			,'2016-09-23'	),
							(5			, 5				,'2010-07-07'	),
							(6			, 18			,'2020-10-16'	),
							(1			, 6				,'2019-10-07'	),
							(19			, 7				,'2019-10-03'	),
							(7			, 1				,'2020-02-14'	),
							(19			, 1				,'2016-09-07'	),
							(5			, 1				,'2017-10-07'	),
							(2			, 1				,'2020-02-16'	),
							(3			, 2				,'2020-02-17'	),
							(19			, 10			,'2016-08-23'	),
							(5			, 15			,'2010-07-07'	),
							(19			, 2				,'2020-10-16'	),
							(4			, 8				,'2016-09-23'	),
							(19			, 17			,'2010-06-07'	),
							(6			, 3				,'2020-10-16'	),
							(19			, 8				,'2019-11-07'	),
							(2			, 9				,'2013-12-03'	),
							(9			, 14 			,'2020-02-14'	),
							(9			, 6				,'2016-09-07'	),
							(19			, 4				,'2017-10-07'	),
							(2			, 10			,'2020-02-16'	);
                            
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
INSERT INTO question	(q_content						, category_id	, type_id	, creator_id	, create_date	)
VALUES					('Câu hỏi về Java'				, 1				, 1			, 3				, '2019-01-02'	),
                        ('Question about .NET'			, 2				, 2			, 5				, '2019-10-07'	),
                        ('Question about NodeJS'		, 3				, 2			, 3				, '2019-12-03'	),
						('Question about SQL'			, 4				, 1			, 7				, '2020-01-02'	),
						('Câu hỏi về Postman'			, 5				, 2			, 2				, '2020-05-06'	),
                        ('Question about Ruby'			, 6				, 1			, 3				, '2018-01-02'	),
                        ('Question about Python'		, 7				, 1			, 9				, '2017-11-02'	),
                        ('Câu hỏi về C++'				, 8				, 2			, 4				, '2017-05-22'	),
						('Question about C#'			, 9				, 1			, 7				, '2019-09-12'	),
						('Question about PHP'			, NULL			, 1			, 1				, '2019-01-23'	),
						('Question about Keywords'		, 2				, 2			, 3				, '2019-10-07'	),
                        ('Question about Syntax'		, 7				, 2			, 10			, '2019-12-03'	),
						('Question about RWords '		, 7				, 1			, 12			, '2020-01-02'	),
						('Câu hỏi về truy vấn data'		, 8				, 2			, 3				, '2020-05-06'	),
                        ('Con bò có ăn cỏ không'		, 6				, 1			, 8				, '2018-01-02'	),
                        ('Khi ngồi lâu, bụng nở ra ntn?', NULL			, 1			, 6				, '2017-11-02'	),
                        ('Điểm khác nhau giữa C và c'	, 8				, 1			, 4				, '2017-05-22'	),
						('Question about C# statement'	, 9				, 1			, 3				, '2019-09-12'	);
                        
-- Add data answer
INSERT INTO answer	(a_content		, question_id	, is_correct	)
VALUES				('Answer AB'	, 7				, 'True'		),
					('Answer CD'	, 5				, 'False'		),
					('Answer EF'	, 4				, 'False'		),     
					('Answer GH'	, 15			, 'True'		),       
                    ('Answer IK'	, 3				, 'False'		),    
					('Answer MN'	, 3				, 'False'		),
					('Answer PQ'	, 18			, 'False'		),
					('Answer XY'	, 3				, 'True'		),     
					('Answer BD'	, 4				, 'True'		),
					('Quả Bưởi'		, 4				, 'True'		),       
                    ('Quả Cam'		, 3				, 'False'		),    
					('Quả Chanh'	, 9				, 'False'		),
					('Củ Sắn'		, 5				, 'False'		),
					('Măng cụt'		, 5				, 'True'		),   
                    ('Quả Quyét'	, 12			, 'True'		);
                    
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
							(2			, 1				),
							(3			, 7				),
							(4			, 8				),
                            (5			, 9				),
							(6			, 4				),
                            (7			, 5				),
							(8			, 3				),
                            (9			, 1				),
							(10			, 1				),
							(11			, 9				),
							(12			, 5				),
                            (13			, 5				),
							(14			, 3				),
                            (15			, 7				);

/* BT Testing_System_Assignment_4 */
-- Q1: Lấy ra danh sách nhân viên và thông tin phòng ban của họ -------------------------------
SELECT *
FROM `account`
LEFT JOIN department USING (department_id);

-- Q2: Lấy ra thông tin các account được tạo sau ngày 20/12/2010 ------------------------------
SELECT *
FROM `account`
LEFT JOIN department USING (department_id)
WHERE create_date > '2010-12-20';

-- Q3: Lấy ra tất cả các Dev ------------------------------------------------------------------
SELECT *
FROM `account`
RIGHT JOIN position USING (position_id)
WHERE position_name = 'Dev';

-- Q4: Lấy ra danh sách phòng ban có > 3 nhân viên --------------------------------------------
SELECT department_id, department_name, COUNT(1) AS 'Số nhân viên'
FROM department
JOIN `account` USING (department_id)
GROUP BY department_id
HAVING COUNT(department_id) > 3;

-- Q5: Lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất --------------------------
SELECT question_id, q_content, GROUP_CONCAT(exam_id), COUNT(1) AS 'Tổng số câu hỏi'
FROM question
JOIN exam_question USING (question_id)
GROUP BY question_id
HAVING COUNT(1) = (
	SELECT COUNT(1)
    FROM exam_question
    GROUP BY question_id
	ORDER BY COUNT(1) DESC
	LIMIT 1
    );

SELECT COUNT(eq.question_id), q.q_content
FROM exam_question eq
JOIN question q ON eq.question_id = q.question_id
GROUP BY eq.question_id
HAVING COUNT(eq.question_id) = (
	SELECT MAX(AMOUT)
    FROM (
		SELECT COUNT(eq.question_id) AS AMOUT
        FROM exam_question eq
        GROUP BY eq.question_id	
	) AS question_amout); -- tạo ra 1 bảng question_amount với field: AMOUNT
    
-- Q6: Thống kê mỗi CategoryQuestion được sử dụng trong bao nhiêu Question ------------------------------------
SELECT *, COUNT(question_id) AS 'Số Question', GROUP_CONCAT(q_content) AS 'Nội dung'
FROM question
RIGHT JOIN category_question USING (category_id)
GROUP BY category_id
ORDER BY category_id ASC;

-- Q7: Thống kê mỗi Question được sử dụng trong bao nhiêu Exam -----------------------------------
SELECT question_id, COUNT(exam_id) AS 'Số Exam', GROUP_CONCAT(exam_id) AS exam_id
FROM exam_question
RIGHT JOIN question USING (question_id)
GROUP BY question_id
ORDER BY question_id ASC;

-- Q8: Lấy ra Question có nhiều câu trả lời nhất -----------------------------------------------
SELECT question_id, q_content AS 'Question', COUNT(1) AS 'Số câu trả lời', GROUP_CONCAT(a_content) AS 'Answer'
FROM answer
JOIN question USING (question_id)
GROUP BY question_id
HAVING COUNT(1) = (
	SELECT COUNT(1)
    FROM answer
    GROUP BY question_id
    ORDER BY COUNT(1) DESC
    LIMIT 1
    );

-- Q9: Thống kê số lượng account trong mỗi group ------------------------------------------------
SELECT group_id, group_name, COUNT(account_id) AS 'Số thành viên'
FROM group_account
RIGHT JOIN `group` USING (group_id)
GROUP BY group_id
ORDER BY group_id ASC;

-- Q10: Tìm chức vụ có ít người nhất ------------------------------------------------------------
SELECT position_id, position_name, COUNT(1) AS 'Số người'
FROM `account`
JOIN position USING (position_id)
GROUP BY position_id
HAVING  COUNT(1) = (
	SELECT COUNT(1)
    FROM `account`
    GROUP BY position_id
	ORDER BY COUNT(1) ASC
    LIMIT 1
    );
    
-- Q11: Thống kê mỗi phòng ban có bao nhiêu nhân viên thuộc 1 trong 4 chức vụ (dev, test, scrum master, PM)
SELECT d.department_name, p.position_name, COUNT(a.account_id)
FROM department d
CROSS JOIN position p
LEFT JOIN `account` a ON d.department_id = a.department_id AND p.position_id = a.position_id
GROUP BY d.department_id, p.position_id
HAVING COUNT(a.account_id) >=2;

-- Q12: Lấy các thông tin chi tiết của câu hỏi ---------------------------------------------------
SELECT	q.question_id, c.category_name AS 'Chủ đề câu hỏi', q.q_content AS 'Câu hỏi', 
		tp.type_name AS 'Loại câu hỏi', a.a_content AS 'Câu trả lời', q.creator_id, ac.full_name, q.create_date
FROM question q
RIGHT JOIN answer a				ON q.question_id = a.question_id
RIGHT JOIN category_question c	ON q.category_id = c.category_id
RIGHT JOIN type_question tp		ON q.type_id	 = tp.type_id
RIGHT JOIN `account` ac			ON q.creator_id  = ac.account_id
	

UNION

SELECT	q.question_id, c.category_name AS 'Chủ đề câu hỏi', q.q_content AS 'Câu hỏi', 
		tp.type_name AS 'Loại câu hỏi', a.a_content AS 'Câu trả lời', q.creator_id, ac.full_name, q.create_date
FROM question q
LEFT JOIN  answer a 			ON q.question_id = a.question_id
LEFT JOIN category_question c	ON q.category_id = c.category_id
LEFT JOIN type_question tp		ON q.type_id	 = tp.type_id
LEFT JOIN `account` ac			ON q.creator_id  = ac.account_id
ORDER BY question_id ASC;

-- Q13: Lấy số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm ---------------------------------
SELECT type_id, type_name AS 'Loại câu hỏi', COUNT(type_id) AS 'Số lượng câu hỏi', 
		GROUP_CONCAT(q_content) AS 'Câu hỏi cụ thể'
FROM type_question
JOIN question USING (type_id)
GROUP BY type_id;

-- Q14: Lấy ra group không có account nào ---------------------------------------------------------
SELECT *
FROM `group`
LEFT JOIN group_account USING (group_id)
WHERE account_id IS NULL;

-- Q15: Lấy ra account không có group nào ---------------------------------------------------------
SELECT *
FROM `account`
LEFT JOIN group_account USING (account_id)
WHERE group_id IS NULL;

-- Q16: Lấy ra question không có answer nào -------------------------------------------------------
SELECT *
FROM question
LEFT JOIN answer USING (question_id)
WHERE answer_id IS NULL;

-- Q17: -------------------------------------------------------------------------------------------
SELECT *
FROM `account`
JOIN group_account USING (account_id)
WHERE group_id =1

UNION

SELECT *
FROM `account`
JOIN group_account USING (account_id)
WHERE group_id =2;

-- Q18: -------------------------------------------------------------------------------------------
SELECT *, COUNT(account_id), 'lớn hơn 5 thành viên'
FROM group_account
JOIN `account` USING (account_id)
GROUP BY account_id
HAVING COUNT(account_id) >5

UNION ALL

SELECT *, COUNT(account_id), 'nhỏ hơn 7 thành viên'
FROM group_account
JOIN `account` USING (account_id)
GROUP BY account_id
HAVING COUNT(account_id) <7;