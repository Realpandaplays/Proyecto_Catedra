-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 15-05-2024 a las 15:58:14
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

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
-- Estructura de tabla para la tabla `material`
--

DROP TABLE IF EXISTS `material`;
CREATE TABLE IF NOT EXISTS `material` (
  `idInterno` varchar(45) NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `uniDisp` int NOT NULL,
  `materialEscrito` varchar(45) NOT NULL,
  `materialAudio` varchar(45) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materialaudiovisual`
--

DROP TABLE IF EXISTS `materialaudiovisual`;
CREATE TABLE IF NOT EXISTS `materialaudiovisual` (
  `idInterno` varchar(45) NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `uniDisp` int NOT NULL,
  `id_documental` varchar(45) NOT NULL,
  `id_musica` varchar(45) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiales`
--

DROP TABLE IF EXISTS `materiales`;
CREATE TABLE IF NOT EXISTS `materiales` (
  `idInterno` varchar(45) NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `autor` varchar(45) NOT NULL,
  `director` varchar(45) NOT NULL,
  `numPaginas` int NOT NULL,
  `editorial` varchar(45) NOT NULL,
  `ISBN` varchar(45) NOT NULL,
  `universidad` varchar(45) NOT NULL,
  `tituloCancion` varchar(45) NOT NULL,
  `tituloAlbum` varchar(45) NOT NULL,
  `cantante` varchar(45) NOT NULL,
  `duracion` varchar(45) NOT NULL,
  `publicacion` varchar(45) NOT NULL,
  `disponibilidad` int NOT NULL,
  PRIMARY KEY (`idInterno`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materialescrito`
--

DROP TABLE IF EXISTS `materialescrito`;
CREATE TABLE IF NOT EXISTS `materialescrito` (
  `idInterno` varchar(45) NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `uniDisp` int NOT NULL,
  `id_libro` varchar(45) NOT NULL,
  `id_revista` varchar(45) NOT NULL,
  `id_prensa` varchar(45) NOT NULL,
  `id_tesis` varchar(45) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

DROP TABLE IF EXISTS `prestamos`;
CREATE TABLE IF NOT EXISTS `prestamos` (
  `Identificacion` varchar(45) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `privilegio` varchar(45) NOT NULL,
  `idInterno` varchar(45) NOT NULL,
  `fechaPrestamo` varchar(45) NOT NULL COMMENT 'yyyy-mm-dd'
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `identificacion` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'carnet',
  `clave` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `nombre` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `apellido` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `usuario` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `nacimiento` varchar(45) NOT NULL COMMENT 'formato yyyy-mm-dd',
  `privilegio` varchar(45) NOT NULL COMMENT 'Admin, Profesor, Alumno',
  PRIMARY KEY (`identificacion`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
