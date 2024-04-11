const getName = async () => {
    let peticion = await fetch("info.txt");
    let resultado = await peticion.json();
    let div = document.createElement("div");
    div.classList.add("nombre");
    div.innerHTML = resultado.nombre;
    document.body.appendChild(div);
};
const getage = async () => {
    let peticion = await fetch("info.txt");
    let resultado = await peticion.json();
    let div = document.createElement("div");
    div.classList.add("edad");
    div.innerHTML = resultado.edad;
    document.body.appendChild(div);
};

document.getElementById("getname").addEventListener("click", getName);
document.getElementById("getage").addEventListener("click", getage);
