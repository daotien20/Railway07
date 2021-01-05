DROP DATABASE IF EXISTS Testing_System_Assignment_1;
CREATE DATABASE Testing_System_Assignment_1;
USE Testing_System_Assignment_1;

DROP TABLE IF EXISTS department;
CREATE TABLE IF NOT EXISTS department (
	department_id	TINYINT UNSIGNED,
	department_name	NVARCHAR(50)
);

DROP TABLE IF EXISTS position;
CREATE TABLE IF NOT EXISTS position (
	position_id		TINYINT UNSIGNED,
	position_name	ENUM('Dev', 'Test', 'Scum Master', 'PM')
);

DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
	account_id		SMALLINT UNSIGNED,
	email			VARCHAR(50),
	user_name		VARCHAR(50),
	full_name		VARCHAR(50),
	department_id	TINYINT UNSIGNED,
	position_id		TINYINT UNSIGNED,
	create_date		DATE
);

CREATE TABLE IF NOT EXISTS `group` (
	group_id		TINYINT UNSIGNED,
	group_name		VARCHAR(200),
	creator_id		SMALLINT UNSIGNED,
	create_date		DATE
);

DROP TABLE IF EXISTS group_account;
CREATE TABLE IF NOT EXISTS group_account (
	group_id		TINYINT UNSIGNED,
	account_id		SMALLINT UNSIGNED,
	join_date		DATE
);

DROP TABLE IF EXISTS type_question;
CREATE TABLE IF NOT EXISTS type_question (
	type_id			SMALLINT UNSIGNED,
	type_name		ENUM('Essay', 'Multiple-Choice')
);

DROP TABLE IF EXISTS category_question;
CREATE TABLE IF NOT EXISTS category_question (
	category_id		TINYINT UNSIGNED,
	category_name	VARCHAR(200)
);

DROP TABLE IF EXISTS question;
CREATE TABLE IF NOT EXISTS question (
	question_id		SMALLINT UNSIGNED,
	content			TEXT,
	category_id		TINYINT UNSIGNED,
	type_id			SMALLINT UNSIGNED,
	creator_id		SMALLINT UNSIGNED,
	create_date		DATE
);

DROP TABLE IF EXISTS answer;
CREATE TABLE IF NOT EXISTS answer (
	answer_id		SMALLINT UNSIGNED,
	content			TEXT,
	question_id		SMALLINT UNSIGNED,
	is_correct		ENUM('True', 'False')
);

DROP TABLE IF EXISTS exam;
CREATE TABLE IF NOT EXISTS exam (
	exam_id			SMALLINT UNSIGNED,
	`code`			VARCHAR(50),
	title			VARCHAR(100),
	category_id		TINYINT UNSIGNED,
	duration		TINYINT UNSIGNED,
	creator_id		SMALLINT UNSIGNED,
	create_date		DATE
);

DROP TABLE IF EXISTS exam_question;
CREATE TABLE IF NOT EXISTS exam_question (
	exam_id			SMALLINT UNSIGNED,
	question_id		SMALLINT UNSIGNED
);