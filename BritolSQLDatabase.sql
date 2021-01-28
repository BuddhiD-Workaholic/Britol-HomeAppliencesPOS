-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 28, 2021 at 09:42 PM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database_britolproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `NIC` varchar(12) NOT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `TelephoneNo` int(11) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--


-- --------------------------------------------------------

--
-- Table structure for table `orderinvoice`
--

CREATE TABLE `orderinvoice` (
  `OrderNo` int(11) NOT NULL,
  `NIC` varchar(12) DEFAULT NULL,
  `CName` varchar(100) DEFAULT NULL,
  `TotalPayableamount` float DEFAULT NULL,
  `PaymentMethod` varchar(100) DEFAULT NULL,
  `Orderdate` date DEFAULT NULL,
  `PaymentDate` date DEFAULT NULL,
  `Status` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orderinvoice`
--


-- --------------------------------------------------------

--
-- Table structure for table `ordermultivalued`
--

CREATE TABLE `ordermultivalued` (
  `OrderNo` int(11) NOT NULL,
  `ProductID` varchar(100) NOT NULL,
  `PName` varchar(100) DEFAULT NULL,
  `Price` float DEFAULT NULL,
  `Quantity` float DEFAULT NULL,
  `TotalPrice` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ordermultivalued`
--


-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `ProductID` varchar(100) NOT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `Price` float DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL,
  `MDate` date DEFAULT NULL,
  `EDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--


--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`NIC`);

--
-- Indexes for table `orderinvoice`
--
ALTER TABLE `orderinvoice`
  ADD PRIMARY KEY (`OrderNo`),
  ADD KEY `OCFK` (`NIC`);

--
-- Indexes for table `ordermultivalued`
--
ALTER TABLE `ordermultivalued`
  ADD PRIMARY KEY (`OrderNo`,`ProductID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ProductID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orderinvoice`
--
ALTER TABLE `orderinvoice`
  ADD CONSTRAINT `OCFK` FOREIGN KEY (`NIC`) REFERENCES `customer` (`NIC`) ON UPDATE CASCADE;

--
-- Constraints for table `ordermultivalued`
--
ALTER TABLE `ordermultivalued`
  ADD CONSTRAINT `OMCFK` FOREIGN KEY (`OrderNo`) REFERENCES `orderinvoice` (`OrderNo`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
