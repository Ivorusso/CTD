//Agrega Caminos//
let edad = 15;

if (edad < 18) {
  console.log("No puede pasar al bar.");
} else if (edad < 21) {
  console.log("Puede pasar al bar, pero no puede tomar alcohol.");
} else if (edad < 0) {
  console.log("Error, edad invalida. Por favor ingrese un numero valido");
} else if (edad == 21) {
  console.log("Felicidades puedes pasar y alcanzaste la mayoria de edad");
} else if (edad % 2 != 0) {
  console.log("Sabias que tu edad es impar?");
} else {
  console.log("Puede pasar al bar y tomar alcohol.");
}

//Total a Pagar//
const coche = 86;
const moto = 70;
const autobus = 55;
const consumo = 25
const costoTotal = (86 * 25)

function totalAPagar(vehiculo, litrosConsumidos) {
    if (0 < consumo <= 25){
    console.log(costoTotal + 50);
} else if (consumo > 25){
    console.log (costoTotal + 25);
}

