"use strict"; // Modo estricto activado

let nombre = "Juan"; // Modo estricto activado

const objt = {};
Object.defineProperty(objt, "nombre", { value: "Juan", writable: false });

objt.nombre = "Pedro";

console.log(objt.nombre);
