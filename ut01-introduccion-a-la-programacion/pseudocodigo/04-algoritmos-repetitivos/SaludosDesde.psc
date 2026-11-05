Algoritmo SaludosDesde
	//Fecha 30 Sept
	//Autor JAPR
	//Pregunta al usuario su nombre y cuántas veces desea que le saludes. A continuación, muestra el mensaje "Hola nombre_usuario" tantas veces como haya indicado.
	
	//Parte declarativa
	Definir nombre como Cadena
	Definir n, i Como Entero
	
	//Cuerpo del Algoritmo 
	Escribir "¿Cómo te llamas?"
	Leer nombre
	Escribir "¿Cúantas veces quieres que te salude?"
	Leer n
	
	Para i <- 1 Hasta n Con Paso 1 Hacer
		Escribir"Hola ",nombre,"."
	FinPara
FinAlgoritmo
