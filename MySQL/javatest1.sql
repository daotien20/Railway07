USE TestingJAVA;
-- SELECT * FROM department
-- WHERE department_id = 5;

-- INSERT INTO position	(position_name	)
-- VALUES					('hanoi'			);

-- UPDATE position
-- SET position_name = "Dev"
-- WHERE position_id = 5;

SELECT * FROM department;
SELECT * FROM position;	
SELECT * FROM `account`;
SET FOREIGN_KEY_CHECKS = 0;
-- DELETE 
-- FROM position
-- WHERE position_id = 3;

-- UPDATE department
-- SET department_name = "Dev"
-- WHERE department_id = 2;
SET FOREIGN_KEY_CHECKS = 0;
DROP PROCEDURE IF EXISTS sp_delete_department;
DELIMITER $$
CREATE PROCEDURE sp_delete_department (IN in_dept_no INT)
	BEGIN
        DELETE 
        FROM department
        WHERE department_id = in_dept_no;
    END $$
DELIMITER ;