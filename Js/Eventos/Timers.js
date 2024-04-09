setTimeout(() => {
    clearInterval(interval);
}, 5000);

const interval = setInterval(() => {
    document.write("Hola Mundo");
}, 1000);

