const Prueba = () => {
    try {
        return 1;
    } catch (e) {
        return 2;
    } finally {
        return 3;
    }
};
console.log(Prueba);
