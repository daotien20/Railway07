USE Testing_System_Assignment_3;
SET SQL_SAFE_UPDATES =0;
/* ======================== Assignment 6 ===========================*/   
-- Q1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
DROP PROCEDURE IF EXISTS get_account;
DELIMITER $$
CREATE PROCEDURE get_account (IN in_deprtment_name NVARCHAR(100))
	BEGIN
		SELECT *
		FROM `account`
        RIGHT JOIN department USING (department_id)
        WHERE department_name LIKE CONCAT('%', in_deprtment_name , '%');
    
    END $$
DELIMITER ;

CALL Testing_System_Assignment_3.get_account('bảo');

-- Q2: Tạo store để in ra số lượng account của mỗi group
DROP PROCEDURE IF EXISTS luong_account;
DELIMITER $$
CREATE PROCEDURE luong_account ()
	BEGIN
		SELECT *, COUNT(1)
        FROM group_account
        GROUP BY group_id
        ;
	END $$
DELIMITER ;

CALL Testing_System_Assignment_3.luong_account;

-- Q3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
DROP PROCEDURE IF EXISTS luong_question;
DELIMITER $$
CREATE PROCEDURE luong_question ()
	BEGIN
		SELECT type_id, type_name, create_date, COUNT(type_id)
        FROM type_question
        LEFT JOIN question USING (type_id)
        WHERE YEAR(create_date) = YEAR(NOW()) && MONTH(create_date) = MONTH(NOW())
        GROUP BY type_id
		;
	END $$
DELIMITER ;

CALL Testing_System_Assignment_3.luong_question();

-- Q4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
DROP PROCEDURE IF EXISTS max_question;
DELIMITER $$
CREATE PROCEDURE max_question (OUT out_type_id INT)
	BEGIN
		WITH TypeQuestionStatistic AS (
			SELECT type_id, COUNT(1) AS AMOUNT
			FROM question
			GROUP BY type_id
			)

		SELECT type_id INTO out_type_id
		FROM TypeQuestionStatistic
		WHERE AMOUNT = (
					SELECT MAX(AMOUNT)
					FROM TypeQuestionStatistic);
	END $$	
DELIMITER ;

SET @out_type_id =0;
CALL Testing_System_Assignment_3.max_question(@out_type_id);
SELECT @out_type_id;

-- Q5: Sử dụng store ở question 4 để tìm ra tên của type question
DROP PROCEDURE IF EXISTS max_question1;
DELIMITER $$
CREATE PROCEDURE max_question1 ()
	BEGIN
        SET @out_type_id =0;
		CALL Testing_System_Assignment_3.max_question(@out_type_id);

		SELECT type_name
		FROM type_question
		WHERE type_id = @out_type_id;
	END $$
DELIMITER ;

CALL Testing_System_Assignment_3.max_question1();


-- Q6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào
		-- hoặc trả về user có username chứa chuỗi của người dùng nhập vào
DROP PROCEDURE IF EXISTS abc;
DELIMITER $$
CREATE PROCEDURE abc (IN input VARCHAR(100))
	BEGIN
		SELECT 	group_name AS `name`, 'group' AS `type`
        FROM 	`group`
        WHERE 	group_name LIKE CONCAT('%', input, '%') 
		
        UNION
        SELECT 	user_name AS `name`, 'account' AS `type`
        FROM 	`account`
        WHERE 	user_name LIKE CONCAT('%', input, '%') ;
	END $$
DELIMITER ;

CALL Testing_System_Assignment_3.abc('a');

-- Q7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và 
-- trong store sẽ tự động gán:
-- username sẽ giống email nhưng bỏ phần @..mail đi
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ
-- Sau đó in ra kết quả tạo thành công

DROP PROCEDURE IF EXISTS new_account;
DELIMITER $$
CREATE PROCEDURE new_account (IN your_name VARCHAR(100), your_email VARCHAR(150))
	BEGIN
		INSERT INTO `account`
        SET email 			= your_email,
			user_name 		= LOWER(SUBSTRING_INDEX(email,'@',1)), 
            full_name 		= your_name,
			position_id 	= (	SELECT position_id
								FROM position
								WHERE position_name = 'Dev'),
            department_id 	= 99,
            create_date 	= NOW();
	END $$
DELIMITER ;

SELECT * FROM `account`;

-- Q8: Viết 1 store cho phép người dùng nhập vào Essay hay Mulitiple-Choice để thống kê câu hỏi Essay hay Multiple_Choice nào có content dài nhất
DROP PROCEDURE IF EXISTS long_content;
DELIMITER $$
CREATE PROCEDURE long_content (IN input ENUM('Essay', 'Multiple-Choice'))
	BEGIN
		WITH max_LENGTHCONTENT AS (
			SELECT type_name, LENGTH(content) AS length_content
			FROM question
			JOIN type_question USING (type_id)
		)
        
		SELECT type_name, MAX(length_content)
		FROM max_LENGTHCONTENT
		WHERE type_name = input;
	END $$
