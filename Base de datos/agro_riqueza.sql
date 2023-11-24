-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2023 a las 16:15:50
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `agro_riqueza`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fincas`
--

CREATE TABLE `fincas` (
  `id_finca` int(11) NOT NULL,
  `nombre_finca` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `fincas`
--

INSERT INTO `fincas` (`id_finca`, `nombre_finca`) VALUES
(1, 'Milenio'),
(2, 'Arboleda'),
(3, 'Melgar'),
(4, 'Moreno'),
(5, 'Lisboa'),
(11, 'Esperanza'),
(12, 'Villa Santana'),
(13, 'Pechene'),
(14, 'Zurdo'),
(15, 'Mauro'),
(19, 'Aguirre'),
(29, 'Finca la rebeca');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ordeniadores_finca`
--

CREATE TABLE `ordeniadores_finca` (
  `id_ordeniadores_finca` int(11) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `id_finca` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ordeniadores_finca`
--

INSERT INTO `ordeniadores_finca` (`id_ordeniadores_finca`, `id_usuario`, `id_finca`) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 4),
(5, 5, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proceso_ordenio`
--

CREATE TABLE `proceso_ordenio` (
  `id_proceso_ordenio` int(11) NOT NULL,
  `id_vaca` int(11) DEFAULT NULL,
  `id_ordeniador` int(11) DEFAULT NULL,
  `litros` int(11) NOT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proceso_ordenio`
--

INSERT INTO `proceso_ordenio` (`id_proceso_ordenio`, `id_vaca`, `id_ordeniador`, `litros`, `fecha`) VALUES
(1, 1, 1, 0, NULL),
(2, 2, 2, 0, NULL),
(3, 3, 3, 0, NULL),
(4, 4, 4, 0, NULL),
(5, 5, 5, 0, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `documento` char(15) DEFAULT NULL,
  `nombres` varchar(40) DEFAULT NULL,
  `apellidos` varchar(40) DEFAULT NULL,
  `telefono` char(10) DEFAULT NULL,
  `rol` enum('ADMIN','ORDENIADOR') DEFAULT NULL,
  `email` varchar(80) NOT NULL,
  `passw` varchar(70) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `documento`, `nombres`, `apellidos`, `telefono`, `rol`, `email`, `passw`) VALUES
(1, '123456789', 'Juan', 'Perez', '1234567890', 'ORDENIADOR', 'perez@mail.com', 'contrase?a1'),
(2, '987654321', 'Crespos', 'Loaiza', '9876543210', 'ORDENIADOR', 'mafegomez@gmail.com', 'contrase?a2'),
(3, '456789123', 'Pechene', 'Lopez', '4567891230', 'ORDENIADOR', 'peche@mail.com', 'contrase?a3'),
(4, '789123456', 'Juliana', 'Martinez', '7891234560', 'ORDENIADOR', 'juliana@mail.com', 'contrase?a4'),
(5, '654321987', 'Pedro', 'Sanchez', '6543219870', 'ORDENIADOR', 'pedrito@mail.com', 'contrase?a5'),
(11, '1109185526', 'Andrey', 'Franco', '3103836118', 'ADMIN', 'andrey@mail.com', '12345'),
(12, '18596647', 'Juan', 'Monsalve', '3106964352', 'ADMIN', 'monsalve@mail.com', '12345'),
(13, '108800', 'Oscar', 'Loaiza', '315422', 'ADMIN', 'oscar@mail.com', 'oscar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacas`
--

CREATE TABLE `vacas` (
  `id_vaca` int(11) NOT NULL,
  `id_finca` int(11) DEFAULT NULL,
  `alias` varchar(40) DEFAULT NULL,
  `descripcion` varchar(80) DEFAULT NULL,
  `estado` enum('ORDENIADA','SIN ORDENAR') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vacas`
--

INSERT INTO `vacas` (`id_vaca`, `id_finca`, `alias`, `descripcion`, `estado`) VALUES
(1, 1, 'Vaca 1', 'Blancas con Manchas Negras', 'ORDENIADA'),
(2, 2, 'Vaca 2', 'Blancas con Manchas Negras', 'SIN ORDENAR'),
(3, 3, 'Vaca 3', 'Blancas con Manchas Negras', 'ORDENIADA'),
(4, 4, 'Vaca 4', 'Blancas con Manchas Negras', 'SIN ORDENAR'),
(5, 5, 'Vaca 5', 'Blancas con Manchas Negras', 'SIN ORDENAR');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `fincas`
--
ALTER TABLE `fincas`
  ADD PRIMARY KEY (`id_finca`);

--
-- Indices de la tabla `ordeniadores_finca`
--
ALTER TABLE `ordeniadores_finca`
  ADD PRIMARY KEY (`id_ordeniadores_finca`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_finca` (`id_finca`);

--
-- Indices de la tabla `proceso_ordenio`
--
ALTER TABLE `proceso_ordenio`
  ADD PRIMARY KEY (`id_proceso_ordenio`),
  ADD KEY `id_vaca` (`id_vaca`),
  ADD KEY `id_ordeniador` (`id_ordeniador`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Indices de la tabla `vacas`
--
ALTER TABLE `vacas`
  ADD PRIMARY KEY (`id_vaca`),
  ADD KEY `id_finca` (`id_finca`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `fincas`
--
ALTER TABLE `fincas`
  MODIFY `id_finca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT de la tabla `ordeniadores_finca`
--
ALTER TABLE `ordeniadores_finca`
  MODIFY `id_ordeniadores_finca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `proceso_ordenio`
--
ALTER TABLE `proceso_ordenio`
  MODIFY `id_proceso_ordenio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `vacas`
--
ALTER TABLE `vacas`
  MODIFY `id_vaca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ordeniadores_finca`
--
ALTER TABLE `ordeniadores_finca`
  ADD CONSTRAINT `ordeniadores_finca_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`),
  ADD CONSTRAINT `ordeniadores_finca_ibfk_2` FOREIGN KEY (`id_finca`) REFERENCES `fincas` (`id_finca`);

--
-- Filtros para la tabla `proceso_ordenio`
--
ALTER TABLE `proceso_ordenio`
  ADD CONSTRAINT `proceso_ordenio_ibfk_1` FOREIGN KEY (`id_vaca`) REFERENCES `vacas` (`id_vaca`),
  ADD CONSTRAINT `proceso_ordenio_ibfk_2` FOREIGN KEY (`id_ordeniador`) REFERENCES `ordeniadores_finca` (`id_ordeniadores_finca`);

--
-- Filtros para la tabla `vacas`
--
ALTER TABLE `vacas`
  ADD CONSTRAINT `vacas_ibfk_1` FOREIGN KEY (`id_finca`) REFERENCES `fincas` (`id_finca`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
