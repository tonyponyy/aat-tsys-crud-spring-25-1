
CREATE TABLE fabricantes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(250)
);

CREATE TABLE articulos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(250),
    precio INT,
    fabricante INT,
    FOREIGN KEY (fabricante) REFERENCES fabricantes(id)
);

INSERT INTO fabricantes (nombre) VALUES
    ('Seat'),
    ('House solutions'),
    ('Garden thuiings'),
    ('La pastoreta y asociados'),
    ('Schlecker');

INSERT INTO articulos (nombre, precio, fabricante) VALUES
    ('Tuerca', 100, 1),
    ('Tornillo', 150, 2),
    ('Martillo', 200, 3),
    ('Hilo de pesca', 50, 4),
    ('Clavo', 120, 5);