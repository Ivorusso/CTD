// Aquí realizamos un la consulta de la promesa, esperando su respuesta asíncrona
fetch('https://randomuser.me/api/')
    .then(response => {
        return response.json()
    })
    .then(data => {
        //manipulamos la respuesta
        console.log(data)
        renderizarDatosUsuario(data.results[0]);
    });


    const tarjeta = document.querySelector(".tarjeta")
    const btn = document.querySelector('#random');

function renderizarDatosUsuario(datos) {
    /* -------------------------------- CONSIGNA 1 -------------------------------- */
    tarjeta.innerHTML += `<img src="${datos.picture.large}"></img>
    <p>${datos.name.title} ${datos.name.first}  ${datos.name.last}<p>
    <p>${datos.email}<p>
    `
}


/* --------------------------- CONSIGNA 2 (extra) --------------------------- */

btn.addEventListener('click', function() {
    location.reload()
})