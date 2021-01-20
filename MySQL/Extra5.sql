USE adventureworks;
/*=======================EXERCISE 1============================*/
-- Q1:  Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name của ProductSubcategory là 'Saddles'.
SELECT `Name`
FROM Product
WHERE ProductSubcategoryID = (
			SELECT ProductSubcategoryID
			FROM ProductSubcategory
			WHERE `Name` = 'Saddles'
			);
            
-- Q2: Thay đổi câu Query 1 để lấy được kết quả sau.
SELECT `Name`
FROM Product
WHERE ProductSubcategoryID IN (
			SELECT ProductSubcategoryID
			FROM ProductSubcategory
			WHERE `Name` LIKE 'Bo%'
			);
            
-- Q3: Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) và Touring Bike (nghĩa là ProductSubcategoryID = 3);
SELECT `Name`
FROM Product
WHERE ListPrice = (
		SELECT MIN(ListPrice)
		FROM (
				SELECT `Name`, ListPrice
				FROM Product
				WHERE ProductSubcategoryID = (
						SELECT ProductSubcategoryID
						FROM ProductSubcategory
						WHERE `Name` = 'Touring Bikes'
						)
			) AS min_ListPrice
);


/*=======================EXERCISE 2============================*/
-- Q1: Viết query lấy danh sách tên country và province được lưu trong AdventureWorks2008sample database.
SELECT country.`Name` AS Country, province.`Name` AS Province
FROM stateprovince province
JOIN countryregion country USING (CountryRegionCode);

-- Q2: Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country Germany và Canada
-- Chú ý: sủ dụng sort order và column headings
SELECT country.`Name` AS Country, province.`Name` AS Province
FROM stateprovince province
JOIN countryregion country USING (CountryRegionCode)
WHERE country.`Name` IN ('Germany', 'Canada')
ORDER BY country.`Name`, province.`Name`;


-- Q3: SalesOrderID, OrderDate and SalesPersonID. Từ bảng SalesPerson, chúng ta lấy cột 
-- BusinessEntityID (là định danh của người sales), Bonus and the SalesYTD (là đã sale 
-- được bao nhiêu người trong năm nay)
SELECT soh.SalesOrderID, soh.OrderDate, sp.SalesPersonID, sp.Bonus, sp.SalesYTD
FROM SalesOrderHeader soh
JOIN SalesPerson sp ON soh.SalesPersonID = sp.SalesPersonID ;

-- Q4: Sử dụng câu query trên, thêm cột JobTitle and xóa cột SalesPersonID và BusinessEntityID.
SELECT soh.SalesOrderID, soh.OrderDate, e.Title, sp.Bonus, sp.SalesYTD
FROM SalesOrderHeader soh
JOIN SalesPerson sp ON soh.SalesPersonID = sp.SalesPersonID 
JOIN employee e ON sp.SalesPersonID = e.EmployeeID;



