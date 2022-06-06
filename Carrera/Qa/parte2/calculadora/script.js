function suma(numero1, numero2){
    if (isNaN(numero1) || isNaN(numero2)){
        return false;
    }else {
        return numero1 + numero2;
    }
}

function resta(numero1, numero2){
    if (isNaN(numero1) || isNaN(numero2)){
        return false;}
        else{
             return numero1 - numero2;
        }
}
function multiplicar(numero1, numero2){
    if (isNaN(numero1) || isNaN(numero2)){
        return false;
    }else{
  return  numero1 * numero2;
    }
}
function division(numero1, numero2){
    if (isNaN(numero1) || isNaN(numero2)){
        return false;
    }else{
    return numero1 / numero2;
    }
}


function calcular(numero1, numero2, operacion){
    if(operacion === "suma"){
        return suma(numero1, numero2)
    } else if(operacion === "resta"){
        return resta(numero1, numero2)
    }else if(operacion === "multiplicar"){
        return multiplicar(numero1, numero2)
    }else if(operacion === "division"){
        return division(numero1, numero2)
    }else{
        console.log("la operacion ingresada no es valida")
    }

}

console.log(calcular(2, 4, "division"))
console.log(calcular(2, 4, "multiplicar"))
console.log(calcular(2, 4, "suma"))
console.log(calcular(2, 4, "resta"))
console.log(calcular("2", 4, resta))
console.log(calcular(2, 4, "aaaaaa"))
