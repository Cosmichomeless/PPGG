let pares = [
    [1, { nombre: "Juan" }],
    [2, { nombre: "Pedro" }],
    [3, { nombre: "Pablo" }],
];
let ids = [
    {
        id: 1,
        nombre: "Juan",
    },
    {
        id: 2,
        nombre: "Pedro",
    },
    {
        id: 3,
        nombre: "Pablo",
    },
];

function toCollections(arr) {
    let collection = [];

    for (const idx in arr) {
        let añadir = arr[idx];
        collection[idx] = añadir[1];
        collection[idx].id = añadir[0];
    }
    return collection;
}

let resultado9 = toCollections(pares);
console.log(resultado9);
