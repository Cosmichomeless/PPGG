const obj = {
    prop1: "value1",
    prop2: "value2",
    prop3: "value3",
};

const obtenerinformacion = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve(obj);
        }, 1000);
    });
};

const mostrarinformacion = async () => {
    resultado = await obtenerinformacion();
    console.log(resultado);
};
obtenerinformacion().then((resultado) => console.log(resultado));

mostrarinformacion();
