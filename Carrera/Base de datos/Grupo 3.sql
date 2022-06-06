-- Codigo de camada : 0921TDBD1N1C7LAED0621PT
-- Grupo: 3
-- Integrantes:  Geraldine Brussa, Adelina Drana, Ivan Rodriguez Russo

-- 1.Listar todos los clientes cuyo nombre comience con la letra "A". Se debe mostrar
-- id como "Número de cliente", apellido y nombre.
SELECT id AS "numero de cliente", nombre, apellido  from cliente
WHERE nombre like "A%";
-- 2. Mostrar el número de la sucursal con domicilio "Ramón Freire Serrano 7410"
SELECT * from sucursal 
where domicilio = "Ramón Freire Serrano 7410";
-- sucursal 10   
-- 3. Se requiere saber cuál es el mayor importe prestado
SELECT importe from prestamo
where id = 10;
-- 4. Listar los pagos realizados con números 10, 14, 27, 45.
SELECT * from pago
WHERE id in (10, 14, 27 , 45);
-- 5. Calcular el total de los pagos realizados para el préstamo número cuarenta. El
-- reporte debe tener dos columnas denominadas "Número de préstamo" y el
-- "Total pagado".
Select prestamo_id As "Número de préstamo", importe AS "Total pagado" from pago
where prestamo_id = 40;

-- 6. Listar los empleados que no pertenezcan a la sucursal dos y que la fecha de alta
-- del contrato sea mayor que 5/09/21 o igual a 25/06/21. Ordenar por alta de
-- contrato.
select sucursal_numero, apellido, nombre, legajo, alta_contrato_laboral from empleado
where sucursal_numero != 2 and alta_contrato_laboral >'2021-09-05'<'2021-06-25'
order by alta_contrato_laboral;



-- 7. Listar los pagos realizados con importe entre $1030,25 a $1666,66 (ordenarlos
-- por el importe pagado de mayor a menor).
select * from pago
where importe between "1030.30" and "1666.66"
order by importe desc;

-- 8. Mostrar el quinto pago realizado con menor importe.
select * from pago
order by importe
limit 1
offset 5;

-- 9. Mostrar el préstamo con mayor importe. Este reporte debe contener el número
-- del préstamo, la fecha de otorgamiento y el importe.
select id as 'Número de Préstamo', fecha_otorgado as 'Fecha de Otorgamiento', importe from prestamo
order by importe desc 
limit 1;


-- 10. Mostrar las diez cuentas bancarias con menor saldo. Este reporte debe contener
-- el número de cuenta, saldo y el código del tipo de cuenta.
select numero as "Número de Cuenta", saldo, cuenta_tipo_id as "Código del tipo de Cuenta" from cuenta
order by saldo
limit 10;

-- 11. Listar los préstamos otorgados entre 10/07/21 al 10/08/21 (ordenarlos por fecha
-- de otorgamiento)
select id, fecha_otorgado from prestamo
where fecha_otorgado between "21-07-10" and "21-08-10";
-- 12. Listar en forma ordenada las cuentas bancarias que tengan un descubierto
-- otorgado superior o igual a $8999,80.
SELECT* FROM cuenta WHERE descubierto_otorgado >= 8999.80 ORDER BY numero;
-- 13. Listar todos los empleados cuyo apellido termine con los caracteres "do". Se
-- debe mostrar el legajo, apellido, nombre y email.
select legajo, apellido, nombre, email from empleado
where apellido like "%_do%";

-- 14. Se desea conocer cuál es el promedio de los saldos de las cajas de ahorro
select avg(saldo) as "promedio saldos caja de ahorro" from cuenta
where cuenta_tipo_id = 1;

-- 15. Mostrar el tercer préstamo con mayor importe.
select importe from prestamo
order by importe desc limit 3;

-- 16. Calcular la cantidad de cuentas que tiene la sucursal número cinco. El reporte
-- debe tener dos columnas denominadas "Sucursal" y el "Cantidad de Cuentas".
select sucursal_numero AS "Sucursal" from cuenta
where sucursal_numero = 5;
-- 17. Mostrar todas las ciudades que contengan una palabra de cinco caracteres, pero
-- el tercer carácter debe ser igual a "n".
SELECT nombre from ciudad
where nombre like "__n__%";
-- 18. Modificar el tipo de cuenta bancaria "Cuenta Corriente" a "Cuenta Especial"
UPDATE cuenta_tipo
SET tipo = "Cuenta Especial"
where id = 2;
-- 19. En la fecha de hoy, agregar en la sucursal número nueve al empleado Quinteros
-- Arias Raúl Alejandro con domicilio en Av. 25 de mayo 7410 - Pilar - Buenos Aires,
-- mail: quiteros2021bs@gmail.com, teléfono móvil: '+5491154000745'.
-- INSERT INTO 'el_descubierto'.'empleado' ('legajo', 'sucursal_numero', 'apellido', 'nombre', 'domicilio', 'ciudad_id', 'email', 'telefono_movil', 'alta_contrato_laboral') 
-- VALUES ('51', '9', 'Quinteros Arias', 'Raúl Alejandro', 'Av. 25 de Mayo 7410', '14', 'quiteros2021bs@gmail.com', '+5491154000745', '2021-10-11');


-- 20. Eliminar el registro del préstamo número cuarenta y cinco
delete from prestamo
where id = 45;
