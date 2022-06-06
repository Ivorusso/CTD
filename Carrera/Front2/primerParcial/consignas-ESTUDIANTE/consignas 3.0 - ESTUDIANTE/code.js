/* --------------------------- NO TOCAR DESDE ACÁ --------------------------- */
let datosPersona = {
  nombre: "",
  edad: 0,
  ciudad: "",
  interesPorJs: "",
};

const listado = [{
    imgUrl: "https://huguidugui.files.wordpress.com/2015/03/html1.png",
    lenguajes: "HTML y CSS",
    bimestre: "1er bimestre",
  },
  {
    imgUrl: "https://jherax.files.wordpress.com/2018/08/javascript_logo.png",
    lenguajes: "Javascript",
    bimestre: "2do bimestre",
  },
  {
    imgUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/React.svg/1200px-React.svg.png",
    lenguajes: "React JS",
    bimestre: "3er bimestre",
  },
];

const profileBtn = document.querySelector("#completar-perfil");
const materiasBtn = document.querySelector("#obtener-materias");
const verMasBtn = document.querySelector("#ver-mas");
const cambiarTema = document.querySelector('#cambiar-tema');

profileBtn.addEventListener("click", renderizarDatosUsuario);
materiasBtn.addEventListener("click", recorrerListadoYRenderizarTarjetas);
cambiarTema.addEventListener("click", alternarColorTema);
/* --------------------------- NO TOCAR HASTA ACÁ --------------------------- */

function obtenerDatosDelUsuario() {
  /* --------------- PUNTO 1: Escribe tu codigo a partir de aqui --------------- */
 const usuario = prompt("Nombre de Usuario")
 const usuarioEdad = parseInt(prompt("Año de Nacimiento"))
 const usuarioCiudad = prompt("Ciudad")
 const usuarioJs = prompt("Te interesaJs")

 const anioActual = 2022

 nombreUsuario = datosPersona["nombre"] = usuario;
 edadUsuario = datosPersona["edad"] = anioActual - usuarioEdad;
 ciudadUsuario = datosPersona["ciudad"] = usuarioCiudad;
 javascriptUsuario = datosPersona["interesPorJs"] = usuarioJs;

console.log (datosPersona)
}

function renderizarDatosUsuario() {
  /* ------------------- NO TOCAR NI ELIMINAR ESTA FUNCION. ------------------- */
  obtenerDatosDelUsuario();
  /* --------------- PUNTO 2: Escribe tu codigo a partir de aqui --------------- */
    const cardHeader = document.querySelector(".card-header")
    cardHeader.innerHTML = '';
    return cardHeader.innerHTML += `
    <h3>Nombre: <span id="#nombre">${datosPersona.nombre}</span></h3>
    <h3>Edad: <span id="#edad"> ${datosPersona.edad}</span>  </h3>
    <h3>Ciudad: <span id="#ciudad"> ${datosPersona.ciudad}</span></h3>
    <h3>Interes en Javascript: <span id="#javascript"> ${datosPersona.interesPorJs}</span></h3>
     `
  }



function recorrerListadoYRenderizarTarjetas() {
  /* ------------------ PUNTO 3: Escribe tu codigo desde aqui ------------------ */
  document.querySelector("#fila")
  fila.innerHTML = '';
  listado.forEach(element => {
    fila.innerHTML += `
    <div class="caja">
    <img src=${element.imgUrl} alt=${element.bimestre} >
    <p class="lenguajes"> ${element.lenguajes} </p>
    <p class="bimestre"> ${element.bimestre} </p>
    </div>
    ` 
  });


}

function alternarColorTema() {
  /* --------------------- PUNTO 4: Escribe tu codigo aqui --------------------- */
 const dom = document.querySelector("#sitio")
 dom.classList.toggle("dark")
}

/* --------------------- PUNTO 5: Escribe tu codigo aqui --------------------- */
const sobreMi = document.querySelector("#sobre-mi")
document.addEventListener('keydown', (event) => {
  if (event.key === "f") {
    sobreMi.removeAttribute("class");
  }
  alert('presionaste la tecla ' +  event.key);
});

