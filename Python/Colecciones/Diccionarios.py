"""Diccionarios"""

edad = {"javier": 23, "maria": 25, "luis": 30}

for k,v in edad.items():
    print(k,v)

if 23 in edad.values():
    print("Si")
else:
    print("No")

# print(edad["maria"])

# edad["maria"] = 26
# edad["pedro"] = 31
# print(edad)

# a=edad.pop("maria")
# print(a)
# print(edad)
