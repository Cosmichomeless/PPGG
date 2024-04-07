function getbyIdx(arr, idx) {
    if (idx < 0 || arr.length <= idx) {
        console.log("no existe");
    }
    return arr[idx];
}

let resultado = getbyIdx([1, 2], 2);
console.log(resultado);
