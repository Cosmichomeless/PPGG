archivo_salida = "nuevo.txt"
encoding = "utf-8"  # Especifica el encoding adecuado para tu archivo
texto_a_escribir = "¡Hola, este es un texto con caracteres especiales como áéíóú!"

with open(archivo_salida, "a", encoding=encoding) as archivo:
    archivo.write(texto_a_escribir)
    archivo.write("\nLínea 2")
    archivo.close()

with open(archivo_salida, "r", encoding=encoding) as archivo:
    contenido = archivo.read()
    print("CONTENIDO: ", contenido)
