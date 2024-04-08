# Título: Operador Ternario

edad = 18

print("Es mayor de edad" if edad >= 18 else "Es menor de edad")

Numero = 1

Valor = Numero + 1 if Numero == 2 else Numero - 1

print(Valor)

Mes = int(input("Introduzca un número: "))
staition = None

if 1 <= Mes <= 3:
    staition = "Winter"
    print("Winter")
elif 4 <= Mes <= 6:
    staition = "Spring"
    print("Spring")
elif 7 <= Mes <= 9:
    staition = "Summer"
    print("Summer")
elif 10 <= Mes <= 12:
    staition = "Autumn"
    print("Autumn")
else:
    print("Error")

