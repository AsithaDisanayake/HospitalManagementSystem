-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 27, 2017 at 06:57 AM
-- Server version: 5.7.17-log
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `php_proj`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `nic` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `telephone` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `addressOne` varchar(45) NOT NULL,
  `addressTwo` varchar(45) NOT NULL,
  `addressThree` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`nic`, `name`, `telephone`, `mobile`, `email`, `addressOne`, `addressTwo`, `addressThree`, `password`) VALUES
('1234567891', 'asd', '', '1234567891', 'skr@gmail.com', '', '', '', '7c4a8d09ca3762af61e59520943dc26494f8941b'),
('1234567491', 'asdas', '', '1234567891', 'asd@gmail.com', '', '', '', '7c4a8d09ca3762af61e59520943dc26494f8941b'),
('932721392V', 'supun rajasinghe', '0572231154', '0717328070', 'supunrajasinghe@gmail.com', 'hospital road', 'wewathenna', 'bandarwela', 'f7c3bc1d808e04732adf679965ccc34ca7ae3441');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
