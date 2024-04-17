class Persona:
    contador = 0

    @classmethod
    def generarSiguiente(cls):
        cls.contador += 1
        return cls.contador

    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
        self.id = Persona.generarSiguiente()

    def __str__(self):
        return f'Persona: {self.id} - {self.nombre}-{self.edad}'


p = Persona("David", 21)
print(p)
x = Persona("Laura", 22)
print(x)
d = Persona("Pepa", 23)
print(d)
h = Persona("Raul", 26)
print(h)