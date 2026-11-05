Algoritmo SumaDiezCantidadesDesde
	//Fecha 30 Sept
	//Autor JAPR
	//Algoritmo que sume diez cantidades solicitadas al usuario. Hazlo de tres formas diferentes, con bucle desde /mientras / repetir.
	
	//Parte declarativa
	Definir i Como Entero
	Definir suma Como Entero
	Definir num Como Entero
	
	//Cuerpo del Algoritmo 
	suma <- 0
	Para i <- 1 Hasta 10 Con Paso 1 Hacer
		Escribir "Escribe un número ",i, ":"
		Leer num
		suma <- num + suma
	FinPara
	Escribir "La suma total es: ",suma
	
FinAlgoritmo
