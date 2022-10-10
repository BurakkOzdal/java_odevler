-- SELECT
--ANSII Standartına göre
Select ContactName Adi, CompanyName SirketAdi, City Sehir from Customers

-- filter
Select * from Customers where City='London'

Select * from Products where categoryId=1 or categoryId=3

Select * from Products where categoryId=1 and unitePrice>=10

-- Order By
Select * from Products order by ProductName
Select * from Products order by CategoryId ,ProductName 
Select * from Products order by CategoryId asc -- ascending artan
Select * from Products order by CategoryId desc -- descending azalan 
Select * from Products where categoryId=1 order by unitePrice desc

-- count 
Select count(*) from Products --toplam satır sayısı
Select count(*) Adet from Products where categoryId=2


-- Group By
Select categoryId, count(*) Adet from Products group by categoryId
Select categoryId, count(*) Adet from Products group by categoryId having count(*)<10


-- inner join
Select Products.ProductId, Products.ProductName, Categories.CategoryName
from Products inner join Categories on Products.ProductId=Categories.CategoryId

Select * from Customers c left join Orders o on c.cutomerId = o.customerId where o.customerId is null

