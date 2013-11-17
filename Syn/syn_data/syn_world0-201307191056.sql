-- MySQL dump 10.13  Distrib 5.5.31, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: syn_world0
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
-- Table structure for table `actions_listeners_maps`
--

DROP TABLE IF EXISTS `actions_listeners_maps`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `actions_listeners_maps` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `mapID` int(11) NOT NULL DEFAULT '0',
  `type` varchar(20) NOT NULL DEFAULT '1',
  `actions` text NOT NULL,
  `conditions` text NOT NULL,
  `actionsListeners` text NOT NULL COMMENT 'Les actionsListeners qu''il faut ajouter à celui-ci (Donc celui-ci sera le container des autres)',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actions_listeners_maps`
--

LOCK TABLES `actions_listeners_maps` WRITE;
/*!40000 ALTER TABLE `actions_listeners_maps` DISABLE KEYS */;
INSERT INTO `actions_listeners_maps` VALUES (1,1155,'ON_CELL_ARRIVE','E:339#0#0#%mapID=1155%%cellID=190%#0','OY=214&MY=1155','');
/*!40000 ALTER TABLE `actions_listeners_maps` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `actions_listeners_npcs`
--

DROP TABLE IF EXISTS `actions_listeners_npcs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `actions_listeners_npcs` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `npcID` int(11) NOT NULL DEFAULT '0',
  `type` varchar(20) NOT NULL DEFAULT '1',
  `actions` text NOT NULL,
  `conditions` text NOT NULL,
  `actionsListeners` text NOT NULL COMMENT 'Les actionsListeners qu''il faut ajouter à celui-ci (Donc celui-ci sera le container des autres)',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actions_listeners_npcs`
--

LOCK TABLES `actions_listeners_npcs` WRITE;
/*!40000 ALTER TABLE `actions_listeners_npcs` DISABLE KEYS */;
INSERT INTO `actions_listeners_npcs` VALUES (1,0,'ON_CELL_ARRIVE','E:3ea#0#0#Bonjour, ici mon message de fou sur la cell 250 ;)@FF0000#0','OY=250','2,3'),(2,0,'ON_MAP_ARRIVE','E:3ea#0#0#Bonjour, ici mon message de fou sur la map 7412 ;)@FF0000#0','MY=7412',''),(3,0,'ON_AREA_ARRIVE','E:3ea#0#0#Bonjour, ici mon message de fou sur l\'area 18 ;)@FF0000#0','AY=18',''),(4,0,'ON_ITEM_USE','E:3ea#0#0#Bonjour, ici mon message de fou sur l\'item utilisé 7618 ;)@FF0000#0|A:1002;%iobject%','IU=7618','');
/*!40000 ALTER TABLE `actions_listeners_npcs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `actions_listeners_world`
--

