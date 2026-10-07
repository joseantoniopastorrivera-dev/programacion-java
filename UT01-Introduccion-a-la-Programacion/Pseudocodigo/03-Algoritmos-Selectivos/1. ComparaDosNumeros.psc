Algoritmo ComparaDosNumeros
	//Fecha 23 Sept
	//Autor JAPR
	//Se desea implementar un algoritmo para determinar cuál de dos valores proporcionados es el mayor.
	
	//Parte declarativa
	Definir num1 como real
	Definir num2 como real
	
	//Cuerpo del Algoritmo 
	Escribir "Escriba el primer número que desea comparar: "
	Leer num1
	
	Escribir "Escriba el segundo número que desea comparar: "
	Leer num2
	Si num1 = num2 Entonces Escribir"Los dos números son iguales, indique dos valores distintos para poder compararlos."
	sino 
		Si num1 < num2 entonces Escribir"El primer valor indicado, el cual corresponde a ",num1, " es menor que el segundo valor indicado, que corresponde a ",num2
		sino Escribir"El segundo valor indicado, el cual corresponde a ",num2, " es menor que el primer valor indicado, que corresponde a ",num1
		FinSi
	FinSi
	
FinAlgoritmo
