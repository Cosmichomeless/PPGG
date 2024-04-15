class Numeros:
    def __init__(self, a, b):
        self.operador1 = a
        self.operador2 = b

    def suma(self, a, b):
        return f'{a + b}'

    def resta(self, a, b):
        return f'{a - b}'

    def multiplicacion(self, a, b):
        return f'{a * b}'

    def division(self, a, b):
        return f'{a / b}'


N = Numeros(5, 6)

print(N.suma(5, 6))
print(N.resta(5, 6))
print(N.multiplicacion(5, 6))
print(N.division(5, 6))
