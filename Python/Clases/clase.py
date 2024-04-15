class Persona:
    def __init__(self, nombre, edad, *args, **kwargs):
        self.nombre = nombre
        self.edad = edad
        self.lista = args
        self.dicc = kwargs

    @property
    def nombre(self):
        return self.nombre

    @nombre.setter
    def nombre(self, nuevonombre):
        print("cargando nuevo valor")
        return self.nombre


def mostrar(self):
    print(f'Nombre: {self.nombre} - Edad: {self.edad} Lista: {self.lista} Dic: {self.dicc}')


P = Persona("David", 21, "uno", "dos", "tres", m="manzada", p="pera")

print(P.edad, P.nombre)
P.mostrar()

X = Persona("Maria", 21)
Persona.mostrar(X)

print(P)
