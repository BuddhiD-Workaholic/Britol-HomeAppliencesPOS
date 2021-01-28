Create table Product 
(
ProductID varchar(100),
Name Varchar(100),
Price float, 
Quantity float,
MDate Date,
EDate Date,
Constraint ProductPK  primary key(ProductID)
)

Create table Customer
(
NIC varchar(12),
Name Varchar(100),
TelephoneNo int,
Address Varchar(200),
Email Varchar(100),
Constraint CustomerPK primary key(NIC)
)

-----------------------------------------------To be created

Create table OrderInvoice
(
OrderNo int IDENTITY (1,1),
NIC varchar(12),
CName Varchar(100),
TotalPrice float, 
PaymentMethod Varchar(100),
Orderdate Date,
PaymentDate Date,
Constraint OrderPK primary key (OrderNo),
Constraint OCFK FOREIGN KEY (NIC) REFERENCES Customer (NIC)
)

Create table OrderMultivalued
(
OrderNo int,
ProductID varchar(100),
PName Varchar(100),
Price float,
Quantity float,
TotalPrice float,
Constraint OrderPK primary key (OrderNo, ProductID),
Constraint OMCFK FOREIGN KEY (OrderNo) REFERENCES OrderInvoice (OrderNo) on delete cascade 
)
