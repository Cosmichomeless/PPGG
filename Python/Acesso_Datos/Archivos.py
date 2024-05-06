archivo_entrada = "archivo.txt"
encoding = "utf-8"  # Especifica el encoding adecuado para tu archivo

with open(archivo_entrada, "r", encoding=encoding) as archivo:
    contenido = archivo.read()

print(contenido)

archivo_salida = "salida.txt"
encoding = "utf-8"  # Especifica el encoding adecuado para tu archivo
texto_a_escribir = "¡Hola, este es un texto con caracteres especiales como áéíóú!"

with open(archivo_salida, "w", encoding=encoding) as archivo:

    archivo.write(texto_a_escribir)
    archivo = open("a.txt", "a", encoding="utf-8")
    archivo.write("Línea 2\n")
    archivo.close()
    archivo = open("a.txt", "r", encoding="utf-8")
    contenido = archivo.read()
    print("CONTENIDO: ", contenido)
