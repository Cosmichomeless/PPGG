class Perro:
    def sonido(self):
        print('guau')


class Gato:
    def sonido(self):
        print('miau')


class Vaca:
    def sonido(self):
        print('muu')


def hacer_sonido(a):
    if isinstance(a, Perro):
        print("Es perro")
    elif isinstance(a, Gato):
        print('Es gato')
    else:
        print('Es vaca')
    a.sonido()


p = Perro()
g = Gato()
v = Vaca()

hacer_sonido(p)
hacer_sonido(g)
hacer_sonido(v)
