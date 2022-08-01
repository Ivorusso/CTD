/* ---------------------------------- texto --------------------------------- */
function validarTexto(texto) {
    if (texto.lenght < 4 || texto.lenght > 15) {
        return true
        
    } else{
        return false
    }
}

function normalizarTexto(texto) {
   return texto.toUpperCase()
    
}

/* ---------------------------------- email --------------------------------- */
function validarEmail(email) {
    var regex = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    // return regex.test(email) ? true : false;
    if (regex.test(email) === true) {
        normalizarEmail(email)
    } else{
        alert("Ingrese un email valido")
    }
}

function normalizarEmail(email) {
    return email.toLowerCase()
}

/* -------------------------------- password -------------------------------- */
function validarContrasenia(password) {
    if (password.lenght < 8 || password.lenght > 20){
        return true
    } else{
     alert("las clave debe ser entre 8 a 20 caracteres")
     return false
    }
    
}

function compararContrasenias(password_1, password_2) {
    if (password_1 === password_2){
        return true
    } else{
       alert("Las claves no coinciden")
          
    }
}
