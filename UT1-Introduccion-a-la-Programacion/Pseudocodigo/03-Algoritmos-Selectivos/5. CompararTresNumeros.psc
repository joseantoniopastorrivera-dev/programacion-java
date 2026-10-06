Algoritmo CompararTresNumeros
	//Fecha 23 Sept
	//Autor JAPR
	//Se requiere determinar cuál de tres cantidades, pedidas al usuario, es la mayor de todas.
	
	//Parte declarativa
	Definir ud1 Como Real
	Definir ud2 Como Real
	Definir ud3 como Real
	
	//Cuerpo del Algoritmo 
	Escribir "Vamos a comparar tres cantidades e indicar cual es la mayor de todas. Indique el primer valor: "
	Leer ud1
	Escribir "Indique el segundo valor: "
	Leer ud2
	Escribir "Indique el tercer valor: "
	Leer ud3
	
	Si ud1 = ud2 y ud2 = ud3 Entonces //Caso los tres numeros son iguales.
		Escribir"Los tres valores no pueden ser la misma cantidad. Introduzca al menos dos números distintos."
	Sino 
		Si ud1 = ud2 Entonces //Caso si ud1 y u2 son iguales.
			Si ud2 < ud3 Entonces 
				Escribir "El tercer valor el cual corresponde a: ",ud3, " es el mayor de los tres. ",ud1, " (primer valor) es igual que ",ud2, " (segundo valor), ambos son menores que ",ud3, "(tercer valor). ",ud3, " > ",ud1, " = ",ud2," ."
			Sino Escribir "El tercer valor el cual corresponde a: ",ud3, " es el menor de los tres. ",ud1, " (primer valor) es igual a ",ud2, " (segundo valor), ambos son mayores que ",ud3, "(tercer valor). ",ud1, " = ",ud2, " > ",ud3," ."
			FinSi
		Sino 
			Si ud2 = ud3 Entonces //Caso si ud2 y ud3 son iguales.
				Si ud3 < ud1 Entonces
					Escribir "El primer valor el cual corresponde a: ",ud1, " es el mayor de los tres. ",ud2, "(segundo valor) es igual que ",ud3, "(tercer valor) , ambos son menores que ",ud1, "(primer valor). ",ud1, " > ",ud2, " = ",ud3," ."
				Sino Escribir "El primer valor el cual corresponde a: ",ud1, " es el menor de los tres. ",ud2, "(segundo valor) es igual a ",ud3, "(tercer valor) , ambos son mayores que ",ud1, "(primer valor). ",ud2, " = ",ud3, " > ",ud1," ."
				FinSi
			Sino 
				Si ud1 = ud3 Entonces //Caso ud1 y ud3 son iguales.
					Si ud1 < ud2 Entonces
						Escribir "El segundo valor el cual corresponde a: ",ud2, " es el mayor de los tres. ",ud1, "(primer valor) es igual que ",ud3, "(tercer valor) , ambos son menores que ",ud2, "(segundo valor). ",ud2, " > ",ud1, " = ",ud3," ."
					Sino Escribir "El segundo valor el cual corresponde a: ",ud2, " es el menor de los tres. ",ud1, "(primer valor) es igual a ",ud3, "(tercer valor) , ambos son mayores que ",ud2, "(segundo valor). ",ud1, " = ",ud3, " > ",ud2," ."
					FinSi
				Sino //Los tres valores son distintos
					Si ud1 > ud2 y ud1 > ud3 Entonces//ud1 mayor de todos
						Si ud2 > ud3 Entonces
							Escribir "El primer valor el cual corresponde a: ",ud1, " es el mayor de todos. ",ud2, "(segundo valor) es además mayor que ",ud3, "(tercer valor), el cual, es el valor menor de los tres. ",ud1, " > ",ud2, " > ",ud3," ."
						Sino Escribir "El primer valor el cual corresponde a: ",ud1, " es el mayor de todos. ",ud3, "(tercer valor) es además mayor que ",ud2, "(segundo valor), el cual, es el valor menor de los tres. ",ud1, " > ",ud3, " > ",ud2," ."
						FinSi
					Sino 
						Si ud2 > ud1 y ud2 > ud3 Entonces//ud2 mayor que todos
							Si ud1 > ud3 Entonces
								Escribir "El segundo valor el cual corresponde a: ",ud2, " es el mayor de todos. ",ud1, "(primer valor) es además mayor que ",ud3, "(tercer valor), el cual, es el valor menor de los tres. ",ud2, " > ",ud1, " > ",ud3," ."
							Sino Escribir "El segundo valor el cual corresponde a: ",ud2, " es el mayor de todos. ",ud3, "(tercer valor) es además mayor que ",ud1, "(primer valor), el cual, es el valor menor de los tres. ",ud2, " > ",ud3, " > ",ud1," ."
							FinSi
						Sino //ud3 mayor que todos
							Si ud2 > ud1 Entonces
								Escribir "El tercer valor el cual corresponde a: ",ud3, " es el mayor de todos. ",ud2, "(segundo valor) es además mayor que ",ud1, "(primer valor) , el cual, es el valor menor de los tres. ",ud3, " > ",ud2, " > ",ud1," ."
							Sino Escribir "El tercer valor el cual corresponde a: ",ud3, " es el mayor de todos. ",ud1, "(primer valor) es además mayor que ",ud2, "(segundo valor) , el cual, es el valor menor de los tres. ",ud3, " > ",ud1, " > ",ud2," ."
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
