/**
 * 
 */
var slinder = document.querySelector(".slinder-contenedor");
var slinderIndividual = document.querySelectorAll(".contenido-slinder");
var slinderImage = document.querySelectorAll(".img");
var contador = 1;
var width = slinderIndividual[0].clientWidth;
var intervalo = 3000;

window.addEventListener("resize", function () {
    width = slinderIndividual[0].clientWidth;
});
setInterval(function () {
    Slinder();
}, intervalo);
function Slinder() {
    slinder.style.transform = "translate(" + (-width * contador) + "px)";
    slinder.style.transition = "transform 1s";
    contador++;
    if (contador == slinderIndividual.length) {
        setTimeout(function () {
            slinder.style.transform = "translate(0px)";
            slinder.style.transition = "transform 0s";
            contador = 1;
        }, 1500);
    }
}