-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-06-2020 a las 23:10:48
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `java`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentarios`
--

CREATE TABLE `comentarios` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_post` int(11) NOT NULL,
  `nombre_usuario` text NOT NULL,
  `comentario` text NOT NULL,
  `fecha` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `opiniones`
--

CREATE TABLE `opiniones` (
  `id` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `nombre_usuario` text NOT NULL,
  `opinion` text NOT NULL,
  `estrellas` int(11) NOT NULL,
  `fecha` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `posts`
--

CREATE TABLE `posts` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `nombre_usuario` text NOT NULL,
  `titulo` text NOT NULL,
  `mensaje` text NOT NULL,
  `fecha` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `posts`
--

INSERT INTO `posts` (`id`, `id_usuario`, `nombre_usuario`, `titulo`, `mensaje`, `fecha`) VALUES
(1, 0, 'Admin', 'Encuesta y sorteo', 'Bienvenidos a todos los usuarios de OpinionShop, en esta ocasion se dirige el admin, con la intencion de informarles sobre un sorteo y encuestas a diferentes usuarios con el fin de recopilar informacion para mejorar el servicio.\r\n\r\nLas encuestas llegaran via email.\r\n\r\nSi eres ganador de el sorteo de un grandioso SonyPlaystation 5 del dia 25/12/2020, te avisaremos por email para acerte llegar el premio.\r\n\r\nFeliz dia.\r\n\r\n', '2020-05-15 09:24:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `id_vendedor` int(11) NOT NULL,
  `nombre_vendedor` text NOT NULL,
  `nombre` text NOT NULL,
  `imagen` text NOT NULL,
  `descripcion` text NOT NULL,
  `precio` double NOT NULL,
  `stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `id_vendedor`, `nombre_vendedor`, `nombre`, `imagen`, `descripcion`, `precio`, `stock`) VALUES
(1, 1, 'Sony', 'Sony PlayStation 5', '', 'La nueva consola de sony, denominada PS5, con nuevas tecnologias y un rendimiento inimaginable.', 499.99, 500),
(2, 1, 'Sony', 'Smart TV 28\'', '', 'Increible smart tv de sony con diferentes funcionalidades, tecnologia de punta', 399.99, 125),
(3, 2, 'Intel', 'Procesador intel core i9 9990k 4.50 ghz', '', 'Procesador intel core i9 con 8 nucleos a una frecuencia de 4.50 ghz, de ultima generacion, con intercooler incluido.', 249.99, 54),
(4, 3, 'Mabe', 'Refrigerado X-50', '', 'Refrigeradora con una estructura comoda de almacenamiento, incluyendo diferentes avances tecnologicos en el control de temperatura y hasta de reconocimiento facial!', 700, 140);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjetas`
--

CREATE TABLE `tarjetas` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `numero` text NOT NULL,
  `vencimiento` text NOT NULL,
  `cvv` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nombre_completo` text NOT NULL,
  `email` text NOT NULL,
  `password` text NOT NULL,
  `nacimiento` text NOT NULL,
  `domicilio` text NOT NULL,
  `contacto` int(11) NOT NULL,
  `carrito` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL
) ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedores`
--

CREATE TABLE `vendedores` (
  `id` int(11) NOT NULL,
  `nombre` text NOT NULL,
  `domicilio` text NOT NULL,
  `descripcion` text NOT NULL,
  `fundacion` int(11) NOT NULL,
  `contacto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `vendedores`
--

INSERT INTO `vendedores` (`id`, `nombre`, `domicilio`, `descripcion`, `fundacion`, `contacto`) VALUES
(1, 'Sony', 'Nihonbashi, ciudad de Tokio, Tokio, Japón', 'Sony Corporation, comúnmente referida como Sony, es una empresa multinacional japonesa con sede en Tokio y uno de los fabricantes más importantes a nivel mundial en electrónica de consumo: audio y vídeo, computación, fotografía, videojuegos, telefonía móvil, productos profesionales, etcétera', 1946, 0),
(2, 'Intel', 'Mountain View, California, Estados Unidos', 'Intel Corporation es el mayor fabricante de circuitos integrados del mundo​ según su cifra de negocio anual.​ La compañía estadounidense es la creadora de la serie de procesadores x86, los procesadores más comúnmente encontrados en la mayoría de las computadoras personales.', 1968, 0),
(3, 'Mabe', 'Ciudad de México, México', 'Mabe es una multinacional que diseña, produce y distribuye electrodomésticos a más de 70 países alrededor del mundo', 1946, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `opiniones`
--
ALTER TABLE `opiniones`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `posts`
--
ALTER TABLE `posts`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tarjetas`
--
ALTER TABLE `tarjetas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `vendedores`
--
ALTER TABLE `vendedores`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `opiniones`
--
ALTER TABLE `opiniones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `posts`
--
ALTER TABLE `posts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tarjetas`
--
ALTER TABLE `tarjetas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `vendedores`
--
ALTER TABLE `vendedores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
