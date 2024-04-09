//aqui se a forzado que la promesa sea rechazada

let nom = "emilio";

const prom = new Promise((resolve, reject) => {
    if (nom !== "David") {
        reject("El nombre no es David");
    } else {
        resolve("El nombre es David");
    }
});

prom.then((rej) => {
    console.log(rej);
}).catch((err) => {
    console.log(err);
});
