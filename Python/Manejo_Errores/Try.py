try:
    a = 10
    b = 0
    c = a / b
except ZeroDivisionError as e:
    print("ERROR ", e)
except TypeError as e:
    print("ERROR ", e)
else:
    print("No se ha producido error")
finally:
    print("El bloque finally siempre se ejecuta")
