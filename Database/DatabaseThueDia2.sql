CREATE DATABASE TestDb1
drop DatabaseThueDia2
USE TestDb1


CREATE TABLE Dia
(
	maDia NVARCHAR(50) not null,
	tenDia NVARCHAR(50) not null,
	tenTheLoai NVARCHAR(50) not null,
	soLuongTon INT,
	hangSx NVARCHAR(50) not null,
	giaThue INT ,
	PRIMARY KEY (maDia)
)

CREATE TABLE Thanhvien
(
	maThanhvien NVARCHAR(50) not null,
	tenThanhvien NVARCHAR(50) not null,
	diaChi NVARCHAR(50) not null,
	sDT NVARCHAR(50) not null,
	cMND NVARCHAR(50) not null,
	PRIMARY KEY (maThanhvien)
)

CREATE TABLE Nhanvien
(
	maNhanvien NVARCHAR(50) not null,
	tenNhanvien NVARCHAR(50) not null,
	diaChi NVARCHAR(50) not null,
	soDt NVARCHAR(50) not null,
	gioiTinh NVARCHAR(50) not null,
	
	PRIMARY KEY (maNhanvien)
)

CREATE TABLE Phieuthue
(
	soPhieu NVARCHAR(50) not null,
	maThanhvien NVARCHAR(50) not null,
	maNhanvien NVARCHAR(50) not null,
	ngayThue DATE,
	hanTra DATE,
	
	PRIMARY KEY (soPhieu)
)

CREATE TABLE CtPhieuthue
(
	soPhieu NVARCHAR(50) ,
	maDia NVARCHAR(50),
	soLuongThue INT,
	giaThue int,
	tinhtrang nvarchar(30) ,
	ngaykhachhangdentra date,
	thanhtien int
)

CREATE TABLE theLoai
(
	
	tenTheLoai NVARCHAR(50),
	ghiChu NVARCHAR(50),
	PRIMARY KEY(tenTheLoai)
)

CREATE TABLE taiKhoan
(
	maNhanvien NVARCHAR(50) not null,
	matKhau NVARCHAR(50) not null,
)


ALTER TABLE [dbo].[CtPhieuthue]
ADD CONSTRAINT FK_CtPhieuthue_Dia FOREIGN KEY (maDia) REFERENCES [dbo].[Dia]

ALTER TABLE [dbo].[CtPhieuthue]
ADD CONSTRAINT FK_CtPhieuthue_Phieuthue FOREIGN KEY (soPhieu) REFERENCES [dbo].[Phieuthue]

ALTER TABLE [dbo].[Phieuthue]
ADD CONSTRAINT FK_Phieuthue_Thanhvien FOREIGN KEY (maThanhvien) REFERENCES [dbo].[Thanhvien]

ALTER TABLE [dbo].[Phieuthue]
ADD CONSTRAINT FK_Phieuthue_Nhanvien FOREIGN KEY (maNhanvien) REFERENCES [dbo].[Nhanvien]

ALTER TABLE [dbo].[Dia]
ADD CONSTRAINT FK_Dia_theLoai FOREIGN KEY (tenTheLoai) REFERENCES [dbo].[theLoai]

ALTER TABLE [dbo].[taiKhoan]
ADD CONSTRAINT FK_taiKhoan_Nhanvien FOREIGN KEY (maNhanvien) REFERENCES [dbo].[Nhanvien]

INSERT dbo.theLoai VALUES
(N'Phim trong nước',''),
(N'Phim nước ngoài',''),
(N'Hoạt hình',''),
(N'Ca nhạc',''),
(N'Hài kịch',''),
(N'Games',''),
(N'Phần mềm',''),
(N'Khoa học',''),
(N'Cải lương',''),
(N'Phim tài liệu','')

insert dbo.Dia values
('D01', N'Chí Phèo',N'Phim trong nước',5,'vn',5000)


select *from Phieuthue
select *from [dbo].[CtPhieuthue]
select *from dia
select soPhieu,maDia,soLuongThue,giathue,tinhtrang from [dbo].[CtPhieuthue]
Select hanTra from Phieuthue where soPhieu = 'PT02'

