Algoritmo TrajesConDescuentos
	//Fecha 23 Sept
	//Autor JAPR
	//Almacenes "Perico de los palotes" tiene una promoción: a todos los trajes que tienen un precio 
	//superior a 1500e se les aplicará un descuento de 15 %, a todos los demás se les aplicará sólo 8 %. 
	//Realice un algoritmo para determinar el precio final que debe pagar una persona por comprar un 
    //traje y de cuánto es el descuento que obtendrá.
	
	
	//Parte declarativa.
	Definir precioTraje como Real
	
	//Cuerpo Algoritmo 
	Escribir "Indique el precio del traje que desea comprar en euros: "
	Leer precioTraje
	
	Si precioTraje = 0 
		Entonces Escribir"No existe ningún traje que cueste 0 euros, indique un valor distinto."
	Sino 
		Si precioTraje < 1500 
			Escribir "Debido a que el precio del traje escogido es menor de 1500e hay un descuento del 8%, el precio final tras la rebaja es: " ,precioTraje*0.92, " euros. El ahorro supone un total de: " ,precioTraje*0.08, " euros."
		sino Escribir "Debido a que el precio del traje escogido es mayor de 1500e hay un descuento del 15%, el precio final tras la rebaja es: " ,precioTraje*0.85, " euros. El ahorro supone un total de: " ,precioTraje*0.15, " euros."
		FinSi
	FinSi	
FinAlgoritmo
