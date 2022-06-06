function arregloDeObjetos(number) {
    const array1 = []
    for (let i = 1; i <= number; i++) {
        const objeto = {valor : "",}
        objeto.valor=i 
    array1.push(objeto)
    }

    return array1
}

console.table(arregloDeObjetos(5))
console.table(arregloDeObjetos(3))



function arregloDeObjetos2(numero, palabra) {
    const array2 = []
    for (let i = 1; i <= numero; i++) {
        const objeto2 = {[palabra] : i,}
    array2.push(objeto2)
    }

    return array2
}

console.log(arregloDeObjetos2(5, "hola"))
console.log(arregloDeObjetos2(3, "hola"))