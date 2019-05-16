/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50171
Source Host           : localhost:3306
Source Database       : luo

Target Server Type    : MYSQL
Target Server Version : 50171
File Encoding         : 65001

Date: 2018-12-27 13:57:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phone` varchar(20) NOT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `ide` varchar(255) DEFAULT NULL,
  `tradePassword` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123456', '123', null, null, null);
INSERT INTO `user` VALUES ('2', '111', '123', null, null, null);
INSERT INTO `user` VALUES ('3', '112', '123', null, null, null);
INSERT INTO `user` VALUES ('4', '7777', '777', null, null, null);
