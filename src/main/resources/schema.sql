CREATE TABLE provedor (
    id_provedor INT IDENTITY(1,1) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    telefono CHAR(9) NOT NULL,
    gmail VARCHAR(100) NOT NULL,
    direccion VARCHAR(150) NOT NULL,
    compras_id_compra INT NOT NULL,
    CONSTRAINT provedor_pk PRIMARY KEY (id_provedor)
);