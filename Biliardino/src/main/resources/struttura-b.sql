-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: sbiliardino
-- ------------------------------------------------------
-- Server version	5.7.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `giocatore`
--

DROP TABLE IF EXISTS `giocatore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `giocatore` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) NOT NULL DEFAULT '"',
  `Cognome` varchar(45) NOT NULL DEFAULT '"',
  `Vittorie` varchar(45) NOT NULL DEFAULT '0',
  `Sconfitte` varchar(45) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `partite`
--

DROP TABLE IF EXISTS `partite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `partite` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `IdSquadra1` int(11) NOT NULL DEFAULT '0',
  `IdSquadra2` int(11) NOT NULL DEFAULT '0',
  `golSquadra1` int(11) NOT NULL DEFAULT '0',
  `golSquadra2` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `idSquadra1_idx` (`IdSquadra1`),
  KEY `idSquadra2_idx` (`IdSquadra2`),
  CONSTRAINT `idSquadra1` FOREIGN KEY (`IdSquadra1`) REFERENCES `squadra` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idSquadra2` FOREIGN KEY (`IdSquadra2`) REFERENCES `squadra` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `squadra`
--

DROP TABLE IF EXISTS `squadra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `squadra` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `IdGiocatore1` int(11) NOT NULL DEFAULT '0',
  `IdGiocatore2` int(11) NOT NULL DEFAULT '0',
  `Vittorie` int(11) NOT NULL DEFAULT '0',
  `Sconfitte` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `IdGiocatore1_idx` (`IdGiocatore1`),
  KEY `IdGiocatore2_idx` (`IdGiocatore2`),
  CONSTRAINT `IdGiocatore1` FOREIGN KEY (`IdGiocatore1`) REFERENCES `giocatore` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `IdGiocatore2` FOREIGN KEY (`IdGiocatore2`) REFERENCES `giocatore` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-11 12:19:36
