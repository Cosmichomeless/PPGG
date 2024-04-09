const obtenerinformacion = (text) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve(text);
        }, Math.random() * 200); // en este caso como no se especifica el tiempo, se toma un valor aleatorio y te devuelve el texto en orden aleatorio
    });
};

// obtenerinformacion("text").then((resultado) => console.log(resultado));
// obtenerinformacion("david").then((resultado) => console.log(resultado));
// obtenerinformacion("raul").then((resultado) => console.log(resultado));

const obtenerinformacion2 = (text) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve(text);
        }, 1000); // en este caso se especifica el tiempo de 1 segundo para que se muestre en orden de llamado de la función
    });
};
const mostrardata = async () => {
    data1 = await obtenerinformacion2("text");
    data2 = await obtenerinformacion2("david");
    data3 = await obtenerinformacion2("raul");
    console.log(data1);
    console.log(data2);
    console.log(data3);
};

mostrardata();
