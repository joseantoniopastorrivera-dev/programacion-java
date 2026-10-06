Algoritmo DiezCantidadesConMientras
	//Fecha 30 Sept
	//Autor JAPR
	//Algoritmo que sume diez cantidades solicitadas al usuario. Hazlo de tres formas diferentes, con bucle desde /mientras / repetir.
	
	//Parte declarativa
	Definir i Como Entero
	Definir suma Como Entero
	Definir num Como Entero
	
	//Cuerpo del Algoritmo 
	suma <- 0
	i <- 1
	Mientras i <= 10 Hacer
		Escribir "Incresa un número ",i, ":"
		Leer num
		suma <- suma + num
		i <- i + 1
	FinMientras
	Escribir "La suma total es: ",suma
	
FinAlgoritmo
