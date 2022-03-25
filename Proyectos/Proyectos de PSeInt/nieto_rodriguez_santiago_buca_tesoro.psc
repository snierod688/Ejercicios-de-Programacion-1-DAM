Algoritmo Busca_el_tesoro
	Dimension datos[4,5]
	
	
	para i<-4 Hasta 1 Con Paso -1 Hacer
		para j<-1 Hasta 5 Con Paso 1 Hacer
			datos[i,j]=" "
		FinPara
	FinPara
	
	//Defino el tesoro y la mina
	tesoroX<-AZAR(5)+1
	tesoroY<-AZAR(4)+1
	minaX<-AZAR(5)+1
	minaY<-AZAR(4)+1
	
	//comprobar que coordenadas mina y tesoro no son las mismas
	Repetir
		minaX<-AZAR(5)+1
		minaY<-AZAR(4)+1
	Hasta Que tesoroX<>minaX y tesoroY<>minaY
	
	//Creo el tablero
	
	Escribir "¡BUSCA EL TESORO!"
	para i<-4 Hasta 1 Con Paso -1 Hacer
		Escribir Sin Saltar i,"|"
		para j<-1 Hasta 5 Con Paso 1 Hacer
			Escribir Sin Saltar datos[i,j], " "
		FinPara
		Escribir ""
	FinPara
	Escribir " ----------"
	Escribir "  1 2 3 4 5"
	
	//Defino la variable Encontrado para saber si se ha hallado el tesoro o la mina, y cuando
	//uno de los 2 se halle se acaba el juego
	Encontrado<-Falso //Booleana para saber si ha encontrado la mina o el tesoro
	ErrorY<-Falso //Booleana para controlar que la coordenada y esté bien introducida
	ErrorX<-Falso //Booleana para controlar que la coordenada x esté bien introducida
	
	//Comienza el juego
	
	Repetir
		
		//Bucle para comprobar si la coordenada y está en rango
		Repetir 
		Escribir Sin Saltar "Introduce la coordenada y"
		Leer cx
		Si cx<1 o cx>4 Entonces
			Escribir "La coordenada introducida está fuera de rango"
			Escribir "---------------------------------------------"
			Escribir "Introduce una coordenada entre 1 y 4"
		SiNo
			ErrorY<-Verdadero
		FinSi
		Hasta Que ErrorY=Verdadero
		ErrorY<-Falso
		
		//Bucle para comprobar si la coordenada y está en rango
		Repetir
			Escribir Sin Saltar "Introduce la coordenada x"
			Leer cy
			Si cy<1 o cy>5 Entonces
				Escribir "La coordenada introducida está fuera de rango"
				Escribir "---------------------------------------------"
				Escribir "Introduce una coordenada entre 1 y 5"
			SiNo
				ErrorX<-Verdadero
			FinSi
		Hasta Que ErrorX=Verdadero
		ErrorX<-Falso
		
		//Si para comprobar si las coordenadas introducidas por el jugador coinciden con las del tesoro
		Si cx=tesoroX y cy=tesoroY Entonces
			Escribir "¡¡ FELICIDADES !!"
			Escribir "¡ HAS ENCONTRADO EL TESORO !"
			Encontrado<-Verdadero
			datos[cx, cy]="E"
		SiNo
			//Si para comprobar si las coordenadas introducidas por el jugador coinciden con las del tesoro
			Si cx=minaX y cy=minaY Entonces
				Escribir "LO SIENTO"
				Escribir "¡ HAS PERDIDO !"
				Encontrado<-Verdadero
			SiNo
				//Si para marcar las coordenadas introducidas por el jugador si no coinciden con las del tesoro o la mina
				datos[cx,cy]="X"
				
				para i<-4 Hasta 1 Con Paso -1 Hacer
					Escribir Sin Saltar i, "|"
					para j<-1 Hasta 5 Con Paso 1 Hacer
						Escribir Sin Saltar datos[i,j], " "
						
					FinPara
					Escribir ""
				FinPara
				Escribir " ----------"
				Escribir "  1 2 3 4 5"
				
			FinSi
		FinSi
	Hasta Que Encontrado
	
	
	datos[tesoroX, tesoroY]="$" //matriz para las coordenadas del tesoro
	datos[minaX, minaY]="*"  //matriz para las coordenadas de la mina
	
	Escribir "---------------------------------"
	
	//Bucle para mostrar el tablero una vez finalizado el juego
	para i<-4 Hasta 1 Con Paso -1 Hacer
		Escribir Sin Saltar i, "|"
		para j<-1 Hasta 5 Con Paso 1 Hacer
			Escribir Sin Saltar datos[i,j], " "
			
		FinPara
		Escribir ""
	FinPara
	Escribir " ----------"
	Escribir "  1 2 3 4 5"
	

FinAlgoritmo
