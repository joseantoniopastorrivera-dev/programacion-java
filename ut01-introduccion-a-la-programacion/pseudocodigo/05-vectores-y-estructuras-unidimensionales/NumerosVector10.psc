Algoritmo NumerosVector10
	//Fecha 07 Oct
	//Autor JAPR
	//Hasta 10 números enteros en un vector. Fin por negativo o llegar a 10. Mostrar contenido del vector y suma del mismo
	
	//Parte declarativa
		Definir vectorNumeros Como Entero
		Definir i, suma Como Entero
		Dimension vectorNumeros[10]
		
		suma <- 0
		i <- 1
		
		// Lectura de números con condición de parada
		Mientras i <= 10 Hacer
			Escribir "Introduce un número positivo (negativo para finalizar): "
			Leer vectorNumeros[i]
			
			// Comprobar si el número es negativo
			Si vectorNumeros[i] < 0 Entonces
				// Salir del bucle sin guardar el número
				Salir
			FinSi
			
			// Sumar el número al total
			suma <- suma + vectorNumeros[i]
			
			i <- i + 1
		FinMientras
		
		// Mostrar contenido del vector
		Escribir ""
		Escribir "----------------------------"
		Escribir "Números introducidos:"
		Para j <- 1 Hasta i - 1 Hacer
			Escribir "Posición ", j, ": ", vectorNumeros[j]
		FinPara
		Escribir "----------------------------"
		
		// Mostrar suma total
		Escribir "Suma total de los valores almacenados: ", suma
FinAlgoritmo
