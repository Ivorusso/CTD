let dom = document.body
function darkmode() {
    dom.classList.toggle("oscuro")
    button = document.querySelector("button")
    button.innerText = estado ? "oscuro" : "Claro"
}