create database DB_Test_WebAPI
Go
use DB_Test_WebAPI
Go

create table Computer(
	ComId int identity primary key,
	ComName nvarchar(50),
	Producer nvarchar(100),
	Status bit,
	YearMaking Date,
	ExpireDate Date,
	Price float
)

insert into Computer values(N'DELL E5590', N'Nhà máy DELL', 1, '2020-11-12', '2025-11-12', 14000000)

select * from Computer