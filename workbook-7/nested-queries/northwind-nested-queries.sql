-- Q 1:
SELECT ProductName, UnitPrice
FROM northwind.products
WHERE UNITPRICE = (SELECT MAX(UnitPrice)
					FROM northwind.products);
                    
-- Cte de Blaye (263.5000)

-- Q 2:

-- Q 3:
SELECT OrderID
FROM northwind.`order details`
WHERE ProductID = (SELECT ProductID
					FROM northwind.products
					WHERE ProductName = 'Sasquatch Ale'
                    );
-- Q 4:
-- Janet Leverling

-- Q 5:
-- Pirkko Koskitalo