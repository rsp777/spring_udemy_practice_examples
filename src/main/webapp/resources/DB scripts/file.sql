-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: localhost    Database: crm
-- ------------------------------------------------------
-- Server version	5.5.62

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
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(128) DEFAULT NULL,
  `instructor_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `TITLE_UNIQUE` (`title`),
  KEY `FK_INSTRUCTOR_idx` (`instructor_id`),
  CONSTRAINT `FK_INSTRUCTOR` FOREIGN KEY (`instructor_id`) REFERENCES `instructor` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'Java',1),(2,'',2),(3,'Machine Learning',2),(7,'fsdf',3),(8,'sdfsdf',4),(9,'sdfsdfsdf',3),(11,'sdfsdf1',6),(12,'sdadad',4),(13,'sdadad22',4),(14,'jhgj',7),(15,'asdada',8),(16,'[sdfsdf]',7),(17,'sdfsfsdf',6),(18,'[sdfsdf1, sdfsfsdf]',6),(19,'sdfsdfsfsdf',7),(20,'[fsdf, sdfsdfsdf]',3),(21,'jgjg',9),(22,'lklkl',10),(23,'etretete',11),(24,'khk',12),(25,'hkh',13),(27,'wer',15),(28,'dfgvjijghfdxcj',2),(29,'[wer]',15),(30,'sdf',16),(31,'GTA',16),(32,'[sdf, GTA, Rock on ]',16),(33,'gs',17),(34,'gs, asd',17),(35,'asddd',17);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `instructor`
--

DROP TABLE IF EXISTS `instructor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `instructor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(128) DEFAULT NULL,
  `last_name` varchar(128) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `instructor_dtl_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_DETAIL_idx` (`instructor_dtl_id`),
  CONSTRAINT `FK_DETAIL` FOREIGN KEY (`instructor_dtl_id`) REFERENCES `instructor_dtl` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instructor`
--

LOCK TABLES `instructor` WRITE;
/*!40000 ALTER TABLE `instructor` DISABLE KEYS */;
INSERT INTO `instructor` VALUES (1,'Ravindra Singh','Pawar','raspawr006@gmail.com',1),(2,'Jarvis','Vision','jv@stark_industries.com',25),(3,'sdf','f','wddf',17),(6,'sdf','fwd','fwdg',15),(7,'gg','jjg','jhg',16),(9,'ggjg','jgj','gjg',18),(10,'ljhkl','kllk','klklk',19),(11,'etete','rtet','ete',20),(12,'ig','ukjh','kjhk',21),(13,'ii','hi','uhk',22),(15,'ii','hi','uhk',26),(17,'Ravinra','sdfg','sdfg',32);
/*!40000 ALTER TABLE `instructor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `instructor_dtl`
--

DROP TABLE IF EXISTS `instructor_dtl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `instructor_dtl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `youtube_channel` varchar(128) NOT NULL,
  `hobby` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instructor_dtl`
--

LOCK TABLES `instructor_dtl` WRITE;
/*!40000 ALTER TABLE `instructor_dtl` DISABLE KEYS */;
INSERT INTO `instructor_dtl` VALUES (1,'Tech','gaming'),(2,'Stark Expo',''),(3,'Stark Expo','Artificial Intelligence'),(4,'fdsf','ff'),(5,'',''),(6,'fdsf','ff'),(8,'',''),(9,'',''),(10,'',''),(11,'jhg','jg'),(12,'',''),(13,'jhg','jg'),(14,'',''),(15,'fqffsf','ffsd'),(16,'jhg','jg'),(17,'fdsf','ff'),(18,'jhgjhg','jgjhg'),(19,'lklk','lklk'),(20,'tret','ert'),(21,'hkj','jk'),(22,'hkh','k'),(24,'hkh','k'),(25,'Stark Expo','Artificial Intelligence'),(26,'hkh','k'),(27,'sdf','sdf'),(28,'Dish','Gaming'),(29,'Dish','Gaming'),(30,'efdsff','fs'),(31,'efdsff','fs'),(32,'efdsff','fs');
/*!40000 ALTER TABLE `instructor_dtl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `review` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(256) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_COURSE_ID_idx` (`course_id`),
  CONSTRAINT `FK_COURSE` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES (1,'Dumb course',20),(2,'jgjhgjg',21),(3,'klklkl',22),(4,'tretre',23),(5,'hkjhk',24),(6,'khkh',25),(7,'khkh',27),(8,'',28),(9,'DADASD',29),(10,'sdf',30),(11,'Very Good',31),(12,'',32),(13,'sdg',33),(14,'',34),(15,'',35);
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-06  9:09:28
