Algoritmo PositivoNegativo
	//Fecha 23 Sept
	//Autor JAPR
	//Realice un algoritmo para determinar si un número es positivo o negativo.
	
	//Parte declarativa
	Definir num Como Real
	
	//Cuerpo del Algoritmo 
	Escribir"Escriba el número el cual desee saber si es positivo o negativo: "
	Leer num
	Si num = 0 Entonces Escribir"El número debe ser distinto de cero, indique otro valor."
		Sino Si num < 0 Entonces Escribir"El número indicado es negativo debido a que es menor que cero."
			Sino Escribir"El número indicado es positivo debido a que es mayor que cero."
			FinSi
	FinSi
	
FinAlgoritmo
