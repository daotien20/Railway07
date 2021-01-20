/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/
DROP DATABASE IF EXISTS m99;
CREATE DATABASE m99;
USE m99;

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
	position_name	ENUM('Dev', 'Test', 'Scrum Master', 'PM', 'BA', 'BrSE', 'Intern', 'Comtor', 'Reviewer')
);

DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
	account_id		SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	email			VARCHAR(100) UNIQUE KEY,
	user_name		VARCHAR(50) UNIQUE KEY,
	full_name		NVARCHAR(50),
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

DROP TABLE IF EXISTS table_01;
CREATE TABLE IF NOT EXISTS table_01(
	table01_id		SMALLINT UNSIGNED,
	group_id		TINYINT UNSIGNED,
	account_id		SMALLINT UNSIGNED,
    another_account	VARCHAR(50) DEFAULT 'unknown',
    PRIMARY KEY (table01_id),
    FOREIGN KEY (group_id,account_id) REFERENCES group_account (group_id,account_id)
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
	q_content		TEXT,
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
	a_content		TEXT,
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
    PRIMARY KEY (exam_id,question_id)
);

DROP TABLE IF EXISTS table_02;
CREATE TABLE IF NOT EXISTS table_02(
	table02_id		SMALLINT UNSIGNED,
	exam_id			SMALLINT UNSIGNED,
	question_id		SMALLINT UNSIGNED,
    another_account	VARCHAR(50) DEFAULT 'unknown',
    PRIMARY KEY (table02_id),
    FOREIGN KEY (exam_id,question_id) REFERENCES exam_question (exam_id,question_id)
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
                        (N'Lao công'		),
                        (N'Waiting department');
        
-- Add data position
INSERT INTO position	(position_name	)
VALUES					('Dev'			),
						('Test'			),
						('Scrum Master'	),
						('PM'			),
						('BA'			),
						('BrSE'			),
						('Intern'		),
						('Comtor'		),
						('Reviewer'		);
        
-- Add data account
INSERT INTO `account`	(email							, user_name		, full_name			, department_id	, position_id	, create_date	)
VALUES					('admin@gmail.com'				, 'admin'		, ''				, NULL			, NULL			, '2005-10-10'	),
						('nguyenvana@gmail.com'			, 'nva123'		, 'Nguyen Van A'	, 4				, 7				, '2017-04-21'	),
						('leumacthanh@gmail.com'		, 'lmt2512'		, 'Leu Mac Thanh'	, 3				, 9				, '2007-09-25'	),
                        ('vankieunguyen12@gmail.com'	, 'vankieu'		, 'Nguyen Kieu Van'	, 10			, 2				, '2018-05-14'	),
                        ('hainam23@gmail.com'			, 'hn23'		, 'Do Hai Nam'		, 2				, 1				, '2015-12-12'	),
                        ('dolphinca@gmail.com'			, 'dolphin'		, 'Ca Dolphin'		, 1				, 7				, '2016-11-23'	),
                        ('nguyenvan@gmail.com'			, 'nvan_'		, 'Nguyen Van'		, 3				, 9				, '2009-07-21'	),
						('elliedao@gmail.com'			, 'ellie201'	, 'Dao Thu Thuy'	, 3				, 5				, '2020-12-25'	),
                        ('vanninhn12@gmail.com'			, 'ninhninh'	, 'Doan Ninh Thao'	, 3				, 1				, '2011-05-07'	),
						('muavaban12@gmail.com'			, 'muaban'		, 'Doan Ninh Thao'	, 2			 	, 1				, '2018-05-09'	),
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
                        ('Question about NodeJS'		, 3				, 2			, 3				, '2020-11-03'	),
						('Question about SQL'			, 4				, 1			, 7				, '2020-01-02'	),
						('Câu hỏi về Postman'			, 5				, 2			, 2				, '2020-05-06'	),
                        ('Question about Ruby'			, 6				, 1			, 3				, '2018-01-02'	),
                        ('Question about Python'		, 7				, 1			, 9				, '2020-11-02'	),
                        ('Câu hỏi về C++'				, 8				, 2			, 4				, '2017-05-22'	),
						('Question about C#'			, 9				, 1			, 7				, '2019-09-12'	),
						('Question about PHP'			, NULL			, 1			, 1				, '2019-01-23'	),
						('Question about Keywords'		, 2				, 2			, 3				, '2019-11-07'	),
                        ('Question about Syntax'		, 7				, 2			, 10			, '2019-12-03'	),
						('Question about RWords '		, 7				, 1			, 12			, '2020-11-02'	),
						('Câu hỏi về truy vấn data'		, 8				, 2			, 3				, '2020-05-06'	),
                        ('Con bò có ăn cỏ không'		, 6				, 1			, 8				, '2018-01-02'	),
                        ('Khi ngồi lâu, bụng nở ra ntn?', NULL			, 1			, 6				, '2020-11-02'	),
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
                    ('EX006'	, 'Ruby Final Exam'		, 6				, 60		, 2				, '2016-07-01'	),
                    ('EX007'	, 'Java Final Exam'		, 1				, 120		, 3				, '2017-06-06'	),
                    ('EX008'	, 'SQL Final Exam'		, 4				, 120		, 4				, '2020-11-21'	),
                    ('EX009'	, '.NET Final Exam'		, 2				, 60		, 9				, '2019-12-21'	),
                    ('EX010'	, 'NodeJS Final Exam'	, 3				, 60		, 10			, '2016-10-31'	);
                    
-- Add data exam_question
INSERT INTO exam_question	(exam_id	, question_id	)
VALUES						(1			, 5				),
							(2			, 1				),
							(2			, 7				),
							(4			, 8				),
                            (5			, 9				),
							(4			, 4				),
                            (9			, 11			),
							(8			, 3				),
                            (9			, 10			),
							(10			, 10			),
							(10			, 9				),
							(10			, 5				),
                            (13			, 5				),
							(14			, 3				),
							(9			, 2				),
							(9			, 13			),
                            (9			, 1				),
							(10			, 1				),
							(9			, 9				),
							(9			, 15			),
                            (9			, 5				),
							(9			, 3				),
                            (9			, 19			),
							(9			, 6				),
                            (9			, 8				),
							(9			, 4				),
                            (15			, 7				);
                            
                            
/* Assignment 7 */
USE m99;

-- Q1: tạo trigger không cho phép người dùng nhập vào group có ngày tạo trước 1 năm trước
DROP TRIGGER IF EXISTS question_1;
DELIMITER $$
CREATE TRIGGER question_1
BEFORE INSERT ON `group`
FOR EACH ROW
	BEGIN
		IF NEW.create_date < DATE_SUB(NOW(), INTERVAL 1 YEAR) THEN
			SIGNAL SQLSTATE '10000'
            SET MESSAGE_TEXT = 'lỗi create_date khi thêm mới group';
            
		END IF;
END $$
DELIMITER ;

/* bản test
INSERT INTO `group` (group_name		, creator_id	, create_date	)
VALUES				('GR NAME'		, 1				, '2018-10-07'	);

SELECT * FROM `group`; 
*/

-- Q2: tạo trigger không cho phép người dùng thêm bấ kỳ user nào vào department 'Sale' nữa, 
-- khi thêm thì hiện thông báo 'Department Sale cannot add more user'
DROP TRIGGER IF EXISTS question_2;
DELIMITER $$
CREATE TRIGGER question_2
BEFORE INSERT ON `account`
FOR EACH ROW 
	BEGIN
        IF NEW.department_id = ( 
			SELECT department_id
			FROM `account`
			LEFT JOIN department USING (department_id)
			WHERE department_name = 'Sale'
            GROUP BY department_id)
        
         THEN
			SIGNAL SQLSTATE '10001'
            SET MESSAGE_TEXT = 'Department Sale cannot add more user';
            
		END IF;
	END $$
DELIMITER ;

/* bản test
INSERT INTO `account`	(email							, user_name		, full_name			, department_id	, position_id	, create_date	)
VALUES					('cuongm@gmail.com'				, 'nvamn1234'	, 'Nguyen Van F'	, 2				, 7				, '2030-04-21'	);

SELECT * FROM `account`;
*/

-- Q3: cấu hình 1 group có nhiều nhất là 5 user
DROP TRIGGER IF EXISTS question_3;
DELIMITER $$
CREATE TRIGGER question_3
BEFORE INSERT ON group_account
FOR EACH ROW
	BEGIN
		IF 	NEW.group_id = (
			SELECT group_id
            FROM	(SELECT group_id, COUNT(account_id)	
					FROM group_account
					GROUP BY group_id
					HAVING COUNT(account_id) >= 5 ) AS derived_table
			)
		THEN
			SIGNAL SQLSTATE '10002'
			SET MESSAGE_TEXT = 'group đã đủ thành viên';
            
        END IF;
	END $$
DELIMITER ;

/* bản test
INSERT INTO group_account 	(group_id		, account_id	, join_date		)
VALUES						(2				, 8				, '2020-10-07'	);

SELECT * FROM group_account;
*/

-- Q4: cấu hình 1 bài thi có nhiều nhất là 10 question
DROP TRIGGER IF EXISTS question_4;
DELIMITER $$
CREATE TRIGGER question_4
BEFORE INSERT ON exam_question
FOR EACH ROW
	BEGIN
		IF 	NEW.exam_id = (
			SELECT exam_id
            FROM 	(SELECT exam_id, COUNT(question_id)
					FROM exam_question
                    GROUP BY exam_id
                    HAVING COUNT(question_id) >=10 ) AS derived_table
			)
		
        THEN 
			SIGNAL SQLSTATE '10003'
			SET MESSAGE_TEXT = 'exam đã đủ câu hỏi';
            
		END IF;
	END $$
DELIMITER ;

/* bản test
INSERT INTO exam_question 	(exam_id		, question_id	)
VALUES						(9				, 21			);

SELECT * FROM exam_question;
*/

-- Q5: tạo trigger không cho phép người dùng xóa tài khoản có email là admin@gmail.com
-- còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông tin liên quan đến user đó
DROP TRIGGER IF EXISTS question_5;
DELIMITER $$
CREATE TRIGGER question_5
BEFORE DELETE ON `account`
FOR EACH ROW
	BEGIN
		DECLARE d_account_id INT;
    
		SELECT account_id INTO d_account_id
		FROM `account`
		WHERE email = OLD.email;
	
		IF OLD.email = 'admin@gmail.com' THEN
			SIGNAL SQLSTATE '10004' 
			SET MESSAGE_TEXT = 'Đây là tài khoản admin, không cho phép xóa';
	ELSE 
		DELETE FROM group_account WHERE account_id = d_account_id;
        UPDATE `group` SET creator_id = NULL WHERE creator_id = d_account_id;
        UPDATE exam SET creator_id = NULL WHERE creator_id = d_account_id;
        UPDATE question SET creator_id = NULL WHERE creator_id = d_account_id;
        
    END IF;
	END $$
DELIMITER ;

-- Q6: tạo trigger cho phép người dùng khi tạo account không điền vào department_id thì được phân vào 'waiting department'
DROP TRIGGER IF EXISTS question_5;
DELIMITER $$
CREATE TRIGGER question_5
BEFORE INSERT ON `account`
FOR EACH ROW
	BEGIN
		DECLARE n_department_id INT;
    
		SELECT department_id INTO n_department_id 
		FROM department
		WHERE department_name = 'Waiting department';
    
		IF NEW.department_id IS NULL THEN
		SET NEW.department_id = n_department_id;
	END IF;
	END $$
DELIMITER ;

/* bản test
INSERT INTO `account`	(email							, user_name		, full_name			, department_id	, position_id	, create_date	)
VALUES					('cuongm@gmail.com'				, 'nvamn1234'	, 'Nguyen Van F'	, NULL				, 7			, '2030-04-21'	);

SELECT * FROM `account`;
*/

-- Q7: cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi question, trong đó có tối đa 2 đáp án đúng
DROP TRIGGER IF EXISTS question_6;
DELIMITER $$
CREATE TRIGGER question_6
BEFORE INSERT ON answer
FOR EACH ROW
BEGIN
	DECLARE n_so_answer TINYINT;
	DECLARE n_so_answer_dung TINYINT;

	SELECT COUNT(answer_id) INTO n_so_answer
    FROM answer  
    JOIN question USING (question_id)
    WHERE answer.question_id = NEW.question_id;
    
    SELECT COUNT(answer_id) INTO n_so_answer_dung
    FROM answer
    JOIN question USING (question_id)
    WHERE answer.question_id = NEW.question_id AND is_correct = 'True';
    
    IF n_so_answer >= 4 THEN
		SIGNAL SQLSTATE '10006'
		SET MESSAGE_TEXT = '1 bài thi chỉ có tối đa 4 câu hỏi';
	END IF;
    
    IF n_so_answer_dung >= 2 THEN
		SIGNAL SQLSTATE '10007'
		SET MESSAGE_TEXT = '1 câu hỏi chỉ có tối đa 2 câu trả lời đúng!';
	END IF;
END$$
DELIMITER ;

/* bản test
INSERT INTO answer 	(a_content	, question_id	, is_correct)
VALUES				('Answer'	, 3				, 'True'	);

SELECT * FROM answer;
*/

-- Q8: viết trigger để sửa lại dữ liệu cho đúng
ALTER TABLE `account`
ADD COLUMN gender	NVARCHAR(50);

DROP TRIGGER IF EXISTS question_7;
DELIMITER $$
CREATE TRIGGER question_7
BEFORE INSERT ON `account`
FOR EACH ROW
BEGIN
	IF NEW.gender = 'nam' THEN
		SET NEW.gender = 'M';
	ELSEIF NEW.gender = 'nữ' THEN
		SET NEW.gender = 'F';
	ELSEIF NEW.gender = 'chưa xác định' THEN
		SET NEW.gender = 'U';
	END IF;
END$$
DELIMITER ;

/* bản test
INSERT INTO `account`	(email							, user_name		, full_name			, department_id	, position_id	, create_date	, gender)
VALUES					('cuo12ngm@gmail.com'			, 'amn1234'		, 'Nguyen Van M'	, NULL				, 7			, '2030-04-21'	, 'nam'	);

SELECT * FROM `account`;
*/

-- Q9: viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày
DROP TRIGGER IF EXISTS question_9;
DELIMITER $$
CREATE TRIGGER question_9
BEFORE DELETE ON exam
FOR EACH ROW
	BEGIN
		IF OLD.create_date >= DATE_SUB(NOW(), INTERVAL 2 DAY) THEN
			SIGNAL SQLSTATE '10009'
			SET MESSAGE_TEXT = 'exam mới tạo, không được xóa';
        END IF;
	END $$
DELIMITER ;

/* bản test
DELETE FROM exam
WHERE exam_id = 8;

SELECT * FROM exam;
*/

-- Q10: viết trigger chỉ cho phép người dùng được update, delete các question khi question đó chưa nằm trong exam nào 
DROP TRIGGER IF EXISTS question_10;
DELIMITER $$
CREATE TRIGGER question_10
BEFORE UPDATE ON question
FOR EACH ROW
	BEGIN
		IF OLD.question_id IN (
			SELECT question_id
            FROM exam_question
            WHERE exam_id IS NOT NULL) 
		
        THEN
			SIGNAL SQLSTATE '10010'
            SET MESSAGE_TEXT = 'câu hỏi này đang tồn tại trong exam';
		
        END IF;
	END $$
DELIMITER ;

/* bản test
UPDATE question
SET q_content = 'a'
WHERE question_id = 5;

SELECT * FROM question;
*/

-- Q12: lấy ra thông tin exam trong đó
-- duration <= 30 sẽ đổi thành giá trị 'short time'
-- 30< duration <= 60 sẽ đổi thành giá trị 'medium time'
-- duration > 60 sẽ đổi thành giá trị 'long time'

SELECT *,
	CASE	WHEN duration <= 30 THEN 'short time'
			WHEN duration > 30  AND duration <=60 THEN 'medium time'
            WHEN duration > 60 THEN 'long time'
	END AS duration_note
FROM exam;

-- Q13: thống kê số account trong mỗi group và 
-- in thêm 1 column nữa có tên the_number_user_amount mang giá trị quy định như sau
-- lượng user trong group <= 5 thì có giá trị 'few'
-- lượng user trong group <= 20 và > 5 thì có giá trị 'normal' 
-- lượng user trong group > 20 thì có giá trị 'higher'

SELECT group_id, COUNT(account_id),
	CASE	WHEN  COUNT(account_id)  <= 5 THEN 'few'
			WHEN  COUNT(account_id)  > 5  AND  COUNT(account_id)  <=20 THEN 'normal'
            WHEN  COUNT(account_id)  > 20 THEN 'higher'
	END AS the_number_user_amount
FROM group_account
GROUP BY group_id;

-- Q14: thống kê mỗi phòng ban có bao nhiêu user
-- nếu phòng ban nào không có user thì thay đổi giá trị 0 thành 'không có user'
SELECT *, COUNT(account_id),
	CASE	WHEN COUNT(account_id) = 0 THEN 'không có user'
	END AS note
FROM `account`
RIGHT JOIN department USING (department_id)
GROUP BY department_id;
