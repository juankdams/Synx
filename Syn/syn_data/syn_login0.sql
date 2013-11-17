/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : syn_login0

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2013-11-17 03:11:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `accounts`
-- ----------------------------
DROP TABLE IF EXISTS `accounts`;
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

-- ----------------------------
-- Records of accounts
-- ----------------------------
INSERT INTO `accounts` VALUES ('1', 'robynz', 'z', 'Crystal', 'q', 'q', '10', '0', '127.0.0.1', '', '12343245345876', '1', '32,1;37,1;39,1;40,1;43,1', '', '0', '0', '0');
INSERT INTO `accounts` VALUES ('2', 'robynzz', 'z', 'Crystall', 'q', 'q', '10', '0', '127.0.0.1', '', '12334324345876', '0', '5,1;41,1;42,1', '', '0', '0', '0');
INSERT INTO `accounts` VALUES ('3', 'robynzzz', 'z', 'Crystalll', 'q', 'q', '10', '0', '127.0.0.1', '', '23343245345876', '0', '36,1', '3,', '0', '0', '0');
INSERT INTO `accounts` VALUES ('4', 'test', 'test', 'Testeur', 'q', 'q', '0', '0', '127.0.0.1', '', '12343245345876', '0', '43,1', '', '', '', '');
INSERT INTO `accounts` VALUES ('5', '1', '1', 'Test1', 'q', 'q', '10', '0', '127.0.0.1', '', '12343245345876', '0', '', '', '', '', '');

-- ----------------------------
-- Table structure for `game_servers`
-- ----------------------------
DROP TABLE IF EXISTS `game_servers`;
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

-- ----------------------------
-- Records of game_servers
-- ----------------------------
INSERT INTO `game_servers` VALUES ('1', 'Jiva', '127.0.0.1', '5555', 'true', 'syn_world0', 'root', '', '127.0.0.1', '0', '0', 'fr');

-- ----------------------------
-- Table structure for `gifts`
-- ----------------------------
DROP TABLE IF EXISTS `gifts`;
CREATE TABLE `gifts` (
  `ID` int(11) NOT NULL DEFAULT '1',
  `type` int(11) NOT NULL,
  `title` varchar(255) DEFAULT '',
  `desc` varchar(255) DEFAULT '',
  `gfxURL` varchar(255) DEFAULT NULL,
  `items` varchar(255) DEFAULT '',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of gifts
-- ----------------------------
INSERT INTO `gifts` VALUES ('1', '2', 'HelloTitle', 'ByeDesc', '5', '1182,230;1183,1;8990,2');
