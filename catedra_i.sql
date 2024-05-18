-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 18-05-2024 a las 16:01:22
-- Versión del servidor: 8.2.0
-- Versión de PHP: 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `catedra_i`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materialaudiovisual`
--

DROP TABLE IF EXISTS `materialaudiovisual`;
CREATE TABLE IF NOT EXISTS `materialaudiovisual` (
  `idInterno` varchar(45) DEFAULT NULL,
  `titulo` varchar(45) DEFAULT NULL,
  `uniDisp` int DEFAULT NULL,
  `id_documental` varchar(45) DEFAULT NULL,
  `id_musica` varchar(45) DEFAULT NULL,
  `IdMaterialAudio` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdMaterialAudio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiales`
--

DROP TABLE IF EXISTS `materiales`;
CREATE TABLE IF NOT EXISTS `materiales` (
  `idInterno` varchar(45) DEFAULT NULL,
  `titulo` varchar(45) DEFAULT NULL,
  `autor` varchar(45) DEFAULT NULL,
  `director` varchar(45) DEFAULT NULL,
  `numPaginas` int DEFAULT NULL,
  `editorial` varchar(45) DEFAULT NULL,
  `ISBN` varchar(45) DEFAULT NULL,
  `universidad` varchar(45) DEFAULT NULL,
  `tituloCancion` varchar(45) DEFAULT NULL,
  `tituloAlbum` varchar(45) DEFAULT NULL,
  `cantante` varchar(45) DEFAULT NULL,
  `duracion` varchar(45) DEFAULT NULL,
  `publicacion` varchar(45) DEFAULT NULL,
  `disponibillidad` int DEFAULT NULL,
  `IdMateriales` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdMateriales`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materialescrito`
--

DROP TABLE IF EXISTS `materialescrito`;
CREATE TABLE IF NOT EXISTS `materialescrito` (
  `idInterno` varchar(45) DEFAULT NULL,
  `titulo` varchar(45) DEFAULT NULL,
  `uniDisp` int DEFAULT NULL,
  `id_libro` varchar(45) DEFAULT NULL,
  `id_revista` varchar(45) DEFAULT NULL,
  `id_prensa` varchar(45) DEFAULT NULL,
  `id_tesis` varchar(45) DEFAULT NULL,
  `IdMaterialEscrito` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdMaterialEscrito`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

DROP TABLE IF EXISTS `prestamos`;
CREATE TABLE IF NOT EXISTS `prestamos` (
  `identificacion` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `privilegio` varchar(45) DEFAULT NULL,
  `fechaPrestamo` varchar(45) DEFAULT NULL,
  `fecha_devolucion` varchar(45) DEFAULT NULL,
  `IdMateriales` int DEFAULT NULL,
  `IdUsuario` int DEFAULT NULL,
  `IdPrestamos` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdPrestamos`),
  KEY `IdMateriales` (`IdMateriales`),
  KEY `IdUsuario` (`IdUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipomaterial`
--

DROP TABLE IF EXISTS `tipomaterial`;
CREATE TABLE IF NOT EXISTS `tipomaterial` (
  `idInterno` varchar(45) DEFAULT NULL,
  `titulo` varchar(45) DEFAULT NULL,
  `uniDisp` int DEFAULT NULL,
  `materialEscrito` varchar(45) DEFAULT NULL,
  `materialAudio` varchar(45) DEFAULT NULL,
  `IdMaterialEscrito` int DEFAULT NULL,
  `IdMaterialAudio` int DEFAULT NULL,
  `IdMateriales` int DEFAULT NULL,
  `IdTipoMaterial` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdTipoMaterial`),
  KEY `IdMaterialEscrito` (`IdMaterialEscrito`),
  KEY `IdMaterialAudio` (`IdMaterialAudio`),
  KEY `IdMateriales` (`IdMateriales`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `identificacion` varchar(45) DEFAULT NULL,
  `clave` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `nacimiento` varchar(45) DEFAULT NULL,
  `privilegio` varchar(45) DEFAULT NULL,
  `IdUsuario` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD CONSTRAINT `prestamos_ibfk_1` FOREIGN KEY (`IdMateriales`) REFERENCES `materiales` (`IdMateriales`),
  ADD CONSTRAINT `prestamos_ibfk_2` FOREIGN KEY (`IdUsuario`) REFERENCES `usuarios` (`IdUsuario`);

--
-- Filtros para la tabla `tipomaterial`
--
ALTER TABLE `tipomaterial`
  ADD CONSTRAINT `tipomaterial_ibfk_1` FOREIGN KEY (`IdMaterialEscrito`) REFERENCES `materialescrito` (`IdMaterialEscrito`),
  ADD CONSTRAINT `tipomaterial_ibfk_2` FOREIGN KEY (`IdMaterialAudio`) REFERENCES `materialaudiovisual` (`IdMaterialAudio`),
  ADD CONSTRAINT `tipomaterial_ibfk_3` FOREIGN KEY (`IdMateriales`) REFERENCES `materiales` (`IdMateriales`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
