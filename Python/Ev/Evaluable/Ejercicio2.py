# (2 puntos) Generar el fichero porProv.txt que contenga, con el siguiente 
# formato, el total de ventas por provincia. El archivo debe estar ordenado por 
# código de provincia.

UTF = "utf-8"

provincias = {}
with open("prov.txt", "r", encoding=UTF) as prov:
    l_prov = prov.readlines()
    for venta in l_prov:
        codigo, nombre = venta.split(",")
        provincias[codigo] = nombre.strip()


ventas = {}
with open("ventas.txt", "r", encoding=UTF) as ven:
    l_ventas = ven.readlines()
    for venta in l_ventas:
        codigo, _, venta = venta.split(",")
        if codigo in ventas:
            ventas[codigo] += int(venta)
        else:
            ventas[codigo] = int(venta)

with open("porProv.txt", "w", encoding=UTF) as wr:
    for codigo in sorted(ventas.keys()):
        wr.write(f"{codigo} - {provincias[codigo]}: {ventas[codigo]}\n")

