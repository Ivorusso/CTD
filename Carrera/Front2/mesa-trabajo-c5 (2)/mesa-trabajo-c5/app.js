// let felinos = {
//     url: "./imagenes/chita.jpg",
//     titulo: "El guepardo",
//     descripcion: "El guepardo o chita (Acinonyx jubatus)1​ es un miembro atípico de la familia de los félidos. Es el único representante vivo del género Acinonyx. Caza gracias a su vista y a su gran velocidad. Es el animal terrestre más veloz, ya que alcanza una velocidad punta de 115 km/h en carreras de hasta cuatrocientos o quinientos metros."
// }

const container = document.querySelector(".contenedor")

// container.innerHTML += `
// <div class="item">
// <img src=${felinos.url} >
// <h2> ${felinos.titulo} </h2>
// <p> ${felinos.descripcion} </p>
// </div>
// ` 

const divItem = document.createElement("div")
const img = document.createElement("img")
const h2 = document.createElement("h2")
const p = document.createElement("p")

divItem.setAttribute("class", "item")
img.setAttribute("src", "./imagenes/chita.jpg")
img.setAttribute("alt", "Imagen de Chita")

h2.innerText = "El guepardo"
p.innerText = "El guepardo o chita (Acinonyx jubatus)1​ es un miembro atípico de la familia de los félidos. Es el único representante vivo del género Acinonyx. Caza gracias a su vista y a su gran velocidad. Es el animal terrestre más veloz, ya que alcanza una velocidad punta de 115 km/h en carreras de hasta cuatrocientos o quinientos metros."

//padre le va a agregar un hijo
divItem.appendChild(img)
divItem.appendChild(h2)
divItem.appendChild(p)

console.log(divItem)

container.appendChild(divItem)


