function Punto(x, y) {
    this.x = x;
    this.y = y;
    this.dibujar = function () {
        console.log("X: " + this.x + ", Y: " + this.y);
    };
}
let punto = { z: 10 };
Punto.apply(punto, [10, 20]); // funciona igual que call pero recibe los argumentos como un array
Punto.call(punto, 10, 20);
console.log(punto);
