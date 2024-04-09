"""set"""

mset = {5, 4, 3, 1, 2,0} # Creación de un conjunto de datos unicos
print(mset)

mset1 = {8,6,1,2,3,5,7,8,77,7} # Creación de un conjunto de datos unicos

mset.remove(3) # Si el elemento no existe, se genera un error
print(mset)

mset.discard(4) # Si el elemento no existe, no se genera un error
print(mset)

print(len(mset)) # Devuelve la cantidad de elementos del conjunto
orden = sorted(mset) # Devuelve una lista ordenada con los elementos del conjunto
print(orden)

msetu = mset.union(mset1) # Devuelve un conjunto con los elementos de ambos conjuntos
print(msetu)

mseti = mset.intersection(mset1) # Devuelve un conjunto con los elementos comunes de ambos conjuntos
print(mseti)

msetd = mset.difference(mset1) # Devuelve un conjunto con los elementos que no son comunes de ambos conjuntos
print(msetd)

