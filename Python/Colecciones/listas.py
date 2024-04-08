

range(10)
# La siguiente línea de código devuelve una secuencia de números enteros que van desde 5 hasta 10, con un paso de 2:
range(5, 10, 2)
# La función range() se utiliza a menudo en bucles for. Por ejemplo, el siguiente código imprime los números del 0 al 9:
for i in range(10):
    print(i)
# La función range() también se puede utilizar para crear listas. Por ejemplo, el siguiente código crea una lista que contiene los números del 0 al 9:
lista = list(range(10))
# La función range() en comparaciones para validar un mes
mes = int(input("Ingrese un mes: "))

if mes in range(1, 13):
    print("mes correcto")
else:
    print("mes incorrecto")
