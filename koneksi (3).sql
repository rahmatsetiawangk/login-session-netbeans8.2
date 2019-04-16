-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 15, 2019 at 03:48 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `koneksi`
--

-- --------------------------------------------------------

--
-- Table structure for table `mhs`
--

CREATE TABLE `mhs` (
  `nim` varchar(12) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL,
  `telp` varchar(20) DEFAULT NULL,
  `tgl_lahir` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(50) NOT NULL,
  `prodi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mhs`
--

INSERT INTO `mhs` (`nim`, `nama`, `alamat`, `telp`, `tgl_lahir`, `jenis_kelamin`, `prodi`) VALUES
('20190203', 'Rahmat Setiawan', 'gunungkidul', '087839300114', '2019-04-11', 'laki-laki', 'Pend. B. Inggris'),
('20190208', 'Rahmat Setiawan baru', 'gunungkidul', '087839300114', '2019-04-11', 'laki-laki', 'Pend. B. Inggris'),
('sdf', 'asdf baru', 'asd', '234', '2019-03-06', 'perempuan', 'Pend. B. Indonesia'),
('zx', 'asd baru 1', 'asd', '234', '2019-03-15', 'laki-laki', 'Teknik Informatika');

-- --------------------------------------------------------

--
-- Table structure for table `prodi`
--

CREATE TABLE `prodi` (
  `kode_prodi` int(50) NOT NULL,
  `p_studi_prodi` varchar(50) NOT NULL,
  `status_prodi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `prodi`
--

INSERT INTO `prodi` (`kode_prodi`, `p_studi_prodi`, `status_prodi`) VALUES
(10, 'Matematika 1', 'Aktif'),
(11, 'Matematika', 'Aktif'),
(12, 'Matematika 3', 'Aktif'),
(13, 'Akuntansi', 'Aktif');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(9) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `nama_lengkap` varchar(120) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `level_pengguna` varchar(50) DEFAULT NULL,
  `status_pengguna` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `nama_lengkap`, `email`, `level_pengguna`, `status_pengguna`) VALUES
(1, 'admin', 'admin', 'Rahmat Setiawan', 'admin@admin.com', 'Admin', 'Aktif'),
(2, 'rahmat', '16111100094', 'Rahmat Setiawan imut', 'admin@admin.com', 'Admin', 'Aktif');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mhs`
--
ALTER TABLE `mhs`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `prodi`
--
ALTER TABLE `prodi`
  ADD PRIMARY KEY (`kode_prodi`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `prodi`
--
ALTER TABLE `prodi`
  MODIFY `kode_prodi` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
