let array = [2, 5, 7, 15, -5, -100, 55];

function getMenorMayor(arr) {
    // arr.sort(); // primero lo ordenamos
    // let mayor = Math.max(...arr); //aqui sacamos cual es el mayor indice
    // let menor = Math.min(...arr); //aqui sacamos cual es el menor indice
    // console.log(mayor, menor);
    let menor = arr[0];
    let mayor = arr[0];
    for (numero of arr) {
        menor = menor < numero ? menor : numero;
        mayor = mayor > numero ? mayor : numero;
    }
    return ["El menor es: " + menor, "El mayor es: " + mayor];
}

let resultado = getMenorMayor(array);
console.log(resultado);
