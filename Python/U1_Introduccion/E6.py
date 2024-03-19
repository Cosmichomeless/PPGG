print("Proporcione los siguientes datos del libro:")
nombre = input("Proporciona el nombre del libro: ")
ID = int(input("Proporciona el ID del libro: "))
precio = float(input("Proporciona el precio del libro: "))
ENVIO = input("Indica si el ENVIO es gratuito (True/False): ").lower()


if ENVIO == "true":
    ENVIO = True
elif ENVIO == "false":
    ENVIO = False
else:
    ENVIO = "Valor incorrecto, debe ser True/False"

print(f'''
    Nombre: {nombre}
    ID: {id}
    Precio: {precio}
    Envio gratuito: {ENVIO}
''')
