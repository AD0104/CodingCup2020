"""
    El problema dice que se debe sacar el area total de un reloj.
    El reloj esta compuesto por un pentagono, rectangulo y trapecio
    el usuario ingresara los datos en el siguiente orden.
    a,b,c,d,e > donde a es el centro del pentagono
    b la base del rectangulo, d la altura.
    e la altura del trapecio y c una de las bases del trapecio(la otra es b)
"""
def areaPentagono(a,b):
    return (5*a*b)/2
def areaRect(b,d):
    return b*d
def areaTrap(b,c,e):
    return ((b+c)*e)/2


if __name__ == "__main__":
    a = int(input())
    b = int(input())
    c = int(input())
    d = int(input())
    e = int(input())

    area_1 = areaPentagono(a,b)
    area_2 = areaRect(b,d)
    area_3 = areaTrap(b,c,e)
    print("El área es {}".format(int(area_1+area_2+area_3)))
