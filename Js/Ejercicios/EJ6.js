let array6 = [2, 5, 7, 15, -5, -100, 55];

function cuantosPositivos(arr) {
    let cantidad = 0;
    for (const numero of arr) {
        if (numero > 0) {
            cantidad++;
        }
    }
    return cantidad;
}

let resultado6 = cuantosPositivos(array6);
console.log(resultado6);
