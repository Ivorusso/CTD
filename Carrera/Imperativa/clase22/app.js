const archivos = require("./lecturaescritura");
let arrayautos = archivos.leerJson("autos");


const carrera = {
 //A//
 autos : arrayautos,

 //B//
 autosPorTanda : 6,

 //C//
 autosHabilitados: function () {
    return this.autos.filter(auto => auto.sancionado === false)
},

//D//
listarAutos: function (array) {
    for (let i = 0; i < array.length; i++) {
        const aut = array[i];
        const sancionado = aut.sancionado ? "Habilitado" : "Sancionado";
        console.log(`Piloto: ${aut.piloto}, Patente: ${aut.patente},  Velocidad: ${aut.velocidad}, Peso: ${aut.peso}, esta: ${sancionado}`
        )
    }
},

//E//
buscarPorPatente : function (patente) {
    return this.autos.find((auto) => auto.patente === patente)    
},

//F//
filtrarPorCilindrada : function (cilindradaMaxima) {
    return this.autosHabilitados().filter(auto => auto.cilindrada <= cilindradaMaxima) 
},

//G//
ordenarPorVelocidad : function () {
    return this.autos.sort((a, b) => a.velocidad - b.velocidad);
},

//H//
habilitarVehiculo: function (patente) {
    const encontrado = this.buscarPorPatente(patente);
    if (encontrado !== undefined) {
        encontrado.sancionado = false;
        archivos.escribirJson("autos", this.autos);
        return encontrado;
    } else {
        return encontrado
    }
},



//I//
generarTanda: function () {
    
}

}



//C//
console.table(carrera.autosHabilitados())
//D//
carrera.listarAutos(carrera.autos);
//E//
console.log(carrera.buscarPorPatente("CJK912"))
//F//
console.table(carrera.filtrarPorCilindrada(1500))
//G//
console.table(carrera.ordenarPorVelocidad())
//H//
console.table(carrera.habilitarVehiculo("ODS523"))

