-- Crear la base de datos si no existe
CREATE DATABASE IF NOT EXISTS tiendaonline
  DEFAULT CHARACTER SET utf8mb4
  DEFAULT COLLATE utf8mb4_general_ci;

-- Usar la base de datos
USE tiendaonline;

-- Crear la tabla productos
CREATE TABLE IF NOT EXISTS productos (
    id INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
     precio DOUBLE NOT NULL CHECK (precio >= 0),
    stock INT NOT NULL CHECK (stock >= 0)
);
