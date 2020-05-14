CREATE PROCEDURE Agregar_Productos(id int, nombre varchar(255), foto longblob, descripcion varchar(255), precio double, stock int(11))
INSERT INTO productos VALUES (id , nombre ,foto, descripcion, precio, stock);




CREATE PROCEDURE Consultar_Productos()
SELECT * FROM productos;




CREATE PROCEDURE Modificar_Productos(id int, nombre varchar(255), foto longblob, descripcion varchar(255), precio double, stock int(11))
UPDATE producto SET  Nombres= nombre, Foto= foto, Descripcion= descripcion, Precio= precio , Stock=stock WHERE idProducto =id;




CREATE PROCEDURE Eliminar_Productos(id int)
DELET FROM productos WHERE idProducto=id;
