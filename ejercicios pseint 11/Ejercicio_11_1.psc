Algoritmo Ejercicio_11_1
	Escribir "Dime tu nombre"
	Leer nombre
	Escribir "Tu nombre escrito al revés quedaría:"
	Para i<-Longitud(nombre) Hasta 1 Con Paso -1 Hacer
		Escribir Sin Saltar Subcadena(nombre i, i)
	Fin Para
	Escribir ""
FinAlgoritmo
