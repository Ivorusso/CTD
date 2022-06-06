let peliculas = [
  "star wars",
  "totoro",
  "rocky",
  "pulp fiction",
  "la vida es bella",
];

function aMayusculas(arrayPelis) {
  arrayPelis[0] = arrayPelis[0].toUpperCase();
  arrayPelis[1] = arrayPelis[1].toUpperCase();
  arrayPelis[2] = arrayPelis[2].toUpperCase();
  arrayPelis[3] = arrayPelis[3].toUpperCase();
  arrayPelis[4] = arrayPelis[4].toUpperCase();
  return arrayPelis;
}

peliculas = aMayusculas(peliculas);
peliculas[3] = "wally";
console.log(peliculas);

const peli1 = "titanic";
const peli2 = "titanic2";
const array2 = [peli1, peli2];
console.log(array2);
array2[0] = "wally";
console.log(array2);

console.log(peliculas.length);
for (let i = 0; i < peliculas.length; i++) {
  const peli = peliculas[i];
  console.log(peli);
}

function aMayus(array) {
  const nuevoArray = [];
  for (let i = 0; i < array.length; i++) {
    nuevoArray[i] = array[i].toUpperCase();
  }
  return nuevoArray;
}

function aMayus2(array) {
  const nuevoArray = [];
  let i = 0;
  while (i < array.length) {
    nuevoArray[i] = array[i].toUpperCase();
    i++;
  }
  return nuevoArray;
}

const nuevoArray = aMayus(peliculas);
const nuevoArray2 = aMayus2(peliculas);
console.log(nuevoArray);
console.log(nuevoArray2);
