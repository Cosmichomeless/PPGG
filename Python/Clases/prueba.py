class miClase:
    var_clase = 0

    def __init__(self, atr1):
        self.atr1 = atr1
        miClase.var_clase += 1

    def hola(self):
        print("dinamico")

    @staticmethod
    def m_statico():
        print("estatico", miClase.var_clase)

o1 = miClase(4)
o2 = miClase(6)

print(o1.var_clase)
print(o2.var_clase)

miClase.var_clase = 99

print(o1.var_clase)
print(o2.var_clase)

o2.hola()
o2.m_statico()
