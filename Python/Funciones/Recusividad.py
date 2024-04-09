# Imprimir números de 5 a 1 de manera descendente usando funciones recursivas.

def imprimir(numero):
    if numero == 0:
        return
    else:
        print(numero)
        imprimir(numero - 1)
    
imprimir(5)
