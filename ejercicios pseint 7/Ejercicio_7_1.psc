//Crea un programa que pida al usuario un código de usuario y una contraseña. Deberá repetirse hasta que el código sea "1" y la contraseña sea "1234".
Algoritmo Ejercicio_7_1
	Definir codigo, clave Como Entero
	Repetir
		Escribir "Introduce un código de usuario"
		Leer codigo 
		Escribir "Introduce una contraseña"
		Leer clave
		Si codigo<>1 o clave<>1234
			Escribir "Contraseña y/o código incorrectos"
		FinSi
	Hasta Que codigo = 1 y clave = 1234
	Escribir "Fin"
FinAlgoritmo
