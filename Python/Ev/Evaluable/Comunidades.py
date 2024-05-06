UTF = 'utf-8'

# (2 puntos) Generar el fichero porTotal.txt que contenga, con el siguiente
# formato, el total de las ventas realizadas (la suma de todas las ventas que
# aparece en archivo ventas.txt)


def leer_ventas():
    ventas = {'total': 0}
    with open('ventas.txt', 'r',encoding=UTF) as ven:
        l_ventas = ven.readlines()
        for row in l_ventas:
            _, _, venta = row.split(',')
            ventas['total'] += int(venta)
        ven.close()
    return ventas

def escribir_por_total(ventas):
    with open('porTotal.txt', 'w',encoding=UTF) as f:
        f.write(f'Total: {ventas["total"]}\n')
        f.close()

# (2 puntos) Generar el fichero porProv.txt que contenga, con el siguiente
# formato, el total de ventas por provincia. El archivo debe estar ordenado por
# código de provincia
def leer_provincias():
    provincias = {}
    with open('provincias.txt', 'r',encoding=UTF) as prov:
        l_prov = prov.readlines()
        for row in l_prov:
            codigo, nombre = row.split(',')
            provincias[codigo] = nombre.strip()
        prov.close()
    return provincias

def leer_ventas_por_provincia():
    ventas = {}
    with open('ventas.txt', 'r',encoding=UTF) as ven:
        l_ventas = ven.readlines()
        for row in l_ventas:
            codigo, _, venta = row.split(',')
            if codigo in ventas:
                ventas[codigo] += int(venta)
            else:
                ventas[codigo] = int(venta)
        ven.close()
    return ventas

def escribir_por_provincia(provincias, ventas):
    with open('porProv.txt', 'w',encoding=UTF) as f:
        for codigo, venta in ventas.items():
            f.write(f'{provincias[codigo]}: {venta}\n')
        f.close()
