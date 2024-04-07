function Usuario(nombre, edad) {
    this.nombre = nombre;
    this.edad = edad;
}

console.log(Usuario.name);
console.log(Usuario.length);

function of(Fn, arg) {
    return new Fn(arg);
}

let user1 = of(Usuario, "David");
console.log(user1.nombre);

function retuned() {
    return function () {
        console.log("Hola mundo");
    };
}
let saludo = retuned();
saludo();
