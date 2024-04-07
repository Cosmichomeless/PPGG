function Usuario(nombre, edad) {
    this.nombre = nombre;
    this.edad = edad;
    this.recuperarClave = function () {
        console.log("Recuperando clave " + this.nombre);
    };
}

let user1 = new Usuario("David", 30);
console.log(user1.nombre);
user1.recuperarClave();
