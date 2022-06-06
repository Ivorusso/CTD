const archivos = require("./lecturaEscritura");
let arrayProfesionales = archivos.leerJson("profesionales");

const helper = require('./lecturaEscritura');
let arrayProfesionales = helper.leerJson("profesionales");
const appProfesionales = { profesionales: arrayProfesionales,
   
    //A
   imprimir: function () {
       this.profesionales.forEach(prof => console.log(prof.especialidad + ' - ' + prof.nombre))
   },
   //B
   modificarHonorario: function () {
       this.profesionales.forEach(function (prof) {
           prof.honorarioConsulta *= 1.05
       })
       return this.profesionales
   },
 
   //C
   deshabilitados: function () {
       const deshabilitados = this.profesionales.filter(prof => !prof.estaHabilitado);
       return deshabilitados
   },
   //D
   habilitados: function () {
       const habilitados = this.profesionales.filter(prof => prof.estaHabilitado);
       return habilitados
   },
   //E
   arquitectos: function () {
       const arquitectos = this.profesionales.filter(prof => prof.especialidad === 'Arquitecto');
       return arquitectos
   },
   //F
   habilitarDeshabilitados: function () {
       const profDeshabilitado = this.deshabilitados();
       profDeshabilitado.forEach(prof => prof.estaHabilitado = true);
       return profDeshabilitado;
 
 
   },
   //G
   totalConsultas: function () {
       return this.profesionales.reduce((total, prof) => total + prof.cantidadConsultas, 0)
   },
   //H
   recaudacion: function () {
       return this.profesionales.map(function (prof, i, nuevoArray) {
           nuevoArray.push({
               nombre: prof.nombre,
               especialidad: prof.especialidad,
               recaudacion: (prof.cantidadConsultas * prof.honorarioConsulta)
           })
           return nuevoArray;
       })
   }
}
