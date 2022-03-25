Algoritmo Ejercicio_10_2
	Definir num1 como real 
	Escribir "Vamos a calcular la raíz cuadrada de los números que introduzcas"
	Escribir "Para que el programa pare, escribe 0"
	Repetir
		Escribir "Introduce un número"
		Leer num1
		Si num1>0 Entonces
			r=Raiz(num1)
			Escribir "La raíz cuadrada de " num1 " es " r
		SiNo
			Si num1<0 Entonces
				Escribir "¡Cuidado! No se puede calcular la raíz de los números negativos"
			FinSi
		Fin Si
	Hasta Que num1=0
	Escribir "Has introducido 0, fin del programa"
FinAlgoritmo
