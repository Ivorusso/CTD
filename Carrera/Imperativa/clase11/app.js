let peliculas = ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"] 
let peliculas2 = ["toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"]

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

function pasajeDeElementos(array1, array2) { 
  array1.push(array2.pop().toUpperCase()) 
  array1.push(array2.pop().toUpperCase()) 
  array1.push(array2.pop().toUpperCase()) 
  array1.push(array2.pop().toUpperCase()) 
  array1.push(array2.pop().toUpperCase()) 
  return array1 
  } 
  peliculas= pasajeDeElementos(peliculas, peliculas2);
  console.log(peliculas);
  console.log(peliculas2)



const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4]; 
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5]; 
function compararCalificaciones(asia, europa) { 
let comparacionesAsiaEuropa = [] 
comparacionesAsiaEuropa[0] = asia[0] === europa[0] 
comparacionesAsiaEuropa[1] = asia[1] === europa[1] 
comparacionesAsiaEuropa[2] = asia[2] === europa[2] 
comparacionesAsiaEuropa[3] = asia[3] === europa[3] 
comparacionesAsiaEuropa[4] = asia[4] === europa[4] 
comparacionesAsiaEuropa[5] = asia[5] === europa[5] 
comparacionesAsiaEuropa[6] = asia[6] === europa[6] 
comparacionesAsiaEuropa[7] = asia[7] === europa[7] 
comparacionesAsiaEuropa[8] = asia[8] === europa[8] 
return comparacionesAsiaEuropa 
} 
console.log(compararCalificaciones(asiaScores, euroScores))
