Algoritmo SumaRestaMultiplicacionDivisionResto
	//Fecha 19 de Sept
	//Autor JAPR
	//Pedir dos números y calcular su suma, resta, multiplicación, división y resto.
	
	//Parte declarativa
	Definir numero1 como real
	Definir numero2 como real
	Definir suma Como real
	Definir resta Como real
	Definir multiplicacion como real
	Definir division Como real
	Definir resto Como real
	
	//Cuerpo del Algoritmo 
	Escribir "Escribe el primer número:"
	Leer numero1
	
	Escribir "Escribe el segundo número:"
	Leer numero2
	
	//Operaciones básicas
	suma <- numero1 + numero2
	resta <- numero1 - numero2
	multiplicacion <- numero1 * numero2
	
	Si numero2 <> 0 entonces
		division <- numero1 / numero2
		resto <- numero1 - Trunc(numero1 / numero2) * numero2
		Escribir "La suma de los dos números es: " , suma
		Escribir "La resta de los dos números es: " , resta
		Escribir "La multiplicación de los dos números es: " , multiplicacion
		Escribir "La división de los dos números es: " , división
		Escribir "El resto (módulo) de la división de los dos números es: " , resto
	SiNo
		Escribir "No se puede dividir entre 0."
	FinSi
	
FinAlgoritmo
