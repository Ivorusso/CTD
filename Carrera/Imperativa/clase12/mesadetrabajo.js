let arrayCuentas = [
{
nroCuenta: 5486273622,
tipoDeCuenta: "Cuenta Corriente",
saldoEnPesos: 27771,
titularCuenta: "Abigael Natte",
},
{
nroCuenta: 1183971869,
tipoDeCuenta: "Caja de Ahorro",
saldoEnPesos: 8675,
titularCuenta: "Ramon Connell",
},
{
nroCuenta: 9582019689,
tipoDeCuenta: "Caja de Ahorro",
saldoEnPesos: 27363,
titularCuenta: "Jarret Lafuente",
},
{
nroCuenta: 1761924656,
tipoDeCuenta: "Cuenta Corriente",
saldoEnPesos: 32415,
titularCuenta: "Ansel Ardley",
},
{
nroCuenta: 7401971607,
tipoDeCuenta: "Cuenta Unica",
saldoEnPesos: 18789,
titularCuenta: "Jacki Shurmer",
},];


const banco = {
    consultarCliente: function(titular){
        for (let i = 0; i < arrayCuentas.length; i++) {
            const Cuenta = arrayCuentas[i];
            if (arrayCuentas[i].titularCuenta === titular){
                return Cuenta
            }
        }
    },
    deposito: function (titular, cantidad) {
        for (let ii = 0; ii < arrayCuentas.length; ii++) {
            const total = arrayCuentas[ii];
            const Cuenta = arrayCuentas[ii];
            if (arrayCuentas[ii].titularCuenta === titular) and (arrayCuentas[ii].saldoEnPesos === total)
                return total + [cantidad]
            }
            
        }
        
    }

const clienteEncontrado = banco.consultarCliente("Ansel Ardley")
console.log(clienteEncontrado);

const depositoRealizado = banco.deposito("Ansel Ardley", 5000)
console.log(depositoRealizado)


