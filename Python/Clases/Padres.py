class Color:

    def __init__(self, color):
        self.color = color

    def __str__(self):
        return f"Color: {self.color}"


class Figura:
    def __init__(self, lado):
        self.lado = lado

    def __str__(self):
        return f"Lado {self.lado}"


class Cuadrado(Color, Figura):
    def __init__(self, textura, color, lado):
        super().__init__(color)
        self.textura = textura
        self.color = color
        self.lado = lado
        # Color.__init__(color)
        # Figura.__init__(lado)


c = Color("verde")
f = Figura(23)

cua = Cuadrado("liso", "azul", 45)