delete [dbo].[CtPhieuthue] where soPhieu = 'PT02'
drop table [dbo].[CtPhieuthue]

select DISTINCT Year([ngaythue]) from Phieuthue order by Year([ngaythue]) asc
select SUM(soLuongThue*giathue) 
from Phieuthue pt join [dbo].[CtPhieuthue] ctpt on pt.soPhieu=ctpt.soPhieu
where tinhtrang=N'Chưa trả' and YEAR([ngayThue])=11

select SUM([thanhtien]) 
from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu
where tinhtrang=N'Đã trả' and MONTH([ngaykhachhangdentra])=11

select SUM([thanhtien]) from [dbo].[CtPhieuthue]


select Top 5 ctpt.madia,tendia,SoLuongKhachThue=Count(soluongthue)
from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join Dia d on d.maDia=ctpt.maDia
group by ctpt.madia,tendia
order by Count(soluongthue) desc

select  pt.maThanhvien,tv.tenThanhvien,tv.diaChi,SoLuongDiaThue=SUM(ctpt.soluongthue)
from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join Thanhvien tv on tv.maThanhvien=pt.maThanhvien
where tinhtrang=N'Đã trả' and YEAR([ngaykhachhangdentra])=2019
group by pt.maThanhvien,tv.tenThanhvien,tv.diaChi
order by SUM(ctpt.soluongthue) desc	

select Count(maThanhvien)
from Thanhvien

select pt.sophieu,ctpt.sophieu,maThanhvien,tinhtrang,ngayThue,madia,soluongthue,ngaykhachhangdentra
from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu

select Count(DISTINCT  pt.mathanhvien)
from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join Thanhvien tv on tv.maThanhvien=pt.maThanhvien
where tinhtrang=N'Đã trả' and YEAR([ngayThue])=2019 

select SUM(soluongton) from Dia

select SUM(ctpt.soluongthue)
from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join dia d on d.maDia=ctpt.maDia
where tinhtrang=N'Chưa trả' and YEAR([ngayThue])=2019

select SUM(ctpt.soluongthue)
from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join dia d on d.maDia=ctpt.maDia
where tinhtrang=N'Đã trả' and YEAR([ngayThue])=2019

select  ctpt.madia,tendia,tenTheLoai,SoLuongDiaThue=SUM(ctpt.soluongthue)
from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join dia d on d.maDia=ctpt.maDia
where YEAR([ngayThue])=2019
group by ctpt.madia,tendia,tenTheLoai
order by SUM(ctpt.soluongthue) desc

select count(DISTINCT Year([ngaykhachhangdentra])) 
from [dbo].[CtPhieuthue]

select DISTINCT Year([ngaykhachhangdentra])
from [dbo].[CtPhieuthue]
where tinhtrang=N'Đã trả'

select SUM([thanhtien]) 
from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu
where tinhtrang=N'Đã trả' and YEAR([ngaykhachhangdentra])=2019

select SUM([thanhtien]) 
from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu
where tinhtrang=N'Đã trả'

select SUM([thanhtien]) 
from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu
where tinhtrang=N'Đã trả' and  YEAR([ngaykhachhangdentra])=2019 and MONTH([ngaykhachhangdentra])=10


update CtPhieuthue set ngaykhachhangdentra=GETDATE()
where sophieu='PT10'



select Count(DISTINCT pt.mathanhvien)
from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join Thanhvien tv on tv.maThanhvien=pt.maThanhvien 
where tinhtrang=N'Chưa trả' and YEAR([ngayThue])=2019 and MONTH([ngayThue]) between  1 and 3

select ctpt.sophieu,maThanhvien,tinhtrang,ngayThue,hantra,madia,soluongthue,giathue,ngaykhachhangdentra,thanhtien
from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu
order by pt.sophieu asc

select SUM(soLuongThue*giathue)
from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu
where tinhtrang=N'Chưa trả' and YEAR([ngayThue])=2019 and DATEPART(quarter,[ngayThue]) between 1 and 2