/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/
DROP DATABASE IF EXISTS test_exam1;
CREATE DATABASE test_exam1;
USE test_exam1;

/*============================== CREATE TABLE=== =======================================*/
/*======================================================================================*/
DROP TABLE IF EXISTS customer;
CREATE TABLE IF NOT EXISTS customer (
	customer_id		MEDIUMINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `name`			NVARCHAR (100),
    phone			INT UNSIGNED,
    email			VARCHAR (100),
    address			NVARCHAR (200),
    note			TEXT
);

DROP TABLE IF EXISTS car;
CREATE TABLE IF NOT EXISTS car (
	car_id 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    marker		ENUM ('honda', 'toyota', 'nissan'),
    model		VARCHAR (100),
    `year`		YEAR ,
    color		VARCHAR (50),
    note		TEXT
);

DROP TABLE IF EXISTS `order`;
CREATE TABLE IF NOT EXISTS `order` (
	order_id 			MEDIUMINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    customer_id			MEDIUMINT UNSIGNED ,
    car_id				TINYINT UNSIGNED ,
    amount				INT UNSIGNED DEFAULT 1 ,
    sale_price			TINYINT UNSIGNED ,
    order_date			DATE,
    delivery_date		DATE,
    delivery_address	NVARCHAR (200),
    `status`			ENUM ('0','1','2') DEFAULT '0',
    note				TEXT,
    FOREIGN KEY (customer_id) REFERENCES customer (customer_id),
    FOREIGN KEY (car_id) REFERENCES car (car_id)
);	

/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/
-- Add data customer
INSERT INTO customer	(`name`					, phone			, email							, address	, note	)
VALUES					('Nguyen Van A'			, '0123456789'	,'admin@gmail.com'				,'decm'		, NULL	),
						('Leu Mac Thanh'	    , '0234567890'  ,'nguyenvana@gmail.com'			,'abc'		, NULL	),
                        ( 'Nguyen Kieu Van'	    , '0345678901'  ,'leumacthanh@gmail.com'		,'cdf'		, NULL	),
                        ( 'Dao Hai Nam'		    , '0456789012'  ,'vankieunguyen12@gmail.com'	,'ghj'		, NULL	),
                        ( 'Ca Dolphin'		    , '0569870123'  ,'hainam23@gmail.com'			,'yui'		, NULL	);

                        
 -- Add data car
INSERT INTO car			(marker				, model			, `year`	, color		, note	)	
VALUES					('toyota'			, 'model 1'		, 2020		, 'red'		, NULL	),
						('nissan'			, 'model 1'		, 2019		, 'silver'	, NULL	),
						('honda'			, 'model 1'		, 2018		, 'balck'   , NULL	),
                        ('honda'			, 'model 2'		, 2020		, 'yellow'  , NULL	),
                        ('nissan'			, 'model 2'		, 2020		, 'red'     , NULL	);
                        
 -- Add data order
INSERT INTO `order`     (customer_id	, car_id	, amount	, sale_price	,  order_date	,  delivery_date	,  delivery_address	,`status` 	, note	)		       
VALUES	                (1     			, 1			, 1			, 20			, '2020-05-05'	, '2020-06-05'		,'decm'				, '1'		, NULL	),
						(5				, 2			, 2			, 112			, '2019-06-06'	, '2020-07-06'      ,'abc'				, '2'       , NULL	),
                        (1				, 5			, 5			, 89			, '2020-01-10'	, '2020-02-10'      ,'cdf'				, '0'       , NULL	),
                        (3				, 3			, 1			, 120			, '2020-02-13'	, '2020-03-13'      ,'ghj'				, '1'       , NULL	),
                        (2				, 1			, 3			, 56			, '2020-10-14'	, '2020-11-14'      ,'yui'				, '2'       , NULL	),
                        (2				, 3			, 2			, 59			, '2020-10-14'	, '2020-11-14'      ,'yui'				, '1'       , NULL	);

                        
