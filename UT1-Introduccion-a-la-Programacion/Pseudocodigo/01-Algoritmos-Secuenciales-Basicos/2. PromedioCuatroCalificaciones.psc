Algoritmo PromedioCuatroCalificaciones
	//Fecha 19 de Sept
	//Autor JAPR
	//Mjedia de cuatro examenes
	
	//Parte de declarativa
	Definir nota1 Como Real
	Definir nota2 Como Real
	Definir nota3 Como Real
	Definir nota4 como Real
	Definir notamedia Como Real
	
	
	//Cuerpo del Algoritmo 
	Escribir "Introduzca la nota del primer examen:"
	Leer nota1
	
	Escribir "Introduzca la nota del segundo examen:"
	Leer nota2
	
	Escribir"Introduzca la nota del tercer examen:"
	Leer nota3
	
	Escribir "Introduzca la nota del cuarto examen:"
	Leer nota4
	
	promedio <- (nota1 + nota2 + nota3 + nota4) / 4
	
	si (nota1 < 5) o (nota2 <5) o (nota3 < 5) o (nota4 < 5) Entonces
		Escribir"Aunque tu nota media sería: " , promedio, ". No has aprobado porque al menos una de tus calificaciones es menor que 5."
	SiNo 
		Escribir "Has aprobado. Tu nota media es:" , promedio
	FinSi
	
FinAlgoritmo
