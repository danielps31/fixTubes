-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2019 at 07:27 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.1.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bencana`
--

-- --------------------------------------------------------

--
-- Table structure for table `peristiwa`
--

CREATE TABLE `peristiwa` (
  `id_peristiwa` int(11) NOT NULL,
  `jenis_bencana` varchar(100) NOT NULL,
  `jam` time NOT NULL,
  `lokasi_bencana` varchar(100) NOT NULL,
  `keterangan_bencana` varchar(100) NOT NULL,
  `status_peristiwa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peristiwa`
--

INSERT INTO `peristiwa` (`id_peristiwa`, `jenis_bencana`, `jam`, `lokasi_bencana`, `keterangan_bencana`, `status_peristiwa`) VALUES
(11, '1', '00:00:01', '1', '1', ''),
(12, '2', '00:00:02', '2', '2', ''),
(13, '12', '00:00:12', '12', '12', '12'),
(14, 'assds2', '00:00:02', 'asd2', 'dsass', 'dsass');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `peristiwa`
--
ALTER TABLE `peristiwa`
  ADD PRIMARY KEY (`id_peristiwa`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `peristiwa`
--
ALTER TABLE `peristiwa`
  MODIFY `id_peristiwa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