DELIMITER ;

-- Q9: Viết 1 store cho phép người dùng xóa exam dựa vào id
DROP PROCEDURE IF EXISTS delete_exam;
DELIMITER $$
CREATE PROCEDURE delete_exam (IN input_id INT)
	BEGIN
		DELETE
        FROM exam
        WHERE exam_id = input_id;
	END $$
DELIMITER ;

SELECT * FROM exam;

/* Q10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (dùng store 9) +
In số lượng record đã remove từ các table liên quan trong khi removing */

-- Tìm  Tìm ra các exam được tạo từ 3 năm trước
SELECT *
FROM exam
WHERE YEAR(NOW()) - YEAR(create_date) >=3;

-- xóa các exam đó đi (dùng store 9)
DROP PROCEDURE IF EXISTS delete_exam;
DELIMITER $$
CREATE PROCEDURE delete_exam (IN input_id INT)
	BEGIN
		DELETE
        FROM exam
        WHERE 	exam_id = input_id AND 
				(YEAR(NOW()) - YEAR(create_date)>=3);
	END $$
DELIMITER ;

-- In số lượng record đã remove từ các table liên quan trong khi removing

/* Q11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng nhập vào tên phòng ban
 và các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc */
DROP PROCEDURE IF EXISTS delete_department;
DELIMITER $$
CREATE PROCEDURE delete_department (IN input_department_name VARCHAR(150))
	BEGIN
		UPDATE `account` a
        LEFT JOIN department d ON a.department_id = d.department_id
        SET department_name = 'Phòng ban chờ việc'
        WHERE d.department_name = input_department_name;
        
	END $$
DELIMITER ;

CALL Testing_System_Assignment_3.delete_department('marketing');

-- Q12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay
CREATE OR REPLACE VIEW view12 AS
SELECT EachMonthInYear.MONTH
FROM
	(
				SELECT 1 AS MONTH
				UNION SELECT 2 AS MONTH
				UNION SELECT 3 AS MONTH
				UNION SELECT 4 AS MONTH
				UNION SELECT 5 AS MONTH
				UNION SELECT 6 AS MONTH
				UNION SELECT 7 AS MONTH
				UNION SELECT 8 AS MONTH
				UNION SELECT 9 AS MONTH
				UNION SELECT 10 AS MONTH
				UNION SELECT 11 AS MONTH
				UNION SELECT 12 AS MONTH
	) AS EachMonthInYear;

DROP PROCEDURE IF EXISTS year_question;
DELIMITER $$
CREATE PROCEDURE year_question ()
	BEGIN
		DROP TABLE IF EXISTS bang_tam;
        CREATE TABLE IF NOT EXISTS bang_tam (
        question_id		SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
		content			TEXT,
		category_id		TINYINT UNSIGNED,
		type_id			SMALLINT UNSIGNED,
		creator_id		SMALLINT UNSIGNED,
		create_date		DATE);
        
        INSERT INTO bang_tam
        SELECT *
        FROM question;
		
        SET SQL_SAFE_UPDATES =0;
		UPDATE bang_tam
		SET create_date = NULL
        WHERE YEAR(create_date) != YEAR(NOW());
        
		SELECT *, COUNT(b.question_id)
        FROM view12
        LEFT JOIN bang_tam b ON view12.MONTH = MONTH(b.create_date)
        GROUP BY view12.MONTH
        ORDER BY view12.MONTH ASC;
	END $$
DELIMITER ;

CALL Testing_System_Assignment_3.year_question();

-- Q13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất 
-- Nếu tháng nào không có thì sẽ in ra "không có câu trả lời nào trong tháng"
DROP PROCEDURE IF EXISTS month_question;
DELIMITER $$
CREATE PROCEDURE month_question()
	BEGIN		
			WITH CTE2 AS(
				WITH CTE1 AS (
					SELECT question_id, MONTH(create_date) AS month_created, COUNT(question_id) AS number_question
					FROM question
					WHERE YEAR(create_date) = YEAR(NOW())
					GROUP BY month_created
					ORDER BY month_created)
                    
				
				SELECT view12.MONTH, CTE1.number_question
				FROM view12
				JOIN CTE1 ON view12.MONTH = CTE1.month_created
					
				UNION
				SELECT view12.MONTH, 'Không có câu hỏi nào trong tháng' AS number_question
                FROM view12 
				LEFT JOIN CTE1 ON view12.MONTH = CTE1.month_created
				WHERE CTE1.month_created IS NULL)
                
			SELECT * FROM CTE2
            ORDER BY MONTH;
	END $$
DELIMITER ;

CALL Testing_System_Assignment_3.month_question();
