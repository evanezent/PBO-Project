-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 06, 2018 at 10:44 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `OOP`
--

-- --------------------------------------------------------

--
-- Table structure for table `Kandidat`
--

CREATE TABLE `Kandidat` (
  `Ketua` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Wakil` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `no_Urut` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `jumlahSuara` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Kandidat`
--

INSERT INTO `Kandidat` (`Ketua`, `Wakil`, `no_Urut`, `jumlahSuara`) VALUES
('Jokowi', 'Maruf', '1', 4),
('Prabowo', 'Sandy', '2', 1);

-- --------------------------------------------------------

--
-- Table structure for table `Panitia`
--

CREATE TABLE `Panitia` (
  `Nama Panitia` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Password` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Panitia`
--

INSERT INTO `Panitia` (`Nama Panitia`, `Username`, `Password`) VALUES
('b', 'b', 'b'),
('c', 'c', 'c'),
('f', 'f', 'f'),
('r', 'r', 'r'),
('X', 'X', 'X');

-- --------------------------------------------------------

--
-- Table structure for table `Pemilih`
--

CREATE TABLE `Pemilih` (
  `Nama Pemilih` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `No_KTP` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `tgl_lahir` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `alamat` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Pemilih`
--

INSERT INTO `Pemilih` (`Nama Pemilih`, `No_KTP`, `tgl_lahir`, `alamat`, `status`) VALUES
('yusuf', '69', '1 januari 1999', 'njapol', 1),
('tama', '777', '16 desember 99', 'pilangsari', 1),
('a', 'a', 'a', 'a', 1),
('b', 'b', 'b', 'b', 1),
('q', 'q', 'q', 'q', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Kandidat`
--
ALTER TABLE `Kandidat`
  ADD PRIMARY KEY (`no_Urut`);

--
-- Indexes for table `Panitia`
--
ALTER TABLE `Panitia`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `Pemilih`
--
ALTER TABLE `Pemilih`
  ADD PRIMARY KEY (`No_KTP`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
