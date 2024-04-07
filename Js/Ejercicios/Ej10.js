let longitud = 7;
function createArray(n) {
    let array = [];
    let i = 0;
    if (n <= 0) {
        return [];
    }

    for (let i = 0; i < n; i++) {
        array[i] = i + 1;
        // array.push(i);
    }
    return array;
}

let resultado10 = createArray(longitud);
console.log(resultado10);
