# Queremos definir una clase abstracta llamada Forma que contenga un método abstracto llamado calcular_area() que deberá ser implementado por las clases concretas
# que heredan de ella, como Rectangulo y Circulo. Además, queremos definir un método común llamado obtener_nombre() que devuelva el nombre de la forma
import math
from abc import abstractmethod


class forma:
    @abstractmethod
    def calcular_area(self):
        pass

    def obtener_nombre(self):
        return self.__class__.__name__


class mi_rectangulo(forma):
    def __init__(self, lado1, lado2):
        self.lado1 = lado1
        self.lado2 = lado2

    def calcular_area(self):
        return self.lado1 * self.lado2


class mi_circulo(forma):
    def __init__(self, radio):
        self.radio = radio

    def calcular_area(self):
        return math.pi * (2 * self.radio)


m = mi_rectangulo(5, 10)
c = mi_circulo(5)

print(m.obtener_nombre())
print(m.calcular_area())
print(c.obtener_nombre())
print(c.calcular_area())
