CREATE TABLE IF NOT EXISTS  Producto (
  id serial,
  description VARCHAR(45) NOT NULL,
  details VARCHAR(45) NULL,
  PRIMARY KEY (id)
  );


CREATE TABLE IF NOT EXISTS  clientes (
  id serial,
  nombres VARCHAR(45) NOT NULL,
  apellidos VARCHAR(45) NULL,
  PRIMARY KEY (id)
  );