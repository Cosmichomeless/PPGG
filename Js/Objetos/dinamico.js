const user = { id: 1 };
user.name = "David";
user.guardar = function () {
    console.log("Guardando usuario", user.name);
};
user.guardar();
const user1 = Object.freeze({ id: 1 }); // no deja agregar ni modificar propiedades
const user2 = Object.seal({ id: 2 }); // no deja agregar propiedades pero si modificar las existentes
user2.name = "David";
user2.id = 3;
console.log(user2.name);
console.log(user2.id);
