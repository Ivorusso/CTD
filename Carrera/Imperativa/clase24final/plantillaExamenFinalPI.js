const archivos = require("./jsonHelper");
let arrayRecetas = archivos.leerJson("recetas");
const v = "\x1b[32m%s\x1b[0m"; // NO TOCAR
const o = "*".repeat(80) + "\n"; // NO TOCAR
const oo = "*".repeat(25); // NO TOCAR
// Te proveemos la siguiente plantilla que tiene dos partes:
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados
const nombre = "Ivan Rodriguez Russo";
const tema = "TEMA 2";

/*******************************/
/* Desarrollo de las consignas */
/*******************************/

// A
const restaurante = {
// B
recetas : arrayRecetas,
// C
listarRecetas : function (array) {
    for (let i = 0; i < array.length; i++) {
        const rec = array[i];
        const delDia = rec.menuDelDia ? "Menu del Dia" : " ";
        console.log(`${rec.nombre}, tiempo de espera ${rec.tiempo} minutos, precio: ${rec.precio}, ${delDia}`)   
    }
},
// D
buscarPorId : function (id) {
    return this.recetas.find((receta) => receta.id === id);
},
// E
fueraMenuDelDia : function () {
    return this.recetas.filter(receta => receta.menuDelDia === false)
    
},

// F
filtrarPorPrecio : function (filtro) {
    return this.recetas.filter(receta => receta.precio <= filtro)
},

// G
ordenarPorPrecio : function () {
    return this.recetas.sort((a, b) => a.precio - b.precio);
},

// H
precioTotal: function () {
        const pTot = this.recetas.reduce((acum, rec) => acum + rec.precio, 0);
        return "El precio de todas las recetas sumadas es de $" + pTot;
},

// I
incrementarTiempo : function (id) {
const encontrada = this.buscarPorId(id);
if (encontrada) { encontrada.tiempo += 10; 
    archivos.escribirJson('recetas', this.recetas);
    return encontrada;} 
else {
    return encontrada}
},
}
/******************************/
/* Ejecución de las consignas */
/******************************/
console.table([{ alumno: nombre, tema: tema }]); // NO MODIFICAR NADA DE ESTA LINEA

console.log(v, "\n" + oo + " .C. Listar");
restaurante.listarRecetas(arrayRecetas);
console.log(o);

console.log(v, oo + " .D. Buscar");
console.log(restaurante.buscarPorId(70276));
console.log(o);

console.log(v, oo + " .E. Filtrar 1");
restaurante.listarRecetas(restaurante.fueraMenuDelDia())
console.log(o);

console.log(v, oo + " .F. Filtrar 2");
restaurante.listarRecetas(restaurante.filtrarPorPrecio(20))
console.log(o);

console.log(v, oo + " .G. Ordenar");
restaurante.listarRecetas(restaurante.ordenarPorPrecio())
console.log(o);

console.log(v, oo + " .H. Duracion");
console.log(restaurante.precioTotal())
console.log(o);

console.log(v, oo + " .I. Modificar Propiedad");
console.log(restaurante.incrementarTiempo(70276))
console.log(o);
