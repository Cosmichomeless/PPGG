const getName2 = async () => {
    let resultado = await axios("info.txt");
    let div = document.createElement("div");
    div.classList.add("nombre");
    div.innerHTML = resultado.data.nombre;
    document.body.appendChild(div);
};
const getage2 = async () => {
    let resultado = await axios("info.txt");
    let div = document.createElement("div");
    div.classList.add("edad");
    div.innerHTML = resultado.data.edad;
    document.body.appendChild(div);
};

document.getElementById("getname").addEventListener("click", getName2);
document.getElementById("getage").addEventListener("click", getage2);
