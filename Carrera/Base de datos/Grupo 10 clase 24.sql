
-- Clase 24 Sergio Gende, Nico Gomez, Gerardo Suhr, Fabio Boschetti, Ivan Rodriguez Russo

/*1) Cálculo de edad 
a) Crear un SP que muestre apellidos, nombres y edad de cada empleado, debe calcular 
la edad de los empleados a partir de la fecha de nacimiento y que tengan entre n y n años de edad. 
b) Ejecutar el SP indicando un rango de edad entre 50 y 60 años de edad. */

DELIMITER $$
CREATE PROCEDURE sp_listaApellidosNombresEdad (IN edad1 INT, edad2 INT)
BEGIN
	SELECT Empleados.Apellido, Empleados.Nombre, TIMESTAMPDIFF(YEAR,Empleados.FechaNacimiento,CURDATE())
	FROM Empleados
	WHERE TIMESTAMPDIFF(YEAR,Empleados.FechaNacimiento,CURDATE()) between edad1 and edad2;
END $$

CALL sp_listaApellidosNombresEdad(50, 60)$$

/* 2) Actualización de productos 
a) Crear un SP que reciba un porcentaje y un nombre de categoría y actualice los productos pertenecientes 
a esa categoría, incrementando las unidades pedidas según el porcentaje indicado. Por ejemplo: si un producto 
de la categoría Seafood tiene 30 unidades pedidas, al invocar el SP con categoría Seafood y porcentaje 10%, 
el SP actualizará el valor de unidades pedidas con el nuevo valor 33. 
b) Listar los productos de la categoría Beverages para ver cuántas unidades pedidas hay de cada uno de ellos. 
c) Invocar al SP con los valores Beverages como categoría y 15 como porcentaje. 
d) Volver a listar los productos como en (a), y validar los resultados.*/ 

DELIMITER $$
CREATE PROCEDURE sp_ActualizacionProductos1 (IN porcentaje INT, nombre_categoria varchar(15))
BEGIN
	SELECT Productos.ProductoNombre, Productos.UnidadesPedidas, Categorias.CategoriaNombre
	FROM Productos
	JOIN Categorias ON Productos.CategoriaID = Categorias.CategoriaID
    WHERE Categorias.CategoriaNombre = nombre_categoria
    AND ((porcentaje*Productos.UnidadesPedidas) / 100);
END $$

SELECT Productos.ProductoNombre, Productos.UnidadesPedidas, Categorias.CategoriaNombre
FROM Productos
JOIN Categorias ON Productos.CategoriaID = Categorias.CategoriaID
WHERE Categorias.CategoriaNombre = 'Beverages'$$

CALL p_ActualizacionProductos1(15, 'Beverages')$$

SELECT Productos.ProductoNombre, Productos.UnidadesPedidas, Categorias.CategoriaNombre
FROM Productos
JOIN Categorias ON Productos.CategoriaID = Categorias.CategoriaID
WHERE Categorias.CategoriaNombre = 'Beverages'$$

/* 3) Actualización de empleados 
a) Crear un SP que cree una tabla con los nombres, apellidos y teléfono de contacto de todos los empleados 
que hayan sido contratados con fecha anterior a una fecha dada. 
b) Ejecutar el SP para generar una tabla de empleados con fecha de contratación anterior a 01/01/1994. 
c) Consultar la tabla generada y validar los resultados. */

DELIMITER $$
CREATE PROCEDURE sp_ActualizacionEmpleados (IN fecha_consulta datetime)
BEGIN
	SELECT concat(Empleados.Apellido, Empleados.Nombre, Empleados.Telefono) AS EmpleadosTelefonos, Empleados.FechaContratacion
	FROM Empleados
    WHERE Empleados.FechaContratacion < fecha_consulta
    ORDER BY Empleados.Apellido;
END$$

CALL sp_ActualizacionEmpleados('1994-01-01 00:00:00')$$

SELECT concat(Empleados.Apellido, Empleados.Nombre, Empleados.Telefono) AS EmpleadosTelefonos, Empleados.FechaContratacion
FROM Empleados
ORDER BY Empleados.Apellido;