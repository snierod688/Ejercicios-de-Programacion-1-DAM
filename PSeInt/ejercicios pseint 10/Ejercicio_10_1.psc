Algoritmo Ejercicio_10_1
	n=Azar(100)+1
	int=7
	Definir num1 Como Entero
	Escribir "Tienes que averiguar un n�mero al azar. Tienes 7 oportunidades."
	Para i<-1 Hasta 7 Con Paso 1 Hacer
		Escribir "Tienes " int " intentos"
		Escribir "Escribe un n�mero"
		Leer num1
		int=int-1
		Si num1<n y int>0  Entonces
			Escribir "Intenta un n�mero mayor"
		SiNo 
			Si num1>n y int>0 Entonces
				Escribir "Intenta un n�mero menor"
			SiNo
				Si num1=n Entonces
					i=8
					Escribir "El n�mero introducido es igual que el aleatorio"
					Escribir "�HAS GANADO!"
					
				FinSi
			FinSi
		FinSi
	Fin Para
	Si int=0 Entonces
		Escribir "Has perdido"
	FinSi
FinAlgoritmo
