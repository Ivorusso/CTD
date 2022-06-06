function suma(numero1, numero2) {
    return numero1 + numero2
}
function resta(numero1, numero2) {
    return numero1 - numero2
}
function multiplicacion(numero1, numero2) {
    return numero1 * numero2
}
function division(numero1, numero2) {
    return numero1 / numero2
}
function calculadora(numero1, numero2, operacion) {
    return operacion(numero1, numero2)
}
console.log (calculadora(2, 3, suma));