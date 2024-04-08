NUM1 = int(input("Ingrese un numero: "))
NUM2 = int(input("Ingrese otro numero: "))

if NUM1 > NUM2:
    print(f'El numero {NUM1} es mayor que el numero {NUM2}')
elif NUM1 == NUM2:
    print(f'El numero {NUM1} es igual que el numero {NUM2}')
else:
    print(f'El numero {NUM1} es menor que el numero {NUM2}')
