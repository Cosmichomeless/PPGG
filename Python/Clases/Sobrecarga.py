a = 5
b = 3
c = a + b
print(c)

x = "Hola"
y = "Adios"
print(x + y)

f = [1, 2, 3]
y = [4, 5, 6]
print(f + y)


class OTHER:
    def __init__(self, nombre, ventas):
        self.nombre = nombre
        self.ventas = ventas

    def __str__(self):
        return f'Persona: {self.nombre} - {self.ventas}'

    def __add__(self, other):
        res = OTHER("Total", self.ventas + other.ventas)
        return res



p = OTHER("David", 10)
x = OTHER("Felipe", 25)
y = p + x
print(p)
print(x)
print(y)
