Algoritmo sin_titulo
	//Fecha 19 de Sept
	//Autor JAPR
	//KM, precio gasolina,dinero gastado, tiempo gastado
	
	//Parte declarativa
	Definir km como Entero
	Definir precioLitro Como Real
	Definir gastoGasolina Como Real
	Definir hora Como Entero
	Definir min Como Entero
	Definir seg Como Entero
	Definir precio100 como Real
	Definir consumo100 como Real
	Definir litroKm como Real
	Definir euroKm como Real
	Definir km/h como Real
	Definir m/s como Real
	
	//Cuerpo del Algoritmo 
	Escribir "Introuduzca el número de Km recorridos en el viaje:"
	Leer km
	Escribir "Introduzca el precio de la gasolina por litro:"
	Leer precioLitro
	Escribir"Introduzca el dinero gastado en gasolina para el viaje:"
	Leer gastoGasolina
	Escribir "Introduzca la(s) hora(s), minuto(s) y segundo(s) de viaje separados por espacios:"
	leer hora, min, seg
	
	//Consumo de gasolina (en litros y euros) por cada 100 km.
	precio100 <- (gastoGasolina / km) *100 
	Escribir "El gasto de gasolina medio por cada 100Km ha sido de:", precio100"?."
	consumo100 <- (gastoGasolina / precioLitro) / km * 100 
	Escribir "El gasto en litros medio por cada 100Km ha sido de:", consumo100"litro(s)."
	
	//Consumo de gasolina (en litros y euros) por cada km.
	litroKm <- gastoGasolina / km
	Escribir "El volumen de gasolina en litros consumido por cada Km es de:", litroKm "Litro(s)."
	euroKm <- litroKm * precioLitro
	Escribir "El consumo de gasolina en euros consumido por cada Km es de:", euroKm "?."
	
	//Velocidad media (en km/h y m/s).
	km/h <- km / hora
	Escribir"La velocidad media  del viaje en Km/h es:", "Km/h."
	Escribir"La velocidad media del viaje en m/s es:", "m/s."
	