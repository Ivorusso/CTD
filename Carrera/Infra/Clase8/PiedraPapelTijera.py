import random
import sys

puntajeUsuario = 0

puntajePC = 0

puntajeTotal = 0
ganaUsuario = 0
ganaPC = 0

def porcentaje():
        if puntajeTotal > 0: 
            x = ((puntajeTotal - puntajePC) / puntajeTotal) * 100
            return x
        elif puntajeTotal == 0:
            x = 0
            return x

while True: 
    aleatorio = random.randrange(0, 5)
    eligePc = ""
    again = ""
    print("1)Piedra")
    print("2)Papel")
    print("3)Tijera")
    print("4)lagarto")
    print("5)spock")
    print("6)Mostrar Puntajes")
    print("7)Salir del Programa")
    opcion = int(input("Que eliges: "))
    
    if opcion == 1:
        eligeUsuario = "piedra"
    elif opcion == 2:
        eligeUsuario = "papel"
    elif opcion == 3:
        eligeUsuario = "tijera"
    elif opcion == 4:
        eligeUsuario = "spock"
    elif opcion == 5:
        eligeUsuario = "lagarto" 
    elif opcion == 6:
        print ("Puntajes: ")
        print ("Usuario: ", puntajeUsuario)
        print ("Pc: ", puntajePC)
        print ("Porcentaje de victorias: ", porcentaje(), "%")
    elif opcion == 7:
        print ("Nos vemos!")
        break
    else:
        print ("Valor Invalido")
        continue
    
    print("Tu eliges: ", eligeUsuario)  

    if aleatorio == 0:
        eligePc = "piedra"
    elif aleatorio == 1:
        eligePc = "papel"
    elif aleatorio == 2:
        eligePc = "tijera"
    elif aleatorio == 4:
        eligePc = "spock"
    elif aleatorio == 5:
        eligePc = "lagarto"

    print("PC eligio: ", eligePc)
    print("...")
    
    if eligePc == "piedra" and eligeUsuario == "papel":
        print("Ganaste, papel envuelve piedra")
        ganaUsuario = 1
    elif eligePc == "papel" and eligeUsuario == "tijera":
        print("Ganaste, tijera corta papel")
        ganaUsuario = 1
    elif eligePc == "tijera" and eligeUsuario == "piedra":
        print("Ganaste, piedra pisa tijera")
        ganaUsuario = 1
    elif eligePc == "spock" and eligeUsuario == "lagarto":
        print("Ganaste, lagarto envenena a spcok")
        ganaUsuario = 1
    elif eligePc == "lagarto" and eligeUsuario == "tijera":
        print("Ganaste, tijera decapita lagarto")
        ganaUsuario = 1
    elif eligePc == "spock" and eligeUsuario == "papel":
        print("Ganaste, papel desautoriza spock")
        ganaUsuario = 1
    elif eligePc == "piedra" and eligeUsuario == "spock":
        print("Ganaste, spock vaporiza piedra")
        ganaUsuario = 1
    elif eligePc == "papel" and eligeUsuario == "lagarto":
        print("Ganaste, lagarto devora papel")
        ganaUsuario = 1

    if eligeUsuario == "piedra" and eligePc == "papel":
        print("Perdiste, papel envuelve piedra")
        ganaPC = 1
    elif eligeUsuario == "papel" and eligePc == "tijera":
        print("Perdiste, tijera corta papel")
        ganaPC = 1
    elif eligeUsuario == "tijera" and eligePc == "piedra":
        print("Perdiste, piedra pisa tijera")
        ganaPC = 1
    elif eligeUsuario == "tijera" and eligePc == "spock":
        print("Perdiste, Spock rompe tijera")
        ganaPC = 1
    elif eligeUsuario == "lagarto" and eligePc == "piedra":
        print("Perdiste, piedra aplasta lagarto")
        ganaPC = 1
    elif eligeUsuario == "spock" and eligePc == "lagarto":
        print("Perdiste, lagarto envenena spock")
        ganaPC = 1
    elif eligeUsuario == "piedra" and eligePc == "spock":
        print("Perdiste, Spock vaporiza piedra")
        ganaPC = 1
    elif eligeUsuario == "spock" and eligePc == "papel":
        print("Perdiste, papel desautoriza spock")
        ganaPC = 1
    elif eligeUsuario == "lagarto" and eligePc == "tijera":
        print("Perdiste, tijera decapita lagarto")
        ganaPC = 1
    elif eligePc == eligeUsuario:
        print("Empate")

    puntajeUsuario = puntajeUsuario + ganaUsuario
    puntajePC = puntajePC + ganaPC
    puntajeTotal = puntajeUsuario + puntajePC

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
    




