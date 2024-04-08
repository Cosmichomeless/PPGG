array = [1, 2, 3, 4, 6, -11, -100]


def maxi(array):
    i = 0
    for numero in array:
        if numero > i:
            i = numero
    print(i)


maxi(array)


def max_de_tres(n1,n2,n3):
    if n1 > n2 and n1 > n3:
        print(n1)
    elif n2 > n1 and n2 > n3:
        print(n2)
    else:
        print(n3)

max_de_tres(1,3,2)

def longitud(array):
    i = 0
    for numero in array:
        i += 1
    print(i)

longitud(array)

def vocal(letra):
    letra = letra.lower()
    if letra == ['a', 'e', 'i', 'o', 'u']:
        print('Es vocal')
    else:
        print('No es vocal')

vocal('a')

def suma(array):
    i = 0
    for numero in array:
        i += numero
    print(i)

def multiplica(array):
    i = 1
    for numero in array:
        i *= numero
    print(i)    

suma(array)
multiplica(array)


#def añade(numero):
#    lista = []
#    lista.append(numero)
#    return lista

#resultado = añade(int(input('Introduce un numero: ')))
#print(resultado)


def inversa(cadena):
    return cadena[::-1] 

    cadena_inversa = ''
    for letra in cadena:
        cadena_inversa = letra + cadena_inversa
    return cadena_inversa

print(inversa('hola'))