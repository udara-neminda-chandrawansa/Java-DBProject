-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 12, 2024 at 12:42 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_student`
--

-- --------------------------------------------------------

--
-- Table structure for table `stud`
--

CREATE TABLE `stud` (
  `STID` int(11) NOT NULL,
  `ST_Name` varchar(200) DEFAULT NULL,
  `ST_Address` varchar(300) DEFAULT NULL,
  `ST_DOB` date DEFAULT NULL,
  `ST_Gender` varchar(10) DEFAULT NULL,
  `ST_Tel` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stud`
--

INSERT INTO `stud` (`STID`, `ST_Name`, `ST_Address`, `ST_DOB`, `ST_Gender`, `ST_Tel`) VALUES
(1, 'Udara Neminda Chandrawansa', 'Pallewela', '2002-08-29', 'Male', 715508450),
(2, 'Deshan Shavinda', 'Gampaha', '2002-06-18', 'Male', 777766807),
(3, 'Gayathri Dayas Perera', 'Mirigama', '2002-05-29', 'Female', 777706650),
(4, 'Kasun Jayamaha', 'Colombo', '2002-05-29', 'Male', 773370090),
(5, 'Jayanthi Perera', 'Galle', '2002-03-24', 'Female', 776654401),
(6, 'Niamasha Jayasinghe', 'Hambantota', '2003-03-12', 'Female', 119286678),
(7, 'Kasun Tharanga', 'Trincomale', '2001-05-20', 'Male', 778299277),
(8, 'Gayani Jayawardana', 'Katugastota', '2002-08-25', 'Female', 778886268),
(9, 'Kasuni', 'Katugastota', '2004-06-13', 'Female', 774486268),
(10, 'Test', 'palala', '2002-08-20', 'Male', 775508450),
(11, 'Kasun', 'papapap', '2002-08-29', 'Female', 9999);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `stud`
--
ALTER TABLE `stud`
  ADD PRIMARY KEY (`STID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
