-- MySQL dump 10.13  Distrib 5.5.31, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: syn_login0
-- ------------------------------------------------------
-- Server version	5.5.31-0ubuntu0.12.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `accounts` (
  `ID` int(11) NOT NULL DEFAULT '1',
  `username` varchar(255) NOT NULL DEFAULT '',
  `password` varchar(255) NOT NULL DEFAULT '',
  `pseudo` varchar(200) NOT NULL DEFAULT '',
  `secretquestion` varchar(200) NOT NULL DEFAULT '',
  `secretanswer` varchar(200) NOT NULL DEFAULT '',
  `gmlvl` tinyint(5) NOT NULL DEFAULT '0',
  `community` tinyint(11) NOT NULL DEFAULT '0',
  `curIP` char(15) NOT NULL,
  `isBanned` bit(1) NOT NULL DEFAULT b'0',
  `premiumTime` bigint(11) NOT NULL DEFAULT '0',
  `giftID` int(11) NOT NULL DEFAULT '0',
  `persos` varchar(255) NOT NULL DEFAULT '',
  `banks` varchar(255) NOT NULL DEFAULT '',
  `friends` varchar(255) NOT NULL DEFAULT '',
  `ennemies` varchar(255) NOT NULL DEFAULT '',
  `ignored` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`ID`,`username`,`pseudo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` VALUES (1,'robynz','z','Crystal','q','q',10,0,'127.0.0.1','\0',12343245345876,1,'32,1;37,1;39,1;40,1','','0','0','0'),(2,'robynzz','z','Crystall','q','q',10,0,'127.0.0.1','\0',12334324345876,0,'5,1;41,1;42,1','','0','0','0'),(3,'robynzzz','z','Crystalll','q','q',10,0,'127.0.0.1','\0',23343245345876,0,'36,1','3,','0','0','0'),(4,'test','test','Testeur','q','q',0,0,'127.0.0.1','\0',12343245345876,0,'43,1','','','',''),(5,'1','1','Test1','q','q',10,0,'127.0.0.1','\0',12343245345876,0,'','','','','');
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `game_servers`
--

DROP TABLE IF EXISTS `game_servers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `game_servers` (
  `worldID` smallint(11) NOT NULL DEFAULT '1' COMMENT 'ID du world',
  `worldName` varchar(20) NOT NULL DEFAULT 'NomduGameServer' COMMENT 'Nom du GameServer',
  `ip` varchar(20) NOT NULL DEFAULT '127.0.0.1',
  `port` smallint(11) NOT NULL DEFAULT '5555',
  `enableOnLoad` enum('false','true') NOT NULL DEFAULT 'true',
  `dbName` varchar(20) NOT NULL DEFAULT '' COMMENT 'Nom de la base de donnée de ce serveur.',
  `dbUser` varchar(20) NOT NULL DEFAULT 'root' COMMENT 'Nom de Compte pour accéder à la base de donnée de ce serveur.',
  `dbPass` varchar(20) NOT NULL DEFAULT '' COMMENT 'Mot de passe du compte pour accéder à la base de donnée de ce serveur.',
  `dbIP` varchar(20) NOT NULL DEFAULT '127.0.0.1',
  `worldCommunity` tinyint(11) NOT NULL DEFAULT '0' COMMENT 'ID de communité (Francophone, Allemande, Internationnale, etc.)',
  `worldType` tinyint(11) NOT NULL DEFAULT '0' COMMENT 'Type de serveur',
  `worldLang` char(2) NOT NULL DEFAULT 'fr' COMMENT 'Langue parlée par le serveur',
  PRIMARY KEY (`worldID`,`worldName`,`port`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game_servers`
--

LOCK TABLES `game_servers` WRITE;
/*!40000 ALTER TABLE `game_servers` DISABLE KEYS */;
INSERT INTO `game_servers` VALUES (1,'Jiva','127.0.0.1',5555,'true','syn_world0','root','','127.0.0.1',0,0,'fr');
/*!40000 ALTER TABLE `game_servers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gifts`
--

DROP TABLE IF EXISTS `gifts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gifts` (
  `ID` int(11) NOT NULL DEFAULT '1',
  `type` int(11) NOT NULL,
  `title` varchar(255) DEFAULT '',
  `desc` varchar(255) DEFAULT '',
  `gfxURL` varchar(255) DEFAULT NULL,
  `items` varchar(255) DEFAULT '',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gifts`
--

LOCK TABLES `gifts` WRITE;
/*!40000 ALTER TABLE `gifts` DISABLE KEYS */;
INSERT INTO `gifts` VALUES (1,2,'HelloTitle','ByeDesc','5','1182,230;1183,1;8990,2');
/*!40000 ALTER TABLE `gifts` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-07-19 22:56:39
