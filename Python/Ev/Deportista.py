deportistas = {}

def CrearDeportista():
    while True:
        try:
            nombre = str(input("Ingrese el nombre del deportista: "))
            if nombre in deportistas.keys():
                print("Ese nombre ya existe introduzca otro")
                continue
            anio = int(input("Ingrese el año de nacimiento del deportista: "))
            if anio >= 2024 or anio <= 1900:
                if anio > 2024:
                    print("---------------------------------------------------------")
                    print("El año de nacimiento no puede ser mayor al año actual")
                    print("---------------------------------------------------------")
                elif anio < 1900:
                    print("---------------------------------------------------------")
                    print("El año de nacimiento no puede ser menor a 1900")
                    print("---------------------------------------------------------")
                continue
            deportistas[nombre] = anio
            break
        except ValueError:
            print("Por favor, introduzca un valor válido.")

def ModificarDeportista():
    while True:
        try:
            nombre = input("Ingrese el nombre del deportista que desea modificar: ")
            if nombre in deportistas:
                año_nacimiento = int(input("Ingrese el nuevo año de nacimiento del deportista: "))  # Convertir a int
                deportistas[nombre] = año_nacimiento
            else:
                print("---------------------------------------------------------")
                print("El deportista no existe")
                print("---------------------------------------------------------")
            break
        except ValueError:
            print("Por favor, introduzca un valor válido.")

def ConsultarDeportista():
    nombre = input("Ingrese el nombre del deportista que desea consultar: ")
    if nombre in deportistas:
        print("El año de nacimiento del deportista es: ", deportistas[nombre])
    else:
        print("---------------------------------------------------------")
        print("El deportista no existe")
        print("---------------------------------------------------------")

def BorrarDeportista():
    nombre = input("Ingrese el nombre del deportista que desea borrar: ")
    if nombre in deportistas:
        confirmacion = input("¿Está seguro de que desea borrar este deportista? (s/n): ")
        if confirmacion.lower() == 's':
            del deportistas[nombre]
            print("Deportista borrado con éxito.")
        else:
            print("Operación cancelada.")
    else:
        print("---------------------------------------------------------")
        print("El deportista no existe")
        print("---------------------------------------------------------")

def ListaDeportistas():
    for nombre, anio in deportistas.items():
        print(f"Nombre: {nombre}, Año de nacimiento: {anio}")

def DeportistasDeUnAño():
    while True:
        try:
            anio = int(input("Ingrese el año que desea consultar: "))
            deportistas_anio = {nombre: anio_nac for nombre, anio_nac in deportistas.items() if anio_nac == anio}
            if deportistas_anio:
                for nombre in deportistas_anio.keys():
                    print(nombre)
            else:
                print("No hay deportistas nacidos en ese año.")
            break
        except ValueError:
            print("Por favor, introduzca un valor válido.")

while True:
    try:
        opcion = int(input(''' 
        1. Crear deportista
        2. Modificar deportista
        3. Consultar deportista
        4. Borrar deportista
        5. Lista de deportistas
        6. Deportistas de un año
        7. Salir
        Ingresa una opción:'''))
        if opcion < 1 or opcion > 7:
            print("Opción inválida. Por favor, ingrese un número del 1 al 7.")
            continue
        
        if opcion == 1:
            CrearDeportista()
        elif opcion == 2:
            ModificarDeportista()
        elif opcion == 3:
            ConsultarDeportista()
        elif opcion == 4:
            BorrarDeportista()
        elif opcion == 5:
            ListaDeportistas()
        elif opcion == 6:
            DeportistasDeUnAño()
        elif opcion == 7:
            print("Gracias por todo.")
            break
    except ValueError:
        print("Opción inválida. Por favor, ingrese un número del 1 al 7.")