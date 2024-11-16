CREATE TABLE mural (
    idM SERIAL PRIMARY KEY,
    titulo VARCHAR(255),
    ap VARCHAR(255),
    dimensiones VARCHAR(255),
    materiales VARCHAR(255),
    idA INT,
    FOREIGN KEY (idA) REFERENCES artista(idA)
);
