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
    console.log(peticion.status);
});
peticion.open("POST", "https://reqres.in/api/users");

peticion.send(JSON.stringify({ nombre: "Juan", edad: 25 }));
