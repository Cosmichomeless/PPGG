# (4 puntos) Generar el fichero porCCAA.txt que contenga, con el siguiente formato, el
# total de ventas por Comunidad Autónoma. El archivo debe estar ordenado por código
# de Comunidad Autónoma.
UTF = "utf-8"

with open("ccaa.txt", "r", encoding=UTF) as f:
    ccaa = {line.split(",")[0]: line.split(",")[1].strip() for line in f}

Comunidad_Prov = {}
with open("ccaa_prov.txt", "r", encoding=UTF) as f:
    for line in f:
        codigo, prov = line.split(",")
        if codigo in Comunidad_Prov:
            Comunidad_Prov[codigo].append(prov.strip())
        else:
            Comunidad_Prov[codigo] = [prov.strip()]

ventas = {}
with open("ventas.txt", "r", encoding=UTF) as f:
    for line in f:
        prov, empresa, venta = line.split(",")
        if prov in ventas:
            ventas[prov].append((empresa, float(venta)))
        else:
            ventas[prov] = [(empresa, float(venta))]


with open("porCCAA.txt", "w", encoding=UTF) as f:
    for ca, nombre in ccaa.items():
        suma_ventas = sum(
            venta
            for prov in Comunidad_Prov.get(ca, [])
            for empresa, venta in ventas.get(prov, [])
        )
        f.write(f" {ca} - {nombre}: {suma_ventas}\n")
