/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/
DROP DATABASE IF EXISTS JavaMockTest;
CREATE DATABASE JavaMockTest;
USE JavaMockTest;

/*============================== CREATE TABLE===========================================*/
/*======================================================================================*/
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
	user_id			INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	full_name		VARCHAR(50) UNIQUE KEY NOT NULL,
    email			VARCHAR(50) UNIQUE KEY NOT NULL,
	`password`		VARCHAR(50) NOT NULL,
   `role`			ENUM ('Admin', 'User')
);

/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/
INSERT INTO `user`		(full_name			, email							, `password`	,  `role`	)
VALUES					('Nguyen Van A'		,'nguyenvana@gmail.com'			, 'nvanA123'	,  'Admin'	),
						('Leuu Mac Thanh'	,'leumacthanh@gmail.com'		, 'lmT2512'		,  'Admin'	),
                        ('Nguyen Kieu Van1'	,'vankieunguyen12@gmail.com'	, 'vanKieu'		,  'User'	),
                        ('Nguyen Kieu Van2'	,'vankieunguyen2@gmail.com'		, 'Vankeu'		,  'User'	),
                        ('Do Hai Nam'		,'hainam23@gmail.com'			, 'Hk12n23'		,  'Admin'	),
                        ('Ca Dolphin'		,'dolphinca@gmail.com'			, 'Dolphin'		,  'User'	),
                        ('Nguyen Van'		,'nguyenvan@gmail.com'			, 'nvAn5'		,  'User'	),
						('Dao Thu Thuy'		,'elliedao@gmail.com'			, 'ellIe201'	,  'User'	),
                        ('Doan Ninh Thao'	,'vanninhn12@gmail.com'			, 'ninHninh'	,  'User'	),
                        ('Le Thuy'			,'jklovot@gmail.com'			, 'lovOt'		,  'User'	),
                        ('Nhan Ly Di'		,'doubledouble@gmail.com'		, 'doubleD'		,  'User'	)