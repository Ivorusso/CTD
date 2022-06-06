const saludo = (nombre) => "hola " + nombre + " como estas?";

const saludo2 = (nombre, saludo) => "hola " + nombre + saludo;

console.log(saludo("juan carlos"));
console.log(saludo2("juan carlos", " como estas c"));

////////////////////////callback///////////////////////////////////////////
function suma(numero1, numero2) {
  return numero1 + numero2;
}
function resta(numero1, numero2) {
  return numero1 - numero2;
}
function multiplicacion(numero1, numero2) {
  return numero1 * numero2;
}
function division(numero1, numero2) {
  return numero1 / numero2;
}
function calculadora(numero1, numero2, operacion) {
  return operacion(numero1, numero2);
}
console.log(calculadora(2, 3, suma));
///////////////////////////////////////////////////////////////////////////
function crearURL(palabra) {
  return "http://www." + palabra + ".com";
}
function largoString(palabra) {
  return palabra.length;
}

function procesar(arr, cb) {
  let res = [];
  for (const e of arr) {
    res.push(cb(e));
  }
  return res;
}

const urlCompletas = procesar(
  ["google", "yahoo"],
  (palabra) => "http://www." + palabra + ".com"
);
console.log(urlCompletas); // imprime [ 'http://www.google.com', 'http://www.yahoo.com' ]

const largoDeElmentos = procesar(["google", "yahoo"], largoString);
console.log(largoDeElmentos); // imprime [ 6, 5 ]

///////////////////////////////////////////////////////////////////////////
function portugues(param) {
  console.log("o resultado é : " + param);
}
//portugues(4);

const español = function (param) {
  console.log("el resultado es: " + param);
};
//español(4);

const ingles = (param) => console.log("the result is: " + param);
//ingles(4);

function sumadora(num1, num2, cb) {
  let sum = num1 + num2;
  cb(sum);
}

sumadora(5, 5, portugues);
sumadora(5, 5, español);
sumadora(5, 5, function (param) {
  console.log("the result is: " + param);
});
sumadora(5, 5, (param) => console.log("the result is: " + param));
///////////////////////////////////////////////////////////////////////////
