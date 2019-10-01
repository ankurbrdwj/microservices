CREATE TABLE IF NOT EXISTS `CompanyLicense` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT,
  `Version` int(11) NOT NULL,
  `BonusLevelCount` int(11) DEFAULT NULL,
  `Company` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `ExpirationDate` datetime DEFAULT NULL,
  `LicenseKey` varchar(255) DEFAULT NULL,
  `MediaCount` int(11) DEFAULT NULL,
  `MicCount` int(11) DEFAULT NULL,
  `StandardLevelCount` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
)

create table order (id bigint not null, createddate date, version integer, billingaddress tinyblob, shippingaddress tinyblob, customer_id bigint not null, primary key (id)) engine=InnoDB