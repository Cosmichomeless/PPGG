# Crear una función en Python que reciba una lista de palabras y devuelva un diccionario con la cantidad de veces que aparece la palabra en la lista. La carga de la lista de palabras
# se hace por teclado hasta que se pulsa INTRO

def contar_palabras():
    palabras = []
    while True:
        palabra = input('Introduce una palabra: ')
        if palabra == '':
            break
        palabras.append(palabra)
    palabras_dic = {}
    for palabra in palabras:
        if palabra in palabras_dic:
            palabras_dic[palabra] += 1
        else:
            palabras_dic[palabra] = 1
    return palabras_dic

print(contar_palabras())
