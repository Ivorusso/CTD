const archivos = require("./lecturaEscritura");
let arrayProfesionales = archivos.leerJson("profesionales");
const nuevoProfesional=  {
    identificador: 250,
    estaHabilitado: true,
    honorarioConsulta: 8000,
    edad: 52,
    nombre: 'Linus Torvalds',
    especialidad: 'Junior Developer',
    cantidadConsultas: 48,
    puntuacion: 50
}
const appProfesionales = {
 profesionales: arrayProfesionales,
//A
primerosCincoProfesionales: function (){
  return this.profesionales.slice(0,5)
},
//B
Reemplazar: function () {
    return this.profesionales.splice(14, 1, nuevoProfesional)
},
//C
Ordenar: function () {
   return this.profesionales.sort((a, b) => a.honorarioConsulta - b.honorarioConsulta);
},

//D
ordenarPorPrecioConsultaAsc : function () {
    return this.profesionales.sort((a,b) => a.honorarioConsulta - b.honorarioConsulta);
  },
 
}



console.table(arrayProfesionales)
console.table(appProfesionales.primerosCincoProfesionales());
console.table(appProfesionales.Reemplazar());
console.table(appProfesionales.Ordenar())
console.table(appProfesionales.ordenarPorPrecioConsultaAsc())