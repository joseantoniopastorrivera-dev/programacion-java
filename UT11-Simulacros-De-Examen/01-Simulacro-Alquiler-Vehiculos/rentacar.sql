-- =====================================================
-- SCRIPT BASE DE DATOS: rentacar
-- Aplicación de gestión de alquileres de vehículos
-- =====================================================

CREATE DATABASE IF NOT EXISTS rentacar
CHARACTER SET utf8mb4
COLLATE utf8mb4_spanish_ci;

USE rentacar;

-- =====================================================
-- Crear usuario admin
-- =====================================================

CREATE USER IF NOT EXISTS 'admin'@'localhost'
IDENTIFIED BY 'Password1234';

GRANT ALL PRIVILEGES ON rentacar.* TO 'admin'@'localhost';

FLUSH PRIVILEGES;

-- =====================================================
-- Recrear tabla de vehículos
-- =====================================================

DROP TABLE IF EXISTS vehiculos;

CREATE TABLE vehiculos (
    codigo VARCHAR(20) PRIMARY KEY,
    tipo VARCHAR(30) NOT NULL,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    anio INT NOT NULL,
    disponible BOOLEAN NOT NULL DEFAULT TRUE,

    -- Datos específicos según el tipo de vehículo:
    -- Coche: dato1 = número de puertas, dato2 = tipo de combustible
    -- Moto: dato1 = cilindrada, dato2 = tiene baúl
    -- Furgoneta: dato1 = capacidad de carga en kg, dato2 = volumen en m3
    dato1 VARCHAR(100) NOT NULL,
    dato2 VARCHAR(100) NOT NULL,

    coste_diario DECIMAL(8,2) NOT NULL,
    dias_maximos INT NOT NULL,
    penalizacion_dia DECIMAL(8,2) NOT NULL,

    CONSTRAINT chk_tipo_vehiculo
        CHECK (tipo IN ('Coche', 'Moto', 'Furgoneta')),

    CONSTRAINT chk_codigo_vehiculo
        CHECK (codigo REGEXP '^(COC|MOT|FUR)-[0-9]{4}-[0-9]{3}$'),

    CONSTRAINT chk_anio_vehiculo
        CHECK (anio >= 1900),

    CONSTRAINT chk_coste_diario
        CHECK (coste_diario > 0),

    CONSTRAINT chk_dias_maximos
        CHECK (dias_maximos > 0),

    CONSTRAINT chk_penalizacion_dia
        CHECK (penalizacion_dia >= 0)
);

-- =====================================================
-- Datos iniciales de prueba
-- =====================================================

INSERT INTO vehiculos (
    codigo, tipo, marca, modelo, anio, disponible,
    dato1, dato2, coste_diario, dias_maximos, penalizacion_dia
) VALUES
('COC-2020-001', 'Coche', 'Toyota', 'Corolla', 2020, TRUE, '5', 'Gasolina', 45.00, 15, 20.00),
('COC-2019-002', 'Coche', 'Seat', 'Leon', 2019, TRUE, '5', 'Diesel', 45.00, 15, 20.00),
('MOT-2023-001', 'Moto', 'Yamaha', 'MT-07', 2023, TRUE, '689', 'true', 25.00, 7, 12.00),
('MOT-2022-002', 'Moto', 'Honda', 'CB500F', 2022, TRUE, '471', 'false', 25.00, 7, 12.00),
('FUR-2021-001', 'Furgoneta', 'Ford', 'Transit', 2021, TRUE, '1200', '11.5', 65.00, 10, 30.00),
('FUR-2020-002', 'Furgoneta', 'Renault', 'Master', 2020, TRUE, '1400', '13.0', 65.00, 10, 30.00)
ON DUPLICATE KEY UPDATE
    tipo = VALUES(tipo),
    marca = VALUES(marca),
    modelo = VALUES(modelo),
    anio = VALUES(anio),
    disponible = VALUES(disponible),
    dato1 = VALUES(dato1),
    dato2 = VALUES(dato2),
    coste_diario = VALUES(coste_diario),
    dias_maximos = VALUES(dias_maximos),
    penalizacion_dia = VALUES(penalizacion_dia);

-- =====================================================
-- Comprobación final
-- =====================================================

SELECT 'Base de datos rentacar creada correctamente' AS mensaje;

SELECT *
FROM vehiculos;