Algoritmo TablaMultiplicarMientras
	//Fecha 30 Sept
	//Autor JAPR
	//Pide un número al usuario y muestra su tabla de multiplicar.
	
	//Parte declarativa
	Definir n, i Como Entero
	Escribir "Indique un número: "
	Leer n
	i <- 1
	Repetir 
		Escribir n, " x ",i, " = ", n * i
		i <- i + 1
	Hasta Que i > 10
FinAlgoritmo
