"""Ejercicio 7"""

#Solicitar nombres por pantalla hasta introducir un INTRO y mostrarla sin valores repetidos.

nombres = set()

while nombre := input("Ingrese un nombre: "):
# nombre = input("Ingrese un nombre: ")
    if nombre == "":
        break
    nombres.add(nombre)

print(nombres)
