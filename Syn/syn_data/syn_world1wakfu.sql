/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : syn_world1wakfu

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2013-11-17 03:11:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `actions_listeners_maps`
-- ----------------------------
DROP TABLE IF EXISTS `actions_listeners_maps`;
CREATE TABLE `actions_listeners_maps` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `mapID` int(11) NOT NULL DEFAULT '0',
  `type` varchar(20) NOT NULL DEFAULT '1',
  `actions` text NOT NULL,
  `conditions` text NOT NULL,
  `actionsListeners` text NOT NULL COMMENT 'Les actionsListeners qu''il faut ajouter à celui-ci (Donc celui-ci sera le container des autres)',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of actions_listeners_maps
-- ----------------------------
INSERT INTO `actions_listeners_maps` VALUES ('1', '1155', 'ON_CELL_ARRIVE', 'E:339#0#0#%mapID=1155%%cellID=190%#0', 'OY=214&MY=1155', '');

-- ----------------------------
-- Table structure for `actions_listeners_npcs`
-- ----------------------------
DROP TABLE IF EXISTS `actions_listeners_npcs`;
CREATE TABLE `actions_listeners_npcs` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `npcID` int(11) NOT NULL DEFAULT '0',
  `type` varchar(20) NOT NULL DEFAULT '1',
  `actions` text NOT NULL,
  `conditions` text NOT NULL,
  `actionsListeners` text NOT NULL COMMENT 'Les actionsListeners qu''il faut ajouter à celui-ci (Donc celui-ci sera le container des autres)',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of actions_listeners_npcs
-- ----------------------------
INSERT INTO `actions_listeners_npcs` VALUES ('1', '0', 'ON_CELL_ARRIVE', 'E:3ea#0#0#Bonjour, ici mon message de fou sur la cell 250 ;)@FF0000#0', 'OY=250', '2,3');
INSERT INTO `actions_listeners_npcs` VALUES ('2', '0', 'ON_MAP_ARRIVE', 'E:3ea#0#0#Bonjour, ici mon message de fou sur la map 7412 ;)@FF0000#0', 'MY=7412', '');
INSERT INTO `actions_listeners_npcs` VALUES ('3', '0', 'ON_AREA_ARRIVE', 'E:3ea#0#0#Bonjour, ici mon message de fou sur l\'area 18 ;)@FF0000#0', 'AY=18', '');
INSERT INTO `actions_listeners_npcs` VALUES ('4', '0', 'ON_ITEM_USE', 'E:3ea#0#0#Bonjour, ici mon message de fou sur l\'item utilisé 7618 ;)@FF0000#0|A:1002;%iobject%', 'IU=7618', '');

-- ----------------------------
-- Table structure for `actions_listeners_world`
-- ----------------------------
DROP TABLE IF EXISTS `actions_listeners_world`;
CREATE TABLE `actions_listeners_world` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL DEFAULT '1',
  `actions` text NOT NULL,
  `conditions` text NOT NULL,
  `actionsListeners` text NOT NULL COMMENT 'Les actionsListeners qu''il faut ajouter à celui-ci (Donc celui-ci sera le container des autres)',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of actions_listeners_world
-- ----------------------------
INSERT INTO `actions_listeners_world` VALUES ('1', 'ON_CELL_ARRIVE', 'E:3ea#0#0#Bonjour, ici mon message de fou sur la cell 250 ;)@FF0000#0', 'OY=250', '2,3');
INSERT INTO `actions_listeners_world` VALUES ('2', 'ON_MAP_ARRIVE', 'E:3ea#0#0#Bonjour, ici mon message de fou sur la map 7412 ;)@FF0000#0', 'MY=7412', '');
INSERT INTO `actions_listeners_world` VALUES ('3', 'ON_AREA_ARRIVE', 'E:3ea#0#0#Bonjour, ici mon message de fou sur l\'area 18 ;)@FF0000#0', 'AY=18', '');
INSERT INTO `actions_listeners_world` VALUES ('4', 'ON_ITEM_USE', 'E:3ea#0#0#Bonjour, ici mon message de fou sur l\'item utilisé 7618 ;)@FF0000#0|A:1002;%iobject%', 'IU=7618', '');

