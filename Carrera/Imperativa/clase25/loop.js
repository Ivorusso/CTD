const mascota = require("./app")
function esperar(ms) {
  let d = new Date();
  let d2 = null;
  do { d2 = new Date(); }
  while (d2 - d < ms);
}

while (mascota.sigueConVida()) {
    mascota.estado()
    mascota.crecimiento()
    mascota.comer()
    mascota.descanso()
    mascota.comer()
    esperar(1000);
}
esperar(600);
console.log(!mascota.sigueConVida() ? "R.I.P. lo siento..." : "");
