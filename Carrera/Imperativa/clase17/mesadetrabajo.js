const nombres = ["Martin", "Homero", "Cosme", "Steven", "Adam"];

// const mostrarResultado = (valorIngresado) => valorIngresado === "" || valorIngresado === " "? " Nombre no encontrado" : " El nombre fue encontrado.";
// console.log(buscarNombre("x", mostrarResultado));


const buscarnombre = function (nombreBusqueda, callback) {
    let nombre = ""
    for (let i = 0; i < nombres.length; i++) {
        if (nombres[i] === nombreBusqueda)
        nombre === nombreBusqueda
    }
    callback(nombre)
}

function mostrarResultado(params) {
    if (params === "" )
    console.log("Nombre no encontrado")
}


console.log(buscarnombre("Homero", mostrarResultado))
buscarnombre("Homero", mostrarResultado)