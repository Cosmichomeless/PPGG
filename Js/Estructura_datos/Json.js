deserializada = {
    var1: "Juan",
    var2: "Pedro",
};

const serializado = JSON.stringify(deserializada);
const deserializado = JSON.parse(serializado);
console.log( typeof serializado);
console.log(typeof deserializado);

