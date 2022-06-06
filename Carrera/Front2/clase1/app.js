// const piedra = 1;
// const papel =2;
// const tijera =3;
// let puntajeMaquina = 0;
// let puntajeUsuario = 0;
// let opcionUsuario = parseInt(prompt('¿piedra(1), papel(2), tijera(3)?'))
// let opcionMaquina = Math.floor(Math.random()*3 +1)


// console.log("Tu respuesta " + opcionUsuario)
// console.log("Respuesta de la maquina " + opcionMaquina)

//   switch(opcionUsuario) {
//     case 1:
//         if(opcionMaquina === 1) resultado = empate;
//         if(opcionMaquina === 2) resultado = ganaCompu;
//         if(opcionMaquina === 3) resultado = ganaUsuario;
//         break;
//     case 2:
//         if(opcionMaquina === 1) resultado = ganaUsuario;
//         if(opcionMaquina === 2) resultado = empate;
//         if(opcionMaquina === 3) resultado = ganaCompu;
//         break;
//     case 3:
//         if(opcionMaquina === 1) resultado = ganaCompu;
//         if(opcionMaquina === 2) resultado = ganaUsuario;
//         if(opcionMaquina === 3) resultado = empate;
//         break;
//   }


var name = prompt("Ingresa tu nombre")



var parrafo = document.createElement("P")
var text = document.createTextNode("Hola " + name)

parrafo.appendChild(text)
document.body.appendChild(text)

