-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 14, 2024 at 09:52 AM
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
-- Database: `anto`
--

-- --------------------------------------------------------

--
-- Table structure for table `alien`
--

CREATE TABLE `alien` (
  `aid` int(11) NOT NULL,
  `aname` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `alien`
--

INSERT INTO `alien` (`aid`, `aname`) VALUES
(101, 'Navin'),
(102, 'Rose'),
(103, 'Kiran'),
(104, 'Clorinde'),
(105, 'chiori'),
(106, 'Kaveh'),
(107, 'Abi'),
(108, 'Navin'),
(109, 'Kumar'),
(110, 'Cici'),
(111, 'Amon'),
(112, 'Chip');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alien`
--
ALTER TABLE `alien`
  ADD PRIMARY KEY (`aid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alien`
--
ALTER TABLE `alien`
  MODIFY `aid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=113;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
