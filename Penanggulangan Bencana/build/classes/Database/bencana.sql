-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2019 at 11:33 AM
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
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(10) NOT NULL,
  `username` varchar(10) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `username`, `nama`, `email`, `password`) VALUES
(2, '5', '5', '5', '5');

-- --------------------------------------------------------

--
-- Table structure for table `bantuan`
--

CREATE TABLE `bantuan` (
  `id_bantuan` int(10) NOT NULL,
  `jenis_bantuan` varchar(100) NOT NULL,
  `tanggal_pengiriman` varchar(100) NOT NULL,
  `keterangan_bantuan` varchar(100) NOT NULL,
  `nama_pengirim` varchar(100) NOT NULL,
  `lokasi_pengirim` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bantuan`
--

INSERT INTO `bantuan` (`id_bantuan`, `jenis_bantuan`, `tanggal_pengiriman`, `keterangan_bantuan`, `nama_pengirim`, `lokasi_pengirim`) VALUES
(6, '2', '2', '2	', '2', '2'),
(7, 'Jenis Bantuan', 'Tanggal Pengiriman', 'TAMBAHKAN KETERANGAN DISINI.....', 'Nama Pengirim', 'Lokasi Pengirim'),
(8, '34', '34', '34', '34', '34'),
(9, 'Jenis Bantuan', 'Tanggal Pengiriman', 'TAMBAHKAN KETERANGAN DISINI.....', 'Nama Pengirim', 'Lokasi Pengirim'),
(10, 'uang', '29nov2019', 'saya mengirimkan uang 200 juta\n', 'anjasmara', 'bandung'),
(11, 'uang', '29 november 2019', 'saya mengirimakn uang tolong di cek', 'anjasamara', 'bandung');

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
(13, '12', '00:00:12', 'Apayaaa', '12', '12');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(100) NOT NULL,
  `no_telp` varchar(50) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(10) NOT NULL,
  `id_user` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `no_telp`, `nama`, `email`, `password`, `id_user`) VALUES
('1', '1', '1', '1', '1', 2),
('123', '1234', 'asd', 'dsa', '123', 3),
('daniel98', '081234571234', 'daniel', 'daniel98@gmail.com', '1234', 4),
('daniel31', '082295356465', 'Daniel Pitters Smith', 'smithpeter938@gmail.com', 'daniel31', 5),
('anjasrama21', '08210823109283', 'anjasmara', 'anjasmara5492@gmail.com', '12345678', 6),
('5', '5', '5', '5', '5', 7);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `bantuan`
--
ALTER TABLE `bantuan`
  ADD PRIMARY KEY (`id_bantuan`);

--
-- Indexes for table `peristiwa`
--
ALTER TABLE `peristiwa`
  ADD PRIMARY KEY (`id_peristiwa`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `bantuan`
--
ALTER TABLE `bantuan`
  MODIFY `id_bantuan` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `peristiwa`
--
ALTER TABLE `peristiwa`
  MODIFY `id_peristiwa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
