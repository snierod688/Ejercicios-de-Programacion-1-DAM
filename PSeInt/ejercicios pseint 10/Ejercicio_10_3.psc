Algoritmo Ejercicio_10_3
	Definir num1 como real 
	Escribir "Vamos a calcular la ra?z c?bica de los n?meros que introduzcas"
	Escribir "Para que el programa pare, escribe 0"
	Repetir
		Escribir "Introduce un n?mero"
		Leer num1
		Si num1>0 Entonces
			Escribir "La ra?z c?bica de " num1 " es " num1^(1/3)
		SiNo
			Si num1<0 Entonces
				Escribir "?Cuidado! No se puede calcular la ra?z de los n?meros negativos"
			FinSi
		Fin Si
	Hasta Que num1=0
	Escribir "Has introducido 0, fin del programa"
FinAlgoritmo