-- ----------------------------
-- Table structure for `areas`
-- ----------------------------
DROP TABLE IF EXISTS `areas`;
CREATE TABLE `areas` (
  `ID` smallint(11) NOT NULL DEFAULT '1',
  `name` varchar(20) NOT NULL DEFAULT 'MonArea',
  `superAreaID` char(2) NOT NULL DEFAULT '',
  `subareas` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`ID`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of areas
-- ----------------------------

-- ----------------------------
-- Table structure for `areas_sub`
-- ----------------------------
DROP TABLE IF EXISTS `areas_sub`;
CREATE TABLE `areas_sub` (
  `ID` smallint(11) NOT NULL DEFAULT '0',
  `name` varchar(20) NOT NULL DEFAULT 'MaSubArea',
  `areaID` smallint(11) NOT NULL,
  `possiblesMobs` text NOT NULL COMMENT '((mobID*10)+grade) , spawnprobabilité (double de 0 à 1)',
  `maxNumberOfGroups` smallint(11) NOT NULL DEFAULT '4',
  `maxMonsterGroupSize` smallint(11) NOT NULL DEFAULT '8',
  PRIMARY KEY (`ID`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of areas_sub
-- ----------------------------

-- ----------------------------
-- Table structure for `areas_super`
-- ----------------------------
DROP TABLE IF EXISTS `areas_super`;
CREATE TABLE `areas_super` (
  `ID` tinyint(11) NOT NULL DEFAULT '0',
  `name` varchar(20) NOT NULL DEFAULT 'MaSuperArea',
  `areas` varchar(10) NOT NULL DEFAULT '',
  PRIMARY KEY (`ID`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of areas_super
-- ----------------------------

-- ----------------------------
-- Table structure for `artificial_intelligence_config`
-- ----------------------------
DROP TABLE IF EXISTS `artificial_intelligence_config`;
CREATE TABLE `artificial_intelligence_config` (
  `ID` smallint(6) NOT NULL,
  `name` varchar(40) NOT NULL,
  `actions` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of artificial_intelligence_config
-- ----------------------------

-- ----------------------------
-- Table structure for `banks`
-- ----------------------------
DROP TABLE IF EXISTS `banks`;
CREATE TABLE `banks` (
  `accountID` int(11) NOT NULL DEFAULT '1',
  `kamas` int(11) NOT NULL DEFAULT '0',
  `items` varchar(255) NOT NULL,
  PRIMARY KEY (`accountID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of banks
-- ----------------------------
INSERT INTO `banks` VALUES ('3', '0', '');
INSERT INTO `banks` VALUES ('4', '0', '');

-- ----------------------------
-- Table structure for `challenges`
-- ----------------------------
DROP TABLE IF EXISTS `challenges`;
CREATE TABLE `challenges` (
  `ID` int(11) NOT NULL DEFAULT '0',
  `name` varchar(20) NOT NULL,
  `bonusXP` int(11) NOT NULL,
  `bonusDrop` int(11) NOT NULL,
  `fightEventType` enum('ON_FIGHT_START','ON_FIGHT_END','ON_FIGHT_TURN_START','ON_FIGHT_TURN_END','ON_FIGHT_ROUND_START','ON_FIGHT_ROUND_END','ON_FIGHT_MOVE','ON_FIGHT_SPELL_CAST','ON_FIGHT_DECONNECTED','ON_FIGHT_RECONNECTED','ON_FIGHT_JOIN','ON_FIGHT_DIE','ON_FIGHT_QUIT') NOT NULL,
  `scriptID` smallint(5) NOT NULL DEFAULT '0',
  `bonusXpPerAlly` int(11) NOT NULL DEFAULT '0',
  `bonusDropPerAlly` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of challenges
-- ----------------------------

-- ----------------------------
-- Table structure for `characteristiques_base`
-- ----------------------------
DROP TABLE IF EXISTS `characteristiques_base`;
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

-- ----------------------------
-- Records of characteristiques_base
-- ----------------------------
INSERT INTO `characteristiques_base` VALUES ('5', '90', '6', '3', '100', '0', '72', '100', '0', '0', '0', '0', '0', '0', '10000');
INSERT INTO `characteristiques_base` VALUES ('32', '90', '6', '3', '0', '0', '84', '120', '0', '29', '0', '0', '10', '1', '10000');
INSERT INTO `characteristiques_base` VALUES ('36', '90', '6', '3', '0', '0', '55', '100', '0', '0', '0', '0', '0', '0', '10000');
INSERT INTO `characteristiques_base` VALUES ('37', '90', '6', '3', '63', '40', '1', '100', '0', '20', '36', '159', '34', '271', '10000');
INSERT INTO `characteristiques_base` VALUES ('39', '90', '6', '3', '0', '0', '55', '100', '0', '0', '0', '0', '0', '0', '10000');
INSERT INTO `characteristiques_base` VALUES ('40', '90', '6', '3', '0', '0', '95', '100', '0', '0', '0', '0', '0', '0', '10000');
INSERT INTO `characteristiques_base` VALUES ('41', '90', '6', '3', '345', '69', '450', '100', '0', '0', '0', '0', '0', '0', '10000');
INSERT INTO `characteristiques_base` VALUES ('42', '90', '6', '3', '0', '0', '55', '100', '0', '0', '0', '0', '0', '0', '10000');
INSERT INTO `characteristiques_base` VALUES ('43', '1', '6', '3', '0', '0', '55', '120', '0', '0', '0', '0', '0', '0', '10000');

-- ----------------------------
-- Table structure for `classes_config`
-- ----------------------------
DROP TABLE IF EXISTS `classes_config`;
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

-- ----------------------------
-- Records of classes_config
-- ----------------------------
INSERT INTO `classes_config` VALUES ('1', 'Feca', '1', '0', '1155', '200', '-1-2-', '1000', '', '3,6,17', 'PROSPECTION,100;PA,6;PM,3', '1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20', '1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200', 'PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5', 'PALIERSSTATS TODO', '10000', '1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0', '0,0;126,126', '100,95,90,90,90,90,90,90');
INSERT INTO `classes_config` VALUES ('2', 'Osamodas', '1', '0', '1155', '200', '-1-2-', '1000', '', '21,23,34', 'PROSPECTION,100;PA,6;PM,3', '21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40', '1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200', 'PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5', 'PALIERSSTATS TODO', '10000', '1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0', '0,0;126,126', '95,90,90,100,90,90,90,90');
INSERT INTO `classes_config` VALUES ('3', 'Enutrof', '1', '0', '1155', '200', '-1-2-', '1000', '', '41,43,51', 'PROSPECTION,120;PA,6;PM,3', '31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50', '1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200', 'PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5', 'PALIERSSTATS TODO', '10000', '1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0', '0,0;126,126', '90,90,90,95,90,100,90,90');
INSERT INTO `classes_config` VALUES ('4', 'Sram', '1', '0', '1155', '200', '-1-2-', '1000', '', '61,65,72', 'PROSPECTION,100;PA,6;PM,3', '41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60', '1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200', 'PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5', 'PALIERSSTATS TODO', '10000', '1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0', '0,0;126,126', '90,90,90,90,100,90,95,90');
INSERT INTO `classes_config` VALUES ('5', 'Xelor', '1', '0', '1155', '200', '-1-2-', '1000', '', '81,82,83', 'PROSPECTION,100;PA,6;PM,3', '51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70', '1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200', 'PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5', 'PALIERSSTATS TODO', '10000', '1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0', '0,0;126,126', '90,95,90,90,100,90,90,90');
INSERT INTO `classes_config` VALUES ('6', 'Ecaflip', '1', '0', '1155', '200', '-1-2-', '1000', '', '102,103,105', 'PROSPECTION,100;PA,6;PM,3', '61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80', '1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200', 'PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5', 'PALIERSSTATS TODO', '10000', '1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0', '0,0;126,126', '90,90,100,90,95,90,90,90');
INSERT INTO `classes_config` VALUES ('7', 'Eniripsa', '1', '0', '1155', '200', '-1-2-', '1000', '', '121,125,128', 'PROSPECTION,100;PA,6;PM,3', '71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90', '1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200', 'PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5', 'PALIERSSTATS TODO', '10000', '1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0', '0,0;126,126', '95,100,90,90,90,90,90,90');
INSERT INTO `classes_config` VALUES ('8', 'Iop', '1', '0', '1155', '200', '-1-2-', '1000', '', '141,142,143', 'PROSPECTION,100;PA,6;PM,3', '81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100', '1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200', 'PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5', 'PALIERSSTATS TODO', '10000', '1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0', '0,0;126,126', '90,90,100,95,90,90,90,90');
INSERT INTO `classes_config` VALUES ('9', 'Cra', '1', '0', '1155', '200', '-1-2-', '1000', '', '161,164,169', 'PROSPECTION,100;PA,6;PM,3', '91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110', '1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200', 'PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5', 'PALIERSSTATS TODO', '10000', '1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0', '0,0;126,126', '90,90,90,90,95,90,100,90');
INSERT INTO `classes_config` VALUES ('10', 'Sadida', '1', '0', '1155', '200', '-1-2-', '1000', '', '183,193,200', 'PROSPECTION,100;PA,6;PM,3', '101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120', '1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200', 'PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5', 'PALIERSSTATS TODO', '10000', '1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0', '0,0;126,126', '100,95,90,90,90,90,90,90');
INSERT INTO `classes_config` VALUES ('11', 'Sacrieur', '1', '0', '1155', '200', '-1-2-', '1000', '', '431,432,434', 'PROSPECTION,100;PA,6;PM,3', '111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130', '1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200', 'PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5', 'PALIERSSTATS TODO', '10000', '1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0', '0,0;126,126', '90,90,90,90,90,90,90,90');
INSERT INTO `classes_config` VALUES ('12', 'Pandawa', '1', '0', '1155', '200', '-1-2-', '1000', '', '686,687,692', 'PROSPECTION,100;PA,6;PM,3', '121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140', '1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200', 'PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5', 'PALIERSSTATS TODO', '10000', '1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0', '0,0;126,126', '95,90,90,90,90,90,90,100');

-- ----------------------------
-- Table structure for `commands_config`
-- ----------------------------
DROP TABLE IF EXISTS `commands_config`;
CREATE TABLE `commands_config` (
  `ID` smallint(1) unsigned NOT NULL AUTO_INCREMENT,
  `Name` varchar(30) NOT NULL DEFAULT 'noname',
  `actions` text NOT NULL,
  `conditions` varchar(255) NOT NULL,
  `parameters` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`,`Name`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of commands_config
-- ----------------------------
INSERT INTO `commands_config` VALUES ('1', 'command', 'E:3ea#0#0#=========\\nIl y a actuellement %NBR_CO% connectés\\nLe record de connectés est %RECORD_CO%\\nUptime: %UPTIME%\\n=========\\nLa team %SERVER_NAME% est fière de vous présenter son émulateur privé %EMULATEUR_NAME% développé par %EMULATEUR_CREATOR%.@@FF', '', '');
INSERT INTO `commands_config` VALUES ('2', 'start', 'A:900;special;Arg|E:3e9#0#0#myfirstscript.hello@true#0', 'PF=null', '');
INSERT INTO `commands_config` VALUES ('3', 'pvp', 'E:3e9#0#0#myfirstscript.hello@true#0', 'PF=null', '');
INSERT INTO `commands_config` VALUES ('4', 'shop', 'E:339#0#0#%mapID%=1155@%cellID%=250#0', 'PF=null', '');
INSERT INTO `commands_config` VALUES ('5', 'infos', 'E:3ea#0#0#=========<br/>Il y a actuellement %NBR_CO% connectés\\nLe record de connectés est %RECORD_CO%\\nUptime: %UPTIME%\\n=========\\nLa Team %SERVER_NAME% est fière de vous présenter son émulateur privé %EMULATEUR_NAME% dev par %EMULATEUR_CREATOR%.@FF0000#0', '', '');

-- ----------------------------
-- Table structure for `config`
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config` (
  `FieldName` varchar(40) CHARACTER SET utf8 NOT NULL,
  `ValueInt` bigint(20) unsigned DEFAULT NULL,
  `ValueString` text CHARACTER SET utf8,
  `ValueBool` enum('true','false','') CHARACTER SET utf8 DEFAULT NULL,
  `Description` text CHARACTER SET utf8
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES ('active_stats2', null, null, 'true', 'Si on active le mode de boost des stats 2.0');
INSERT INTO `config` VALUES ('aura100lvl', '100', null, null, 'Niveau mini du perso pour avoir l\'aura qu\'on a au lvl 100 sur l\'offi, mettez un chiffre plus haut que votre niveau maximal si vous voulez désactiver cette aura\r\n');
INSERT INTO `config` VALUES ('aura200lvl', '200', null, null, 'Niveau mini du perso pour avoir l\'aura qu\'on a au lvl 200 sur l\'offi, mettez un chiffre plus haut que votre niveau maximal si vous voulez désactiver cette aura');
INSERT INTO `config` VALUES ('banOnPacketCantParse', null, null, 'false', 'Si on ban le joueur si l\'émulateur ne peut parser un de ses packets (Ce qui implique une tentative de hack dans le cas ou l\'émulateur est parfait)');
INSERT INTO `config` VALUES ('startMessage', null, 'cs<font color=\'#31f42b\'>Bienvenue sur le serveur Crystal !</font>', null, 'Message de bienvenue . Vous pouvez choisir la couleur du message en mettant le code de celle-ci en HEX dans le message lui-même à la place de \"31f42b\"\r\n');
INSERT INTO `config` VALUES ('RATES', null, '1;1;1;1;1;1', null, 'XP, HONNEUR, JOB, DROP, FM, KAMAS.  On peut mettre des \".\" pour faire des chiffres à virgules.');
INSERT INTO `config` VALUES ('lvlMax', '200', null, null, 'Niveau maximum qu\'un personnage peut atteindre. Même si votre table experience contient plus de niveaux, c\'est ce chiffre qui sera le maximum.');
INSERT INTO `config` VALUES ('minLvlAskSecreteForDelete', '20', null, null, 'À partir de quel lvl la question secrete devra être répondu correctement pour pouvoir delete un perso');
INSERT INTO `config` VALUES ('startCells', null, '315;315;315;315;315;315;315;315;315;315;315;315', null, 'Les startCells de chaque classe (seulement si on utilise pas celles de l\'officielle)');
INSERT INTO `config` VALUES ('forbiddenWords', null, 'arkalia;asterion;zakari', null, 'Les mots interdits');
INSERT INTO `config` VALUES ('kickOnPacketCantParse', null, null, 'false', 'Si on déconnecte le joueur si l\'émulateur ne peut parser un de ses packets (Ce qui implique une tentative de hack dans le cas ou l\'émulateur est parfait)');
INSERT INTO `config` VALUES ('WorldActionsListenersIDs', null, '1,2,4', null, 'Les ActionsListeners qu\'on doit charger par le World et stocker dans l\'hashmap du World et genre actionner par le World aussi (I)');
INSERT INTO `config` VALUES ('ArmorSpellCharacTypes', null, '1,15;6,10;14,14;18,13;452,15;453,10;454,14;451,13', null, 'Les CharacteristicTypes des sorts de réductions de dommages élémentaires comme les armures Féca.  Ex le premier est 1=spellID de Armure Incandescente et 15=CharacteristicType de l\'intelligence.... ;  6=ArmureTerreste,10=Force....etc... Les 45X c\'est les armures des percepteurs.');
INSERT INTO `config` VALUES ('maximumClients', '1000000000', null, null, 'Maximum de joueurs pouvant se connecter au serveur');
INSERT INTO `config` VALUES ('maxPersoPerAccount', '5', null, null, 'Maximum de personnages par compte');
INSERT INTO `config` VALUES ('kickOnExceptionCaught', null, null, 'true', 'Si on déconnecte le joueur lorsqu\'une exception est levée.');
INSERT INTO `config` VALUES ('banOnExceptionCaught', null, null, 'false', 'Si on ban le joueur lorsqu\'une exception est levée.');
INSERT INTO `config` VALUES ('fightStartTimerTime', '45000', null, null, 'Temps en millisecondes pour le timer delancement de combat.');
INSERT INTO `config` VALUES ('fightTurnTimerTime', '30000', null, null, 'Temps en millisecondes pour le timer de tour de combat.');
INSERT INTO `config` VALUES ('useDefaultPlugins', null, null, 'true', 'Si on utilise les plugins par défaut chargés dans Syn lorsqu\'ils ne sont pas spécifiés dans la config de plugins.');
INSERT INTO `config` VALUES ('permanentDamagePercent', '10', null, null, '#Pourcentage des dommages reçus appliqué en dommages permanent sur les points de vie maximals.');

-- ----------------------------
-- Table structure for `experience`
-- ----------------------------
DROP TABLE IF EXISTS `experience`;
CREATE TABLE `experience` (
  `lvl` int(10) unsigned NOT NULL,
  `perso` bigint(11) NOT NULL,
  `metier` bigint(11) NOT NULL,
  `dinde` bigint(11) NOT NULL,
  `pvp` int(11) NOT NULL,
  `bandit` bigint(11) NOT NULL DEFAULT '-1',
  PRIMARY KEY (`lvl`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of experience
-- ----------------------------
INSERT INTO `experience` VALUES ('1', '0', '0', '0', '0', '0');
INSERT INTO `experience` VALUES ('2', '110', '50', '375', '500', '1750');
INSERT INTO `experience` VALUES ('3', '650', '140', '1200', '1500', '4000');
INSERT INTO `experience` VALUES ('4', '1500', '271', '2550', '3000', '7250');
INSERT INTO `experience` VALUES ('5', '2800', '441', '4500', '5000', '11500');
INSERT INTO `experience` VALUES ('6', '4800', '653', '7125', '7500', '16750');
INSERT INTO `experience` VALUES ('7', '7300', '905', '10500', '10000', '23000');
INSERT INTO `experience` VALUES ('8', '10500', '1199', '14700', '12500', '30250');
INSERT INTO `experience` VALUES ('9', '14500', '1543', '19800', '15000', '37500');
INSERT INTO `experience` VALUES ('10', '19200', '1911', '25875', '17500', '47750');
INSERT INTO `experience` VALUES ('11', '25200', '2330', '33000', '-1', '58000');
INSERT INTO `experience` VALUES ('12', '32600', '2792', '41250', '-1', '69250');
INSERT INTO `experience` VALUES ('13', '41000', '3297', '50700', '-1', '81500');
INSERT INTO `experience` VALUES ('14', '50500', '3840', '61425', '-1', '94750');
INSERT INTO `experience` VALUES ('15', '61000', '4439', '73500', '-1', '100000');
INSERT INTO `experience` VALUES ('16', '75000', '5078', '87000', '-1', '124250');
INSERT INTO `experience` VALUES ('17', '91000', '5762', '102000', '-1', '140500');
INSERT INTO `experience` VALUES ('18', '115000', '6493', '118575', '-1', '157750');
INSERT INTO `experience` VALUES ('19', '142000', '7280', '136800', '-1', '176000');
INSERT INTO `experience` VALUES ('20', '171000', '8097', '156750', '-1', '195250');
INSERT INTO `experience` VALUES ('21', '202000', '8980', '178500', '-1', '215500');
INSERT INTO `experience` VALUES ('22', '235000', '9898', '202125', '-1', '236750');
INSERT INTO `experience` VALUES ('23', '270000', '10875', '227700', '-1', '250000');
INSERT INTO `experience` VALUES ('24', '310000', '11903', '255300', '-1', '282250');
INSERT INTO `experience` VALUES ('25', '353000', '12985', '285000', '-1', '306500');
INSERT INTO `experience` VALUES ('26', '398500', '14122', '316875', '-1', '331750');
INSERT INTO `experience` VALUES ('27', '448000', '15315', '351000', '-1', '358000');
INSERT INTO `experience` VALUES ('28', '503000', '16564', '387450', '-1', '385250');
INSERT INTO `experience` VALUES ('29', '561000', '17873', '426300', '-1', '413500');
INSERT INTO `experience` VALUES ('30', '621600', '19242', '467625', '-1', '442750');
INSERT INTO `experience` VALUES ('31', '687000', '20672', '511500', '-1', '473000');
INSERT INTO `experience` VALUES ('32', '755000', '22166', '558000', '-1', '504250');
INSERT INTO `experience` VALUES ('33', '829000', '23726', '607200', '-1', '536250');
INSERT INTO `experience` VALUES ('34', '910000', '25353', '659175', '-1', '569750');
INSERT INTO `experience` VALUES ('35', '1000000', '27048', '714000', '-1', '604000');
INSERT INTO `experience` VALUES ('36', '1100000', '28815', '771750', '-1', '639250');
INSERT INTO `experience` VALUES ('37', '1240000', '30656', '832500', '-1', '675500');
INSERT INTO `experience` VALUES ('38', '1400000', '32572', '896325', '-1', '712750');
INSERT INTO `experience` VALUES ('39', '1580000', '34566', '963300', '-1', '751000');
INSERT INTO `experience` VALUES ('40', '1780000', '36641', '1033500', '-1', '790250');
INSERT INTO `experience` VALUES ('41', '2000000', '38800', '1107000', '-1', '830500');
INSERT INTO `experience` VALUES ('42', '2250000', '41044', '1183875', '-1', '871750');
INSERT INTO `experience` VALUES ('43', '2530000', '43378', '1264200', '-1', '914000');
INSERT INTO `experience` VALUES ('44', '2850000', '45804', '1348050', '-1', '957250');
INSERT INTO `experience` VALUES ('45', '3200000', '48325', '1435500', '-1', '1001500');
INSERT INTO `experience` VALUES ('46', '3570000', '50946', '1526625', '-1', '1046750');
INSERT INTO `experience` VALUES ('47', '3960000', '53669', '1621500', '-1', '1093000');
INSERT INTO `experience` VALUES ('48', '4400000', '56498', '1720200', '-1', '1140250');
INSERT INTO `experience` VALUES ('49', '4860000', '59437', '1822800', '-1', '1188500');
INSERT INTO `experience` VALUES ('50', '5350000', '62491', '1929375', '-1', '1262750');
INSERT INTO `experience` VALUES ('51', '5860000', '65664', '2040000', '-1', '-1');
INSERT INTO `experience` VALUES ('52', '6390000', '68960', '2154750', '-1', '-1');
INSERT INTO `experience` VALUES ('53', '6950000', '72385', '2273700', '-1', '-1');
INSERT INTO `experience` VALUES ('54', '7530000', '75943', '2396925', '-1', '-1');
INSERT INTO `experience` VALUES ('55', '8130000', '79640', '2524500', '-1', '-1');
INSERT INTO `experience` VALUES ('56', '8765100', '83482', '2656500', '-1', '-1');
INSERT INTO `experience` VALUES ('57', '9420000', '87475', '2793000', '-1', '-1');
INSERT INTO `experience` VALUES ('58', '10150000', '91624', '2934075', '-1', '-1');
INSERT INTO `experience` VALUES ('59', '10894000', '95937', '3079800', '-1', '-1');
INSERT INTO `experience` VALUES ('60', '11650000', '100421', '3230250', '-1', '-1');
INSERT INTO `experience` VALUES ('61', '12450000', '105082', '3385500', '-1', '-1');
INSERT INTO `experience` VALUES ('62', '13280000', '109930', '3545625', '-1', '-1');
INSERT INTO `experience` VALUES ('63', '14130000', '114971', '3710700', '-1', '-1');
INSERT INTO `experience` VALUES ('64', '15170000', '120215', '3880800', '-1', '-1');
INSERT INTO `experience` VALUES ('65', '16251000', '125671', '4056000', '-1', '-1');
INSERT INTO `experience` VALUES ('66', '17377000', '131348', '4236375', '-1', '-1');
INSERT INTO `experience` VALUES ('67', '18553000', '137256', '4422000', '-1', '-1');
INSERT INTO `experience` VALUES ('68', '19778000', '143407', '4612950', '-1', '-1');
INSERT INTO `experience` VALUES ('69', '21055000', '149811', '4809300', '-1', '-1');
INSERT INTO `experience` VALUES ('70', '22385000', '156481', '5011125', '-1', '-1');
INSERT INTO `experience` VALUES ('71', '23529000', '163429', '5218500', '-1', '-1');
INSERT INTO `experience` VALUES ('72', '25209000', '170669', '5431500', '-1', '-1');
INSERT INTO `experience` VALUES ('73', '26707000', '178214', '5650200', '-1', '-1');
INSERT INTO `experience` VALUES ('74', '28264000', '186080', '5874675', '-1', '-1');
INSERT INTO `experience` VALUES ('75', '29882000', '194283', '6105000', '-1', '-1');
INSERT INTO `experience` VALUES ('76', '31563000', '202839', '6341250', '-1', '-1');
INSERT INTO `experience` VALUES ('77', '33307000', '211765', '6583500', '-1', '-1');
INSERT INTO `experience` VALUES ('78', '35118000', '221082', '6831825', '-1', '-1');
INSERT INTO `experience` VALUES ('79', '36997000', '230808', '7086300', '-1', '-1');
INSERT INTO `experience` VALUES ('80', '38945000', '240964', '7347000', '-1', '-1');
INSERT INTO `experience` VALUES ('81', '40965000', '251574', '7614000', '-1', '-1');
INSERT INTO `experience` VALUES ('82', '43059000', '262660', '7887375', '-1', '-1');
INSERT INTO `experience` VALUES ('83', '45229000', '274248', '8167200', '-1', '-1');
INSERT INTO `experience` VALUES ('84', '47476000', '286364', '8453550', '-1', '-1');
INSERT INTO `experience` VALUES ('85', '49803000', '299037', '8746500', '-1', '-1');
INSERT INTO `experience` VALUES ('86', '52211000', '312297', '9046125', '-1', '-1');
INSERT INTO `experience` VALUES ('87', '54704000', '326175', '9352500', '-1', '-1');
INSERT INTO `experience` VALUES ('88', '57284000', '340705', '9665700', '-1', '-1');
INSERT INTO `experience` VALUES ('89', '59952000', '355924', '9985800', '-1', '-1');
INSERT INTO `experience` VALUES ('90', '62712000', '371870', '10312875', '-1', '-1');
INSERT INTO `experience` VALUES ('91', '65565000', '388582', '10647000', '-1', '-1');
INSERT INTO `experience` VALUES ('92', '68514000', '406106', '10988250', '-1', '-1');
INSERT INTO `experience` VALUES ('93', '71561000', '424486', '11336700', '-1', '-1');
INSERT INTO `experience` VALUES ('94', '74710000', '443772', '11692425', '-1', '-1');
INSERT INTO `experience` VALUES ('95', '77963000', '464016', '12055500', '-1', '-1');
INSERT INTO `experience` VALUES ('96', '81323000', '485274', '12426000', '-1', '-1');
INSERT INTO `experience` VALUES ('97', '84792000', '507604', '12804000', '-1', '-1');
INSERT INTO `experience` VALUES ('98', '88374000', '531071', '13189575', '-1', '-1');
INSERT INTO `experience` VALUES ('99', '92071000', '555541', '13582800', '-1', '-1');
INSERT INTO `experience` VALUES ('100', '95886000', '581687', '13983750', '-1', '-1');
INSERT INTO `experience` VALUES ('101', '99823000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('102', '103885000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('103', '108075000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('104', '112396000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('105', '116853000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('106', '121447000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('107', '126184000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('108', '131066000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('109', '136098000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('110', '141283000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('111', '146626000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('112', '152130000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('113', '157800000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('114', '163640000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('115', '169655000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('116', '175848000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('117', '182225000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('118', '188791000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('119', '195550000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('120', '202507000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('121', '209667000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('122', '217037000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('123', '224620000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('124', '232424000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('125', '240452000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('126', '248712000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('127', '257209000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('128', '265949000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('129', '274939000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('130', '284186000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('131', '293694000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('132', '303473000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('133', '313527000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('134', '323866000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('135', '334495000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('136', '345423000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('137', '356657000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('138', '368206000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('139', '380076000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('140', '392278000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('141', '404818000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('142', '417706000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('143', '430952000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('144', '444564000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('145', '458551000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('146', '472924000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('147', '487693000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('148', '502867000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('149', '518458000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('150', '534476000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('151', '502867000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('152', '567839000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('153', '585206000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('154', '603047000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('155', '621374000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('156', '640199000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('157', '659536000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('158', '679398000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('159', '699798000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('160', '720751000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('161', '742772000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('162', '764374000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('163', '787074000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('164', '810387000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('165', '834329000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('166', '858917000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('167', '884167000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('168', '910098000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('169', '936727000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('170', '964073000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('171', '992154000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('172', '1020991000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('173', '1050603000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('174', '1081010000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('175', '1112235000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('176', '1144298000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('177', '1177222000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('178', '1211030000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('179', '1245745000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('180', '1281393000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('181', '1317997000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('182', '1355584000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('183', '1404179000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('184', '1463811000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('185', '1534506000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('186', '1616294000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('187', '1709205000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('188', '1813267000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('189', '1928513000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('190', '2054975000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('191', '2192686000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('192', '2341679000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('193', '2501990000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('194', '2673655000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('195', '2856710000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('196', '3051194000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('197', '3257146000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('198', '3474606000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('199', '3703616000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('200', '7407232000', '-1', '-1', '-1', '-1');
INSERT INTO `experience` VALUES ('201', '22221705000', '-1', '-1', '-1', '-1');

-- ----------------------------
-- Table structure for `items`
-- ----------------------------
DROP TABLE IF EXISTS `items`;
CREATE TABLE `items` (
  `ID` int(11) NOT NULL DEFAULT '1',
  `templateID` int(11) NOT NULL DEFAULT '1',
  `quantity` smallint(11) NOT NULL DEFAULT '1',
  `position` tinyint(11) NOT NULL DEFAULT '-1',
  `effects` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of items
-- ----------------------------
INSERT INTO `items` VALUES ('8', '8990', '1', '0', '');
INSERT INTO `items` VALUES ('9', '2473', '1', '0', '');
INSERT INTO `items` VALUES ('10', '2474', '2', '0', '');
INSERT INTO `items` VALUES ('11', '2475', '1', '0', '');
INSERT INTO `items` VALUES ('12', '2476', '1', '0', '');
INSERT INTO `items` VALUES ('13', '2477', '1', '0', '');
INSERT INTO `items` VALUES ('14', '2478', '1', '0', '');
INSERT INTO `items` VALUES ('22', '8990', '1', '-1', '');
INSERT INTO `items` VALUES ('23', '2473', '1', '7', '');
INSERT INTO `items` VALUES ('25', '2475', '1', '4', '');
INSERT INTO `items` VALUES ('26', '2476', '1', '5', '');
INSERT INTO `items` VALUES ('27', '2477', '1', '3', '');
INSERT INTO `items` VALUES ('28', '2478', '1', '0', '');
INSERT INTO `items` VALUES ('29', '8990', '1', '0', '');
INSERT INTO `items` VALUES ('30', '2473', '1', '0', '');
INSERT INTO `items` VALUES ('31', '2474', '2', '0', '');
INSERT INTO `items` VALUES ('32', '2475', '1', '0', '');
INSERT INTO `items` VALUES ('33', '2476', '1', '0', '');
INSERT INTO `items` VALUES ('34', '2477', '1', '0', '');
INSERT INTO `items` VALUES ('35', '2478', '1', '0', '');
INSERT INTO `items` VALUES ('36', '8990', '1', '0', '');
INSERT INTO `items` VALUES ('37', '2473', '1', '0', '');
INSERT INTO `items` VALUES ('38', '2474', '2', '0', '');
INSERT INTO `items` VALUES ('39', '2475', '1', '0', '');
INSERT INTO `items` VALUES ('40', '2476', '1', '0', '');
INSERT INTO `items` VALUES ('41', '2477', '1', '0', '');
INSERT INTO `items` VALUES ('42', '2478', '1', '0', '');
INSERT INTO `items` VALUES ('43', '8990', '1', '0', '');
INSERT INTO `items` VALUES ('44', '2473', '1', '0', '');
INSERT INTO `items` VALUES ('45', '2474', '2', '0', '');
INSERT INTO `items` VALUES ('46', '2475', '1', '0', '');
INSERT INTO `items` VALUES ('47', '2476', '1', '0', '');
INSERT INTO `items` VALUES ('48', '2477', '1', '0', '');
INSERT INTO `items` VALUES ('49', '2478', '1', '0', '');
INSERT INTO `items` VALUES ('71', '8990', '1', '0', '');
INSERT INTO `items` VALUES ('89', '2474', '1', '6', '');
INSERT INTO `items` VALUES ('108', '8990', '1', '-1', '');
INSERT INTO `items` VALUES ('130', '2474', '1', '6', '76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#1#0#0d0+1,7e#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('132', '8990', '1', '37', '');
INSERT INTO `items` VALUES ('133', '8990', '1', '-1', '');
INSERT INTO `items` VALUES ('134', '2473', '1', '7', '');
INSERT INTO `items` VALUES ('135', '2474', '1', '-1', '');
INSERT INTO `items` VALUES ('136', '2475', '1', '4', '');
INSERT INTO `items` VALUES ('137', '2476', '1', '5', '');
INSERT INTO `items` VALUES ('138', '2477', '1', '3', '');
INSERT INTO `items` VALUES ('139', '2478', '1', '0', '');
INSERT INTO `items` VALUES ('140', '2474', '1', '6', '76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#2#0#0d0+2,7e#0#2#0#0d0+2');
INSERT INTO `items` VALUES ('141', '2474', '1', '6', '76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#2#0#0d0+2,7e#0#2#0#0d0+2');
INSERT INTO `items` VALUES ('142', '2474', '1', '6', '76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#2#0#0d0+2,7e#0#2#0#0d0+2');
INSERT INTO `items` VALUES ('144', '2474', '1', '6', '');
INSERT INTO `items` VALUES ('157', '2474', '1', '6', '76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#2#0#0d0+2');
INSERT INTO `items` VALUES ('161', '2473', '1', '7', '');
INSERT INTO `items` VALUES ('162', '2474', '1', '6', '');
INSERT INTO `items` VALUES ('163', '2475', '1', '4', '');
INSERT INTO `items` VALUES ('164', '2476', '1', '5', '');
INSERT INTO `items` VALUES ('165', '2477', '1', '3', '');
INSERT INTO `items` VALUES ('166', '2478', '1', '0', '');
INSERT INTO `items` VALUES ('167', '7164', '1', '-1', '');
INSERT INTO `items` VALUES ('170', '2361', '1', '-1', '61#31#50#0#1d32+48,9d#0#250#0#0d0+592,32c#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('171', '2361', '1', '-1', '');
INSERT INTO `items` VALUES ('173', '2403', '1', '-1', '73#0#6#0#0d0+6,7a#0#2#0#0d0+2,d6#0#3#0#0d0+3,75#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('174', '2403', '1', '-1', '73#0#5#0#0d0+5,7a#0#1#0#0d0+1,d6#0#2#0#0d0+2,75#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('175', '7164', '1', '-1', '');
INSERT INTO `items` VALUES ('176', '2403', '1', '-1', '73#0#7#0#0d0+7,7a#0#1#0#0d0+1,d6#0#3#0#0d0+3,75#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('177', '841', '1', '-1', '6f#0#1#0#0d0+1,98#0#96#0#0d0+150,9a#0#96#0#0d0+150,9b#0#c8#0#0d0+200,9d#0#c8#0#0d0+200');
INSERT INTO `items` VALUES ('178', '2410', '1', '-1', '6f#0#1#0#0d0+1,7d#0#17#0#0d0+23,7f#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('179', '2410', '1', '-1', '6f#0#1#0#0d0+1,7d#0#1f#0#0d0+31,7f#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('180', '841', '1', '-1', '6f#0#1#0#0d0+1,98#0#96#0#0d0+150,9a#0#96#0#0d0+150,9b#0#c8#0#0d0+200,9d#0#c8#0#0d0+200');
INSERT INTO `items` VALUES ('181', '2403', '1', '-1', '73#0#5#0#0d0+5,7a#0#1#0#0d0+1,d6#0#5#0#0d0+5,75#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('183', '2403', '1', '-1', '');
INSERT INTO `items` VALUES ('184', '841', '1', '-1', '');
INSERT INTO `items` VALUES ('185', '2410', '1', '-1', '');
INSERT INTO `items` VALUES ('186', '7164', '1', '-1', '');
INSERT INTO `items` VALUES ('188', '2064', '1', '-1', '');
INSERT INTO `items` VALUES ('189', '9036', '1', '-1', '');
INSERT INTO `items` VALUES ('190', '9177', '1', '-1', '76#0#1b#0#0d0+27,77#0#20#0#0d0+32,7d#0#a9#0#0d0+169,7c#0#1d#0#0d0+29,73#0#3#0#0d0+3,ae#0#178#0#0d0+376,b0#0#c#0#0d0+12,d5#0#7#0#0d0+7');
INSERT INTO `items` VALUES ('191', '9178', '1', '-1', '7b#0#25#0#0d0+37,7e#0#1a#0#0d0+26,7d#0#af#0#0d0+175,7c#0#18#0#0d0+24,73#0#3#0#0d0+3,ae#0#16a#0#0d0+362,b0#0#13#0#0d0+19,d2#0#a#0#0d0+10');
INSERT INTO `items` VALUES ('192', '8991', '1', '-1', '76#0#31#0#0d0+49,7b#0#29#0#0d0+41,7c#0#25#0#0d0+37,7d#0#e3#0#0d0+227,8a#0#d#0#0d0+13,ae#0#22b#0#0d0+555,b0#0#c#0#0d0+12');
INSERT INTO `items` VALUES ('193', '9177', '1', '-1', '76#0#21#0#0d0+33,77#0#1d#0#0d0+29,7d#0#9b#0#0d0+155,7c#0#1a#0#0d0+26,73#0#2#0#0d0+2,ae#0#184#0#0d0+388,b0#0#f#0#0d0+15,d5#0#8#0#0d0+8');
INSERT INTO `items` VALUES ('194', '8991', '1', '-1', '76#0#25#0#0d0+37,7b#0#2f#0#0d0+47,7c#0#2a#0#0d0+42,7d#0#f6#0#0d0+246,8a#0#13#0#0d0+19,ae#0#292#0#0d0+658,b0#0#f#0#0d0+15');
INSERT INTO `items` VALUES ('195', '9178', '1', '-1', '7b#0#1a#0#0d0+26,7e#0#1b#0#0d0+27,7d#0#c3#0#0d0+195,7c#0#1d#0#0d0+29,73#0#3#0#0d0+3,ae#0#18f#0#0d0+399,b0#0#12#0#0d0+18,d2#0#a#0#0d0+10');
INSERT INTO `items` VALUES ('196', '9178', '1', '-1', '');
INSERT INTO `items` VALUES ('197', '8991', '1', '-1', '');
INSERT INTO `items` VALUES ('198', '9177', '1', '-1', '');
INSERT INTO `items` VALUES ('199', '8839', '1', '-1', '');
INSERT INTO `items` VALUES ('200', '10054', '1', '-1', '');
INSERT INTO `items` VALUES ('201', '1741', '1', '-1', '');
INSERT INTO `items` VALUES ('202', '2333', '1', '-1', '');
INSERT INTO `items` VALUES ('203', '1331', '1', '-1', '70#0#6#0#0d0+6,76#0#14#0#0d0+20');
INSERT INTO `items` VALUES ('204', '6858', '1', '-1', '');
INSERT INTO `items` VALUES ('205', '6894', '2', '-1', '');
INSERT INTO `items` VALUES ('206', '1728', '1', '-1', '7b#0#48#0#0d0+72,76#0#25#0#0d0+37,7e#0#4d#0#0d0+77,77#0#11#0#0d0+17,d6#0#5#0#0d0+5');
INSERT INTO `items` VALUES ('207', '1728', '1', '-1', '7b#0#1e#0#0d0+30,76#0#13#0#0d0+19,7e#0#3c#0#0d0+60,77#0#32#0#0d0+50,d6#0#10#0#0d0+16');
INSERT INTO `items` VALUES ('208', '1728', '1', '-1', '7b#0#50#0#0d0+80,76#0#50#0#0d0+80,7e#0#50#0#0d0+80,77#0#50#0#0d0+80,d6#0#14#0#0d0+20');
INSERT INTO `items` VALUES ('209', '1728', '1', '-1', '7b#0#50#0#0d0+80,76#0#50#0#0d0+80,7e#0#50#0#0d0+80,77#0#50#0#0d0+80,d6#0#14#0#0d0+20');
INSERT INTO `items` VALUES ('212', '8990', '2', '-1', '');
INSERT INTO `items` VALUES ('217', '8990', '2', '-1', '');
INSERT INTO `items` VALUES ('229', '8990', '1', '38', '');
INSERT INTO `items` VALUES ('230', '8990', '2', '-1', '');
INSERT INTO `items` VALUES ('231', '8990', '1', '35', '');
INSERT INTO `items` VALUES ('244', '8990', '15', '-1', '');
INSERT INTO `items` VALUES ('250', '1698', '1', '-1', '');
INSERT INTO `items` VALUES ('251', '7164', '1', '-1', '');
INSERT INTO `items` VALUES ('252', '7164', '1', '-1', '');
INSERT INTO `items` VALUES ('253', '7164', '1', '-1', '');
INSERT INTO `items` VALUES ('254', '7164', '1', '-1', '70#0#a#0#0d0+10,7b#0#29#0#0d0+41,77#0#28#0#0d0+40,7e#0#23#0#0d0+35,7c#0#1d#0#0d0+29,7d#0#ac#0#0d0+172,62#6#d#0#1d8+5,63#6#d#0#1d8+5,64#6#d#0#1d8+5,d4#0#6#0#0d0+6');
INSERT INTO `items` VALUES ('255', '8990', '1', '-1', '');
INSERT INTO `items` VALUES ('256', '2473', '1', '-1', '76#0#1#0#0d0+1,77#0#2#0#0d0+2,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#2#0#0d0+2');
INSERT INTO `items` VALUES ('257', '2474', '2', '-1', '76#0#1#0#0d0+1,77#0#1#0#0d0+1,7b#0#1#0#0d0+1,7c#0#2#0#0d0+2,7e#0#2#0#0d0+2');
INSERT INTO `items` VALUES ('258', '2475', '1', '-1', '76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#1#0#0d0+1,7e#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('259', '2476', '1', '-1', '76#0#1#0#0d0+1,77#0#2#0#0d0+2,7b#0#2#0#0d0+2,7c#0#2#0#0d0+2,7e#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('260', '2477', '1', '-1', '76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#2#0#0d0+2,7e#0#2#0#0d0+2');
INSERT INTO `items` VALUES ('261', '2478', '1', '-1', '7c#0#1#0#0d0+1,76#0#1#0#0d0+1,7e#0#1#0#0d0+1,7b#0#2#0#0d0+2,77#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('269', '2475', '1', '-1', '76#0#1#0#0d0+1,77#0#2#0#0d0+2,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#2#0#0d0+2');
INSERT INTO `items` VALUES ('270', '2475', '1', '-1', '');
INSERT INTO `items` VALUES ('272', '7164', '1', '-1', '70#0#a#0#0d0+10,7b#0#2b#0#0d0+43,77#0#2d#0#0d0+45,7e#0#26#0#0d0+38,7c#0#1d#0#0d0+29,7d#0#b7#0#0d0+183,62#6#d#0#1d8+5,63#6#d#0#1d8+5,64#6#d#0#1d8+5,d4#0#9#0#0d0+9');
INSERT INTO `items` VALUES ('273', '7164', '1', '-1', '70#0#a#0#0d0+10,7b#0#32#0#0d0+50,77#0#32#0#0d0+50,7e#0#32#0#0d0+50,7c#0#28#0#0d0+40,7d#0#c8#0#0d0+200,62#6#d#0#1d8+5,63#6#d#0#1d8+5,64#6#d#0#1d8+5,d4#0#a#0#0d0+10');
INSERT INTO `items` VALUES ('281', '8990', '1', '-1', '');
INSERT INTO `items` VALUES ('282', '2473', '1', '-1', '');
INSERT INTO `items` VALUES ('283', '2474', '2', '-1', '');
INSERT INTO `items` VALUES ('284', '2475', '1', '-1', '');
INSERT INTO `items` VALUES ('285', '2476', '1', '-1', '');
INSERT INTO `items` VALUES ('286', '2477', '1', '-1', '');
INSERT INTO `items` VALUES ('287', '2478', '1', '-1', '');
INSERT INTO `items` VALUES ('289', '9481', '1', '-1', '');
INSERT INTO `items` VALUES ('290', '88', '1', '-1', '');
INSERT INTO `items` VALUES ('291', '930', '1', '-1', '');
INSERT INTO `items` VALUES ('292', '1741', '1', '-1', '');
INSERT INTO `items` VALUES ('293', '2216', '1', '-1', '');
INSERT INTO `items` VALUES ('294', '8719', '1', '-1', '11f#2b#0#14#0d0+43,119#32#0#1#0d0+50,11d#34#0#1#0d0+52,11e#2d#0#1#0d0+45');
INSERT INTO `items` VALUES ('297', '8619', '1', '-1', '11f#91#0#19#0d0+145,119#8d#0#1#0d0+141,11d#9a#0#1#0d0+154,11e#9b#0#1#0d0+155');
INSERT INTO `items` VALUES ('298', '8635', '1', '6', '11b#2b2#0#a#0d0+690,11b#2af#0#f#0d0+687,11f#2ae#0#1e#0d0+686,123#2b1#0#1#0d0+689');
INSERT INTO `items` VALUES ('299', '1182', '1', '-1', '');
INSERT INTO `items` VALUES ('301', '8723', '1', '4', '11b#53#0#f#0d0+83,119#61#0#3#0d0+97,124#b#0#a#0d0+11,11e#59#0#1#0d0+89');
INSERT INTO `items` VALUES ('302', '8722', '1', '-1', '119#4a#0#1#0d0+74,11d#45#0#1#0d0+69,11d#47#0#1#0d0+71,11e#4b#0#1#0d0+75');
INSERT INTO `items` VALUES ('303', '8634', '1', '-1', '11b#0#18#a#0d0+24,11f#0#20#19#0d0+32,11f#0#1c#1e#0d0+28,11d#0#22#1#0d0+34');
INSERT INTO `items` VALUES ('304', '8638', '1', '-1', '11b#0#31#14#0d0+49,11c#0#2f#1e#0d0+47,119#0#35#1#0d0+53,11e#0#2a#2#0d0+42');
INSERT INTO `items` VALUES ('305', '8636', '1', '-1', '11b#0#a3#f#0d0+163,11b#0#aa#14#0d0+170,11d#0#ac#1#0d0+172,11a#0#a7#1#0d0+167');
INSERT INTO `items` VALUES ('307', '8632', '1', '-1', '11c#c0#0#64#0d0+192,11f#c3#0#1e#0d0+195,119#b6#0#3#0d0+182,121#c8#0#1#0d0+200');
INSERT INTO `items` VALUES ('310', '8724', '1', '2', '11f#c2#0#1e#0d0+194,120#b9#0#0#0d0+185,11e#bb#0#1#0d0+187,11e#c7#0#3#0d0+199');
INSERT INTO `items` VALUES ('312', '8724', '1', '-1', '11f#c2#0#1e#0d0+194,120#b9#0#0#0d0+185,11e#bb#0#1#0d0+187,11e#c7#0#3#0d0+199');
INSERT INTO `items` VALUES ('314', '8724', '1', '4', '11f#c2#0#1e#0d0+194,120#b9#0#0#0d0+185,11e#bb#0#1#0d0+187,11e#c7#0#3#0d0+199');
INSERT INTO `items` VALUES ('318', '2474', '1', '-1', '');
INSERT INTO `items` VALUES ('320', '1698', '1', '-1', '');
INSERT INTO `items` VALUES ('322', '1697', '1', '-1', '9e#0#44#0#0d0+68');
INSERT INTO `items` VALUES ('324', '1712', '1', '-1', '');
INSERT INTO `items` VALUES ('325', '8497', '1', '-1', '');
INSERT INTO `items` VALUES ('326', '2016', '1', '-1', '');
INSERT INTO `items` VALUES ('327', '8503', '1', '-1', '');
INSERT INTO `items` VALUES ('328', '1897', '1', '-1', '');
INSERT INTO `items` VALUES ('329', '1802', '1', '-1', '');
INSERT INTO `items` VALUES ('330', '1762', '1', '-1', '');
INSERT INTO `items` VALUES ('334', '8430', '1', '-1', '');
INSERT INTO `items` VALUES ('335', '8435', '1', '-1', '');
INSERT INTO `items` VALUES ('336', '8621', '1', '-1', '');
INSERT INTO `items` VALUES ('337', '8624', '1', '-1', '');
INSERT INTO `items` VALUES ('338', '8626', '1', '-1', '');
INSERT INTO `items` VALUES ('339', '8625', '1', '-1', '');
INSERT INTO `items` VALUES ('340', '7798', '1', '-1', '');
INSERT INTO `items` VALUES ('341', '7787', '1', '-1', '');
INSERT INTO `items` VALUES ('343', '7651', '1', '-1', '');
INSERT INTO `items` VALUES ('347', '8724', '1', '2', '11f#c2#0#1e#0d0+194,120#b9#0#0#0d0+185,11e#bb#0#1#0d0+187,11e#c7#0#3#0d0+199');
INSERT INTO `items` VALUES ('348', '2476', '1', '-1', '76#0#2#0#0d0+2,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#1#0#0d0+1,7e#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('350', '8990', '1', '-1', '201#0#0#0#0d0+0');
INSERT INTO `items` VALUES ('351', '8990', '1', '-1', '201#0#0#0#0d0+0');
INSERT INTO `items` VALUES ('352', '8990', '1', '-1', '');
INSERT INTO `items` VALUES ('355', '8010', '2', '-1', '');
INSERT INTO `items` VALUES ('356', '8990', '1', '-1', '');
INSERT INTO `items` VALUES ('357', '2474', '1', '-1', '');
INSERT INTO `items` VALUES ('358', '8724', '1', '-1', '11f#c2#0#1e#0d0+194,120#b9#0#0#0d0+185,11e#bb#0#1#0d0+187,11e#c7#0#3#0d0+199');
INSERT INTO `items` VALUES ('359', '8724', '1', '4', '11f#c2#0#1e#0d0+194,120#b9#0#0#0d0+185,11e#bb#0#1#0d0+187,11e#c7#0#3#0d0+199');
INSERT INTO `items` VALUES ('360', '2475', '1', '2', '');
INSERT INTO `items` VALUES ('361', '2475', '1', '-1', '');
INSERT INTO `items` VALUES ('362', '2475', '1', '-1', '76#0#0#2#0d0+0,77#0#0#2#0d0+0,7b#0#0#2#0d0+0,7c#0#0#2#0d0+0,7e#0#0#2#0d0+0');
INSERT INTO `items` VALUES ('365', '8990', '2', '-1', '201#0#0#0,96#0#0#0');
INSERT INTO `items` VALUES ('366', '1819', '1', '-1', '6e#0#64#0#0d0+100');
INSERT INTO `items` VALUES ('367', '1182', '1', '-1', '6e#b#14#0#1d10+10');
INSERT INTO `items` VALUES ('368', '15001', '1', '-1', '');
INSERT INTO `items` VALUES ('369', '15001', '1', '-1', '3e8#0#13#0');
INSERT INTO `items` VALUES ('370', '15001', '2', '-1', '3e8#0#0#0');
INSERT INTO `items` VALUES ('372', '7799', '1', '-1', '3b5#0#0#0');
INSERT INTO `items` VALUES ('373', '1182', '2', '-1', '6e#b#14#0#1d10+10,3e9#0#0#0');
INSERT INTO `items` VALUES ('375', '7775', '1', '-1', '32c#0#64#0');
INSERT INTO `items` VALUES ('376', '7774', '1', '-1', '');
INSERT INTO `items` VALUES ('377', '8010', '1', '-1', '');
INSERT INTO `items` VALUES ('379', '8010', '1', '-1', '3b3#0#0#0');
INSERT INTO `items` VALUES ('381', '1182', '1', '-1', '6e#b#14#0#1d10+10,3e9#0#0#mysecondscript.js');
INSERT INTO `items` VALUES ('385', '2473', '1', '-1', '76#0#1#0#0d0+1,77#0#1#0#0d0+1,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#2#0#0d0+2');
INSERT INTO `items` VALUES ('386', '2473', '1', '-1', '76#0#1#0#0d0+1,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#1#0#0d0+1,7e#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('387', '2473', '1', '-1', '76#0#1#0#0d0+1,77#0#2#0#0d0+2,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('388', '2473', '1', '-1', '76#0#1#0#0d0+1,77#0#1#0#0d0+1,7b#0#2#0#0d0+2,7c#0#2#0#0d0+2,7e#0#2#0#0d0+2');
INSERT INTO `items` VALUES ('389', '7590', '1', '-1', '');
INSERT INTO `items` VALUES ('390', '7591', '1', '-1', '');
INSERT INTO `items` VALUES ('391', '7591', '1', '-1', '');
INSERT INTO `items` VALUES ('392', '7591', '1', '-1', '');
INSERT INTO `items` VALUES ('393', '7591', '11', '-1', '32c#0#10e#10e');
INSERT INTO `items` VALUES ('395', '7590', '1', '-1', '32c#0#64#0');
INSERT INTO `items` VALUES ('397', '1697', '1', '7', '9e#0#53#0#0d0+83');
INSERT INTO `items` VALUES ('398', '7888', '1', '-1', '7d#0#7b#0#0d0+123,9d#0#2c#0#0d0+44,9b#0#32#0#0d0+50,9a#0#41#0#0d0+65,98#0#30#0#0d0+48,70#0#6#0#0d0+6,9e#0#16a#0#0d0+362,d3#0#4#0#0d0+4,d2#0#4#0#0d0+4');
INSERT INTO `items` VALUES ('399', '6981', '1', '-1', '64#8#d#0#1d6+7,62#8#d#0#1d6+7,80#0#1#0#0d0+1,76#0#21#0#0d0+33,7d#0#eb#0#0d0+235,77#0#2b#0#0d0+43,e1#0#13#0#0d0+19,e2#0#12#0#0d0+18,ae#0#12c#0#0d0+300,70#0#a#0#0d0+10');
INSERT INTO `items` VALUES ('400', '1183', '1', '-1', '6e#15#28#0#1d20+20,3e9#0#0#floodscript.js');
INSERT INTO `items` VALUES ('401', '1183', '1', '-1', '6e#15#28#0#1d20+20,3e9#0#0#floodscript.js');
INSERT INTO `items` VALUES ('402', '1183', '1', '-1', '6e#15#28#0#1d20+20,3e9#0#0#floodscript.js');
INSERT INTO `items` VALUES ('405', '1183', '1', '-1', '6e#15#28#0#1d20+20,3e9#0#0#floodscript.js');
INSERT INTO `items` VALUES ('406', '1183', '1', '-1', '6e#15#28#0#1d20+20,3e9#0#0#floodscript.js');
INSERT INTO `items` VALUES ('407', '1183', '1', '-1', '6e#15#28#0#1d20+20,3e9#0#0#floodscript.js');
INSERT INTO `items` VALUES ('408', '1183', '1', '-1', '6e#15#28#0#1d20+20,3e9#0#0#floodscript.js');
INSERT INTO `items` VALUES ('409', '1183', '1', '-1', '6e#15#28#0#1d20+20,3e9#0#0#floodscript.js');
INSERT INTO `items` VALUES ('411', '1183', '1', '-1', '6e#15#28#0#1d20+20,3e9#0#0#floodscript.js');
INSERT INTO `items` VALUES ('412', '1183', '1', '-1', '6e#0#0#0#0d0+0,3e9#0#0#0');
INSERT INTO `items` VALUES ('413', '8990', '1', '-1', '201#0#0#0,96#0#0#0');
INSERT INTO `items` VALUES ('414', '2473', '1', '7', '76#0#1#0#0d0+1,77#0#2#0#0d0+2,7b#0#2#0#0d0+2,7c#0#2#0#0d0+2,7e#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('415', '2474', '1', '-1', '76#0#2#0#0d0+2,77#0#2#0#0d0+2,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('416', '2475', '1', '4', '76#0#1#0#0d0+1,77#0#1#0#0d0+1,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#0#0#0d0+0');
INSERT INTO `items` VALUES ('417', '2476', '1', '5', '76#0#2#0#0d0+2,77#0#2#0#0d0+2,7b#0#1#0#0d0+1,7c#0#2#0#0d0+2,7e#0#0#0#0d0+0');
INSERT INTO `items` VALUES ('418', '2477', '1', '3', '76#0#1#0#0d0+1,77#0#2#0#0d0+2,7b#0#1#0#0d0+1,7c#0#2#0#0d0+2,7e#0#0#0#0d0+0');
INSERT INTO `items` VALUES ('419', '2478', '1', '0', '7c#0#2#0#0d0+2,76#0#2#0#0d0+2,7e#0#0#0#0d0+0,7b#0#1#0#0d0+1,77#0#2#0#0d0+2');
INSERT INTO `items` VALUES ('420', '2474', '1', '6', '76#0#2#0#0d0+2,77#0#2#0#0d0+2,7b#0#1#0#0d0+1,7c#0#1#0#0d0+1,7e#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('421', '1182', '1', '-1', '6e#0#0#0,3e9#0#0#mysecondscript.js');
INSERT INTO `items` VALUES ('422', '1182', '1', '-1', '6e#b#14#0#1d10+10,3e9#0#0#0');
INSERT INTO `items` VALUES ('426', '7601', '1', '-1', '');
INSERT INTO `items` VALUES ('427', '7603', '1', '-1', '60#5#a#0#1d6+4');
INSERT INTO `items` VALUES ('428', '7603', '1', '-1', '60#5#a#0#1d6+4');
INSERT INTO `items` VALUES ('429', '7603', '10', '-1', '60#5#a#0#1d6+4');
INSERT INTO `items` VALUES ('430', '7603', '10', '-1', '60#5#a#0#1d6+4');
INSERT INTO `items` VALUES ('431', '7603', '10', '-1', '60#5#a#0#1d6+4');
INSERT INTO `items` VALUES ('432', '7603', '6', '-1', '60#5#a#0#1d6+4');
INSERT INTO `items` VALUES ('433', '7603', '5', '35', '60#5#a#0#1d6+4');
INSERT INTO `items` VALUES ('437', '1819', '1', '-1', '6e#0#64#0#0d0+100');
INSERT INTO `items` VALUES ('438', '1819', '7', '-1', '6e#0#64#0#0d0+100');
INSERT INTO `items` VALUES ('443', '9182', '1', '-1', '7b#0#32#0#0d0+50,7e#0#32#0#0d0+50,7d#0#fa#0#0d0+250,7c#0#1e#0#0d0+30,b0#0#a#0#0d0+10,70#0#a#0#0d0+10,b2#0#a#0#0d0+10,b6#0#2#0#0d0+2,d6#0#a#0#0d0+10,80#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('444', '1182', '1', '-1', '6e#b#14#0#1d10+10');
INSERT INTO `items` VALUES ('445', '2474', '1', '6', '');
INSERT INTO `items` VALUES ('446', '7604', '3', '-1', '');
INSERT INTO `items` VALUES ('451', '7609', '4', '-1', '195#0#0#allo');
INSERT INTO `items` VALUES ('453', '2475', '1', '4', '');
INSERT INTO `items` VALUES ('455', '526', '1', '-1', '6e#0#64#0#0d0+100');
INSERT INTO `items` VALUES ('457', '526', '1', '-1', '6e#0#64#0#0d0+100');
INSERT INTO `items` VALUES ('458', '526', '1', '-1', '6e#0#64#0#0d0+100');
INSERT INTO `items` VALUES ('461', '8145', '1', '-1', '');
INSERT INTO `items` VALUES ('464', '2088', '1', '-1', '6e#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('465', '2088', '3', '-1', '6e#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('466', '9811', '1', '-1', '');
INSERT INTO `items` VALUES ('468', '8911', '1', '-1', '');
INSERT INTO `items` VALUES ('470', '8911', '1001', '-1', '');
INSERT INTO `items` VALUES ('471', '8911', '1001', '-1', '');
INSERT INTO `items` VALUES ('472', '8911', '1001', '-1', '');
INSERT INTO `items` VALUES ('473', '8911', '998', '-1', '');
INSERT INTO `items` VALUES ('474', '2529', '4', '-1', '2be#0#0#0');
INSERT INTO `items` VALUES ('475', '2529', '4', '-1', '2be#0#0#9');
INSERT INTO `items` VALUES ('476', '15002', '4', '-1', '2be#0#0#9');
INSERT INTO `items` VALUES ('477', '7698', '1', '-1', '32c#0#1388#0');
INSERT INTO `items` VALUES ('478', '7604', '4', '-1', '32c#0#0#10e');
INSERT INTO `items` VALUES ('479', '7618', '1', '-1', '32c#0#10e#10e');
INSERT INTO `items` VALUES ('482', '7602', '1', '-1', '3a8#0#1#0,3b4#0#1#0,32c#0#258#0');
INSERT INTO `items` VALUES ('483', '39', '1', '-1', '7e#0#2#0#0d0+2,64#1#7#0#1d7+0');
INSERT INTO `items` VALUES ('484', '0', '1', '-1', '7e#0#2#0#0d0+2');
INSERT INTO `items` VALUES ('485', '39', '2', '-1', '7e#0#2#0#0d0+2,64#1#7#0#1d7+0');
INSERT INTO `items` VALUES ('487', '0', '17', '-1', '7e#0#2#0#0d0+2');
INSERT INTO `items` VALUES ('490', '39', '3', '-1', '7e#0#2#0#0d0+2');
INSERT INTO `items` VALUES ('491', '39', '2', '-1', '7e#0#2#0#0d0+2,64#2#8#0#1d7+1');
INSERT INTO `items` VALUES ('492', '2411', '1', '-1', '7e#0#8#0#0d0+8,76#0#23#0#0d0+35');
INSERT INTO `items` VALUES ('493', '2414', '2', '-1', 'ae#0#85#0#0d0+133,6e#1#32#0#1d50+0');
INSERT INTO `items` VALUES ('494', '2416', '2', '-1', '61#4#8#0#1d5+3,63#4#8#0#1d5+3,b6#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('495', '2419', '2', '-1', '6e#1#1e#0#1d30+0');
INSERT INTO `items` VALUES ('496', '2422', '2', '-1', '8a#0#a#0#0d0+10,6e#1#23#0#1d35+0');
INSERT INTO `items` VALUES ('497', '2425', '2', '-1', '76#0#4#0#0d0+4,7e#0#3#0#0d0+3');
INSERT INTO `items` VALUES ('498', '2428', '2', '-1', '9e#0#112#0#0d0+274');
INSERT INTO `items` VALUES ('499', '2416', '1', '1', '61#4#8#0#1d5+3,63#4#8#0#1d5+3,b6#0#1#0#0d0+1');
INSERT INTO `items` VALUES ('500', '2428', '1', '3', '9e#0#112#0#0d0+274');
INSERT INTO `items` VALUES ('501', '2425', '1', '0', '76#0#4#0#0d0+4,7e#0#3#0#0d0+3');
INSERT INTO `items` VALUES ('503', '2411', '1', '6', '7e#0#8#0#0d0+8,76#0#23#0#0d0+35');
INSERT INTO `items` VALUES ('505', '2419', '1', '4', '6e#1#1e#0#1d30+0');
INSERT INTO `items` VALUES ('507', '2422', '1', '5', '8a#0#a#0#0d0+10,6e#1#23#0#1d35+0');
INSERT INTO `items` VALUES ('508', '2414', '1', '7', 'ae#0#85#0#0d0+133,6e#1#32#0#1d50+0');
INSERT INTO `items` VALUES ('509', '1182', '10', '-1', '6e#b#14#0#1d10+10');
INSERT INTO `items` VALUES ('510', '7174', '1', '-1', '7d#0#c#0#0d0+12');
INSERT INTO `items` VALUES ('511', '2419', '2', '-1', '7d#0#4#0#0d0+4');
INSERT INTO `items` VALUES ('512', '2477', '1', '-1', '');
INSERT INTO `items` VALUES ('513', '39', '1', '-1', '7e#0#2#0#0d0+2,64#1#7#0#1d7+0');
INSERT INTO `items` VALUES ('514', '2411', '1', '6', '7e#0#8#0#0d0+8,76#0#23#0#0d0+35');
INSERT INTO `items` VALUES ('515', '39', '1', '0', '7e#0#2#0#0d0+2');

-- ----------------------------
-- Table structure for `item_sets`
-- ----------------------------
DROP TABLE IF EXISTS `item_sets`;
CREATE TABLE `item_sets` (
  `ID` smallint(11) NOT NULL DEFAULT '0',
  `name` varchar(150) NOT NULL,
  `items` text NOT NULL,
  `bonus` text NOT NULL COMMENT 'bonus2items1,bonus2items2;bonus3items1,bonus3items2',
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AVG_ROW_LENGTH=61;

-- ----------------------------
-- Records of item_sets
-- ----------------------------

-- ----------------------------
-- Table structure for `item_templates`
-- ----------------------------
DROP TABLE IF EXISTS `item_templates`;
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

-- ----------------------------
-- Records of item_templates
-- ----------------------------
INSERT INTO `item_templates` VALUES ('15001', 'nonameItem', '0', '12', '1', '1', '-1', '', '3e8#b#14#0#1d10+10', '1', '1', '1', '1', '1', '1', '', '1');
INSERT INTO `item_templates` VALUES ('15002', 'testdurabilite', '0', '12', '1', '1', '0', '', '2be#1#3#9#1d3+7', '1', '1', '1', '1', '0', '1', '', '1');

-- ----------------------------
-- Table structure for `macros`
-- ----------------------------
DROP TABLE IF EXISTS `macros`;
CREATE TABLE `macros` (
  `name` varchar(15) NOT NULL DEFAULT 'EpicMacro' COMMENT 'Nom du macro utilisé communément dans les affichages, commandes, etc.',
  `fileName` varchar(15) NOT NULL DEFAULT 'MonMacro.macro' COMMENT 'Nom du fichier du macro suivit de son extension (Ex: grozilla.macro)',
  `url` varchar(200) NOT NULL DEFAULT 'http://www.google.com' COMMENT 'IP ou lien vers le dossier contenant le macro (Ex: http://google.com/) Obligé d''avoir le "http://" si tu veux charger le macro à partir d''un url externe.',
  `version` varchar(10) NOT NULL,
  `description` text NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of macros
-- ----------------------------

-- ----------------------------
-- Table structure for `maps`
-- ----------------------------
DROP TABLE IF EXISTS `maps`;
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

-- ----------------------------
-- Records of maps
-- ----------------------------

-- ----------------------------
-- Table structure for `monsters`
-- ----------------------------
DROP TABLE IF EXISTS `monsters`;
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

-- ----------------------------
-- Records of monsters
-- ----------------------------
INSERT INTO `monsters` VALUES ('34', 'Larve Verte', '10', '', '', '-1;-1;-1', ',2c0,,,', '0', '0');
INSERT INTO `monsters` VALUES ('36', 'Bouftou', '1154', '', '', '-1;-1;-1', '', '0', '0');

-- ----------------------------
-- Table structure for `monsters_groups`
-- ----------------------------
DROP TABLE IF EXISTS `monsters_groups`;
CREATE TABLE `monsters_groups` (
  `ID` smallint(11) NOT NULL DEFAULT '1',
  `monsters` varchar(250) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of monsters_groups
-- ----------------------------

-- ----------------------------
-- Table structure for `monsters_groups_instances`
-- ----------------------------
DROP TABLE IF EXISTS `monsters_groups_instances`;
CREATE TABLE `monsters_groups_instances` (
  `ID` smallint(11) NOT NULL DEFAULT '1',
  `monsters` varchar(250) NOT NULL,
  `mapID` smallint(11) NOT NULL DEFAULT '0',
  `cellID` smallint(11) NOT NULL DEFAULT '250',
  `orientation` tinyint(11) NOT NULL DEFAULT '1',
  `drops` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of monsters_groups_instances
-- ----------------------------
INSERT INTO `monsters_groups_instances` VALUES ('1', '340', '1155', '250', '1', '');
INSERT INTO `monsters_groups_instances` VALUES ('2', '360', '1155', '95', '1', '');

-- ----------------------------
-- Table structure for `monsters_statistiques`
-- ----------------------------
DROP TABLE IF EXISTS `monsters_statistiques`;
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

-- ----------------------------
-- Records of monsters_statistiques
-- ----------------------------
INSERT INTO `monsters_statistiques` VALUES ('340', '1', '6', '3', '50', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO `monsters_statistiques` VALUES ('360', '1', '6', '3', '50', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');

-- ----------------------------
-- Table structure for `official_maps_supplementaries`
-- ----------------------------
DROP TABLE IF EXISTS `official_maps_supplementaries`;
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

-- ----------------------------
-- Records of official_maps_supplementaries
-- ----------------------------

-- ----------------------------
-- Table structure for `personnages`
-- ----------------------------
DROP TABLE IF EXISTS `personnages`;
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

-- ----------------------------
-- Records of personnages
-- ----------------------------
INSERT INTO `personnages` VALUES ('5', 'Testmap', '', '8', '-1', '-1', '-1', '0', '0', '1770', '341', 'i*#$%!:?p', '445,408,318,28,27,26,25,23,22', '', '0,1', '0');
INSERT INTO `personnages` VALUES ('6', 'Teststats', '', '2', '-1', '-1', '-1', '0', '0', '7411', '315', 'i*#$%!:?p', '36,37,38,39,40,41,42', '', '0,1', '0');
INSERT INTO `personnages` VALUES ('32', 'Unh', '', '3', '-1', '-1', '-1', '0', '0', '7411', '379', 'i%:?!#$p*', '466,473', '', '0,1', '0');
INSERT INTO `personnages` VALUES ('36', 'Taker', '', '11', '-1', '-1', '-1', '0', '0', '7411', '343', 'i*#$%!:?p', '261,260,259,258,257,256,255', '181~1~1;182~1~2;184~1~-184;183~1~3;190~1~-190;189~1~-189;192~1~-192;191~1~-191;186~1~-186;185~1~-185;415~1~13;188~1~-188;187~1~-187;195~1~-195;196~1~-196;193~1~-193;194~1~-194;199~1~-199;200~1~-200;197~1~-197;198~1~-198;415~1~-415', '0,1', '0');
INSERT INTO `personnages` VALUES ('37', 'Leo', '', '10', '-1', '-1', '-1', '0', '2054975000', '7411', '340', '*i:!%?#$p', '491,490,479,478,475,474,444,443,442,433,412,399,398,397,395,393,392,380,379,376,375,373,372,370,369,368,365,355,352,347,343,341,340,339,338,337,336,335,334,330,329,328,327,326,325,324,320,307,302,301,299,298,297,294,293,292,291,290,289,270,268', '183~6~1;191~1~2;194~6~3;195~6~4;181~1~5;196~6~6;415~6~7;193~6~8;182~6~9;189~6~10;190~1~11;187~1~12;184~6~13;184~1~14;195~1~-195;196~1~-196;193~6~-193;194~1~-194;199~1~-199;200~1~-200;197~1~-197;198~1~-198;6~1~-6;182~1~-182;181~1~-181;184~6~-184;190~6~-190;189~6~-189;192~1~-192;191~6~-191;186~1~-186;185~1~-185;188~1~-188;187~5~-187', '0,1', '0');
INSERT INTO `personnages` VALUES ('39', 'Tips', '', '5', '-1', '-1', '-1', '0', '0', '7411', '436', 'i*#$%!:?p', '287,286,285,284,283,282,281', '181~1~1;182~1~2;183~1~3;184~1~-184;185~1~-185;186~1~-186;187~1~-187;188~1~-188;189~1~-189;190~1~-190;191~1~-191;192~1~-192;193~1~-193;194~1~-194;195~1~-195;196~1~-196;197~1~-197;198~1~-198;199~1~-199;200~1~-200;415~1~-415', '0,1', '0');
INSERT INTO `personnages` VALUES ('40', 'Potion', '', '4', '-1', '-1', '-1', '0', '0', '10280', '437', 'i*#$%!:?p', '421,420,419,418,417,416,415,414,413', '', '0,1', '0');
INSERT INTO `personnages` VALUES ('41', 'Eca', '', '6', '-1', '-1', '-1', '0', '22385000', '7411', '315', 'i*#$%!:?p', '498,497,496,495,494,493,492', '61~1~1;62~1~2;63~1~3;102~1~-102;110~1~-110', '0', '0');
INSERT INTO `personnages` VALUES ('42', 'Feca', '', '1', '16777215', '-1', '-1', '0', '0', '7411', '341', 'i*#$%!:?p', '', '1~1~1;2~1~2;6~1~-6;3~1~3', '0', '0');
INSERT INTO `personnages` VALUES ('43', 'Kiqirekesoneq', '', '3', '-1', '-1', '-1', '0', '0', '7411', '314', 'i*#$%!:?p', '', '41~1~1;43~1~2;51~1~3', '0', '0');

-- ----------------------------
-- Table structure for `plugins`
-- ----------------------------
DROP TABLE IF EXISTS `plugins`;
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

-- ----------------------------
-- Records of plugins
-- ----------------------------

-- ----------------------------
-- Table structure for `scripts`
-- ----------------------------
DROP TABLE IF EXISTS `scripts`;
CREATE TABLE `scripts` (
  `ID` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
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
  PRIMARY KEY (`ID`,`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of scripts
-- ----------------------------
INSERT INTO `scripts` VALUES ('1', 'Exit', 'exit.js', 'Syn_scripts/js/', 'exe', '0', 'false', 'false', 'HOURS', '1', '10', '0.0.1', 'Script pour faire System.exit(0);');
INSERT INTO `scripts` VALUES ('2', 'Pubs', 'pub.js', 'Syn_scripts/js/', 'exe', 'Bonjour|FF0000', 'false', 'true', 'SECONDS', '30', '15', '0.0.1', 'Script qui envoie des msg de ');

-- ----------------------------
-- Table structure for `spells`
-- ----------------------------
DROP TABLE IF EXISTS `spells`;
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

-- ----------------------------
-- Records of spells
-- ----------------------------

-- ----------------------------
-- Table structure for `titles`
-- ----------------------------
DROP TABLE IF EXISTS `titles`;
CREATE TABLE `titles` (
  `ID` int(11) NOT NULL,
  `name` text NOT NULL,
  `color` text NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of titles
-- ----------------------------
