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

let pares = [
    [1, { id: 1, nombre: "Juan" }],
    [2, { id: 2, nombre: "Pedro" }],
    [3, { id: 3, nombre: "Pablo" }],
];

function topairs(arr) {
    // let i = 0;
    // for (const id of arr) {
    //     console.log(id, arr["id" + "nombre"]);
    // }
    let pair = [];
    for (idx in arr) {
        let elemento = arr[idx];
        pair[idx] = [elemento.id, elemento];
    }
    return pair;
}

let resultado8 = topairs(ids);
console.log(resultado8);
