let user = {
    id: 1,
    name: "david",
    age: 22,
};

for (const propiedad in user) {
    console.log(user[propiedad]);
}

let animales = ["gato", "perro", "conejo", "pez", "serpiente"];

for (let indice in animales) {
    console.log(indice, animales[indice]);
}
