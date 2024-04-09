const click = document.querySelector(".click");

click.addEventListener("click", (e) => {
    saludar(e);
});

function saludar() {
    window.alert("Hola Mundo");
    click.removeEventListener("click", saludar);
}

const dbclick = document.querySelector(".dbclick");

dbclick.addEventListener("dblclick", (e) => {
    saludar(e);
    dbclick.removeEventListener("dblclick", saludar);
});

const mouseover = document.querySelector(".mouseover");

mouseover.addEventListener("mouseover", (e) => {
    saludar(e);
    mouseover.removeEventListener("mouseover", saludar);
});

const mouseout = document.querySelector(".mouseout");

mouseout.addEventListener("mouseout", (e) => {
    saludar(e);
    mouseout.removeEventListener("mouseout", saludar);
});

const contextmenu = document.querySelector(".contextmenu");

contextmenu.addEventListener("contextmenu", (e) => {
    e.preventDefault();
    saludar(e);
    contextmenu.removeEventListener("contextmenu", saludar);
});

const mousedown = document.querySelector(".mousedown");

mousedown.addEventListener("mousedown", (e) => {
    saludar(e);
    mousedown.removeEventListener("mousedown", saludar);
});

const mouseup = document.querySelector(".mouseup");

mouseup.addEventListener("mouseup", (e) => {
    saludar(e);
    mouseup.removeEventListener("mouseup", saludar);
});

const mouseenter = document.querySelector(".mouseenter");

mouseenter.addEventListener("mouseenter", (e) => {
    saludar(e);
    mouseenter.removeEventListener("mouseenter", saludar);
});

const mouseleave = document.querySelector(".mouseleave");

mouseleave.addEventListener("mouseleave", (e) => {
    saludar(e);
    mouseleave.removeEventListener("mouseleave", saludar);
});
