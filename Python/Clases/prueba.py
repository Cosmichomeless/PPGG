class miClase:
    var_clase = 10

    def __init__(self, atr1):
        self.atr1 = atr1


o1 = miClase(4)
o2 = miClase(6)

print(o1.var_clase)
print(o2.var_clase)

miClase.var_clase = 99

print(o1.var_clase)
print(o2.var_clase)
