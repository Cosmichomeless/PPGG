class Persona:
    def __init__(self, nombre):
        self.nombre = nombre

    def mostrar(self):
        print("Muestra padre")


class Estudiante(Persona):
    def __init__(self, nombre, curso):
        super().__init__(nombre)
        self.curso = curso

    def __str__(self):
        return f"Nombre{super().__str__()}-{self.curso}"

    def estudiar(self):
        print("Estudiar")


p = Estudiante("David", "primero")
print(p.nombre)
print(p.curso)
print(p)
