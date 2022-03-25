Algoritmo Ejercicio_9_3
	Dimension datos[5]
	suma<-0
	Para i<-1 Hasta 5 Hacer
		Escribir "Dime un dato en número " i
		Leer datos[i]
		suma<-datos[i]+suma
	FinPara
	media<-suma/5
	Escribir "La suma es " suma
	Escribir "La media de los datos introducidos es: " media
	Para i<-1 Hasta 5 Hacer
		Si media<(datos[i]) Entonces
			Escribir datos[i] " es mayor que la media"
		Fin Si
	FinPara
FinAlgoritmo
