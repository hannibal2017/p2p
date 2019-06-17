DROP  DATABASE if EXISTS `cloudDB01`;
CREATE DATABASE cloudDB01 CHARACTER SET utf8;
USE cloudDB01;
CREATE TABLE `dept` (
  `deptno` BIGINT NOT NULL AUTO_INCREMENT,
  `dname` varchar(20) NOT NULL,
  `db_source` varchar(255) NOT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

INSERT into dept(dname,db_source) VALUES ('开发部',DATABASE());
INSERT into dept(dname,db_source) VALUES ('人事部',DATABASE());
INSERT into dept(dname,db_source) VALUES ('业务部',DATABASE());
INSERT into dept(dname,db_source) VALUES ('运营部',DATABASE());

DROP  DATABASE if EXISTS `cloudDB03`;
CREATE DATABASE cloudDB03 CHARACTER SET utf8;
USE cloudDB03;
CREATE TABLE `dept` (
  `deptno` BIGINT NOT NULL AUTO_INCREMENT,
  `dname` varchar(20) NOT NULL,
  `db_source` varchar(255) NOT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;