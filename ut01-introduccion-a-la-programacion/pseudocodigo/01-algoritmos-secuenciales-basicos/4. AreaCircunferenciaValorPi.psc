Algoritmo AreaCircunferenciaValorPI
	//Fecha 19 sept
	//Autor JAPR
	//Este Algoritmo calcula el área de una circunferencia
	
	//Parte declarativa
	Definir radio Como Real
	Definir ValorPi como Real
	ValorPi <- 3.1416
	Definir area Como Real
	
	
	//Cuerpo del Algoritmo 
	Escribir "Escribe el radio de la circunferencia la cual quiere calcular:"
	Leer radio
	
	area <- pi * radio * radio
	
	Escribir "El área de la circunferencia es: " , area
	
FinAlgoritmo
