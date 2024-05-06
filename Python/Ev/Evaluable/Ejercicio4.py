# (4 puntos) Generar el fichero porCCAA.txt que contenga, con el siguiente formato, el
# total de ventas por Comunidad Autónoma. El archivo debe estar ordenado por código
# de Comunidad Autónoma.
UTF = "utf-8"

try:
    with open("ccaa.txt", "r", encoding=UTF) as f:
        ccaa = {l_ventas.split(",")[0]: l_ventas.split(",")[1].strip() for l_ventas in f}
except FileNotFoundError:
    print("El archivo 'ccaa.txt' no se encontró.")
    ccaa = {}

Comunidad_Prov = {}
try:
    with open("ccaa_prov.txt", "r", encoding=UTF) as f:
        for l_ventas in f:
            codigo, prov = l_ventas.split(",")
            if codigo in Comunidad_Prov:
                Comunidad_Prov[codigo].append(prov.strip())
            else:
                Comunidad_Prov[codigo] = [prov.strip()]
except FileNotFoundError:
    print("El archivo 'ccaa_prov.txt' no se encontró.")

ventas = {}
try:
    with open("ventas.txt", "r", encoding=UTF) as f:
        for l_ventas in f:
            prov, empresa, venta = l_ventas.split(",")
            if prov in ventas:
                ventas[prov].append((empresa, int(venta)))
            else:
                ventas[prov] = [(empresa, int(venta))]
except FileNotFoundError:
    print("El archivo 'ventas.txt' no se encontró.")

try:
    with open("porCCAA.txt", "w", encoding=UTF) as f:
        for ca, nombre in ccaa.items():
            suma_ventas = sum(
                venta
                for prov in Comunidad_Prov.get(ca, [])
                for empresa, venta in ventas.get(prov, [])
            )
            f.write(f" {ca} - {nombre}: {suma_ventas}\n")
            f.close()
except IOError as e:
    print(f"Ocurrió un error al escribir en el archivo 'porCCAA.txt': {e}")