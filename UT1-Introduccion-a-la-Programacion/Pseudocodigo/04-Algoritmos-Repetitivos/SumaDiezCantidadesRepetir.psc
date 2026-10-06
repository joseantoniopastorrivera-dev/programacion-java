Algoritmo SumaDiezCantidadesRepetir
	//Fecha 30 Sept
	//Autor JAPR
	//Algoritmo que sume diez cantidades solicitadas al usuario. Hazlo de tres formas diferentes, con bucle desde /mientras / repetir.
	
	//Parte declarativa
	Definir i, suma, num Como Entero
	
	//Cuerpo del Algoritmo 
	suma <- 0
	i <- 1
	Repetir
		Escribir "Escribe un número ",i, ":"
		Leer num
		suma <- suma + num
		i <- i + 1
	Hasta Que i > 10
	Escribir "La suma es: ", suma
FinAlgoritmo
