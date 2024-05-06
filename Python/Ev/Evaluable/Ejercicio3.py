#(2 puntos) Generar el fichero porEmpresa.txt que contenga, con el siguiente
#formato, el total de ventas por empresa. El archivo debe estar ordenado por
#nombre de empresa.
UTF = "utf-8"
ARCHIVO = "ventas.txt"

ventas = {}
with open(ARCHIVO, "r", encoding=UTF) as ven:
    l_ventas = ven.readlines()
    for venta in l_ventas:
        _, empresa, venta = venta.split(",")
        if empresa in ventas:
            ventas[empresa] += int(venta)
        else:
            ventas[empresa] = int(venta)

with open ("porEmpresa.txt", "w", encoding=UTF) as wr:
    for empresa, venta in sorted(ventas.items()):
        wr.write(f"{empresa}: {venta}\n")