Algoritmo BuscarAlumno
	//Fecha 07 Oct
	//Autor JAPR
	//Buscar Alumno
	
		// Parte declarativa
		Definir alumnos Como Cadena
		Definir i, posicion, encontrado Como Entero
		Definir nombreBuscar Como Cadena
		Dimension alumnos[10]
		
		encontrado <- 0
		
		// Lectura de los nombres de los alumnos
		Para i <- 1 Hasta 10 Con Paso 1 Hacer
			Escribir "Introduce el nombre del alumno ", i, ": "
			Leer alumnos[i]
		FinPara
		
		// Solicitar el nombre a buscar
		Escribir ""
		Escribir "Introduce el nombre del alumno que deseas buscar: "
		Leer nombreBuscar
		
		// Búsqueda secuencial en el vector
		Para i <- 1 Hasta 10 Con Paso 1 Hacer
			Si alumnos[i] = nombreBuscar Entonces
				Escribir "El alumno '", nombreBuscar, "' se encuentra en la posición ", i
				encontrado <- encontrado + 1
			FinSi
		FinPara
		
		// Comprobación si no se encontró
		Si encontrado = 0 Entonces
			Escribir "El alumno '", nombreBuscar, "' NO existe en la lista."
		FinSi
		
		// Mostrar si se repitió el nombre
		Si encontrado > 1 Entonces
			Escribir "Nota: El nombre '", nombreBuscar, "' aparece repetido ", encontrado, " veces."
		FinSi
FinAlgoritmo
