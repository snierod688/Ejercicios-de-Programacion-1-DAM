Algoritmo Ejercicio_9_9
	Dimension matriz[2,2]
	Escribir "Vamos a calcular el determinante de una matriz 2x2"
	Escribir "Introduzca los valores de la primera columna"
	Para i<-1 Hasta 2 Hacer
		Leer matriz[i,1]
	Fin Para
	Escribir "Introduzca los valores de la segunda columna"
	Para i<-1 Hasta 2 Hacer
		Leer matriz[i,2]
	FinPara
	det<-(matriz[1,1]*matriz[2,2])-(matriz[1,2]*matriz[2,1])
	Escribir "El determinante de la matriz es " det
FinAlgoritmo
