/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : syn_global_wakfu

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2013-11-17 03:11:22
*/

SET FOREIGN_KEY_CHECKS=0;

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
INSERT INTO `plugins` VALUES ('Parsers', 'Syn_plugins/', 'ParsingPlugin.jar', 'pack.ParsingMain', 'true', '0.0.1', 'Plugin de parsing de packets');
INSERT INTO `plugins` VALUES ('Providers', 'Syn_plugins/', 'ProvidersPlugin.jar', 'pack.ProvidingMain', 'true', '0.01', 'Plugin de providers. Permet d\'overrider les providers de base de l\'emu pour utiliser une classe du genre GMonsterOverrider extends GMonster au lieu de GMonster.');

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of scripts
-- ----------------------------
INSERT INTO `scripts` VALUES ('1', 'TestParser', 'parser.js', 'Syn_scripts/js/test/wakfu/parsers/', 'parse', '', 'false', 'false', 'HOURS', '0', '0', '0.0.1', '');
