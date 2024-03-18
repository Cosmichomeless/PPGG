alto = int(input("Ingresa al alto"))
ancho = int(input("Ingrese el ancho"))
area = alto * ancho
perimetro = (alto * ancho) * 2

print(area)
print(perimetro)

if area > perimetro:
    print("area es mayor que el perimetro")
else:
    print("area es menor que el perimetro")

print(f'its pair {int(input("Dime un numero")) % 2 == 0}')


