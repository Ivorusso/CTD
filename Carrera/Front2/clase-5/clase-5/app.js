// let items = document.querySelectorAll("li")
// let valor = "Pepe"
// for (let item of items) {
//    item.innerHTML = `<p>${valor}</p>`
// }

// let persona = {
//     nombre: "Juan",
//     edad: "23"
// }

// for (let datos in persona) {
//     console.log(persona[datos])
//  }

let item = document.querySelectorAll("li")
console.log(item)

function darkmode() {
    // if (item[3].classList.contains("red")) {
    //     item[3].classList.remove("red")
    // }
    // else {
    //     item[3].classList.add("red")
    // }

    // item[3].classList.toggle("red")
    item[3].style.color = "red"
    item[3].style.fontSize = "10px"
}