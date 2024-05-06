# (2 puntos) Generar el fichero porProv.txt que contenga, con el siguiente
# formato, el total de ventas por provincia. El archivo debe estar ordenado por
# código de provincia.

UTF = "utf-8"
LEER_PROVINCIAS = "prov.txt"
LEER_VENTAS = "ventas.txt"
ESCRIBIR = "porProv.txt"

try:
    provincias = {}
    with open(LEER_PROVINCIAS, "r", encoding=UTF) as prov:
        l_prov = prov.readlines()
        for venta in l_prov:
            codigo, nombre = venta.split(",")
            provincias[codigo] = nombre.strip()
except FileNotFoundError:
    print(f'El archivo "{LEER_PROVINCIAS}" no se encontró.')

try:
    ventas = {}
    with open(LEER_VENTAS, "r", encoding=UTF) as ven:
        l_ventas = ven.readlines()
        for venta in l_ventas:
            codigo, _, venta = venta.split(",")
            if codigo in ventas:
                ventas[codigo] += int(venta)
            else:
                ventas[codigo] = int(venta)

except FileNotFoundError:
    print(f'El archivo "{LEER_VENTAS}" no se encontró.')

try:
    with open(ESCRIBIR, "w", encoding=UTF) as wr:
        for codigo in sorted(ventas.keys()):
            wr.write(f"{codigo} - {provincias[codigo]}: {ventas[codigo]}\n")
except IOError as e:
    print(f'Error al escribir en el archivo "{ESCRIBIR}"')
