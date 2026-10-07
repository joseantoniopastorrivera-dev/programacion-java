Algoritmo NotasDe30Alumnos
	//Fecha 07 Oct
	//Nombre JAPR
	//Notas de 30 alumnos. Media, Nota max.,Nota min., %Aprobados
	
	//Parte declarativa
	Definir notas Como Real
	Definir suma, media, maximo, minimo Como Real
	Definir aprobados, i Como Entero
	Dimension notas[30]
	
	suma <- 0
	aprobados <- 0
	
	//Cuerpo Algoritmo
	// Entrada de notas
	Para i <- 1 Hasta 30 Con Paso 1 Hacer
		Escribir "Introduce la nota del alumno ", i, ": "
		Leer notas[i]
		
		suma <- suma + notas[i]
		
		// Inicializar máximo y mínimo en la primera nota
		Si i = 1 Entonces
			maximo <- notas[i]
			minimo <- notas[i]
		SiNo
			Si notas[i] > maximo Entonces
				maximo <- notas[i]
			FinSi
			Si notas[i] < minimo Entonces
				minimo <- notas[i]
			FinSi
		FinSi
		
		// Contar aprobados
		Si notas[i] >= 5 Entonces
			aprobados <- aprobados + 1
		FinSi
	FinPara
	
	// Calcular resultados
	media <- suma / 30
	porcentajeAprobados <- (aprobados / 30) * 100
	
	// Mostrar resultados
	Escribir "----------------------------------"
	Escribir "Media de las notas: ", media
	Escribir "Nota máxima: ", maximo
	Escribir "Nota mínima: ", minimo
	Escribir "Porcentaje de aprobados: ", porcentajeAprobados, "%"
	Escribir "----------------------------------"
FinAlgoritmo
