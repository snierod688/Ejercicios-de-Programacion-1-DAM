//Crea un programa que pida al usuario un c�digo de usuario y una contrase�a. Deber� repetirse hasta que el c�digo sea "1" y la contrase�a sea "1234".
Algoritmo Ejercicio_7_1
	Definir codigo, clave Como Entero
	Repetir
		Escribir "Introduce un c�digo de usuario"
		Leer codigo 
		Escribir "Introduce una contrase�a"
		Leer clave
		Si codigo<>1 o clave<>1234
			Escribir "Contrase�a y/o c�digo incorrectos"
		FinSi
	Hasta Que codigo = 1 y clave = 1234
	Escribir "Fin"
FinAlgoritmo
