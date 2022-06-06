const archivos = require("./lecturaescritura");
let arrayPokemones = archivos.leerJson("response_ability");

function buscarPokemon(name){
    var pokemonEncontrado = false;
    var url;
   
    arrayPokemones.results.forEach(pokemon => {
        if(pokemon.name == name){
            pokemonEncontrado = true;
            url = pokemon.url;
        }        
});
    if(pokemonEncontrado){
        console.log("se encontro el pokemon " + url)
       }else{
        console.log("no se encontro el pokemon")
       }
}
buscarPokemon("stench")

const axios = require('axios');

axios.get('https://pokeapi.co/api/v2/ability/').then(resp => {

    console.log(resp.data);
    console.log(find(resp.data, "shield-dust"));
});
function find(data, n) {
    return data.results.find(x => x.name === n);
}




