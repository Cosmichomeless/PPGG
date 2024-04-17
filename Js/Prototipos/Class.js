class Objeto {
    constructor() {}
    hola() {
        console.log("hola");
    }
}

let objeto = new Objeto();

console.log(objeto.__proto__);

objeto.__proto__.hola = () => {
    // modificamos la funcion que esta declarada en la clase
    console.log("modificado");
};

objeto.hola();

let arr = [];

arr.__proto__ = objeto; // esta es la forma de heredar un prototipo

arr.hola();

arr.__proto__.hola();
