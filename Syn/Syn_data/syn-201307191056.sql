-- MySQL dump 10.13  Distrib 5.5.31, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: syn
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
-- Table structure for table `login_servers`
--

DROP TABLE IF EXISTS `login_servers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login_servers` (
  `loginID` tinyint(11) NOT NULL DEFAULT '1' COMMENT 'ID du login',
  `port` smallint(11) NOT NULL DEFAULT '668',
  `enableOnLoad` enum('false','true') NOT NULL DEFAULT 'true',
  `dbName` varchar(20) NOT NULL DEFAULT 'my_login_db' COMMENT 'Nom de la base de donnée de ce serveur.',
  `dbUser` varchar(20) NOT NULL DEFAULT 'user_name' COMMENT 'Nom de Compte pour accéder à la base de donnée de ce serveur.',
  `dbPass` varchar(20) NOT NULL DEFAULT 'user_pass' COMMENT 'Mot de passe du compte pour accéder à la base de donnée de ce serveur.',
  `dbIP` varchar(20) NOT NULL DEFAULT '127.0.0.1',
  `ownerUsers` varchar(20) NOT NULL DEFAULT '1',
  PRIMARY KEY (`loginID`,`port`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_servers`
--

LOCK TABLES `login_servers` WRITE;
/*!40000 ALTER TABLE `login_servers` DISABLE KEYS */;
INSERT INTO `login_servers` VALUES (1,1112,'true','syn_login0','root','','127.0.0.1','1,2');
/*!40000 ALTER TABLE `login_servers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `macros`
--

DROP TABLE IF EXISTS `macros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `macros` (
  `name` varchar(15) NOT NULL DEFAULT 'EpicMacro' COMMENT 'Nom du macro utilisé communément dans les affichages, commandes, etc.',
  `fileName` varchar(15) NOT NULL DEFAULT 'MonMacro.macro' COMMENT 'Nom du fichier du macro suivit de son extension (Ex: grozilla.macro)',
  `url` varchar(200) NOT NULL DEFAULT 'http://www.google.com' COMMENT 'IP ou lien vers le dossier contenant le macro (Ex: http://google.com/) Obligé d''avoir le "http://" si tu veux charger le macro à partir d''un url externe.',
  `version` varchar(10) NOT NULL,
  `description` text NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `macros`
--

LOCK TABLES `macros` WRITE;
/*!40000 ALTER TABLE `macros` DISABLE KEYS */;
/*!40000 ALTER TABLE `macros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plugins`
--

DROP TABLE IF EXISTS `plugins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plugins` (
  `name` varchar(15) NOT NULL DEFAULT 'MonPlugin.jar' COMMENT 'Nom d''identification du plugin. Utilisé en jeu dans l''affichage, le rechargement, etc.',
  `url` varchar(200) NOT NULL DEFAULT 'Syn_plugins/' COMMENT 'IP ou lien vers le dossier contenant le plugin (Ex: http://www.google.com/ ou Syn_plugins/)',
  `fileName` varchar(20) NOT NULL DEFAULT 'MonPlugin.jar' COMMENT 'Nom du fichier plugin suivit de son extension (Ex: grozilla.jar)',
  `main` varchar(30) NOT NULL DEFAULT 'MonPackage.Main.java' COMMENT 'Classe principale du plugin, celle qui implémente Plugin.java',
  `enableOnLoad` enum('false','true') NOT NULL DEFAULT 'true',
  `version` varchar(10) NOT NULL,
  `description` text NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plugins`
--

LOCK TABLES `plugins` WRITE;
/*!40000 ALTER TABLE `plugins` DISABLE KEYS */;
INSERT INTO `plugins` VALUES ('Actions','Syn_plugins/','ActionsPlugin.jar','pack.ActionsMain','true','0.0.1','Plugin d\'actions'),('AspectJ','Syn_plugins/','AspectJPlugin.jar','pack.AspectMain','true','0.0.1','Plugin de programmation orientée aspect.'),('Chat','Syn_plugins/','ChatPlugin.jar','pack.Chat','true','0.0.1','Plugin de chat'),('Console','Syn_plugins/','ConsolePlugin.jar','pack.Console','true','0.0.1','Plugin de console (ig)'),('Effects','Syn_plugins/','EffectsPlugin.jar','pack.EffectsMain','true','0.0.1','Plugin d\'effets'),('Formuling','Syn_plugins/','FormulingPlugin.jar','pack.FormulingMain','true','0.0.1','Plugin de formules de calcul, pathfinding, etc.'),('Parsers','Syn_plugins/','ParsingPlugin.jar','pack.ParsingMain','true','0.0.1','Plugin de parsing de packets'),('Systems','Syn_plugins/','SystemsPlugin.jar','pack.SystemsMain','true','0.0.1','Plugin de divers systemes comme les FightChannels');
/*!40000 ALTER TABLE `plugins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scripts`
--

DROP TABLE IF EXISTS `scripts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `scripts` (
  `name` varchar(15) NOT NULL DEFAULT 'EpicScript' COMMENT 'Nom du script utilisé communément dans les affichages, commandes, etc.',
  `fileName` varchar(15) NOT NULL DEFAULT 'MonScript.js' COMMENT 'Nom du fichier du script suivit de son extension (Ex: grozilla.js)',
  `url` varchar(200) NOT NULL DEFAULT 'http://www.google.com' COMMENT 'IP ou lien vers le dossier contenant le script (Ex: http://google.com/) Obligé d''avoir le "http://" si tu veux charger le script à partir d''un url externe.',
  `mainFunction` varchar(20) NOT NULL DEFAULT 'exe' COMMENT 'Function à appeler lorsque le script est évalué.',
  `mainArguments` text NOT NULL COMMENT 'Arguments possibles de passer à la mainFunction quand on évalue le script.',
  `precompile` enum('true','false') NOT NULL DEFAULT 'true',
  `executeOnLoad` enum('false','true') NOT NULL DEFAULT 'false' COMMENT 'Si on lance le script au lancement du serveur.',
  `timeUnit` enum('SECONDS','DAYS','MINUTES','MILLISECONDS','HOURS') NOT NULL DEFAULT 'SECONDS' COMMENT 'En quel TimeUnit sont les temps. SECONDS, DAYS, MINUTES, etc..',
  `intervalSchedule` bigint(11) NOT NULL DEFAULT '0' COMMENT 'Si > 0, lance le script dans une Schedule avec cet intervalle. Inutile sinon car la Schedule ne se fait que si le script est exécuté au chargement.',
  `initialScheduleDelay` bigint(11) NOT NULL DEFAULT '0' COMMENT 'Set le temps d''attente initial de la schedule avant la première exécution du script.',
  `version` varchar(10) NOT NULL,
  `description` text NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scripts`
--

LOCK TABLES `scripts` WRITE;
/*!40000 ALTER TABLE `scripts` DISABLE KEYS */;
INSERT INTO `scripts` VALUES ('Pubs','pub.js','Syn_scripts/','exe','Le développeur Crystal est fier de vous accueillir sur un serveur Syn.|FF0000','false','true','MINUTES',3,1,'0.0.1','Script qui envoie des msg de ');
/*!40000 ALTER TABLE `scripts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tool_servers`
--

DROP TABLE IF EXISTS `tool_servers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tool_servers` (
  `ID` smallint(11) unsigned NOT NULL AUTO_INCREMENT,
  `port` smallint(11) unsigned NOT NULL DEFAULT '8000',
  `enableOnLoad` enum('false','true') NOT NULL DEFAULT 'true',
  PRIMARY KEY (`ID`,`port`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tool_servers`
--

LOCK TABLES `tool_servers` WRITE;
/*!40000 ALTER TABLE `tool_servers` DISABLE KEYS */;
INSERT INTO `tool_servers` VALUES (1,8000,'true');
/*!40000 ALTER TABLE `tool_servers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `ID` smallint(11) NOT NULL DEFAULT '1',
  `username` varchar(30) NOT NULL DEFAULT 'user',
  `password` varchar(30) NOT NULL DEFAULT 'pass',
  `IP` varchar(30) NOT NULL DEFAULT '%',
  `secretQuestion` varchar(30) NOT NULL DEFAULT 'question',
  `secretAnswer` varchar(30) NOT NULL DEFAULT 'answer',
  `ownedLoginServersIDs` varchar(30) NOT NULL DEFAULT '%',
  PRIMARY KEY (`ID`,`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'r','ahellofaworld','127.0.0.1','q?','q','1'),(2,'keldy','enormorusrex','%','q?','q','1');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-07-19 22:56:18
