#encoding:UTF-8
import random
import sys

miPuntaje = 0

tuPuntaje = 0

sumaTotal = 0

def porcentaje():
        if sumaTotal > 0: 
            x = ((sumaTotal - tuPuntaje) / sumaTotal) * 100
            return x
        elif sumaTotal == 0:
            x = 0
            return x

def get_int():
    userdata = input("Ingrese un número, o 's' para salir del programa ")
    if userdata == 's':
        print ("Nos vemos!")
        sys.exit()
    try:
        user_num = int(userdata)
        return user_num
    except ValueError:
        print("Necesito un número para continuar: ")
        return(get_int())

while True: 
    aleatorio = random.randrange(0, 5)
    elijePc = ""
    again = ""
    print("1)Piedra")
    print("2)Papel")
    print("3)Tijera")
    print("4)Lagarto")
    print("5)Spock")
    opcion = get_int()
    
    if opcion == 1:
        eligeUsuario = "piedra"
    elif opcion == 2:
        eligeUsuario = "papel"
    elif opcion == 3:
        eligeUsuario = "tijera"
    elif opcion == 4:
        eligeUsuario = "lagarto"
    elif opcion == 5:
        eligeUsuario = "spock"
    elif opcion == 6:
        print ("Puntajes: ")
        print ("Usuario: ", miPuntaje)
        print ("Pc: ", tuPuntaje)
        print ("Porcentaje de victorias: ", porcentaje(), "%")
    else:
        print("Opción Invalida")
        continue
        
    print("Tu eliges: ", eligeUsuario)    
    if aleatorio == 0:
        eligePc = "piedra"
    elif aleatorio == 1:
        eligePc = "papel"
    elif aleatorio == 2:
        eligePc = "tijera"
    elif aleatorio == 3:
        eligePc = "lagarto"
    elif aleatorio == 4:
        eligePc = "spock"
    print("PC eligio: ", eligePc)
    print("...")
    
    if eligePc == "piedra" and eligeUsuario == "papel":
        print("Ganaste, papel envuelve piedra")
        gane = 1
    elif eligePc == "papel" and eligeUsuario == "tijera":
        print("Ganaste, tijera corta papel")
        gane = 1
    elif eligePc == "tijera" and eligeUsuario == "piedra":
        print("Ganaste, piedra aplasta tijera")
        gane = 1
    elif eligePc == "lagarto" and eligeUsuario == "piedra":
        print("Ganaste, piedra aplasta a lagarto")
        gane = 1
    elif eligePc == "lagarto" and eligeUsuario == "tijera":
        print("Ganaste, tijera decapita a Lagarto")
        gane = 1
    elif eligePc == "tijera" and eligeUsuario == "spock":
        print("Ganaste, Spock rompe tijera")
        gane = 1
    elif eligePc == "spock" and eligeUsuario == "lagarto":
        print("Ganaste, lagarto envenena a Spock")
        gane = 1
    elif eligePc == "papel" and eligeUsuario == "lagarto":
        print ("Ganaste, lagarto devora papel")
        gane = 1
    elif eligePc == "spock" and eligeUsuario == "papel":
        print ("Ganaste, papel desautoriza a Spock")
        gane = 1
    elif eligePc == "piedra" and eligeUsuario == "spock":
        print ("Ganaste, Spock vaporiza piedra")
        gane = 1
        
    if eligeUsuario == "piedra" and eligePc == "papel":
        print("Perdiste, papel envuelve piedra")
        ganaste = 1
    elif eligeUsuario == "papel" and eligePc == "tijera":
        print("Perdiste, tijera corta papel")
        ganaste = 1
    elif eligeUsuario == "tijera" and eligePc == "piedra":
        print("Perdiste, piedra aplasta tijera")
        ganaste = 1
    elif eligeUsuario == "lagarto" and eligePc == "piedra":
        print("Perdiste, piedra aplasta a lagarto")
        ganaste = 1
    elif eligeUsuario == "lagarto" and eligePc == "tijera":
        print("Perdiste, tijera decapita a Lagarto")
        ganaste = 1
    elif eligeUsuario == "tijera" and eligePc == "spock":
        print("Perdiste, Spock rompe tijera")
        ganaste = 1
    elif eligeUsuario == "spock" and eligePc == "lagarto":
        print("Perdiste, lagarto envenena a Spock")
        ganaste = 1
    elif eligeUsuario == "papel" and eligePc == "lagarto":
        print ("Perdiste, lagarto devora papel")
        ganaste = 1
    elif eligeUsuario == "spock" and eligePc == "papel":
        print ("Perdiste, papel desautoriza a Spock")
        ganaste = 1
    elif eligeUsuario == "piedra" and eligePc == "spock":
        print ("Perdiste, Spock vaporiza piedra")
        ganaste = 1
    elif eligePc == eligeUsuario:
        print("Empate")
    while again == "":
        again = input("Jugamos de nuevo? Si/No: ")
        if 'si' in again:
            break
        elif 'no' in again:
            print("Nos vemos!")
            sys.exit()
        else:
            print("Valor Invalido")
            again = ""
            continue
    miPuntaje = miPuntaje + gane
    tuPuntaje = tuPuntaje + ganaste
    sumaTotal = miPuntaje + tuPuntaje

