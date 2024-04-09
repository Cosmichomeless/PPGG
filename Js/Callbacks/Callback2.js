class persona {
    constructor(nombre, apellido, edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}

console.log(new persona("David", "Gonzalez", 22));

const personas = [
    ["David", "Gonzalez", 22],
    ["Juan", "Perez", 23],
    ["Pedro", "Gomez", 24],
];

// for (const persona of personas) {
//     console.log(persona);
// }

personas.forEach((persona) => {
    console.log(persona);
});
