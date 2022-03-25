Algoritmo Ejercicio_9_10
	Dimension matriz[3,3]
	Escribir "Vamos a calcular el determinante de una matriz 3x3"
	Escribir "Introduzca los valores de la primera columna"
	Para i<-1 Hasta 3 Hacer
		Leer matriz[i,1]
	Fin Para
	Escribir "Introduzca los valores de la segunda columna"
	Para i<-1 Hasta 3 Hacer
		Leer matriz[i,2]
	FinPara
	Escribir "Introduzca los valores de la tercera columna"
	Para i<-1 Hasta 3 Hacer
		Leer matriz[i,3]
	FinPara
	parte1<-(matriz[1,1]*matriz[2,2]*matriz[3,3])+(matriz[1,2]*matriz[2,3]*matriz[3,1])+(matriz[2,1]*matriz[3,2]*matriz[1,3])
	parte2<-(matriz[1,3]*matriz[2,2]*matriz[3,1])+(matriz[2,3]*matriz[3,2]*matriz[1,1])+(matriz[1,2]*matriz[2,1]*matriz[3,3])
	det<-parte1-parte2
	Escribir "El determinante de la matriz es " det
FinAlgoritmo
