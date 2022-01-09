-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 09 Jan 2022 pada 13.41
-- Versi Server: 5.5.32
-- Versi PHP: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Basis data: `dbpenyewaan`
--
CREATE DATABASE IF NOT EXISTS `dbpenyewaan` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `dbpenyewaan`;

-- --------------------------------------------------------

--
-- Struktur dari tabel `kerusakan`
--

CREATE TABLE IF NOT EXISTS `kerusakan` (
  `Kerusakan` varchar(100) NOT NULL,
  `Nama_Pc` varchar(20) NOT NULL,
  `Tanggal` varchar(20) NOT NULL,
  PRIMARY KEY (`Kerusakan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kerusakan`
--

INSERT INTO `kerusakan` (`Kerusakan`, `Nama_Pc`, `Tanggal`) VALUES
('MATI', 'PC 4', '2022-01-08'),
('MATI TOTAL', 'PC2', '2022-01-04');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE IF NOT EXISTS `pelanggan` (
  `Nama` varchar(20) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `No_Telp` int(20) NOT NULL,
  `Tanggal` varchar(20) NOT NULL,
  `Status` varchar(20) NOT NULL,
  PRIMARY KEY (`Nama`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`Nama`, `Alamat`, `No_Telp`, `Tanggal`, `Status`) VALUES
('dahli', 'jl.kayu', 823456, '200-01-06', 'Pilih'),
('MARUF', 'JL.ISKANDAR', 836374874, '2022-01-08', 'Lunas'),
('riyan', 'jl.kayu', 823456, '2022-01-05', 'Belum Lunas'),
('SALFAN ', 'JL.ISKANDAR', 853637273, '2022-01-08', 'Pilih');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `Nama_Pc` varchar(20) NOT NULL,
  `Bayar` varchar(20) NOT NULL,
  `Waktu` varchar(20) NOT NULL,
  `Tanggal` varchar(20) NOT NULL,
  PRIMARY KEY (`Nama_Pc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`Nama_Pc`, `Bayar`, `Waktu`, `Tanggal`) VALUES
('PC 1', '3000', '1 jam', '2022-01-05'),
('PC 2', '6000', '2 JAM', '2022-01-04');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
