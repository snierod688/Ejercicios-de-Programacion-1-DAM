Algoritmo Ejercicio_11_4
	Definir c Como Caracter
	Escribir "Dime tu nombre"
	Leer nombre
	nombre=Minusculas(nombre)
	Para i<-1 Hasta Longitud(nombre) Con Paso 1 Hacer
		c=Subcadena(nombre,i,i)
		Segun c Hacer
			"a":
				cont_a=cont_a+1
			"e":
				cont_e=cont_e+1
			"i":
				cont_i=cont_i+1
			"o":
				cont_o=cont_o+1
			"u":
				cont_u=cont_u+1
		Fin Segun
	FinPara
	Escribir Sin Saltar "Tus vocales son: "
	Si cont_a>0 Entonces
		Escribir Sin Saltar "a"
	FinSi
	Si cont_e>0 Entonces
		Escribir Sin Saltar "e"
	FinSi
	Si cont_i>0 Entonces
		Escribir Sin Saltar "i"
	FinSi
	Si cont_o>0 Entonces
		Escribir Sin Saltar "o"
	FinSi
	Si cont_u>0 Entonces
		Escribir Sin Saltar "u"
	FinSi
	
FinAlgoritmo
