UTF = "utf-8"
ARCHIVO = "ventas.txt"
# (2 puntos) Generar el fichero porTotal.txt que contenga, con el siguiente
# formato, el total de las ventas realizadas (la suma de todas las ventas que
# aparece en archivo ventas.txt)


ventas = {"total": 0}
with open(ARCHIVO, "r", encoding=UTF) as ven:
    l_ventas = ven.readlines()
    for venta in l_ventas:
        _, _, venta = venta.split(",")
        ventas["total"] += int(venta)
    ven.close()

with open("porTotal.txt", "w", encoding=UTF) as f:
    f.write(f'Total: {ventas["total"]}\n')
    f.close()
