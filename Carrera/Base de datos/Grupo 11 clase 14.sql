-- Clientes
-- 1) ¿Cuántos clientes existen?
SELECT COUNT(*) from clientes;
-- 2) ¿Cuántos clientes hay por ciudad?
SELECT Ciudad, COUNT(Ciudad) FROM Clientes
GROUP BY Ciudad;
-- Facturas
-- 1) ¿Cuál es el total de transporte?
SELECT SUM(transporte)
from facturas;
-- 2) ¿Cuál es el total de transporte por EnvioVia (empresa de envío)?
select enviovia, sum(transporte)
from facturas
group by EnvioVia;
-- 3) Calcular la cantidad de facturas por cliente. Ordenar descendentemente por
-- cantidad de facturas.
select clienteID, count(FacturaID)
from facturas 
group by ClienteID
ORDER BY COUNT(FacturaID) DESC;

-- 4) Obtener el Top 5 de clientes de acuerdo a su cantidad de facturas.
select clienteID, count(FacturaID)
from facturas 
group by ClienteID
ORDER BY COUNT(FacturaID) DESC
limit 5;
-- 5) ¿Cuál es el país de envío menos frecuente de acuerdo a la cantidad de facturas?
select PaisEnvio, count(FacturaID)
from facturas 
group by PaisEnvio
ORDER BY COUNT(FacturaID)
limit 1;
-- 6) Se quiere otorgar un bono al empleado con más ventas. ¿Qué ID de empleado
-- realizó más operaciones de ventas?
select EmpleadoID, count(FacturaID)
from facturas 
group by EmpleadoID
ORDER BY COUNT(FacturaID) desc
limit 1;
-- Factura detalle
-- 1) ¿Cuál es el producto que aparece en más líneas de la tabla Factura Detalle?
select FacturaID, count(ProductoID)
from facturadetalle
group by FacturaID 
order by count(ProductoID) desc
limit 1;
-- 2) ¿Cuál es el total facturado? Considerar que el total facturado es la suma de
-- cantidad por precio unitario.
select Count(preciounitario)
from facturadetalle;
-- 3) ¿Cuál es el total facturado para los productos ID entre 30 y 50?
select Count(preciounitario)
from facturadetalle
where ProductoID between  30 and 50;

-- 4) ¿Cuál es el precio unitario promedio de cada producto?
select productoID, avg(preciounitario)
from facturadetalle
group by productoID;

-- 5) ¿Cuál es el precio unitario máximo?
select productoID, max(precioUnitario)
from facturadetalle;

