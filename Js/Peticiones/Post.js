let peticion;

if (window.XMLHttpRequest) peticion = new XMLHttpRequest();
else peticion = new ActiveXObject("Microsoft.XMLHTTP");

peticion.addEventListener("load", () => {
    let respuesta;
    if (peticion.status === 200) respuesta = peticion.response;
    else {
        respuesta =
            "Error " + peticion.status + " (" + peticion.statusText + ")";
    }
    console.log(JSON.parse(respuesta));
});
peticion.open("POST", "info.txt");

peticion.send();
