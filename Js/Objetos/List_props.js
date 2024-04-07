const puntos = {
    x: 10,
    y: 15,

    dibujar() {
        console.log("dibunjando");
    },
};

delete puntos.dibujar;
if ("dibujar" in puntos) {
    puntos.dibujar();
} else {
    console.log("No se puede dibujar");
}
console.log(Object.keys(puntos)); // devuelve un array con las propiedades del objeto

for (let llave of Object.keys(puntos)) {
    // devuelve un array con las propiedades del objeto
    console.log(llave, puntos[llave]);
}

for (entry of Object.entries(puntos)) {
    // devuelve un array con las propiedades y valores del objeto
    console.log(entry);
}

for (llave in puntos) {
    // devuelve un array con las propiedades del objeto
    console.log(llave, puntos[llave]);
} // pero esto es una forma nueva las otras dos son la froma antigua
