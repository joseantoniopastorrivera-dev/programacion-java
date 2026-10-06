Algoritmo TablaMultiplicarDesde
	//Fecha 30 Sept
	//Autor JAPR
	//Pide un número al usuario y muestra su tabla de multiplicar
	
	//Parte declarativa.
	Definir n, i Como Entero
	
	//Cuerpo Algoritmo 
	Escribir "Escribe un número: "
	Leer n
	Para i <- 1 Hasta 10 Con Paso 1 Hacer
		Escribir n," x ",i, " = ", n * i
	FinPara
FinAlgoritmo
