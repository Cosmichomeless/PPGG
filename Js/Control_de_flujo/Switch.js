let accion = "crear";

switch (accion) {
    case "crear":
        console.log("Crear usuario");
        break;
    case "editar":
        console.log("Editar usuario");
        break;
    case "eliminar":
        console.log("Eliminar usuario");
        break;
    case "lista":
        console.log("Listar usuarios");
        break;
    default:
        console.log("Acción no reconocida");
}
