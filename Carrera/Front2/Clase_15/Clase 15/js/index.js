const form = document.querySelector("form");
const comentarioInput = document.getElementById("comentario")
const ingresarComentario = document.querySelector(".comentarios")
const boton = document.querySelector(".boton-submit")
const arrayComentarios = [];
const botonBorrar = form.appendChild(document.createElement("button"));
botonBorrar.appendChild(document.createTextNode("Refrescar Comentarios"));

    boton.addEventListener ("click", function (e) {
    e.preventDefault()
    localStorage.setItem('comentario', comentarioInput.value);
    const comentarioRecuperado = localStorage.getItem('comentario')
    arrayComentarios.push(comentarioRecuperado)
    console.log(arrayComentarios)
    arrayComentarios.forEach(element => {
        if (element.length <= 0) {
            alert("ingrese un comentario")
        }else{
        ingresarComentario.innerHTML += `<p>${arrayComentarios.pop()}</p>`
        }
    });
 
    
})

btnBorrarComentarios.addEventListener("click", (e) => {
    e.preventDefault();
    localStorage.clear();
    arrayComentarios = [];
}
);
