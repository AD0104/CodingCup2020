"""
    El problema marca que daran 2 enteros
    N e I, donde N sera la cantidad de numeros a ingresar
    e I la posicion del numero que se quiere saber.
"""
if __name__ == "__main__":
    n_i=input()
    n_i = n_i.split()
    numbers = input()
    numbers = numbers.split()
    print(numbers[int(n_i[1])-1])
    