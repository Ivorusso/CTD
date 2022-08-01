// Esta es la base de datos de nuestros usuarios
const baseDeDatos = {
  usuarios: [
    {
      id: 1,
      name: "Steve Jobs",
      email: "steve@jobs.com",
      password: "Steve123",
    },
    {
      id: 2,
      name: "Ervin Howell",
      email: "shanna@melissa.tv",
      password: "Ervin345",
    },
    {
      id: 3,
      name: "Clementine Bauch",
      email: "nathan@yesenia.net",
      password: "Floppy39876",
    },
    {
      id: 4,
      name: "Patricia Lebsack",
      email: "julianne.oconner@kory.org",
      password: "MysuperPassword345",
    },
  ],
};

const main = document.querySelector("main");
const botonSesion = document.querySelector(".login-btn");
const error = document.getElementById("error-container");
const iniciandoSesion = document.getElementById("loader");
const titulo = document.querySelector("h1");
const formulario = document.querySelector("form");
function saludoUsuario() {
  const nombre = localStorage.getItem("nombre");
  const tituloUser = main.appendChild(document.createElement("h1"));
  tituloUser.appendChild(document.createTextNode(`¡Hola ${nombre}!`));
  const cerrarSesion = main.appendChild(document.createElement("button"));
  cerrarSesion.classList.add("login-btn");
  cerrarSesion.appendChild(document.createTextNode("Cerrar Sesión"));
  main.replaceChild(tituloUser, titulo);
  main.replaceChild(cerrarSesion, formulario);
  cerrarSesion.addEventListener("click", (e) => {
    localStorage.removeItem("nombre");
    localStorage.removeItem("usuario");
      main.replaceChild(titulo, tituloUser);
      main.replaceChild(formulario, cerrarSesion);
      mensajeCerrar.classList.add("hidden");
      iniciandoSesion.classList.add("hidden");
    const mensajeCerrar = main.appendChild(document.createElement("p"));
    mensajeCerrar.appendChild(document.createTextNode("Se está cerrando la sesión ¡Nos Vemos!"));
    function vueltaInicio() {
    setTimeout(vueltaInicio, 2000);
  
   }
    })
    }
    window.addEventListener("load", function () {
      if (localStorage.getItem("nombre") == null) {
        botonSesion.addEventListener("click", (e) => {
          e.preventDefault();
          const inputEmail = document.getElementById("email-input");
          const inputContrasenia = document.getElementById("password-input");
          const encontrarUsuario = baseDeDatos.usuarios.find(u => u.email === inputEmail.value && u.password === inputContrasenia.value);
          if (encontrarUsuario) {
            localStorage.setItem('usuario', encontrarUsuario.email);
            localStorage.setItem('nombre', encontrarUsuario.name);
            iniciandoSesion.classList.remove("hidden");
            error.classList.add("hidden");
            setTimeout(saludoUsuario, 6000);
          } else {
            error.classList.toggle("hidden");
            error.innerHTML = `<p>Usuario y/o Contraseña Invalida</p>`
          }
          formulario.reset();
        })
      } else {
        const nombre = localStorage.getItem("nombre");
        saludoUsuario(nombre);
      }
    })


    