DROP TABLE IF EXISTS `actions_listeners_world`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `actions_listeners_world` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL DEFAULT '1',
  `actions` text NOT NULL,
  `conditions` text NOT NULL,
  `actionsListeners` text NOT NULL COMMENT 'Les actionsListeners qu''il faut ajouter à celui-ci (Donc celui-ci sera le container des autres)',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actions_listeners_world`
--

LOCK TABLES `actions_listeners_world` WRITE;
/*!40000 ALTER TABLE `actions_listeners_world` DISABLE KEYS */;
INSERT INTO `actions_listeners_world` VALUES (1,'ON_CELL_ARRIVE','E:3ea#0#0#Bonjour, ici mon message de fou sur la cell 250 ;)@FF0000#0','OY=250','2,3'),(2,'ON_MAP_ARRIVE','E:3ea#0#0#Bonjour, ici mon message de fou sur la map 7412 ;)@FF0000#0','MY=7412',''),(3,'ON_AREA_ARRIVE','E:3ea#0#0#Bonjour, ici mon message de fou sur l\'area 18 ;)@FF0000#0','AY=18',''),(4,'ON_ITEM_USE','E:3ea#0#0#Bonjour, ici mon message de fou sur l\'item utilisé 7618 ;)@FF0000#0|A:1002;%iobject%','IU=7618','');
/*!40000 ALTER TABLE `actions_listeners_world` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `areas`
--

DROP TABLE IF EXISTS `areas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `areas` (
  `ID` smallint(11) NOT NULL DEFAULT '1',
  `name` varchar(20) NOT NULL DEFAULT 'MonArea',
  `superAreaID` char(2) NOT NULL DEFAULT '',
  `subareas` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`ID`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `areas`
--

LOCK TABLES `areas` WRITE;
/*!40000 ALTER TABLE `areas` DISABLE KEYS */;
/*!40000 ALTER TABLE `areas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `areas_sub`
--

DROP TABLE IF EXISTS `areas_sub`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `areas_sub` (
  `ID` smallint(11) NOT NULL DEFAULT '0',
  `name` varchar(20) NOT NULL DEFAULT 'MaSubArea',
  `areaID` smallint(11) NOT NULL,
  `possiblesMobs` text NOT NULL COMMENT '((mobID*10)+grade) , spawnprobabilité (double de 0 à 1)',
  `maxNumberOfGroups` smallint(11) NOT NULL DEFAULT '4',
  `maxMonsterGroupSize` smallint(11) NOT NULL DEFAULT '8',
  PRIMARY KEY (`ID`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `areas_sub`
--

LOCK TABLES `areas_sub` WRITE;
/*!40000 ALTER TABLE `areas_sub` DISABLE KEYS */;
/*!40000 ALTER TABLE `areas_sub` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `areas_super`
--

DROP TABLE IF EXISTS `areas_super`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `areas_super` (
  `ID` tinyint(11) NOT NULL DEFAULT '0',
  `name` varchar(20) NOT NULL DEFAULT 'MaSuperArea',
  `areas` varchar(10) NOT NULL DEFAULT '',
  PRIMARY KEY (`ID`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `areas_super`
--

LOCK TABLES `areas_super` WRITE;
/*!40000 ALTER TABLE `areas_super` DISABLE KEYS */;
/*!40000 ALTER TABLE `areas_super` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `artificial_intelligence_config`
--

DROP TABLE IF EXISTS `artificial_intelligence_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `artificial_intelligence_config` (
  `ID` smallint(6) NOT NULL,
  `name` varchar(40) NOT NULL,
  `actions` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artificial_intelligence_config`
--

LOCK TABLES `artificial_intelligence_config` WRITE;
/*!40000 ALTER TABLE `artificial_intelligence_config` DISABLE KEYS */;
/*!40000 ALTER TABLE `artificial_intelligence_config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banks`
--

DROP TABLE IF EXISTS `banks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banks` (
  `accountID` int(11) NOT NULL DEFAULT '1',
  `kamas` int(11) NOT NULL DEFAULT '0',
  `items` varchar(255) NOT NULL,
  PRIMARY KEY (`accountID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banks`
--

LOCK TABLES `banks` WRITE;
/*!40000 ALTER TABLE `banks` DISABLE KEYS */;
INSERT INTO `banks` VALUES (3,0,''),(4,0,'');
/*!40000 ALTER TABLE `banks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `characteristiques_base`
--

DROP TABLE IF EXISTS `characteristiques_base`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `characteristiques_base` (
  `persoID` int(11) NOT NULL,
  `level` smallint(11) NOT NULL DEFAULT '1',
  `PA` smallint(11) NOT NULL DEFAULT '6',
  `PM` smallint(11) NOT NULL DEFAULT '3',
  `statspoints` smallint(11) NOT NULL DEFAULT '0',
  `spellpoints` smallint(11) NOT NULL DEFAULT '0',
  `pdv` smallint(11) NOT NULL DEFAULT '50',
  `prospection` smallint(11) NOT NULL DEFAULT '100',
  `initiative` smallint(11) NOT NULL DEFAULT '0',
  `vitalite` smallint(11) NOT NULL DEFAULT '0',
  `intelligence` smallint(11) NOT NULL DEFAULT '0',
  `force` smallint(11) NOT NULL DEFAULT '0',
  `chance` smallint(11) NOT NULL DEFAULT '0',
  `agilite` smallint(11) NOT NULL DEFAULT '0',
  `energy` smallint(11) NOT NULL DEFAULT '10000',
  PRIMARY KEY (`persoID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `characteristiques_base`
--

LOCK TABLES `characteristiques_base` WRITE;
/*!40000 ALTER TABLE `characteristiques_base` DISABLE KEYS */;
INSERT INTO `characteristiques_base` VALUES (5,90,6,3,100,0,72,100,0,0,0,0,0,0,10000),(32,90,6,3,0,0,84,120,0,29,0,0,10,1,10000),(36,90,6,3,0,0,55,100,0,0,0,0,0,0,10000),(37,90,6,3,63,40,520,100,0,20,36,159,34,271,10000),(39,90,6,3,0,0,55,100,0,0,0,0,0,0,10000),(40,90,6,3,0,0,95,100,0,0,0,0,0,0,10000),(41,90,6,3,345,69,450,100,0,0,0,0,0,0,10000),(42,90,6,3,0,0,55,100,0,0,0,0,0,0,10000),(43,1,6,3,0,0,55,100,0,0,0,0,0,0,10000);
/*!40000 ALTER TABLE `characteristiques_base` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classes_config`
--

DROP TABLE IF EXISTS `classes_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classes_config` (
  `ID` int(11) unsigned NOT NULL DEFAULT '1',
  `name` varchar(25) NOT NULL DEFAULT 'noname',
  `startLevel` smallint(1) NOT NULL DEFAULT '1',
  `startKamas` bigint(32) unsigned NOT NULL DEFAULT '0',
  `startMap` smallint(1) NOT NULL DEFAULT '7411',
  `startCell` smallint(1) NOT NULL DEFAULT '315',
  `startEmotes` varchar(15) NOT NULL DEFAULT '-1-2-',
  `startPods` smallint(1) NOT NULL DEFAULT '1000',
  `startItems` text NOT NULL,
  `startSpells` text NOT NULL,
  `startStats` text NOT NULL,
  `learnableSpells` text NOT NULL,
  `spellLearningLevels` text NOT NULL,
  `gainedStatsPerLevel` text NOT NULL,
  `paliersStats` text NOT NULL,
  `maxEnergy` smallint(1) NOT NULL DEFAULT '10000',
  `rates` text NOT NULL,
  `minMaxPaPm` varchar(15) CHARACTER SET utf8 NOT NULL DEFAULT '0,0;126,126' COMMENT 'minPa,Pm;maxPa,Pm',
  `WeaponDamageMultiplicators` varchar(31) NOT NULL DEFAULT '100,100,100,100,100,100,100,100',
  PRIMARY KEY (`ID`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classes_config`
--

LOCK TABLES `classes_config` WRITE;
/*!40000 ALTER TABLE `classes_config` DISABLE KEYS */;
INSERT INTO `classes_config` VALUES (1,'Feca',1,0,1155,200,'-1-2-',1000,'','3,6,17','PROSPECTION,100;PA,6;PM,3','1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20','1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200','PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5','PALIERSSTATS TODO',10000,'1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0','0,0;126,126','100,95,90,90,90,90,90,90'),(2,'Osamodas',1,0,1155,200,'-1-2-',1000,'','21,23,34','PROSPECTION,100;PA,6;PM,3','21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40','1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200','PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5','PALIERSSTATS TODO',10000,'1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0','0,0;126,126','95,90,90,100,90,90,90,90'),(3,'Enutrof',1,0,1155,200,'-1-2-',1000,'','41,43,51','PROSPECTION,120;PA,6;PM,3','31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50','1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200','PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5','PALIERSSTATS TODO',10000,'1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0','0,0;126,126','90,90,90,95,90,100,90,90'),(4,'Sram',1,0,1155,200,'-1-2-',1000,'','61,65,72','PROSPECTION,100;PA,6;PM,3','41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60','1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200','PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5','PALIERSSTATS TODO',10000,'1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0','0,0;126,126','90,90,90,90,100,90,95,90'),(5,'Xelor',1,0,1155,200,'-1-2-',1000,'','81,82,83','PROSPECTION,100;PA,6;PM,3','51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70','1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200','PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5','PALIERSSTATS TODO',10000,'1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0','0,0;126,126','90,95,90,90,100,90,90,90'),(6,'Ecaflip',1,0,1155,200,'-1-2-',1000,'','102,103,105','PROSPECTION,100;PA,6;PM,3','61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80','1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200','PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5','PALIERSSTATS TODO',10000,'1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0','0,0;126,126','90,90,100,90,95,90,90,90'),(7,'Eniripsa',1,0,1155,200,'-1-2-',1000,'','121,125,128','PROSPECTION,100;PA,6;PM,3','71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90','1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200','PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5','PALIERSSTATS TODO',10000,'1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0','0,0;126,126','95,100,90,90,90,90,90,90'),(8,'Iop',1,0,1155,200,'-1-2-',1000,'','141,142,143','PROSPECTION,100;PA,6;PM,3','81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100','1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200','PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5','PALIERSSTATS TODO',10000,'1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0','0,0;126,126','90,90,100,95,90,90,90,90'),(9,'Cra',1,0,1155,200,'-1-2-',1000,'','161,164,169','PROSPECTION,100;PA,6;PM,3','91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110','1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200','PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5','PALIERSSTATS TODO',10000,'1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0','0,0;126,126','90,90,90,90,95,90,100,90'),(10,'Sadida',1,0,1155,200,'-1-2-',1000,'','183,193,200','PROSPECTION,100;PA,6;PM,3','101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120','1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200','PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5','PALIERSSTATS TODO',10000,'1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0','0,0;126,126','100,95,90,90,90,90,90,90'),(11,'Sacrieur',1,0,1155,200,'-1-2-',1000,'','431,432,434','PROSPECTION,100;PA,6;PM,3','111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130','1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200','PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5','PALIERSSTATS TODO',10000,'1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0','0,0;126,126','90,90,90,90,90,90,90,90'),(12,'Pandawa',1,0,1155,200,'-1-2-',1000,'','686,687,692','PROSPECTION,100;PA,6;PM,3','121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140','1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200','PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5','PALIERSSTATS TODO',10000,'1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0','0,0;126,126','95,90,90,90,90,90,90,100');
/*!40000 ALTER TABLE `classes_config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commands_config`
--

DROP TABLE IF EXISTS `commands_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `commands_config` (
  `ID` smallint(1) unsigned NOT NULL AUTO_INCREMENT,
  `Name` varchar(30) NOT NULL DEFAULT 'noname',
  `actions` text NOT NULL,
  `conditions` varchar(255) NOT NULL,
  `parameters` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`,`Name`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commands_config`
--

LOCK TABLES `commands_config` WRITE;
/*!40000 ALTER TABLE `commands_config` DISABLE KEYS */;
INSERT INTO `commands_config` VALUES (1,'command','E:3ea#0#0#=========\\nIl y a actuellement %NBR_CO% connectés\\nLe record de connectés est %RECORD_CO%\\nUptime: %UPTIME%\\n=========\\nLa team %SERVER_NAME% est fière de vous présenter son émulateur privé %EMULATEUR_NAME% développé par %EMULATEUR_CREATOR%.@@FF','',''),(2,'start','A:900;special;Arg|E:3e9#0#0#myfirstscript.hello@true#0','PF=null',''),(3,'pvp','E:3e9#0#0#myfirstscript.hello@true#0','PF=null',''),(4,'shop','E:339#0#0#%mapID%=1155@%cellID%=250#0','PF=null',''),(5,'infos','E:3ea#0#0#=========<br/>Il y a actuellement %NBR_CO% connectés\\nLe record de connectés est %RECORD_CO%\\nUptime: %UPTIME%\\n=========\\nLa Team %SERVER_NAME% est fière de vous présenter son émulateur privé %EMULATEUR_NAME% dev par %EMULATEUR_CREATOR%.@FF0000#0','','');
/*!40000 ALTER TABLE `commands_config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `FieldName` varchar(40) CHARACTER SET utf8 NOT NULL,
  `ValueInt` bigint(20) unsigned DEFAULT NULL,
  `ValueString` text CHARACTER SET utf8,
  `ValueBool` enum('true','false','') CHARACTER SET utf8 DEFAULT NULL,
  `Description` text CHARACTER SET utf8
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES ('active_stats2',NULL,NULL,'true','Si on active le mode de boost des stats 2.0'),('aura100lvl',100,NULL,NULL,'Niveau mini du perso pour avoir l\'aura qu\'on a au lvl 100 sur l\'offi, mettez un chiffre plus haut que votre niveau maximal si vous voulez désactiver cette aura\r\n'),('aura200lvl',200,NULL,NULL,'Niveau mini du perso pour avoir l\'aura qu\'on a au lvl 200 sur l\'offi, mettez un chiffre plus haut que votre niveau maximal si vous voulez désactiver cette aura'),('banOnPacketCantParse',NULL,NULL,'false','Si on ban le joueur si l\'émulateur ne peut parser un de ses packets (Ce qui implique une tentative de hack dans le cas ou l\'émulateur est parfait)'),('startMessage',NULL,'cs<font color=\'#31f42b\'>Bienvenue sur le serveur Crystal !</font>',NULL,'Message de bienvenue . Vous pouvez choisir la couleur du message en mettant le code de celle-ci en HEX dans le message lui-même à la place de \"31f42b\"\r\n'),('RATES',NULL,'1;1;1;1;1;1',NULL,'XP, HONNEUR, JOB, DROP, FM, KAMAS.  On peut mettre des \".\" pour faire des chiffres à virgules.'),('lvlMax',200,NULL,NULL,'Niveau maximum qu\'un personnage peut atteindre. Même si votre table experience contient plus de niveaux, c\'est ce chiffre qui sera le maximum.'),('minLvlAskSecreteForDelete',20,NULL,NULL,'À partir de quel lvl la question secrete devra être répondu correctement pour pouvoir delete un perso'),('startCells',NULL,'315;315;315;315;315;315;315;315;315;315;315;315',NULL,'Les startCells de chaque classe (seulement si on utilise pas celles de l\'officielle)'),('forbiddenWords',NULL,'arkalia;asterion;zakari',NULL,'Les mots interdits'),('kickOnPacketCantParse',NULL,NULL,'false','Si on déconnecte le joueur si l\'émulateur ne peut parser un de ses packets (Ce qui implique une tentative de hack dans le cas ou l\'émulateur est parfait)'),('WorldActionsListenersIDs',NULL,'1,2,4',NULL,'Les ActionsListeners qu\'on doit charger par le World et stocker dans l\'hashmap du World et genre actionner par le World aussi (I)'),('ArmorSpellCharacTypes',NULL,'1,15;6,10;14,14;18,13;452,15;453,10;454,14;451,13',NULL,'Les CharacteristicTypes des sorts de réductions de dommages élémentaires comme les armures Féca.  Ex le premier est 1=spellID de Armure Incandescente et 15=CharacteristicType de l\'intelligence.... ;  6=ArmureTerreste,10=Force....etc... Les 45X c\'est les armures des percepteurs.'),('maximumClients',1000000000,NULL,NULL,'Maximum de joueurs pouvant se connecter au serveur'),('maxPersoPerAccount',5,NULL,NULL,'Maximum de personnages par compte'),('kickOnExceptionCaught',NULL,NULL,'true','Si on déconnecte le joueur lorsqu\'une exception est levée.'),('banOnExceptionCaught',NULL,NULL,'false','Si on ban le joueur lorsqu\'une exception est levée.'),('fightStartTimerTime',45000,NULL,NULL,'Temps en millisecondes pour le timer delancement de combat.'),('fightTurnTimerTime',30000,NULL,NULL,'Temps en millisecondes pour le timer de tour de combat.'),('useDefaultPlugins',NULL,NULL,'true','Si on utilise les plugins par défaut chargés dans Syn lorsqu\'ils ne sont pas spécifiés dans la config de plugins.');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experience`
--

DROP TABLE IF EXISTS `experience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `experience` (
  `lvl` int(10) unsigned NOT NULL,
  `perso` bigint(11) NOT NULL,
  `metier` bigint(11) NOT NULL,
  `dinde` bigint(11) NOT NULL,
  `pvp` int(11) NOT NULL,
  `bandit` bigint(11) NOT NULL DEFAULT '-1',
  PRIMARY KEY (`lvl`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experience`
--

LOCK TABLES `experience` WRITE;
/*!40000 ALTER TABLE `experience` DISABLE KEYS */;
INSERT INTO `experience` VALUES (1,0,0,0,0,0),(2,110,50,375,500,1750),(3,650,140,1200,1500,4000),(4,1500,271,2550,3000,7250),(5,2800,441,4500,5000,11500),(6,4800,653,7125,7500,16750),(7,7300,905,10500,10000,23000),(8,10500,1199,14700,12500,30250),(9,14500,1543,19800,15000,37500),(10,19200,1911,25875,17500,47750),(11,25200,2330,33000,-1,58000),(12,32600,2792,41250,-1,69250),(13,41000,3297,50700,-1,81500),(14,50500,3840,61425,-1,94750),(15,61000,4439,73500,-1,100000),(16,75000,5078,87000,-1,124250),(17,91000,5762,102000,-1,140500),(18,115000,6493,118575,-1,157750),(19,142000,7280,136800,-1,176000),(20,171000,8097,156750,-1,195250),(21,202000,8980,178500,-1,215500),(22,235000,9898,202125,-1,236750),(23,270000,10875,227700,-1,250000),(24,310000,11903,255300,-1,282250),(25,353000,12985,285000,-1,306500),(26,398500,14122,316875,-1,331750),(27,448000,15315,351000,-1,358000),(28,503000,16564,387450,-1,385250),(29,561000,17873,426300,-1,413500),(30,621600,19242,467625,-1,442750),(31,687000,20672,511500,-1,473000),(32,755000,22166,558000,-1,504250),(33,829000,23726,607200,-1,536250),(34,910000,25353,659175,-1,569750),(35,1000000,27048,714000,-1,604000),(36,1100000,28815,771750,-1,639250),(37,1240000,30656,832500,-1,675500),(38,1400000,32572,896325,-1,712750),(39,1580000,34566,963300,-1,751000),(40,1780000,36641,1033500,-1,790250),(41,2000000,38800,1107000,-1,830500),(42,2250000,41044,1183875,-1,871750),(43,2530000,43378,1264200,-1,914000),(44,2850000,45804,1348050,-1,957250),(45,3200000,48325,1435500,-1,1001500),(46,3570000,50946,1526625,-1,1046750),(47,3960000,53669,1621500,-1,1093000),(48,4400000,56498,1720200,-1,1140250),(49,4860000,59437,1822800,-1,1188500),(50,5350000,62491,1929375,-1,1262750),(51,5860000,65664,2040000,-1,-1),(52,6390000,68960,2154750,-1,-1),(53,6950000,72385,2273700,-1,-1),(54,7530000,75943,2396925,-1,-1),(55,8130000,79640,2524500,-1,-1),(56,8765100,83482,2656500,-1,-1),(57,9420000,87475,2793000,-1,-1),(58,10150000,91624,2934075,-1,-1),(59,10894000,95937,3079800,-1,-1),(60,11650000,100421,3230250,-1,-1),(61,12450000,105082,3385500,-1,-1),(62,13280000,109930,3545625,-1,-1),(63,14130000,114971,3710700,-1,-1),(64,15170000,120215,3880800,-1,-1),(65,16251000,125671,4056000,-1,-1),(66,17377000,131348,4236375,-1,-1),(67,18553000,137256,4422000,-1,-1),(68,19778000,143407,4612950,-1,-1),(69,21055000,149811,4809300,-1,-1),(70,22385000,156481,5011125,-1,-1),(71,23529000,163429,5218500,-1,-1),(72,25209000,170669,5431500,-1,-1),(73,26707000,178214,5650200,-1,-1),(74,28264000,186080,5874675,-1,-1),(75,29882000,194283,6105000,-1,-1),(76,31563000,202839,6341250,-1,-1),(77,33307000,211765,6583500,-1,-1),(78,35118000,221082,6831825,-1,-1),(79,36997000,230808,7086300,-1,-1),(80,38945000,240964,7347000,-1,-1),(81,40965000,251574,7614000,-1,-1),(82,43059000,262660,7887375,-1,-1),(83,45229000,274248,8167200,-1,-1),(84,47476000,286364,8453550,-1,-1),(85,49803000,299037,8746500,-1,-1),(86,52211000,312297,9046125,-1,-1),(87,54704000,326175,9352500,-1,-1),(88,57284000,340705,9665700,-1,-1),(89,59952000,355924,9985800,-1,-1),(90,62712000,371870,10312875,-1,-1),(91,65565000,388582,10647000,-1,-1),(92,68514000,406106,10988250,-1,-1),(93,71561000,424486,11336700,-1,-1),(94,74710000,443772,11692425,-1,-1),(95,77963000,464016,12055500,-1,-1),(96,81323000,485274,12426000,-1,-1),(97,84792000,507604,12804000,-1,-1),(98,88374000,531071,13189575,-1,-1),(99,92071000,555541,13582800,-1,-1),(100,95886000,581687,13983750,-1,-1),(101,99823000,-1,-1,-1,-1),(102,103885000,-1,-1,-1,-1),(103,108075000,-1,-1,-1,-1),(104,112396000,-1,-1,-1,-1),(105,116853000,-1,-1,-1,-1),(106,121447000,-1,-1,-1,-1),(107,126184000,-1,-1,-1,-1),(108,131066000,-1,-1,-1,-1),(109,136098000,-1,-1,-1,-1),(110,141283000,-1,-1,-1,-1),(111,146626000,-1,-1,-1,-1),(112,152130000,-1,-1,-1,-1),(113,157800000,-1,-1,-1,-1),(114,163640000,-1,-1,-1,-1),(115,169655000,-1,-1,-1,-1),(116,175848000,-1,-1,-1,-1),(117,182225000,-1,-1,-1,-1),(118,188791000,-1,-1,-1,-1),(119,195550000,-1,-1,-1,-1),(120,202507000,-1,-1,-1,-1),(121,209667000,-1,-1,-1,-1),(122,217037000,-1,-1,-1,-1),(123,224620000,-1,-1,-1,-1),(124,232424000,-1,-1,-1,-1),(125,240452000,-1,-1,-1,-1),(126,248712000,-1,-1,-1,-1),(127,257209000,-1,-1,-1,-1),(128,265949000,-1,-1,-1,-1),(129,274939000,-1,-1,-1,-1),(130,284186000,-1,-1,-1,-1),(131,293694000,-1,-1,-1,-1),(132,303473000,-1,-1,-1,-1),(133,313527000,-1,-1,-1,-1),(134,323866000,-1,-1,-1,-1),(135,334495000,-1,-1,-1,-1),(136,345423000,-1,-1,-1,-1),(137,356657000,-1,-1,-1,-1),(138,368206000,-1,-1,-1,-1),(139,380076000,-1,-1,-1,-1),(140,392278000,-1,-1,-1,-1),(141,404818000,-1,-1,-1,-1),(142,417706000,-1,-1,-1,-1),(143,430952000,-1,-1,-1,-1),(144,444564000,-1,-1,-1,-1),(145,458551000,-1,-1,-1,-1),(146,472924000,-1,-1,-1,-1),(147,487693000,-1,-1,-1,-1),(148,502867000,-1,-1,-1,-1),(149,518458000,-1,-1,-1,-1),(150,534476000,-1,-1,-1,-1),(151,502867000,-1,-1,-1,-1),(152,567839000,-1,-1,-1,-1),(153,585206000,-1,-1,-1,-1),(154,603047000,-1,-1,-1,-1),(155,621374000,-1,-1,-1,-1),(156,640199000,-1,-1,-1,-1),(157,659536000,-1,-1,-1,-1),(158,679398000,-1,-1,-1,-1),(159,699798000,-1,-1,-1,-1),(160,720751000,-1,-1,-1,-1),(161,742772000,-1,-1,-1,-1),(162,764374000,-1,-1,-1,-1),(163,787074000,-1,-1,-1,-1),(164,810387000,-1,-1,-1,-1),(165,834329000,-1,-1,-1,-1),(166,858917000,-1,-1,-1,-1),(167,884167000,-1,-1,-1,-1),(168,910098000,-1,-1,-1,-1),(169,936727000,-1,-1,-1,-1),(170,964073000,-1,-1,-1,-1),(171,992154000,-1,-1,-1,-1),(172,1020991000,-1,-1,-1,-1),(173,1050603000,-1,-1,-1,-1),(174,1081010000,-1,-1,-1,-1),(175,1112235000,-1,-1,-1,-1),(176,1144298000,-1,-1,-1,-1),(177,1177222000,-1,-1,-1,-1),(178,1211030000,-1,-1,-1,-1),(179,1245745000,-1,-1,-1,-1),(180,1281393000,-1,-1,-1,-1),(181,1317997000,-1,-1,-1,-1),(182,1355584000,-1,-1,-1,-1),(183,1404179000,-1,-1,-1,-1),(184,1463811000,-1,-1,-1,-1),(185,1534506000,-1,-1,-1,-1),(186,1616294000,-1,-1,-1,-1),(187,1709205000,-1,-1,-1,-1),(188,1813267000,-1,-1,-1,-1),(189,1928513000,-1,-1,-1,-1),(190,2054975000,-1,-1,-1,-1),(191,2192686000,-1,-1,-1,-1),(192,2341679000,-1,-1,-1,-1),(193,2501990000,-1,-1,-1,-1),(194,2673655000,-1,-1,-1,-1),(195,2856710000,-1,-1,-1,-1),(196,3051194000,-1,-1,-1,-1),(197,3257146000,-1,-1,-1,-1),(198,3474606000,-1,-1,-1,-1),(199,3703616000,-1,-1,-1,-1),(200,7407232000,-1,-1,-1,-1),(201,22221705000,-1,-1,-1,-1);
/*!40000 ALTER TABLE `experience` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_sets`
--

DROP TABLE IF EXISTS `item_sets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_sets` (
  `ID` smallint(11) NOT NULL DEFAULT '0',
  `name` varchar(150) NOT NULL,
  `items` text NOT NULL,
  `bonus` text NOT NULL COMMENT 'bonus2items1,bonus2items2;bonus3items1,bonus3items2',
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AVG_ROW_LENGTH=61;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_sets`
--

LOCK TABLES `item_sets` WRITE;
/*!40000 ALTER TABLE `item_sets` DISABLE KEYS */;
/*!40000 ALTER TABLE `item_sets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_templates`
--

DROP TABLE IF EXISTS `item_templates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_templates` (
  `ID` int(11) NOT NULL DEFAULT '1',
  `name` varchar(255) DEFAULT NULL,
  `ItemTemplateType` tinyint(1) NOT NULL DEFAULT '0',
  `type` smallint(1) NOT NULL DEFAULT '1',
  `level` smallint(1) NOT NULL DEFAULT '1',
  `pods` smallint(1) NOT NULL DEFAULT '0',
  `itemSet` smallint(1) NOT NULL DEFAULT '0',
  `conditions` varchar(100) NOT NULL,
  `effects` varchar(255) NOT NULL,
  `PA` smallint(1) NOT NULL DEFAULT '1',
  `tauxCC` smallint(1) NOT NULL DEFAULT '1',
  `tauxEC` smallint(1) NOT NULL DEFAULT '1',
  `bonusCC` smallint(1) NOT NULL DEFAULT '1',
  `poMin` smallint(1) NOT NULL DEFAULT '0',
  `poMax` smallint(1) NOT NULL DEFAULT '1',
  `needsTwoHands` bit(1) NOT NULL DEFAULT b'0',
  `price` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_templates`
--

LOCK TABLES `item_templates` WRITE;
/*!40000 ALTER TABLE `item_templates` DISABLE KEYS */;
INSERT INTO `item_templates` VALUES (15001,'nonameItem',0,12,1,1,-1,'','3e8#b#14#0#1d10+10',1,1,1,1,1,1,'\0',1),(15002,'testdurabilite',0,12,1,1,0,'','2be#1#3#9#1d3+7',1,1,1,1,0,1,'\0',1);
/*!40000 ALTER TABLE `item_templates` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `items` (
  `ID` int(11) NOT NULL DEFAULT '1',
  `templateID` int(11) NOT NULL DEFAULT '1',
  `quantity` smallint(11) NOT NULL DEFAULT '1',
  `position` tinyint(11) NOT NULL DEFAULT '-1',
  `effects` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES (8,8990,1,0,''),(9,2473,1,0,''),(10,2474,2,0,''),(11,2475,1,0,''),(12,2476,1,0,''),(13,2477,1,0,''),(14,2478,1,0,''),(22,8990,1,-1,''),(23,2473,1,7,''),(25,2475,1,4,''),(26,2476,1,5,''),(27,2477,1,3,''),(28,2478,1,0,''),(29,8990,1,0,''),(30,2473,1,0,''),(31,2474,2,0,''),(32,2475,1,0,''),(33,2476,1,0,''),(34,2477,1,0,''),(35,2478,1,0,''),(36,8990,1,0,''),(37,2473,1,0,''),(38,2474,2,0,''),(39,2475,1,0,''),(40,2476,1,0,''),(41,2477,1,0,''),(42,2478,1,0,''),(43,8990,1,0,''),(44,2473,1,0,''),(45,2474,2,0,''),(46,2475,1,0,''),(47,2476,1,0,''),(48,2477,1,0,''),(49,2478,1,0,''),(71,8990,1,0,''),(89,2474,1,6,''),(108,8990,1,-1,''),(130,2474,1,6,'76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#1#0#0d0+1,7e#0#1#0#0d0+1'),(132,8990,1,37,''),(133,8990,1,-1,''),(134,2473,1,7,''),(135,2474,1,-1,''),(136,2475,1,4,''),(137,2476,1,5,''),(138,2477,1,3,''),(139,2478,1,0,''),(140,2474,1,6,'76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#2#0#0d0+2,7e#0#2#0#0d0+2'),(141,2474,1,6,'76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#2#0#0d0+2,7e#0#2#0#0d0+2'),(142,2474,1,6,'76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#2#0#0d0+2,7e#0#2#0#0d0+2'),(144,2474,1,6,''),(157,2474,1,6,'76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#2#0#0d0+2'),(161,2473,1,7,''),(162,2474,1,6,''),(163,2475,1,4,''),(164,2476,1,5,''),(165,2477,1,3,''),(166,2478,1,0,''),(167,7164,1,-1,''),(170,2361,1,-1,'61#31#50#0#1d32+48,9d#0#250#0#0d0+592,32c#0#1#0#0d0+1'),(171,2361,1,-1,''),(173,2403,1,-1,'73#0#6#0#0d0+6,7a#0#2#0#0d0+2,d6#0#3#0#0d0+3,75#0#1#0#0d0+1'),(174,2403,1,-1,'73#0#5#0#0d0+5,7a#0#1#0#0d0+1,d6#0#2#0#0d0+2,75#0#1#0#0d0+1'),(175,7164,1,-1,''),(176,2403,1,-1,'73#0#7#0#0d0+7,7a#0#1#0#0d0+1,d6#0#3#0#0d0+3,75#0#1#0#0d0+1'),(177,841,1,-1,'6f#0#1#0#0d0+1,98#0#96#0#0d0+150,9a#0#96#0#0d0+150,9b#0#c8#0#0d0+200,9d#0#c8#0#0d0+200'),(178,2410,1,-1,'6f#0#1#0#0d0+1,7d#0#17#0#0d0+23,7f#0#1#0#0d0+1'),(179,2410,1,-1,'6f#0#1#0#0d0+1,7d#0#1f#0#0d0+31,7f#0#1#0#0d0+1'),(180,841,1,-1,'6f#0#1#0#0d0+1,98#0#96#0#0d0+150,9a#0#96#0#0d0+150,9b#0#c8#0#0d0+200,9d#0#c8#0#0d0+200'),(181,2403,1,-1,'73#0#5#0#0d0+5,7a#0#1#0#0d0+1,d6#0#5#0#0d0+5,75#0#1#0#0d0+1'),(183,2403,1,-1,''),(184,841,1,-1,''),(185,2410,1,-1,''),(186,7164,1,-1,''),(188,2064,1,-1,''),(189,9036,1,-1,''),(190,9177,1,-1,'76#0#1b#0#0d0+27,77#0#20#0#0d0+32,7d#0#a9#0#0d0+169,7c#0#1d#0#0d0+29,73#0#3#0#0d0+3,ae#0#178#0#0d0+376,b0#0#c#0#0d0+12,d5#0#7#0#0d0+7'),(191,9178,1,-1,'7b#0#25#0#0d0+37,7e#0#1a#0#0d0+26,7d#0#af#0#0d0+175,7c#0#18#0#0d0+24,73#0#3#0#0d0+3,ae#0#16a#0#0d0+362,b0#0#13#0#0d0+19,d2#0#a#0#0d0+10'),(192,8991,1,-1,'76#0#31#0#0d0+49,7b#0#29#0#0d0+41,7c#0#25#0#0d0+37,7d#0#e3#0#0d0+227,8a#0#d#0#0d0+13,ae#0#22b#0#0d0+555,b0#0#c#0#0d0+12'),(193,9177,1,-1,'76#0#21#0#0d0+33,77#0#1d#0#0d0+29,7d#0#9b#0#0d0+155,7c#0#1a#0#0d0+26,73#0#2#0#0d0+2,ae#0#184#0#0d0+388,b0#0#f#0#0d0+15,d5#0#8#0#0d0+8'),(194,8991,1,-1,'76#0#25#0#0d0+37,7b#0#2f#0#0d0+47,7c#0#2a#0#0d0+42,7d#0#f6#0#0d0+246,8a#0#13#0#0d0+19,ae#0#292#0#0d0+658,b0#0#f#0#0d0+15'),(195,9178,1,-1,'7b#0#1a#0#0d0+26,7e#0#1b#0#0d0+27,7d#0#c3#0#0d0+195,7c#0#1d#0#0d0+29,73#0#3#0#0d0+3,ae#0#18f#0#0d0+399,b0#0#12#0#0d0+18,d2#0#a#0#0d0+10'),(196,9178,1,-1,''),(197,8991,1,-1,''),(198,9177,1,-1,''),(199,8839,1,-1,''),(200,10054,1,-1,''),(201,1741,1,-1,''),(202,2333,1,-1,''),(203,1331,1,-1,'70#0#6#0#0d0+6,76#0#14#0#0d0+20'),(204,6858,1,-1,''),(205,6894,2,-1,''),(206,1728,1,-1,'7b#0#48#0#0d0+72,76#0#25#0#0d0+37,7e#0#4d#0#0d0+77,77#0#11#0#0d0+17,d6#0#5#0#0d0+5'),(207,1728,1,-1,'7b#0#1e#0#0d0+30,76#0#13#0#0d0+19,7e#0#3c#0#0d0+60,77#0#32#0#0d0+50,d6#0#10#0#0d0+16'),(208,1728,1,-1,'7b#0#50#0#0d0+80,76#0#50#0#0d0+80,7e#0#50#0#0d0+80,77#0#50#0#0d0+80,d6#0#14#0#0d0+20'),(209,1728,1,-1,'7b#0#50#0#0d0+80,76#0#50#0#0d0+80,7e#0#50#0#0d0+80,77#0#50#0#0d0+80,d6#0#14#0#0d0+20'),(212,8990,2,-1,''),(217,8990,2,-1,''),(229,8990,1,38,''),(230,8990,2,-1,''),(231,8990,1,35,''),(244,8990,15,-1,''),(250,1698,1,-1,''),(251,7164,1,-1,''),(252,7164,1,-1,''),(253,7164,1,-1,''),(254,7164,1,-1,'70#0#a#0#0d0+10,7b#0#29#0#0d0+41,77#0#28#0#0d0+40,7e#0#23#0#0d0+35,7c#0#1d#0#0d0+29,7d#0#ac#0#0d0+172,62#6#d#0#1d8+5,63#6#d#0#1d8+5,64#6#d#0#1d8+5,d4#0#6#0#0d0+6'),(255,8990,1,-1,''),(256,2473,1,-1,'76#0#1#0#0d0+1,77#0#2#0#0d0+2,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#2#0#0d0+2'),(257,2474,2,-1,'76#0#1#0#0d0+1,77#0#1#0#0d0+1,7b#0#1#0#0d0+1,7c#0#2#0#0d0+2,7e#0#2#0#0d0+2'),(258,2475,1,-1,'76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#1#0#0d0+1,7e#0#1#0#0d0+1'),(259,2476,1,-1,'76#0#1#0#0d0+1,77#0#2#0#0d0+2,7b#0#2#0#0d0+2,7c#0#2#0#0d0+2,7e#0#1#0#0d0+1'),(260,2477,1,-1,'76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#2#0#0d0+2,7e#0#2#0#0d0+2'),(261,2478,1,-1,'7c#0#1#0#0d0+1,76#0#1#0#0d0+1,7e#0#1#0#0d0+1,7b#0#2#0#0d0+2,77#0#1#0#0d0+1'),(268,2478,1,0,''),(269,2475,1,-1,'76#0#1#0#0d0+1,77#0#2#0#0d0+2,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#2#0#0d0+2'),(270,2475,1,-1,''),(272,7164,1,-1,'70#0#a#0#0d0+10,7b#0#2b#0#0d0+43,77#0#2d#0#0d0+45,7e#0#26#0#0d0+38,7c#0#1d#0#0d0+29,7d#0#b7#0#0d0+183,62#6#d#0#1d8+5,63#6#d#0#1d8+5,64#6#d#0#1d8+5,d4#0#9#0#0d0+9'),(273,7164,1,-1,'70#0#a#0#0d0+10,7b#0#32#0#0d0+50,77#0#32#0#0d0+50,7e#0#32#0#0d0+50,7c#0#28#0#0d0+40,7d#0#c8#0#0d0+200,62#6#d#0#1d8+5,63#6#d#0#1d8+5,64#6#d#0#1d8+5,d4#0#a#0#0d0+10'),(281,8990,1,-1,''),(282,2473,1,-1,''),(283,2474,2,-1,''),(284,2475,1,-1,''),(285,2476,1,-1,''),(286,2477,1,-1,''),(287,2478,1,-1,''),(289,9481,1,-1,''),(290,88,1,-1,''),(291,930,1,-1,''),(292,1741,1,-1,''),(293,2216,1,-1,''),(294,8719,1,-1,'11f#2b#0#14#0d0+43,119#32#0#1#0d0+50,11d#34#0#1#0d0+52,11e#2d#0#1#0d0+45'),(297,8619,1,-1,'11f#91#0#19#0d0+145,119#8d#0#1#0d0+141,11d#9a#0#1#0d0+154,11e#9b#0#1#0d0+155'),(298,8635,1,6,'11b#2b2#0#a#0d0+690,11b#2af#0#f#0d0+687,11f#2ae#0#1e#0d0+686,123#2b1#0#1#0d0+689'),(299,1182,1,-1,''),(301,8723,1,4,'11b#53#0#f#0d0+83,119#61#0#3#0d0+97,124#b#0#a#0d0+11,11e#59#0#1#0d0+89'),(302,8722,1,-1,'119#4a#0#1#0d0+74,11d#45#0#1#0d0+69,11d#47#0#1#0d0+71,11e#4b#0#1#0d0+75'),(303,8634,1,-1,'11b#0#18#a#0d0+24,11f#0#20#19#0d0+32,11f#0#1c#1e#0d0+28,11d#0#22#1#0d0+34'),(304,8638,1,-1,'11b#0#31#14#0d0+49,11c#0#2f#1e#0d0+47,119#0#35#1#0d0+53,11e#0#2a#2#0d0+42'),(305,8636,1,-1,'11b#0#a3#f#0d0+163,11b#0#aa#14#0d0+170,11d#0#ac#1#0d0+172,11a#0#a7#1#0d0+167'),(307,8632,1,-1,'11c#c0#0#64#0d0+192,11f#c3#0#1e#0d0+195,119#b6#0#3#0d0+182,121#c8#0#1#0d0+200'),(310,8724,1,2,'11f#c2#0#1e#0d0+194,120#b9#0#0#0d0+185,11e#bb#0#1#0d0+187,11e#c7#0#3#0d0+199'),(312,8724,1,-1,'11f#c2#0#1e#0d0+194,120#b9#0#0#0d0+185,11e#bb#0#1#0d0+187,11e#c7#0#3#0d0+199'),(314,8724,1,4,'11f#c2#0#1e#0d0+194,120#b9#0#0#0d0+185,11e#bb#0#1#0d0+187,11e#c7#0#3#0d0+199'),(318,2474,1,-1,''),(320,1698,1,-1,''),(322,1697,1,-1,'9e#0#44#0#0d0+68'),(324,1712,1,-1,''),(325,8497,1,-1,''),(326,2016,1,-1,''),(327,8503,1,-1,''),(328,1897,1,-1,''),(329,1802,1,-1,''),(330,1762,1,-1,''),(334,8430,1,-1,''),(335,8435,1,-1,''),(336,8621,1,-1,''),(337,8624,1,-1,''),(338,8626,1,-1,''),(339,8625,1,-1,''),(340,7798,1,-1,''),(341,7787,1,-1,''),(343,7651,1,-1,''),(347,8724,1,2,'11f#c2#0#1e#0d0+194,120#b9#0#0#0d0+185,11e#bb#0#1#0d0+187,11e#c7#0#3#0d0+199'),(348,2476,1,-1,'76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#1#0#0d0+1,7e#0#1#0#0d0+1'),(350,8990,1,-1,'201#0#0#0#0d0+0'),(351,8990,1,-1,'201#0#0#0#0d0+0'),(352,8990,1,-1,''),(355,8010,2,-1,''),(356,8990,1,-1,''),(357,2474,1,-1,''),(358,8724,1,-1,'11f#c2#0#1e#0d0+194,120#b9#0#0#0d0+185,11e#bb#0#1#0d0+187,11e#c7#0#3#0d0+199'),(359,8724,1,4,'11f#c2#0#1e#0d0+194,120#b9#0#0#0d0+185,11e#bb#0#1#0d0+187,11e#c7#0#3#0d0+199'),(360,2475,1,2,''),(361,2475,1,-1,''),(362,2475,1,-1,'76#0#0#2#0d0+0,77#0#0#2#0d0+0,7b#0#0#2#0d0+0,7c#0#0#2#0d0+0,7e#0#0#2#0d0+0'),(365,8990,2,-1,'201#0#0#0,96#0#0#0'),(366,1819,1,-1,'6e#0#64#0#0d0+100'),(367,1182,1,-1,'6e#b#14#0#1d10+10'),(368,15001,1,-1,''),(369,15001,1,-1,'3e8#0#13#0'),(370,15001,2,-1,'3e8#0#0#0'),(372,7799,1,-1,'3b5#0#0#0'),(373,1182,2,-1,'6e#b#14#0#1d10+10,3e9#0#0#0'),(375,7775,1,-1,'32c#0#64#0'),(376,7774,1,-1,''),(377,8010,1,-1,''),(379,8010,1,-1,'3b3#0#0#0'),(380,1128,1,-1,'64#e#19#0#1d12+13,70#0#4#0#0d0+4,73#0#4#0#0d0+4,76#0#27#0#0d0+39,77#0#28#0#0d0+40,98#0#f#0#0d0+15,9c#0#6#0#0d0+6'),(381,1182,1,-1,'6e#b#14#0#1d10+10,3e9#0#0#mysecondscript.js'),(385,2473,1,-1,'76#0#1#0#0d0+1,77#0#1#0#0d0+1,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#2#0#0d0+2'),(386,2473,1,-1,'76#0#1#0#0d0+1,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#1#0#0d0+1,7e#0#1#0#0d0+1'),(387,2473,1,-1,'76#0#1#0#0d0+1,77#0#2#0#0d0+2,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#1#0#0d0+1'),(388,2473,1,-1,'76#0#1#0#0d0+1,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#2#0#0d0+2,7e#0#2#0#0d0+2'),(389,7590,1,-1,''),(390,7591,1,-1,''),(391,7591,1,-1,''),(392,7591,1,-1,''),(393,7591,11,-1,'32c#0#10e#10e'),(395,7590,1,-1,'32c#0#64#0'),(397,1697,1,7,'9e#0#53#0#0d0+83'),(398,7888,1,-1,'7d#0#7b#0#0d0+123,9d#0#2c#0#0d0+44,9b#0#32#0#0d0+50,9a#0#41#0#0d0+65,98#0#30#0#0d0+48,70#0#6#0#0d0+6,9e#0#16a#0#0d0+362,d3#0#4#0#0d0+4,d2#0#4#0#0d0+4'),(399,6981,1,-1,'64#8#d#0#1d6+7,62#8#d#0#1d6+7,80#0#1#0#0d0+1,76#0#21#0#0d0+33,7d#0#eb#0#0d0+235,77#0#2b#0#0d0+43,e1#0#13#0#0d0+19,e2#0#12#0#0d0+18,ae#0#12c#0#0d0+300,70#0#a#0#0d0+10'),(400,1183,1,-1,'6e#15#28#0#1d20+20,3e9#0#0#floodscript.js'),(401,1183,1,-1,'6e#15#28#0#1d20+20,3e9#0#0#floodscript.js'),(402,1183,1,-1,'6e#15#28#0#1d20+20,3e9#0#0#floodscript.js'),(405,1183,1,-1,'6e#15#28#0#1d20+20,3e9#0#0#floodscript.js'),(406,1183,1,-1,'6e#15#28#0#1d20+20,3e9#0#0#floodscript.js'),(407,1183,1,-1,'6e#15#28#0#1d20+20,3e9#0#0#floodscript.js'),(408,1183,1,-1,'6e#15#28#0#1d20+20,3e9#0#0#floodscript.js'),(409,1183,1,-1,'6e#15#28#0#1d20+20,3e9#0#0#floodscript.js'),(411,1183,1,-1,'6e#15#28#0#1d20+20,3e9#0#0#floodscript.js'),(412,1183,1,-1,'6e#0#0#0#0d0+0,3e9#0#0#0'),(413,8990,1,-1,'201#0#0#0,96#0#0#0'),(414,2473,1,7,'76#0#1#0#0d0+1,77#0#2#0#0d0+2,7b#0#2#0#0d0+2,7c#0#2#0#0d0+2,7e#0#1#0#0d0+1'),(415,2474,1,-1,'76#0#2#0#0d0+2,77#0#2#0#0d0+2,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#1#0#0d0+1'),(416,2475,1,4,'76#0#1#0#0d0+1,77#0#1#0#0d0+1,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#0#0#0d0+0'),(417,2476,1,5,'76#0#2#0#0d0+2,77#0#2#0#0d0+2,7b#0#1#0#0d0+1,7c#0#2#0#0d0+2,7e#0#0#0#0d0+0'),(418,2477,1,3,'76#0#1#0#0d0+1,77#0#2#0#0d0+2,7b#0#1#0#0d0+1,7c#0#2#0#0d0+2,7e#0#0#0#0d0+0'),(419,2478,1,0,'7c#0#2#0#0d0+2,76#0#2#0#0d0+2,7e#0#0#0#0d0+0,7b#0#1#0#0d0+1,77#0#2#0#0d0+2'),(420,2474,1,6,'76#0#2#0#0d0+2,77#0#2#0#0d0+2,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#1#0#0d0+1'),(421,1182,1,-1,'6e#0#0#0#0d0+0,3e9#0#0#mysecondscript.js'),(422,1182,1,-1,'6e#b#14#0#1d10+10,3e9#0#0#0'),(426,7601,1,-1,''),(427,7603,1,-1,'60#5#a#0#1d6+4'),(428,7603,1,-1,'60#5#a#0#1d6+4'),(429,7603,10,-1,'60#5#a#0#1d6+4'),(430,7603,10,-1,'60#5#a#0#1d6+4'),(431,7603,10,-1,'60#5#a#0#1d6+4'),(432,7603,6,-1,'60#5#a#0#1d6+4'),(433,7603,11,-1,'60#5#a#0#1d6+4'),(437,1819,1,-1,'6e#0#64#0#0d0+100'),(438,1819,7,-1,'6e#0#64#0#0d0+100'),(442,9140,1,-1,'76#0#46#0#0d0+70,7d#0#12c#0#0d0+300,7c#0#32#0#0d0+50,80#0#1#0#0d0+1,70#0#a#0#0d0+10,b0#0#a#0#0d0+10,f3#0#a#0#0d0+10,f2#0#a#0#0d0+10,d2#0#a#0#0d0+10'),(443,9182,1,-1,'7b#0#32#0#0d0+50,7e#0#32#0#0d0+50,7d#0#fa#0#0d0+250,7c#0#1e#0#0d0+30,b0#0#a#0#0d0+10,70#0#a#0#0d0+10,b2#0#a#0#0d0+10,b6#0#2#0#0d0+2,d6#0#a#0#0d0+10,80#0#1#0#0d0+1'),(444,1182,1,-1,'6e#b#14#0#1d10+10'),(445,2474,1,6,''),(446,7604,3,-1,''),(451,7609,4,-1,'195#0#0#allo'),(453,2475,1,4,''),(455,526,1,-1,'6e#0#64#0#0d0+100'),(457,526,1,-1,'6e#0#64#0#0d0+100'),(458,526,1,-1,'6e#0#64#0#0d0+100'),(461,8145,1,-1,''),(464,2088,1,-1,'6e#0#1#0#0d0+1'),(465,2088,3,-1,'6e#0#1#0#0d0+1'),(466,9811,1,-1,''),(468,8911,1,-1,''),(470,8911,1001,-1,''),(471,8911,1001,-1,''),(472,8911,1001,-1,''),(473,8911,998,-1,''),(474,2529,4,-1,'2be#0#0#0'),(475,2529,4,-1,'2be#0#0#9'),(476,15002,4,-1,'2be#0#0#9'),(477,7698,1,-1,'32c#0#1388#0'),(478,7604,4,-1,'32c#0#0#10e'),(479,7618,1,-1,'32c#0#10e#10e'),(482,7602,1,-1,'3a8#0#1#0,3b4#0#1#0,32c#0#258#0'),(483,39,1,-1,'7e#0#2#0#0d0+2,64#1#7#0#1d7+0'),(484,0,1,-1,'7e#0#2#0#0d0+2'),(485,39,2,-1,'7e#0#2#0#0d0+2,64#1#7#0#1d7+0'),(487,0,17,-1,'7e#0#2#0#0d0+2'),(490,39,4,-1,'7e#0#2#0#0d0+2'),(491,39,2,-1,'7e#0#2#0#0d0+2,64#2#8#0#1d7+1'),(492,2411,1,-1,'7e#0#8#0#0d0+8,76#0#23#0#0d0+35'),(493,2414,2,-1,'ae#0#85#0#0d0+133,6e#1#32#0#1d50+0'),(494,2416,2,-1,'61#4#8#0#1d5+3,63#4#8#0#1d5+3,b6#0#1#0#0d0+1'),(495,2419,2,-1,'6e#1#1e#0#1d30+0'),(496,2422,2,-1,'8a#0#a#0#0d0+10,6e#1#23#0#1d35+0'),(497,2425,2,-1,'76#0#4#0#0d0+4,7e#0#3#0#0d0+3'),(498,2428,2,-1,'9e#0#112#0#0d0+274'),(499,2416,1,1,'61#4#8#0#1d5+3,63#4#8#0#1d5+3,b6#0#1#0#0d0+1'),(500,2428,1,3,'9e#0#112#0#0d0+274'),(501,2425,1,0,'76#0#4#0#0d0+4,7e#0#3#0#0d0+3'),(503,2411,1,6,'7e#0#8#0#0d0+8,76#0#23#0#0d0+35'),(505,2419,1,4,'6e#1#1e#0#1d30+0'),(507,2422,1,5,'8a#0#a#0#0d0+10,6e#1#23#0#1d35+0'),(508,2414,1,7,'ae#0#85#0#0d0+133,6e#1#32#0#1d50+0'),(509,1182,10,-1,'6e#b#14#0#1d10+10'),(510,7174,1,-1,'7d#0#c#0#0d0+12'),(511,2419,2,-1,'7d#0#4#0#0d0+4'),(512,2477,1,-1,''),(513,39,1,-1,'7e#0#2#0#0d0+2,64#1#7#0#1d7+0'),(514,2411,1,6,'7e#0#8#0#0d0+8,76#0#23#0#0d0+35');
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
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
-- Table structure for table `maps`
--

DROP TABLE IF EXISTS `maps`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `maps` (
  `ID` int(11) NOT NULL,
  `mapKey` text NOT NULL,
  `date` varchar(50) NOT NULL DEFAULT '',
  `mapData` text NOT NULL,
  `height` int(11) NOT NULL DEFAULT '0',
  `width` int(11) NOT NULL DEFAULT '0',
  `actionsListeners` text NOT NULL,
  `monstersGroupsInstances` varchar(10) NOT NULL DEFAULT '',
  `subarea` smallint(11) NOT NULL DEFAULT '0' COMMENT 'L''ID de la SubArea dans laquelle la map fait partie.',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maps`
--

LOCK TABLES `maps` WRITE;
/*!40000 ALTER TABLE `maps` DISABLE KEYS */;
/*!40000 ALTER TABLE `maps` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monsters`
--

DROP TABLE IF EXISTS `monsters`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `monsters` (
  `ID` smallint(11) NOT NULL DEFAULT '1',
  `name` varchar(15) NOT NULL DEFAULT '',
  `gfx` varchar(250) NOT NULL DEFAULT '' COMMENT 'chaque grade de monstre séparé par |',
  `drops` varchar(250) NOT NULL DEFAULT '' COMMENT 'chaque grade de monstre séparé par |',
  `spells` varchar(250) NOT NULL DEFAULT '' COMMENT 'chaque grade de monstre séparé par |',
  `colors` varchar(250) NOT NULL DEFAULT '-1;-1;-1' COMMENT 'chaque grade de monstre séparé par |',
  `accessories` varchar(250) NOT NULL DEFAULT ',,,,' COMMENT 'arme,coiffe,cape,familier,bouclier.  Les IDs sont en hexadecimal. Chaque grade de monstre séparé par | .  ',
  `iaID` smallint(6) NOT NULL DEFAULT '0' COMMENT 'chaque grade de monstre séparé par "|". ID dIA à attribuer au monstre combattant',
  `xp` varchar(255) NOT NULL DEFAULT '0' COMMENT 'chaque grade de monstre séparé par |',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monsters`
--

LOCK TABLES `monsters` WRITE;
/*!40000 ALTER TABLE `monsters` DISABLE KEYS */;
INSERT INTO `monsters` VALUES (34,'Larve Verte','10','','','-1;-1;-1',',2c0,,,',0,'0'),(36,'Bouftou','1154','','','-1;-1;-1','',0,'0');
/*!40000 ALTER TABLE `monsters` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monsters_groups`
--

DROP TABLE IF EXISTS `monsters_groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `monsters_groups` (
  `ID` smallint(11) NOT NULL DEFAULT '1',
  `monsters` varchar(250) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monsters_groups`
--

LOCK TABLES `monsters_groups` WRITE;
/*!40000 ALTER TABLE `monsters_groups` DISABLE KEYS */;
/*!40000 ALTER TABLE `monsters_groups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monsters_groups_instances`
--

DROP TABLE IF EXISTS `monsters_groups_instances`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `monsters_groups_instances` (
  `ID` smallint(11) NOT NULL DEFAULT '1',
  `monsters` varchar(250) NOT NULL,
  `mapID` smallint(11) NOT NULL DEFAULT '0',
  `cellID` smallint(11) NOT NULL DEFAULT '250',
  `orientation` tinyint(11) NOT NULL DEFAULT '1',
  `drops` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monsters_groups_instances`
--

LOCK TABLES `monsters_groups_instances` WRITE;
/*!40000 ALTER TABLE `monsters_groups_instances` DISABLE KEYS */;
INSERT INTO `monsters_groups_instances` VALUES (1,'340',1155,250,1,''),(2,'360',1155,95,1,'');
/*!40000 ALTER TABLE `monsters_groups_instances` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monsters_statistiques`
--

DROP TABLE IF EXISTS `monsters_statistiques`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `monsters_statistiques` (
  `ID` smallint(11) NOT NULL DEFAULT '1',
  `level` smallint(11) NOT NULL DEFAULT '1',
  `PA` smallint(11) NOT NULL DEFAULT '6',
  `PM` smallint(11) NOT NULL DEFAULT '3',
  `pdv` smallint(11) NOT NULL DEFAULT '50',
  `initiative` smallint(11) NOT NULL DEFAULT '1',
  `intelligence` smallint(11) NOT NULL DEFAULT '0',
  `force` smallint(11) NOT NULL DEFAULT '0',
  `chance` smallint(11) NOT NULL DEFAULT '0',
  `agilite` smallint(11) NOT NULL DEFAULT '0',
  `resistanceTerreFixe` smallint(11) NOT NULL DEFAULT '0',
  `resistanceFeuFixe` smallint(11) NOT NULL DEFAULT '0',
  `resistanceAirFixe` smallint(11) NOT NULL DEFAULT '0',
  `resistanceEauFixe` smallint(11) NOT NULL DEFAULT '0',
  `resistanceTerrePourcent` smallint(11) NOT NULL DEFAULT '0',
  `resistanceFeuPourcent` smallint(11) NOT NULL DEFAULT '0',
  `resistanceAirPourcent` smallint(11) NOT NULL DEFAULT '0',
  `resistanceEauPourcent` smallint(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monsters_statistiques`
--

LOCK TABLES `monsters_statistiques` WRITE;
/*!40000 ALTER TABLE `monsters_statistiques` DISABLE KEYS */;
INSERT INTO `monsters_statistiques` VALUES (340,1,6,3,50,1,0,0,0,0,0,0,0,0,0,0,0,0),(360,1,6,3,50,1,0,0,0,0,0,0,0,0,0,0,0,0);
/*!40000 ALTER TABLE `monsters_statistiques` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `official_maps_supplementaries`
--

DROP TABLE IF EXISTS `official_maps_supplementaries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `official_maps_supplementaries` (
  `mapID` smallint(11) NOT NULL DEFAULT '1',
  `mapKey` text NOT NULL,
  `date` varchar(50) NOT NULL DEFAULT '',
  `mapData` text NOT NULL,
  `height` int(11) NOT NULL DEFAULT '0',
  `width` int(11) NOT NULL DEFAULT '0',
  `actionsListeners` text NOT NULL,
  `monstersGroupsInstances` varchar(10) NOT NULL DEFAULT '',
  `subarea` smallint(11) NOT NULL DEFAULT '0' COMMENT 'L''ID de la SubArea dans laquelle la map fait partie.',
  PRIMARY KEY (`mapID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `official_maps_supplementaries`
--

LOCK TABLES `official_maps_supplementaries` WRITE;
/*!40000 ALTER TABLE `official_maps_supplementaries` DISABLE KEYS */;
/*!40000 ALTER TABLE `official_maps_supplementaries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personnages`
--

DROP TABLE IF EXISTS `personnages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personnages` (
  `ID` int(11) unsigned NOT NULL DEFAULT '1',
  `name` varchar(25) NOT NULL DEFAULT 'noname',
  `sexe` bit(1) NOT NULL DEFAULT b'0',
  `classe` tinyint(1) NOT NULL,
  `color1` int(11) NOT NULL,
  `color2` int(11) NOT NULL,
  `color3` int(11) NOT NULL,
  `kamas` bigint(32) unsigned NOT NULL,
  `xp` bigint(32) unsigned NOT NULL,
  `mapID` mediumint(11) NOT NULL DEFAULT '7411',
  `cellID` mediumint(11) NOT NULL DEFAULT '315',
  `channels` varchar(15) NOT NULL DEFAULT '*#%!pi$:?',
  `items` text NOT NULL,
  `spellList` text NOT NULL,
  `emotes` varchar(75) NOT NULL DEFAULT '0,1' COMMENT 'Normalement maximum 36 emotes (3lignes*12colonnes) + une virgule entre chaque, environ 72.  Arrondi à 75 :P',
  `title` smallint(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personnages`
--

LOCK TABLES `personnages` WRITE;
/*!40000 ALTER TABLE `personnages` DISABLE KEYS */;
INSERT INTO `personnages` VALUES (5,'Testmap','\0',8,-1,-1,-1,0,0,1770,341,'i*#$%!:?p','445,408,318,28,27,26,25,23,22','','0,1',0),(6,'Teststats','\0',2,-1,-1,-1,0,0,7411,315,'i*#$%!:?p','36,37,38,39,40,41,42','','0,1',0),(32,'Unh','\0',3,-1,-1,-1,0,0,7411,379,'i%:?!#$p*','466,473','','0,1',0),(36,'Taker','',11,-1,-1,-1,0,0,7411,343,'i*#$%!:?p','261,260,259,258,257,256,255','181~1~1;182~1~2;184~1~-184;183~1~3;190~1~-190;189~1~-189;192~1~-192;191~1~-191;186~1~-186;185~1~-185;415~1~13;188~1~-188;187~1~-187;195~1~-195;196~1~-196;193~1~-193;194~1~-194;199~1~-199;200~1~-200;197~1~-197;198~1~-198;415~1~-415','0,1',0),(37,'Leo','\0',10,-1,-1,-1,0,2054975000,7411,316,'*i:!%?#$p','491,490,479,478,475,474,444,443,442,433,412,399,398,397,395,393,392,380,379,376,375,373,372,370,369,368,365,355,352,347,343,341,340,339,338,337,336,335,334,330,329,328,327,326,325,324,320,307,302,301,299,298,297,294,293,292,291,290,289,270,268','183~6~1;191~1~2;194~6~3;195~6~4;181~1~5;196~6~6;415~6~7;193~6~8;182~6~9;189~6~10;190~1~11;187~1~12;184~6~13;184~1~14;195~1~-195;196~1~-196;193~6~-193;194~1~-194;199~1~-199;200~1~-200;197~1~-197;198~1~-198;6~1~-6;182~1~-182;181~1~-181;184~6~-184;190~6~-190;189~6~-189;192~1~-192;191~6~-191;186~1~-186;185~1~-185;188~1~-188;187~5~-187','0,1',0),(39,'Tips','\0',5,-1,-1,-1,0,0,7411,436,'i*#$%!:?p','287,286,285,284,283,282,281','181~1~1;182~1~2;183~1~3;184~1~-184;185~1~-185;186~1~-186;187~1~-187;188~1~-188;189~1~-189;190~1~-190;191~1~-191;192~1~-192;193~1~-193;194~1~-194;195~1~-195;196~1~-196;197~1~-197;198~1~-198;199~1~-199;200~1~-200;415~1~-415','0,1',0),(40,'Potion','\0',4,-1,-1,-1,0,0,10280,437,'i*#$%!:?p','421,420,419,418,417,416,415,414,413','','0,1',0),(41,'Eca','',6,-1,-1,-1,0,22385000,7411,315,'i*#$%!:?p','498,497,496,495,494,493,492','61~1~1;62~1~2;63~1~3;102~1~-102;110~1~-110','0',0),(42,'Feca','',1,16777215,-1,-1,0,0,1770,341,'i*#$%!:?p','','1~1~1;2~1~2;6~1~-6;3~1~3','0',0);
/*!40000 ALTER TABLE `personnages` ENABLE KEYS */;
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
INSERT INTO `scripts` VALUES ('Exit','exit.js','Syn_scripts/js/','exe','0','false','false','SECONDS',10,10,'0.0.1','Script pour faire System.exit(0);'),('Pubs','pub.js','Syn_scripts/js/','exe','Bonjour|FF0000','false','true','MINUTES',3,1,'0.0.1','Script qui envoie des msg de ');
/*!40000 ALTER TABLE `scripts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `spells`
--

DROP TABLE IF EXISTS `spells`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `spells` (
  `ID` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `lvl1` text NOT NULL,
  `lvl2` text NOT NULL,
  `lvl3` text NOT NULL,
  `lvl4` text NOT NULL,
  `lvl5` text NOT NULL,
  `lvl6` text NOT NULL,
  `effectTarget` varchar(255) NOT NULL,
  `spellSprite` smallint(6) NOT NULL,
  `characterSprite` tinyint(4) NOT NULL DEFAULT '-2' COMMENT 'Soit une array de string de length = 3 séparés par des ''~'', soit -1 pour ne pas forcer l''anim à se faire, soit -2 pour forcer l''animation à se faire',
  `showInFrontOfSprite` enum('true','false','') CHARACTER SET utf8 NOT NULL DEFAULT 'false',
  `displayType` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `spells`
--

LOCK TABLES `spells` WRITE;
/*!40000 ALTER TABLE `spells` DISABLE KEYS */;
/*!40000 ALTER TABLE `spells` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `titles`
--

DROP TABLE IF EXISTS `titles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `titles` (
  `ID` int(11) NOT NULL,
  `name` text NOT NULL,
  `color` text NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `titles`
--

LOCK TABLES `titles` WRITE;
/*!40000 ALTER TABLE `titles` DISABLE KEYS */;
/*!40000 ALTER TABLE `titles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-07-19 22:56:46
