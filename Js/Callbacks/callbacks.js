function Prueba(callback) {
    callback("david");
}

function imprimir(nombre) {
    console.log(nombre);
}

Prueba(imprimir);
