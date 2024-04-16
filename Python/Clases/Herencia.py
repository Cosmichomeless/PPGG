class Vehiculo:

    def __init__(self, color, ruedas):
        self.color: str = color
        self.ruedas: int = ruedas

    def __str__(self):
        return f'Color: {self.color},Ruedas: {self.ruedas}'


class Coche(Vehiculo):

    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad: int = velocidad

    def __str__(self):
        return f'Color: {self.color},Ruedas: {self.ruedas},Velocidad: {self.velocidad}'


class Bicicleta(Vehiculo):

    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo: str = tipo

    def __str__(self):
        return f'Color: {self.color},Ruedas: {self.ruedas},Tipo: {self.tipo}'


# Creamos un objeto de la clase Vehiculo
vehiculo = Vehiculo('Rojo', 4)
print(vehiculo)
# Creamos un objeto de la clase hija Coche
coche = Coche('Azul', 4, 150)
print(coche)
# Creamos un objeto de la clase hija Bicicleta
bicicleta = Bicicleta('Blanca', 2, 'Urbano')
print(bicicleta)
