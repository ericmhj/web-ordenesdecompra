
INSERT INTO sucursal (id,nombre) VALUES (2040, 'TIENDA CDMX' );
INSERT INTO orden (total, fecha,id,id_sucursal) VALUES (2500,'2025-05-12',200,2040);
INSERT INTO producto (precio,id,orden_id,codigo,descripcion,url_image) VALUES (2003.30,100,200,'1212','Computadora Aple','http://localhost:8080/images/Apple MacBook Pro 2022.jpg');
INSERT INTO producto (precio,id,orden_id,codigo,descripcion,url_image) VALUES (500,200,200,'1111','Printer','http://localhost:8080/images/impresora.jpg');
INSERT INTO producto (precio,id,orden_id,codigo,descripcion,url_image) VALUES (200.30,300,200,'1010','Smart Phone','http://localhost:8080/images/Logitech M510.jpg');
INSERT INTO producto (precio,id,orden_id,codigo,descripcion,url_image) VALUES (100,400,200,'2020','Boots','http://localhost:8080/images/default.jpg');