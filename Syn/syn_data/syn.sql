/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : syn

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2013-11-17 03:11:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `login_servers`
-- ----------------------------
DROP TABLE IF EXISTS `login_servers`;
CREATE TABLE `login_servers` (
  `loginID` tinyint(11) NOT NULL DEFAULT '1' COMMENT 'ID du login',
  `port` smallint(11) NOT NULL DEFAULT '668',
  `enableOnLoad` enum('false','true') NOT NULL DEFAULT 'true',
  `dbName` varchar(20) NOT NULL DEFAULT 'my_login_db' COMMENT 'Nom de la base de donnée de ce serveur.',
  `dbUser` varchar(20) NOT NULL DEFAULT 'user_name' COMMENT 'Nom de Compte pour accéder à la base de donnée de ce serveur.',
  `dbPass` varchar(20) NOT NULL DEFAULT 'user_pass' COMMENT 'Mot de passe du compte pour accéder à la base de donnée de ce serveur.',
  `dbIP` varchar(20) NOT NULL DEFAULT '127.0.0.1',
  `ownerUsers` varchar(20) NOT NULL DEFAULT '1',
  `gameClientStrategy` enum('DofusClientStrategy','WakfuClientStrategy') NOT NULL DEFAULT 'DofusClientStrategy',
  PRIMARY KEY (`loginID`,`port`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of login_servers
-- ----------------------------
INSERT INTO `login_servers` VALUES ('1', '668', 'true', 'syn_login0', 'root', '', '127.0.0.1', '1,2', 'DofusClientStrategy');
INSERT INTO `login_servers` VALUES ('2', '666', 'true', 'syn_login1wakfu', 'root', '', '127.0.0.1', '1,2', 'WakfuClientStrategy');

-- ----------------------------
-- Table structure for `tool_servers`
-- ----------------------------
DROP TABLE IF EXISTS `tool_servers`;
CREATE TABLE `tool_servers` (
  `ID` smallint(11) unsigned NOT NULL AUTO_INCREMENT,
  `port` smallint(11) unsigned NOT NULL DEFAULT '8000',
  `enableOnLoad` enum('false','true') NOT NULL DEFAULT 'true',
  PRIMARY KEY (`ID`,`port`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tool_servers
-- ----------------------------
INSERT INTO `tool_servers` VALUES ('1', '8000', 'true');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
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

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'r', 'ahellofaworld', '127.0.0.1', 'q?', 'q', '1');
INSERT INTO `users` VALUES ('2', 'keldy', 'enormorusrex', '%', 'q?', 'q', '1');
