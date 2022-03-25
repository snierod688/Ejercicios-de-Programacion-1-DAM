Algoritmo Ejercicio_9_5
	Dimension v1[3]
	Dimension v2[3]
	Escribir "Introduce los valores del vector x"
	Para i<-1 Hasta 3 Hacer
		Escribir Sin Saltar "x"
		Leer v1[i]
	FinPara
	Escribir "Introduce los valores del vector y"
	Para i<-1 Hasta 3 Hacer
		Escribir Sin Saltar "y"
		Leer v2[i]
	FinPara
	producto<-(v1[1]*v2[1])+(v1[2]*v2[2])+(v1[3]*v2[3])
	Escribir "El producto escalar de los vectores es " producto
FinAlgoritmo
