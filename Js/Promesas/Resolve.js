let nombre = "David";

const promesa = new Promise((resolve, reject) => {
    // Se crea una promesa
    if (nombre !== "David") {
        // Se evalua si el nombre es David
        reject("El nombre no es David");
    } else {
        // Si el nombre es David
        resolve(nombre);
    }
});
promesa
    .then((res) => {
        // Se ejecuta si la promesa se resuelve
        console.log(res);
    })
    .catch((err) => {
        // Se ejecuta si la promesa es rechazada
        console.log(err);
    });
