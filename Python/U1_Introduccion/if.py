# Tema: Condicionales



Numero = int(input("Ingrese un número: "))

if Numero == 1 or Numero == 2 or Numero == 3:
    print("El número es 1, 2 o 3")
else:
    print("El numero no es correcto")

print(f'{Numero} es un número {"El numero es 1,2,3" if Numero ==
      1 or Numero == 2 or Numero == 3 else "El numero no es correcto"}')


if 1 <= Numero <= 3:
    print("El número es 1, 2 o 3")
else:
    print("El numero no es correcto")

