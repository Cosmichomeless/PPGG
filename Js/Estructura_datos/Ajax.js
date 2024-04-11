const peticion = new XMLHttpRequest();

peticion.addEventListener("load", () => {
    let respuesta = peticion.responseText;
    if (peticion.status === 200) {
        console.log(respuesta);
    } else {
        console.log("Error en la petición");
        console.log(respuesta);
    }
});
peticion.open("GET", "info.txt");

peticion.send();
