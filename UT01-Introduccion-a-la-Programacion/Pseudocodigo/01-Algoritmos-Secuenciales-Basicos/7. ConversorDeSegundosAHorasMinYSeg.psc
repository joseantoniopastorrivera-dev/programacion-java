Algoritmo SegundosConvertidosEnHorasMinutosYSegundos
	//Fecha 19 Sept
	//autor JAPR
	//Convierte segundos en horas, minutos y segundos
	
	//Parte declarativa
	Definir seg Como Entero
	Definir min Como real
	Definir hora Como real
	definir segRestante como entero
	
	//Cuerpo del Algoritmo 
	Escribir "Introduzca la cantidad de segundos que desee convertir a horas, minutos y segundos."
	Leer seg
	
	hora <- Trunc(seg / 3600) //horas completas
	min <- Trunc((seg mod  3600) / 60) //minutos completos
	segRestante <- seg mod 60
	Escribir "Los segundos que indicó corresponden a ", hora, "hora(s)", min,"minuto(s) y " ,segRestante, "segundo(s)."
FinAlgoritmo
