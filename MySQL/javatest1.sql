USE TestingJAVA;
SELECT * FROM department
WHERE department_id = 5;

-- INSERT INTO position	(position_name	)
-- VALUES					('hanoi'			);

-- UPDATE position
-- SET position_name = "Dev"
-- WHERE position_id = 5;

SELECT * FROM position;	
SET FOREIGN_KEY_CHECKS = 0;
DELETE 
FROM position
WHERE position_id = 3;