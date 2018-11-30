-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 30, 2018 at 07:16 PM
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

-- --------------------------------------------------------

--
-- Table structure for table `Panitia`
--

CREATE TABLE `Panitia` (
  `Nama Panitia` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Password` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Pemilih`
--

CREATE TABLE `Pemilih` (
  `Nama Pemilih` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `No_KTP` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `tgl_lahir` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `alamat` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
