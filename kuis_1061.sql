-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 13, 2017 at 04:47 PM
-- Server version: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis_1061`
--

-- --------------------------------------------------------

--
-- Table structure for table `identitas_1061`
--

CREATE TABLE `identitas_1061` (
  `id` bigint(20) NOT NULL,
  `jenis_kelamin` varchar(100) DEFAULT NULL,
  `nama` varchar(100) NOT NULL,
  `prodi` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `identitas_1061`
--

INSERT INTO `identitas_1061` (`id`, `jenis_kelamin`, `nama`, `prodi`) VALUES
(1, 'laki-laki', 'prayogi', 'MSN'),
(3, 'laki-laki', 'osman', 'TI');

-- --------------------------------------------------------

--
-- Table structure for table `ipk_1061`
--

CREATE TABLE `ipk_1061` (
  `id` bigint(20) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `nilai` varchar(100) DEFAULT NULL,
  `prodi` varchar(100) DEFAULT NULL,
  `identitas_1061_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ipk_1061`
--

INSERT INTO `ipk_1061` (`id`, `nama`, `nilai`, `prodi`, `identitas_1061_id`) VALUES
(2, 'prayogi', '3.15', 'TI', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1061`
--
ALTER TABLE `identitas_1061`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_n990834olkhmxqu63688euuqe` (`nama`);

--
-- Indexes for table `ipk_1061`
--
ALTER TABLE `ipk_1061`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_iyvftjqiwocbcfhmsgyy141pd` (`nama`),
  ADD KEY `FKgjichweuffmc5cof1a0wf4qhl` (`identitas_1061_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1061`
--
ALTER TABLE `identitas_1061`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `ipk_1061`
--
ALTER TABLE `ipk_1061`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `ipk_1061`
--
ALTER TABLE `ipk_1061`
  ADD CONSTRAINT `FKgjichweuffmc5cof1a0wf4qhl` FOREIGN KEY (`identitas_1061_id`) REFERENCES `identitas_1061` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
