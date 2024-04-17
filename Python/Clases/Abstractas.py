from abc import abstractmethod

from Padres import Figura


class Figura(Figura):
    @abstractmethod
    def area(self):
        pass

    @abstractmethod
    def perimetro(self):
        pass


class Cuadrado(Figura):
    def __init__(self, lado):
        self.lado = lado

    def area(self):
        return (self.lado * self.lado)

    def perimetro(self,):
        return (self.lado * 4)


c = Cuadrado(5)
print(c.area())
print(c.perimetro())
print(c.lado)
