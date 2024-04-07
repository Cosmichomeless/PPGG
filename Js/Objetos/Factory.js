// Crear un objeto con una función
function createUsuario(id, email, name, activo) {
    return {
        id: id,
        email: email,
        name: name,
        activo: activo,
        recuperarClave: function () {
            console.log("Recuperando clave");
        },
    };
}

let user1 = createUsuario(1, "david@rodriguez", "David", true);
let user2 = createUsuario(2, "juan@perez", "Juan", false);
console.log(user1);
console.log(user2);