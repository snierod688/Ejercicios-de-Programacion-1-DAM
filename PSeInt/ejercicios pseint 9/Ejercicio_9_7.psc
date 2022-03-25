Algoritmo Ejercicio_9_7
	Dimension datos[10]
	cont=0
	datos[1]<-1
	datos[2]<-2
	datos[3]<-25
	datos[4]<-4
	datos[5]<-5
	datos[6]<-6
	datos[7]<-25
	datos[8]<-8
	datos[9]<-9
	datos[10]<-10
	Escribir "Introduce un dato"
	Leer num
	Para i<-1 Hasta 10 Hacer
		
		Si datos[i]=num Entonces
			Escribir "El dato se encuentra en la base de datos"
			cont=cont+1
		FinSi
	Fin Para
	si cont>0 Entonces
		ESCRIBIR "El dato ha aparecido ", cont, " veces"
	SiNo
		Escribir  "No se ha encontrado el dato"
	FinSi

FinAlgoritmo
 