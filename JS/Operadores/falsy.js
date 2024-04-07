//short circuit

//falso
// undefined
// null
// 0
// ''
// NaN

let nombre = "";
let username = nombre && "Desconocido";
console.log(username);

function f1() {
  console.log("f1");
  return true;
}

function f2() {
  console.log("f2");
  return false;
}

console.log(f1() && f2()); //esto imprime las dos funciones por que la primera devuelve true

// verdadero
// ' '
// {}
// []
// 1
// 3.14
// -1
// 'false'
// 'true'
