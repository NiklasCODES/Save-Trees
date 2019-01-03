-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 02. Jan 2019 um 11:56
-- Server-Version: 10.1.34-MariaDB
-- PHP-Version: 7.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `test`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `trees`
--

CREATE TABLE `trees` (
  `id` int(11) NOT NULL,
  `treename` varchar(100) NOT NULL,
  `treekind` varchar(100) NOT NULL,
  `treeseed` varchar(100) NOT NULL,
  `oxy_perhour` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `trees`
--

INSERT INTO `trees` (`id`, `treename`, `treekind`, `treeseed`, `oxy_perhour`) VALUES
(1, 'Eiche', 'Buchenartige', 'Eicheln', 370),
(2, 'Buche', 'Buchenartige', 'Buchecken', 0),
(3, 'Fichte', 'Kieferngewaechse', 'Fichtenzapfen', 875),
(4, 'Ahorn', 'Seifenbaumgewaechse', 'Samenfluegel', 0),
(5, 'Tanne', 'Kieferngewaechse', 'Tannenzapfen', 0);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `trees`
--
ALTER TABLE `trees`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `trees`
--
ALTER TABLE `trees`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
