Algoritmo SaludosMientras
	//Fecha 30 Sept
	//Autor JAPR
	//Pregunta al usuario su nombre y cuántas veces desea que le saludes. A continuación, muestra el mensaje "Hola nombre_usuario" tantas veces como haya indicado.
	
	//Parte declarativa
	Definir nombre Como Cadena
	Definir i, n Como Entero
	
	//Cuerpo del Algoritmo 
	Escribir "¿Cómo te llamas?"
	Leer nombre
	Escribir "¿Cuántas vecess quieres que te saluden?"
	Leer n
	i <- 1
	Mientras i <= n Hacer
		Escribir "Hola ",nombre,"."
		i <- i + 1
	FinMientras
	
FinAlgoritmo
