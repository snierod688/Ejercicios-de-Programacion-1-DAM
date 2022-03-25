Algoritmo Ejercicio_11_6
	Escribir "Escribe tu nombre y apellidos"
	Leer nombre
	nombre=Minusculas(nombre)
	Escribir Sin Saltar Mayusculas(Subcadena(nombre 1,1))
	Para i<-1 Hasta Longitud(nombre) Con Paso 1 Hacer
		Si Subcadena(nombre, i,i)=" " Entonces
			Escribir Sin Saltar Mayusculas(Subcadena(nombre i+1, i+1))
		SiNo
			Escribir Sin Saltar Subcadena(nombre i+1, i+1)
		FinSi
	Fin Para
FinAlgoritmo
