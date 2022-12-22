-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: domainird
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_channel`
--

DROP TABLE IF EXISTS `tb_channel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_channel` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sid` int DEFAULT NULL,
  `ird_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9kgl8a4q2bbgermqiep9s6ibq` (`ird_id`)
) ENGINE=MyISAM AUTO_INCREMENT=169 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_channel`
--

LOCK TABLES `tb_channel` WRITE;
/*!40000 ALTER TABLE `tb_channel` DISABLE KEYS */;
INSERT INTO `tb_channel` VALUES (1,'Tv Brasil',7,NULL),(2,'Difusora',9,NULL),(3,'Tv Cidade',11,NULL),(4,'Tv Athenas',12,NULL),(5,'Tv São Luís',13,NULL),(6,'Tv WA',14,NULL),(7,'Tv Brasil 2',15,NULL),(8,'Tv UFMA',16,NULL),(9,'Tv Assembleia',17,NULL),(10,'Tv Camara',18,NULL),(11,'Mirante',19,NULL),(12,'Tv Maranhense',20,NULL),(13,'Tv Guara/Cultura',21,NULL),(14,'Tv Senado',22,NULL),(15,'Tv Justiça',23,NULL),(16,'Tv Escola',25,NULL),(17,'Canal Futura',26,NULL),(18,'Band News',27,NULL),(19,'Terra Viva',28,NULL),(20,'MTV Brasil',29,NULL),(21,'CNT',30,NULL),(22,'CNNI',31,NULL),(23,'Tv Cultura',32,NULL),(24,'TNT',33,NULL),(25,'AXN',34,NULL),(26,'ESPN 2',35,NULL),(27,'Star Channel',36,NULL),(28,'TNT Series',37,NULL),(29,'History',38,NULL),(30,'Discovery Kids',39,NULL),(31,'Cartoon Network',40,NULL),(32,'Nicklodeon',41,NULL),(33,'TBS',42,NULL),(34,'Natgeo',43,NULL),(35,'AMC',44,NULL),(36,'CNNE',45,NULL),(37,'Rede Vida',46,NULL),(38,'Tv Aparecida',47,NULL),(39,'Rede Mundial',48,NULL),(40,'Canção Nova',49,NULL),(41,'Tv Gênesis',50,NULL),(42,'Cine Brasil',51,NULL),(43,'Bloomberg',52,NULL),(44,'Band Sports',53,NULL),(45,'ESPN',54,NULL),(46,'Sony',55,NULL),(47,'Warner Channel',56,NULL),(48,'Fox News',57,NULL),(49,'DSC TCC',58,NULL),(50,'Mega Pix',59,NULL),(51,'TC Premium',60,NULL),(52,'TC Action',61,NULL),(53,'TC Touch',62,NULL),(54,'TC Fun',63,NULL),(55,'TC Pipoca',64,NULL),(56,'TC Cult',65,NULL),(57,'Paramount Channel',66,NULL),(58,'Studio Universal',67,NULL),(59,'Disney',68,NULL),(60,'TCM',69,NULL),(61,'LifeTime',70,NULL),(62,'History 2',71,NULL),(63,'Ratimbum',72,NULL),(64,'Woohoo',73,NULL),(65,'MTV Live',74,NULL),(66,'I-SAT',75,NULL),(67,'FX',77,NULL),(68,'Canal Rural',78,NULL),(69,'Comedy',79,NULL),(70,'Tv Sesc',80,NULL),(71,'Tv Monde',81,NULL),(72,'DSC Science',82,NULL),(73,'DSC Turbo',83,NULL),(74,'HGTV',84,NULL),(75,'Cine Canal',85,NULL),(76,'Syfy',86,NULL),(77,'Baby Tv',87,NULL),(78,'ESPN 4',88,NULL),(79,'Tooncast',90,NULL),(80,'TruTv',91,NULL),(81,'EuroChannel',92,NULL),(82,'Cartoonito',93,NULL),(83,'Fish Tv',94,NULL),(84,'Nick Jr',96,NULL),(85,'Space',97,NULL),(86,'DW',99,NULL),(87,'Canal TVN',100,NULL),(88,'Rai Italia',101,NULL),(89,'Discovery',102,NULL),(90,'A&E',103,NULL),(91,'Animal Planet',104,NULL),(92,'ID',105,NULL),(93,'DSC H&H',106,NULL),(94,'E!',107,NULL),(95,'Fox Sports 2',132,NULL),(96,'CineMax',133,NULL),(97,'RTPI',134,NULL),(98,'Shop Time',135,NULL),(99,'Arte 1',136,NULL),(100,'HBO',200,NULL),(101,'HBO 2',201,NULL),(102,'HBO Pop',202,NULL),(103,'HBO Xtreme',203,NULL),(104,'HBO Family',204,NULL),(105,'HBO Plus',205,NULL),(106,'HBO Mundi',206,NULL),(107,'HBO Signature',208,NULL),(108,'Tv Cidade HD',411,NULL),(109,'Rede Tv HD',413,NULL),(110,'Tv Educação',418,NULL),(111,'Tv Mirante HD',419,NULL),(112,'Band HD',420,NULL),(113,'AgroMais HD',421,NULL),(114,'Trip Brasil HD',424,NULL),(115,'Band News HD',427,NULL),(116,'MTV HD',429,NULL),(117,'TNT HD',433,NULL),(118,'AXN HD',434,NULL),(119,'ESPN 2 HD',435,NULL),(120,'Star Channel HD',436,NULL),(121,'History HD',438,NULL),(122,'Discovery Kids HD',439,NULL),(123,'Nickelodeon HD',441,NULL),(124,'TBS HD',442,NULL),(125,'NatGeo HD',443,NULL),(126,'AMC Brasil HD',444,NULL),(127,'Rede Vida HD',446,NULL),(128,'Tv Aparecida HD',447,NULL),(129,'Canção Nova HD',449,NULL),(130,'ESPN HD',454,NULL),(131,'Sony HD',455,NULL),(132,'Warner channel HD',456,NULL),(133,'Discovery World HD',458,NULL),(134,'MegaPix HD',459,NULL),(135,'TC Premium HD',460,NULL),(136,'TC Action HD',461,NULL),(137,'TC Touch HD',462,NULL),(138,'TC Fun HD',463,NULL),(139,'TC Pipoca HD',464,NULL),(140,'TC Cult HD',465,NULL),(141,'Paramount HD',466,NULL),(142,'Disney HD',468,NULL),(143,'History 2 HD',471,NULL),(144,'FX HD',477,NULL),(145,'Comedy HD',479,NULL),(146,'Discovery HD',480,NULL),(147,'DSC Science HD',482,NULL),(148,'DSC Turbo HD',483,NULL),(149,'HGTV HD',484,NULL),(150,'ESPN 3',487,NULL),(151,'ESPN 4 HD',488,NULL),(152,'Fox Sport 2 HD',489,NULL),(153,'TruTv HD',491,NULL),(154,'Food Network HD',495,NULL),(155,'Space HD',497,NULL),(156,'Meio Norte',498,NULL),(157,'DSC Theater HD',602,NULL),(158,'A&E HD',603,NULL),(159,'ID HD',605,NULL),(160,'DSC H&H HD',606,NULL),(161,'HBO HD',620,NULL),(162,'HBO 2 HD',621,NULL),(163,'HBO Pop HD',622,NULL),(164,'HBO Family HD',624,NULL),(165,'HBO Plus HD',625,NULL),(166,'HBO Signature HD',628,NULL),(167,'Arte 1 HD',636,NULL),(168,'SexPrive',701,NULL);
/*!40000 ALTER TABLE `tb_channel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_ird`
--

DROP TABLE IF EXISTS `tb_ird`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_ird` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `model` varchar(255) DEFAULT NULL,
  `tid` bigint DEFAULT NULL,
  `ua` bigint DEFAULT NULL,
  `polarization_id` bigint DEFAULT NULL,
  `ird_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5a7j8rqu0q9s41lhlrp2ng1d3` (`polarization_id`),
  KEY `FKqqvnb24p26ukdcv55v44wq75h` (`ird_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_ird`
--

LOCK TABLES `tb_ird` WRITE;
/*!40000 ALTER TABLE `tb_ird` DISABLE KEYS */;
INSERT INTO `tb_ird` VALUES (1,'cisco d9800',6546844,7867864,2,1),(2,'cisco 4000',564689,897984,1,1);
/*!40000 ALTER TABLE `tb_ird` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_polarization`
--

DROP TABLE IF EXISTS `tb_polarization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_polarization` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `ird_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK82viyojm3l62k5vkjef4i14od` (`ird_id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_polarization`
--

LOCK TABLES `tb_polarization` WRITE;
/*!40000 ALTER TABLE `tb_polarization` DISABLE KEYS */;
INSERT INTO `tb_polarization` VALUES (1,'vertical',NULL),(2,'horizontal',NULL),(3,'circular direita',NULL),(4,'circular esquerda',NULL);
/*!40000 ALTER TABLE `tb_polarization` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_satellite`
--

DROP TABLE IF EXISTS `tb_satellite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_satellite` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_satellite`
--

LOCK TABLES `tb_satellite` WRITE;
/*!40000 ALTER TABLE `tb_satellite` DISABLE KEYS */;
INSERT INTO `tb_satellite` VALUES (1,'IS11'),(2,'IS21');
/*!40000 ALTER TABLE `tb_satellite` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'domainird'
--

--
-- Dumping routines for database 'domainird'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-21 21:25:27
