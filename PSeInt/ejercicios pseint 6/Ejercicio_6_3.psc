//Crea un programa que genere dos n�meros al azar entre el 0 y el 100, y pida al usuario
//que calcule e introduzca su suma. Si la respuesta no es correcta, deber� volver a pedirla
//tantas veces como sea necesario hasta que el usuario acierte. Pista: como ver�s en el
//apartado 10, para generar un n�mero al azar del 0 al 100 puedes hacer 
//numero <- AZAR(101)
Algoritmo Ejercicio_6_3
	Definir suma Como Entero
	num1<-AZAR(101)
	num2<-AZAR(101)
	Escribir "Los n�meros aleatorios son: " num1 " y " num2 
	Escribir "Introduce la suma de los dos n�meros:" 
	Leer suma
	Mientras suma<>num1+num2 Hacer
		Escribir "El resultado introducido no es correcto, vuelve a calcularlo"
		Leer suma
	Fin Mientras
	Escribir "!Bien hecho�"
FinAlgoritmo
