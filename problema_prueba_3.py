"""
    Ingresaran una cadena de texto de minimo 5 palabras
    y debemos mostrar "P# palabra", donde # es el numero de la palabra
    y 'palabra' es la que esta en el indice #-1
"""
if __name__ == "__main__":
    string=input()
    string = string.split()
    for i, word in enumerate(string):
        print("P{} {}".format(i+1,word))
