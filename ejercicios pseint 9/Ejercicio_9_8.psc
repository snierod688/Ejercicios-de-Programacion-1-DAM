Algoritmo Ejercicio_9_8
	Dimension datos[10,2]
	Escribir "Introduce los 10 números del primer bloque"
	Para i<-1 Hasta 10 Hacer
		Leer datos[i,1]
	Fin Para
	Escribir "Introduce los 10 números del segundo bloque"
	Para i<- 1 Hasta 10 Hacer
		Leer datos[i,2]
	FinPara
	mayor1=datos[1,1]
	Para i<-2 Hasta 10 Hacer
		Si datos[i,1]>mayor1 Entonces
			mayor1<-datos[i,1]
		FinSi
	Fin Para
	mayor2=datos[1,2]
	Para i<-2 Hasta 10 Hacer
		Si datos[i,2]>mayor2 Entonces
			mayor2<-datos[i,2]
		FinSi
	FinPara
	Escribir "El dato mayor introducido en el primer bloque es: " mayor1
	Escribir "El dato mayor introducido en el primer bloque es: " mayor2
FinAlgoritmo
