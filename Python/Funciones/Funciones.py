def saluda(nombre, apellido):
    print(f'nombre {nombre}, {apellido}')
    print('nombre', nombre, apellido)


saluda('david', 'rodriguez')


def suma(x: int, y: int):
    return x + y


print(suma(1, 2))


def saluda(nombre="Desconocido"):
    print('hola', nombre)


saluda("david")
