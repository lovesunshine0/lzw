/*
Navicat MySQL Data Transfer

Source Server         : gejigang
Source Server Version : 50639
Source Host           : 127.0.0.1:3306
Source Database       : course

Target Server Type    : MYSQL
Target Server Version : 50639
File Encoding         : 65001

Date: 2018-04-07 22:41:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bill
-- ----------------------------
DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill` (
  `id` int(11) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `userid` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `isback` int(1) DEFAULT NULL COMMENT '是否撤销',
  `isvalid` int(1) DEFAULT NULL COMMENT '是否有效',
  `createtime` datetime DEFAULT NULL,
  `createuser` int(11) DEFAULT NULL,
  `courseid` int(11) DEFAULT NULL COMMENT '课程id',
  `paytype` int(11) NOT NULL COMMENT '支付类型 1微信2支付宝',
  `updatetime` datetime DEFAULT NULL,
  `updateuser` int(11) DEFAULT NULL,
  `timestamp` varchar(30) DEFAULT NULL,
  `isconsume` int(11) DEFAULT NULL COMMENT '1消费,2充值',
  `usertype` int(11) DEFAULT NULL COMMENT '1学生,2老师,3机构.4系统管理员',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账单信息表';

-- ----------------------------
-- Table structure for coupon
-- ----------------------------
DROP TABLE IF EXISTS `coupon`;
CREATE TABLE `coupon` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `courseid` int(11) DEFAULT NULL,
  `validitytime` datetime NOT NULL,
  `isvalid` int(11) DEFAULT NULL,
  `count` int(11) NOT NULL,
  `organization` int(11) DEFAULT NULL,
  `introduction` varchar(255) DEFAULT NULL,
  `timestamp` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='优惠券信息表';

-- ----------------------------
-- Table structure for courseinfo
-- ----------------------------
DROP TABLE IF EXISTS `courseinfo`;
CREATE TABLE `courseinfo` (
  `id` int(11) NOT NULL,
  `code` varchar(255) DEFAULT NULL COMMENT '编码',
  `title` varchar(255) DEFAULT NULL COMMENT '课程标题',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `updatetime` datetime DEFAULT NULL COMMENT '更新时间',
  `createuser` int(11) DEFAULT NULL COMMENT '创建用户',
  `updateuser` int(11) DEFAULT NULL COMMENT '更新用户',
  `introduction` varchar(255) DEFAULT NULL COMMENT '简介',
  `organizationid` varchar(255) DEFAULT NULL COMMENT '组织',
  `categoryid` varchar(255) DEFAULT NULL COMMENT '课程类别',
  `starttime` datetime DEFAULT NULL COMMENT '课程开始时间',
  `endtime` datetime DEFAULT NULL COMMENT '课程结束时间',
  `phone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `isvalid` int(1) DEFAULT NULL COMMENT '是否有效',
  `studentnum` int(10) DEFAULT NULL COMMENT '报名人数',
  `score` int(3) DEFAULT NULL COMMENT '评分',
  `qqgroup` varchar(20) DEFAULT NULL COMMENT 'QQ讨论群',
  `isfree` int(11) DEFAULT NULL COMMENT '是否免费',
  `charge` int(11) DEFAULT NULL COMMENT '收费金额',
  `parentid` int(11) DEFAULT NULL COMMENT '大课',
  `coursetype` varchar(1) DEFAULT NULL COMMENT '课程类型.1直播，2录像',
  `assessor` int(11) DEFAULT NULL COMMENT '审核人',
  `teacherid` int(11) DEFAULT NULL COMMENT '老师',
  `timestamp` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程信息表';

-- ----------------------------
-- Table structure for coursetype
-- ----------------------------
DROP TABLE IF EXISTS `coursetype`;
CREATE TABLE `coursetype` (
  `id` int(11) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `parentid` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程分类信息表';

-- ----------------------------
-- Table structure for organization
-- ----------------------------
DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization` (
  `id` int(11) NOT NULL,
  `code` varchar(20) DEFAULT NULL COMMENT '编号',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `introduction` varchar(255) DEFAULT NULL COMMENT '介绍',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `businesscode` varchar(100) DEFAULT NULL COMMENT '工商执照编号',
  `experience` varchar(255) DEFAULT NULL,
  `experience1` varchar(255) DEFAULT NULL,
  `experience2` varchar(255) DEFAULT NULL,
  `experience3` varchar(255) DEFAULT NULL,
  `experience4` varchar(255) DEFAULT NULL,
  `experience5` varchar(255) DEFAULT NULL,
  `experience6` varchar(255) DEFAULT NULL,
  `experience7` varchar(255) DEFAULT NULL,
  `isvalid` int(1) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `qq` varchar(20) DEFAULT NULL,
  `qqgroup` varchar(20) DEFAULT NULL COMMENT 'qq群',
  `photo` varchar(255) DEFAULT NULL COMMENT '图片路径',
  `link` varchar(255) DEFAULT NULL COMMENT '链接',
  `studentnum` int(11) DEFAULT NULL COMMENT '学生人数',
  `teachernum` int(11) DEFAULT NULL COMMENT '老师人数',
  `score` int(11) DEFAULT NULL COMMENT '评分',
  `assessor` int(11) DEFAULT NULL COMMENT '审核人',
  `money` int(11) DEFAULT NULL COMMENT '收入',
  `timestamp` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学校(机构)信息表';

-- ----------------------------
-- Table structure for serialnum
-- ----------------------------
DROP TABLE IF EXISTS `serialnum`;
CREATE TABLE `serialnum` (
  `type` varchar(255) NOT NULL COMMENT '类型',
  `num` int(11) NOT NULL COMMENT '序列号',
  `timestamp` varchar(30) NOT NULL,
  PRIMARY KEY (`type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `education` varchar(255) DEFAULT NULL COMMENT '现在学历',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `updatetime` datetime DEFAULT NULL COMMENT '更新时间',
  `fathername` varchar(20) DEFAULT NULL COMMENT '父亲名字',
  `mothername` varchar(20) DEFAULT NULL COMMENT '母亲名字',
  `fatherphone` varchar(20) DEFAULT NULL COMMENT '父亲电话',
  `motherphone` varchar(20) DEFAULT NULL COMMENT '母亲电话',
  `photo` varchar(20) DEFAULT NULL COMMENT '照片路径',
  `wechat` varchar(20) DEFAULT NULL COMMENT '微信',
  `qq` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `code` varchar(10) DEFAULT NULL COMMENT '密码',
  `score` int(11) DEFAULT NULL COMMENT '积分',
  `money` int(11) DEFAULT NULL COMMENT '剩余金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生信息表';

-- ----------------------------
-- Table structure for studentbuycourse
-- ----------------------------
DROP TABLE IF EXISTS `studentbuycourse`;
CREATE TABLE `studentbuycourse` (
  `studentid` int(11) NOT NULL,
  `courseid` int(11) NOT NULL,
  `score` int(3) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `timechart` int(3) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `couponid` int(11) DEFAULT NULL COMMENT '优惠券id',
  `money` int(11) DEFAULT NULL COMMENT '付钱',
  `paytype` int(11) DEFAULT NULL COMMENT '支付方式',
  `timestamp` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生已经购买课程表';

-- ----------------------------
-- Table structure for studentcoupon
-- ----------------------------
DROP TABLE IF EXISTS `studentcoupon`;
CREATE TABLE `studentcoupon` (
  `studentid` int(11) NOT NULL,
  `couponid` int(11) NOT NULL,
  `isvalid` int(11) NOT NULL,
  `timestamp` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生拥有优惠券信息表';

-- ----------------------------
-- Table structure for studentfollowcourse
-- ----------------------------
DROP TABLE IF EXISTS `studentfollowcourse`;
CREATE TABLE `studentfollowcourse` (
  `studentid` int(11) NOT NULL COMMENT '学生id',
  `courseid` int(11) NOT NULL COMMENT '大课id',
  `remark` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL COMMENT '评论',
  `score` int(3) DEFAULT NULL COMMENT '评分',
  `follow` int(1) DEFAULT NULL COMMENT '是否关注老师',
  `timestamp` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生关注课程信息列表';

-- ----------------------------
-- Table structure for studentfolloworganization
-- ----------------------------
DROP TABLE IF EXISTS `studentfolloworganization`;
CREATE TABLE `studentfolloworganization` (
  `studentid` int(11) NOT NULL COMMENT '学生id',
  `organizationid` int(11) NOT NULL COMMENT '机构id',
  `remark` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL COMMENT '评论',
  `score` int(3) DEFAULT NULL COMMENT '评分',
  `follow` int(1) DEFAULT NULL COMMENT '是否关注老师',
  `timestamp` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生关注学习(机构信息列表)';

-- ----------------------------
-- Table structure for studentfollowteacher
-- ----------------------------
DROP TABLE IF EXISTS `studentfollowteacher`;
CREATE TABLE `studentfollowteacher` (
  `studentid` int(11) NOT NULL COMMENT '学生id',
  `teacherid` int(11) NOT NULL COMMENT '老师id',
  `remark` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL COMMENT '评论',
  `score` int(3) DEFAULT NULL COMMENT '评分',
  `follow` int(1) DEFAULT NULL COMMENT '是否关注老师',
  `timestamp` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生关注老师信息列表';

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `education` varchar(255) DEFAULT NULL COMMENT '教育经历',
  `experience` varchar(255) DEFAULT NULL COMMENT '工作经历',
  `introduction` varchar(255) DEFAULT NULL COMMENT '自我介绍',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `identificationcard` varchar(20) DEFAULT NULL COMMENT '身份证',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话1',
  `phone2` varchar(20) DEFAULT NULL COMMENT '电话2',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `isvalid` int(1) DEFAULT NULL COMMENT '是否有效',
  `education1` varchar(255) DEFAULT NULL,
  `education2` varchar(255) DEFAULT NULL,
  `education3` varchar(255) DEFAULT NULL,
  `education4` varchar(255) DEFAULT NULL,
  `education5` varchar(255) DEFAULT NULL,
  `education6` varchar(255) DEFAULT NULL,
  `education7` varchar(255) DEFAULT NULL,
  `experience1` varchar(255) DEFAULT NULL,
  `experience2` varchar(255) DEFAULT NULL,
  `experience3` varchar(255) DEFAULT NULL,
  `experience4` varchar(255) DEFAULT NULL,
  `experience5` varchar(255) DEFAULT NULL,
  `experience6` varchar(255) DEFAULT NULL,
  `experience7` varchar(255) DEFAULT NULL,
  `fulltime` int(1) DEFAULT NULL COMMENT '是否全职',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `updatetime` datetime DEFAULT NULL COMMENT '更新时间',
  `photo` varchar(255) DEFAULT NULL COMMENT '照片路径',
  `wechat` varchar(20) DEFAULT NULL COMMENT '微信',
  `qq` varchar(20) DEFAULT NULL,
  `qqgroup` varchar(20) DEFAULT NULL,
  `blog` varchar(255) DEFAULT NULL COMMENT '博客路径',
  `password` varchar(20) DEFAULT NULL COMMENT '密码',
  `code` varchar(10) DEFAULT NULL COMMENT '编号',
  `organizationid` int(11) DEFAULT NULL COMMENT '机构id',
  `assessor` int(11) DEFAULT NULL COMMENT '审核人',
  `money` int(11) DEFAULT NULL COMMENT '收入',
  `timestamp` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='老师信息表';

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `roleid` int(11) DEFAULT NULL COMMENT '角色:1系统管理员，2机构管理员',
  `isvalid` int(11) DEFAULT NULL COMMENT '是否有效',
  `timestamp` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';
