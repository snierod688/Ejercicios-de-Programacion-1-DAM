Algoritmo Ejercicio_4_6
	Escribir "Introduzca 3 números"
	Leer num1, num2, num3
	Si num1>num2 
		Si num1>num3 Entonces
			Escribir "El primer número es el mayor"
		FinSi
	SiNo // num2>num1
		Si num2>num3 Entonces 
			Escribir "El segundo número es el mayor"
		SiNo 
			Escribir "El tercer número es el mayor"
		FinSi
	Fin Si
FinAlgoritmo
