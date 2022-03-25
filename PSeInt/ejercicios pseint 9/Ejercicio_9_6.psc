Algoritmo Ejercicio_9_6
	Dimension n[7] 
	Definir i Como Entero
	Para i<-1 Hasta 7 Hacer
		Escribir "Dime un número"
		Leer n[i]
	FinPara
	mayor=n[1]
	Para i<-1 Hasta 7 Con Paso 1 Hacer
		Si n[i]>mayor Entonces
			mayor<-n[i]
		FinSi
	Fin Para
	Escribir mayor " es el mayor"
FinAlgoritmo
