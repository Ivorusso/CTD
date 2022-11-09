function enviarMensaje(evento) {
  // Obtenemos el elemento que disparo el evento
  const elemento = evento.target;
  console.log("Elemento que dispara el evento", elemento);

  // Cada elemento tiene la propiedad "dataset", la cual contiene
  // la informacion que le pasamos utilizando el atributo "data-"
  const dataset = elemento.dataset;
  console.log("Dataset del elemento", dataset);

  // Podemos acceder a cada valor de la misma manera que accedemos a la propiedad
  // de un objeto.
  const titulo = dataset.titulo;

  // Como el valor devuelto es un string, lo convertimos en un number.
  const idUsuario = Number(dataset.idUsuario);

  // Ahora que tenemos la informacion que necesitamos, realizamos nuestro
  // requests a la API.

  const url = "https://ctd-todo-api.herokuapp.com/v1"
  const path = "/users"
  const payload = {
    "firstName": "ivan",
    "lastName": "rodriguezrusso",
    "email": "ivanrodriguezrusso@gmail.com",
    "password": "1234"
  }
  const settings = {
    method: "POST",
    headers: {
      "Content-type": "application/json",
    },
    body: JSON.stringify(payload),
  }
   const token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6I…DYzfQ.Rn4cNqFnv43Sb1tcgoxqDn6FIzKnokBCZ_iG7wyEvTc"


  fetch(`${url}${path}`, settings)
    .then((response) => response.json())
    .then((json) => {
      // Aqui obtenemos la respuesta de la API.
      console.log("Respuesta de la API", json);

      // Utilizamos la informacion para mostrar el mensaje en pantalla
      const contenedorMensaje = document.querySelector("#mensaje-posteado");
      contenedorMensaje.textContent = json.title;
    });
}

// {
//   "jwt": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJhdmFAbWFpbC5jb20iLCJpZCI6NTA4MywiaWF0IjoxNjU2Mzc0MzA3fQ.tOYjPNs4swjTt7H4tTdBHzXJ5bKWZAM3Pr8Dqt4xoQc"
// }
// Seleccionamos los elementos 'button'
const botones = document.querySelectorAll("button");

// Por cada boton, agregamos el listener para escuchar el evento 'click'.
botones.forEach((boton) => boton.addEventListener("click", enviarMensaje));
aaa