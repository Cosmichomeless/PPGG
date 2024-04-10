#  Actividad 6: Python 1
#  Crear en Python una aplicación que tenga un menú con las siguientes opciones:
#  1. Crear deportista
#  2. Modificar deportista
#  3. Consultar deportista
#  4. Borrar deportista
#  5. Lista de deportistas
#  6. Deportistas de un año
#  7. Salir
#  Crear deportista: Pide por pantalla un nombre y el año de nacimiento y lo guarda
#  en memoria
#  Modificar deportista: Pide un nombre de deportista y pide el nuevo año de
#  nacimiento y modifica lo almacenado en memoria
#  Consultar deportista: Pide un nombre de deportista y muestra el año de nacimiento
#  Borrar deportista: Pide un nombre de deportista y pide confirmación si se quiere
#  borrar el elemento. Si el usuario lo confirma, se borra
#  Lista de deportistas: Muestra una tabla con todos los nombres y año de nacimiento
#  de todos los deportistas.
#  Deportistas de un año: Se solicita un año y se muestra el nombre de todos los
#  deportistas nacidos ese año
#  Salir: Sale de la aplicación.
deportistas = {}
def CrearDeportista(deportistas):
    nombre = str(input("Ingrese el nombre del deportista: "))
    anio = int(input("Ingrese el año de nacimiento del deportista: "))
    while anio >= 2024 & anio <= 1900:
        if anio > 2024:
            print("---------------------------------------------------------")
            print("El año de nacimiento no puede ser mayor al año actual")
            print("---------------------------------------------------------")
            anio = int(input("Ingrese el año de nacimiento del deportista: "))
        elif anio < 1900:
            print("---------------------------------------------------------")
            print("El año de nacimiento no puede ser menor a 1900")
            print("---------------------------------------------------------")
            anio = int(input("Ingrese el año de nacimiento del deportista: "))

            #cambiar que no deje introducir el mismo nombre si ya existe ya que cambia el año de nacimiento
    deportistas[nombre] = anio


def ModificarDeportista(deportistas):
    nombre = input("Ingrese el nombre del deportista que desea modificar: ")
    if nombre in deportistas:
        año_nacimiento = input("Ingrese el nuevo año de nacimiento del deportista: ")
        deportistas[nombre] = año_nacimiento
    else:
        print("---------------------------------------------------------")
        print("El deportista no existe")
        print("---------------------------------------------------------")

def ConsultarDeportista(deportistas):
    nombre = input("Ingrese el nombre del deportista que desea consultar: ")
    if nombre in deportistas:
        print("---------------------------------------------------------")
        print(f"El año de nacimiento del deportista {nombre} es {deportistas[nombre]}")
        print("---------------------------------------------------------")
    else:
        print("---------------------------------------------------------")
        print("El deportista no existe")
        print("---------------------------------------------------------")

def BorrarDeportista(deportistas):
    nombre = input("Ingrese el nombre del deportista que desea borrar: ")
    if nombre in deportistas:
        confirmacion = input("¿Está seguro que desea borrar el deportista? S/N: ")
        if confirmacion == "S":
            del deportistas[nombre]
            print("---------------------------------------------------------")
            print(f"El deportista {nombre} ha sido borrado")
            print("---------------------------------------------------------")
    else:
        print("---------------------------------------------------------")
        print("El deportista no existe")
        print("---------------------------------------------------------")

def ListaDeportistas(deportistas):
    print("---------------------------------------------------------")
    print("Lista de deportistas")
    print("---------------------------------------------------------")
    print("Nombre\t\t\tAño de nacimiento")
    for nombre, año_nacimiento in deportistas.items():
        print(f"{nombre}\t\t\t{año_nacimiento}")
    print("---------------------------------------------------------")

def DeportistasDeUnAño(deportistas):
    año = input("Ingrese el año que desea consultar: ")
    print("---------------------------------------------------------")
    print(f"Deportistas nacidos en el año {año}")
    print("---------------------------------------------------------")
    for nombre, año_nacimiento in deportistas.items():
        if año_nacimiento == año:
            print(f"{nombre}")
    print("---------------------------------------------------------")

while True:
    
    opcion = input(''' 
    1. Crear deportista
    2. Modificar deportista
    3. Consultar deportista
    4. Borrar deportista
    5. Lista de deportistas
    6. Deportistas de un año
    7. Salir
    Ingresa una opción:''')

    if (opcion == "1"):
        CrearDeportista(deportistas)
    elif (opcion == "2"):
        ModificarDeportista(deportistas)
    elif (opcion == "3"):
        ConsultarDeportista(deportistas)
    elif (opcion == "4"):
        BorrarDeportista(deportistas)
    elif (opcion == "5"):
        ListaDeportistas(deportistas)
    elif (opcion == "6"):
        DeportistasDeUnAño(deportistas)
    elif (opcion == "7"):
        print("Gracias por todo")
        break

