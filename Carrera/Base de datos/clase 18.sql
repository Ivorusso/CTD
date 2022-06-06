-- 1. Crear una vista para poder organizar los envíos de las facturas. Indicar número de factura, fecha de la factura y fecha de envío, ambas en formato dd/mm/yyyy,
-- valor del transporte formateado con dos decimales, y la información del
-- domicilio del destino incluyendo dirección, ciudad, código postal y país, en una columna llamada Destino.
-- 2. Realizar una consulta con todos los correos y el detalle de las facturas que
-- usaron ese correo. Utilizar la vista creada.
-- 3. ¿Qué dificultad o problema encontrás en esta consigna? Proponer alguna alternativa o solución.
-- Crearia una vista con todos los datos de envio mas las de correos, 
-- ya que estoy haciendo un join de la vista creada con la tabla facturas
alter view v_envío_facturas AS
SELECT FacturaID Nº,DATE_FORMAT(FechaFactura, "%d-%m-%Y") as FechaFactura,DATE_FORMAT(FechaEnvio, "%d-%m-%Y") as FechaEnvio,ROUND(Transporte, 2) as precio, CONCAT_WS(' ', DireccionEnvio, CiudadEnvio, CodigoPostalEnvio, PaisEnvio) AS destino, C.compania as Correo, EnvioVia
from facturas
JOIN Correos C ON CorreoID = EnvioVia;
SELECT * FROM V_Envío_Facturas;


SELECT CategoriaNombre AS categoria, ProductoId AS producto_id, ProductoNombre As producto_nombre, PrecioUnitario AS precio FROM categorias c
LEFT JOIN productos p ON c.CategoriaID = p.CategoriaID
WHERE p.UnidadesStock > 0;
-- Ejercicio 2
-- 1. Crear una vista con un detalle de los productos en stock. Indicar id, nombre del producto, nombre de la categoría y precio unitario.
-- 2. Escribir una consulta que liste el nombre y la categoría de todos los productos vendidos. Utilizar la vista creada.
SELECT P.ProductoID AS Nº, P.ProductoNombre AS Producto, P.UnidadesStock AS Stock, C.CategoriaNombre AS categoría, P.PrecioUnitario AS Precio, UnidadesPedidas
FROM Productos P
JOIN FacturaDetalle F ON F.ProductoID = P.ProductoID
JOIN Categorias C ON C.CategoriaID = P.CategoriaID
GROUP BY P.ProductoID, C.CategoriaNombre, P.PrecioUnitario, P.UnidadesStock
HAVING P.UnidadesStock > 0;

SELECT DISTINCT vp.* FROM facturadetalle fd
INNER JOIN v_productos_en_stock vp ON vp.producto_id = fd.ProductoID;




