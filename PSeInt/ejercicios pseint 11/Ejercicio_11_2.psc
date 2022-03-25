Algoritmo Ejercicio_11_2
	Escribir "Escribe tu nombre"
	Leer nombre
	Para i<-1 Hasta Longitud(nombre) Con Paso 1 Hacer
		x<-Subcadena(nombre, i,i)
		Si i%2=0 Entonces
			Escribir Sin Saltar Mayusculas(x)
		SiNo
			Escribir Sin Saltar Minusculas(x)
		FinSi
	Fin Para
FinAlgoritmo
