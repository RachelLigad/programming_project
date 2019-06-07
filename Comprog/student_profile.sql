-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 07, 2019 at 07:17 PM
-- Server version: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_profile`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`, `firstname`, `lastname`) VALUES
(10, 'cherry', 'tulang', 'Cherry May', 'Tulag'),
(3, 'rachel', 'ligad', 'Rachel Ann', 'Ligad'),
(9, 'reymar', 'sum', 'Reymar', 'Sumangue'),
(11, 'Ron', 'mor', 'Roniel', 'Moreno');

-- --------------------------------------------------------

--
-- Table structure for table `student_info`
--

DROP TABLE IF EXISTS `student_info`;
CREATE TABLE IF NOT EXISTS `student_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_number` varchar(15) NOT NULL,
  `student` varchar(50) NOT NULL,
  `course` varchar(50) NOT NULL,
  `date` varchar(15) NOT NULL,
  `time_in` varchar(15) NOT NULL,
  `time_out` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=58 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_info`
--

INSERT INTO `student_info` (`id`, `id_number`, `student`, `course`, `date`, `time_in`, `time_out`) VALUES
(57, '2018-112', 'Pete Christian Reyes', 'BSN', '05-31-2019', '2:13PM', '5:00 PM'),
(55, '2019-0080', 'Cherry May Tulang', 'BSIT', '05-31-2019', '1:41 pm', '5:13 pm'),
(54, '2018-1942', 'Rachel Ann Ligad', 'BSIT', '05-31-2019', '8:32 am', '10:00 am'),
(44, '2018-0080', 'Cherry May Tulang', 'BSIT', '05-29-2019', '11:56 am', '12:00 pm'),
(41, '2018-1942', 'Rachel Ann Ligad', 'BSIT', '05-29-2019', '9:51AM', '10:00 AM'),
(53, '2018-1942', 'Rachel Ann Ligad', 'BSIT', '05-30-2019', '8:40 AM', '5:25 PM');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
