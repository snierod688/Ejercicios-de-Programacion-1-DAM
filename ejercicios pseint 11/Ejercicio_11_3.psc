Algoritmo 	Ejercicio11_3
	
	Definir c Como Caracter
	Escribir "Escribe tu nombre"
	Leer nombre
	nombre=Minusculas(nombre)
	Para i<-1 Hasta Longitud(nombre) Con Paso 1 Hacer
		c=Subcadena(nombre,i,i)
		Si ((c=='a') o (c=='e') o (c=='i') o (c=='o') o (c=='u')) Entonces
			cont=cont+1
		FinSi
	Fin Para
	Escribir "Tu nombre tiene " cont " vocales"
FinAlgoritmo