/* */
-- Q1:Tạo table với các ràng buộc và kiểu dữ liệu
-- Thêm ít nhất 5 bản ghi vào table.

-- Q2: Viết lệnh lấy ra thông tin của khách hàng: tên, số lượng oto khách hàng đã mua và 
-- sắp sếp tăng dần theo số lượng oto đã mua.

SELECT customer_id, `name`, phone, email, address, SUM(amount) AS so_oto_da_mua
FROM customer
LEFT JOIN `order` USING (customer_id)
GROUP BY customer_id
ORDER BY SUM(amount) ASC;

-- Q3: Viết hàm (không có parameter) trả về tên hãng sản xuất đã bán được nhiều oto nhất trong năm nay.
SET GLOBAL log_bin_trust_function_creators = 1;
DROP FUNCTION IF EXISTS function1;
DELIMITER $$
CREATE FUNCTION function1 () RETURNS VARCHAR(100)
	BEGIN
		DECLARE hang_sx_ban_nhieu_oto_nhat VARCHAR(100);
        
		SELECT marker INTO hang_sx_ban_nhieu_oto_nhat
        FROM `order`
        RIGHT JOIN car USING (car_id)
        GROUP BY car_id
        HAVING SUM(amount) = (
			SELECT MAX(luong_xe)
            FROM (
				SELECT SUM(amount) AS luong_xe
				FROM `order`
				GROUP BY car_id) AS so_luong_xe
			);
            
        RETURN hang_sx_ban_nhieu_oto_nhat;
	
    END $$
DELIMITER ;

SELECT test_exam1.function1();


-- Q4: Viết 1 thủ tục (không có parameter) để xóa các đơn hàng đã bị hủy của những năm trước. 
-- In ra số lượng bản ghi đã bị xóa.
SET SQL_SAFE_UPDATES =0;
DROP PROCEDURE IF EXISTS deleted_order;
DELIMITER $$
CREATE PROCEDURE deleted_order ()
	BEGIN 
		DELETE 
        FROM `order`
        WHERE (YEAR(order_date) < YEAR(NOW())) && (`status` = '2');
        
        SELECT ROW_COUNT();
	END $$
DELIMITER ;

CALL test_exam1.deleted_order();

SELECT * FROM `order`;

-- Q5: Viết 1 thủ tục (có CustomerID parameter) để in ra thông tin của các đơn hàng đã đặt hàng 
-- bao gồm: tên của khách hàng, mã đơn hàng, số lượng oto và tên hãng sản xuất.
DROP PROCEDURE IF EXISTS order_info;
DELIMITER $$
CREATE PROCEDURE order_info (IN id_customer INT)
	BEGIN
		SELECT  o.order_id, c.`name`, SUM(o.amount) AS 'số xe mua', car.marker
        FROM customer c
        JOIN `order` o 	ON c.customer_id = o.customer_id
        JOIN car		ON o.car_id = car.car_id
        WHERE c.customer_id = id_customer
        GROUP BY o.car_id;
        
	END $$
DELIMITER ;

CALL test_exam1.order_info(2);

-- Q6: Viết trigger để tránh trường hợp người dụng nhập thông tin không hợp lệ 
-- vào database (DeliveryDate < OrderDate + 15).
DROP TRIGGER IF EXISTS false_date;
DELIMITER $$
CREATE TRIGGER false_date 
BEFORE INSERT ON `order`
FOR EACH ROW
	BEGIN
		IF NEW.delivery_date < (NEW.order_date + 15) THEN
			SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT ='thông tin ngày vận chuyển không hợp lệ';
		END IF;
	END $$
DELIMITER ;

/* bản test
INSERT INTO `order`     (customer_id	, car_id	, amount	, sale_price	,  order_date	,  delivery_date	,  delivery_address	,`status` 	, note	)		       
VALUES	                (1     			, 1			, 1			, 20			, '2020-05-05'	, '2020-04-05'		,	'decm'			, '1'		, NULL	);
SELECT * FROM `order`;
*/