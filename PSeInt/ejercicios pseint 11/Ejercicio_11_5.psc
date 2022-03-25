Algoritmo Ejercicio_11_5
	Definir frase como caracter
	Escribir "Escribe una frase y diré las palabras que tiene"
	Leer frase
	frase=Minusculas(frase)
	Para i<-1 Hasta Longitud(frase) Con Paso 1 Hacer
		Si Subcadena(frase, i,i)= " " y Subcadena(frase, i+1,i+1)<> " " Entonces
			cont=cont+1
		FinSi
		
	Fin Para
	Escribir "Tu frase tiene " cont+1 " palabras"
FinAlgoritmo
