const archivos = require("./lecturaescritura");
let arrayInmobiliaria = archivos.leerJson("departamentos");


const Inmobiliaria = {
    //A//
    departamentos : arrayInmobiliaria,
    
    //B//
    listarDepartamentos: function (array) {
        for (let i = 0; i < array.length; i++) {
            const dep = array[i];
            const disponible = dep.disponible ? "disponible" : "Alquilado";
            console.log(`id:${dep.id}, precio ${dep.precioAlquiler}, esta ${disponible}, cantidad de ambientes ${dep.ambientes}`
            )
        }
    },

    //C//
    buscarPorId: function (id) {
    return this.departamentos.find((departamento) => departamento.id === id)
    },

    //D//
    departamentosNoDisponibles: function () {
     return this.departamentos.filter(departamento => departamento.disponible === false)

    },

    //E//
    departamentosDisponibles: function () {
      return this.departamentos.filter(departamento => departamento.disponible === true)


    },

    //F//
    filtrarPorAmbientes: function (num) {
        return this.departamentos.filter(departamento => departamento.ambientes >= num) 
    },

    //G//
    filtrarPorPrecio: function (number) {
        return this.departamentosDisponibles().filter(departamento => departamento.precioAlquiler <= number) 
    },

    //H//
    rebajarPrecioAlquiler: function () {
        this.departamentosDisponibles().forEach((departamento) =>(departamento.precioAlquiler = (departamento.precioAlquiler * 3 / 100)));
        archivos.escribirJson("departamentos", this.departamentos);
        return this.departamentos;
    },

    //I//
    calcularRecaudación: function () {
        return this.departamentosNoDisponibles().reduce((ac, departamento) => ac + departamento.precioAlquiler, 0)
        
    },

    //J//
    ordenarPorPrecio: function () {
        return this.departamentos.sort((a, b) => a.precioAlquiler - b.precioAlquiler);
    },
}
//A//
console.table(Inmobiliaria.departamentos)
//B//
console.table(Inmobiliaria.listarDepartamentos(arrayInmobiliaria))
//C//
console.table(Inmobiliaria.buscarPorId(2))
//D//
console.table(Inmobiliaria.departamentosNoDisponibles())
//E//
console.table(Inmobiliaria.departamentosDisponibles())
//F//
console.table(Inmobiliaria.filtrarPorAmbientes(2))
//G//
console.table(Inmobiliaria.filtrarPorPrecio(74000))
//H//
console.table(Inmobiliaria.rebajarPrecioAlquiler())
//I//
console.table(Inmobiliaria.calcularRecaudación())
//J//
console.table(Inmobiliaria.ordenarPorPrecio(74000))