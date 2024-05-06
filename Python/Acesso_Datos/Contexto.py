class  micContexto:
    def __enter__(self):
        print("Entro al contexto")
        self.archivo=open("a.txt","r",encoding="utf-8")
        return self.archivo

    def __exit__(self, exc_type, exc_val, exc_tb):
        print("Fin de contexto")
        self.archivo.close()



with micContexto("a.txt") as obj:
    print("Dentro del contexto")
    contenido = obj.read()
    print(contenido)