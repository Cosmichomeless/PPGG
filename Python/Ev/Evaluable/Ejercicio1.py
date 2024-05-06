# (2 puntos) Generar el fichero porTotal.txt que contenga, con el siguiente
# formato, el total de las ventas realizadas (la suma de todas las ventas que
# aparece en archivo ventas.txt)
UTF = "utf-8"
LEER_VENTAS = "ventas.txt"
ESCRIBIR = "porTotal.txt"
ventas_dic = {"total": 0}

try:
    with open(LEER_VENTAS, "r", encoding=UTF) as ven:

        l_ventas = ven.readlines()
        for venta in l_ventas:
            _, _, venta = venta.split(",")
            ventas_dic["total"] += int(venta)
        ven.close()

except FileNotFoundError:
    print(f"El archivo {LEER_VENTAS} no se encuentra.")
    ventas_dic["total"] = 0


try:
    with open(ESCRIBIR, "w", encoding=UTF) as f:
        f.write(f'Total: {ventas_dic["total"]}\n')
        f.close()

except IOError as e:
    print(f"Ocurrió un error al escribir en el archivo {ESCRIBIR}: {e}")
