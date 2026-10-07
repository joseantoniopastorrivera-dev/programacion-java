-- Eliminar la base de datos si existe para evitar conflictos
DROP DATABASE IF EXISTS tienda;
-- Crear la base de datos
CREATE DATABASE tienda;
-- Seleccionar la base de datos
USE tienda;

-- Eliminar las tablas si existen (en caso de no haber eliminado la base de datos)
DROP TABLE IF EXISTS productos;
DROP TABLE IF EXISTS categorias;

-- Crear la tabla 'categorias'
CREATE TABLE IF NOT EXISTS categorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

-- Crear la tabla 'productos' con relación a 'categorias'
CREATE TABLE IF NOT EXISTS productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    categoria_id INT,
    FOREIGN KEY (categoria_id) REFERENCES categorias(id)
);

-- Insertar 5 categorías
INSERT INTO categorias (nombre) VALUES ('Electrónica');
INSERT INTO categorias (nombre) VALUES ('Ropa');
INSERT INTO categorias (nombre) VALUES ('Alimentos');
INSERT INTO categorias (nombre) VALUES ('Hogar');
INSERT INTO categorias (nombre) VALUES ('Libros');

-- Insertar 5 productos para la categoría 'Electrónica' (id = 1)
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Smartphone', 500.00, 1);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Televisor', 300.00, 1);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Laptop', 800.00, 1);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Tablet', 250.00, 1);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Cámara', 400.00, 1);

-- Insertar 5 productos para la categoría 'Ropa' (id = 2)
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Camiseta', 20.00, 2);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Pantalón', 35.00, 2);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Chaqueta', 50.00, 2);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Zapatos', 60.00, 2);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Sombrero', 15.00, 2);

-- Insertar 5 productos para la categoría 'Alimentos' (id = 3)
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Pan', 2.00, 3);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Leche', 1.50, 3);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Huevos', 3.00, 3);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Arroz', 4.00, 3);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Frutas', 5.00, 3);

-- Insertar 5 productos para la categoría 'Hogar' (id = 4)
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Sofá', 200.00, 4);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Mesa', 100.00, 4);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Silla', 50.00, 4);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Lámpara', 30.00, 4);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Estantería', 80.00, 4);

-- Insertar 5 productos para la categoría 'Libros' (id = 5)
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Novela', 10.00, 5);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Biografía', 15.00, 5);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Libro de cocina', 20.00, 5);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Historia', 12.00, 5);
INSERT INTO productos (nombre, precio, categoria_id) VALUES ('Ciencia ficción', 18.00, 5);
