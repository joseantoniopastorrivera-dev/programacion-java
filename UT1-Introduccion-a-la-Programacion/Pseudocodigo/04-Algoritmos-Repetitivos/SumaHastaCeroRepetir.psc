Algoritmo SumaHastaCeroRepetir
	//Fecha 30 Sept
	//Autor JAPR
	//Algoritmo que sume cantidades solicitadas al usuario hasta que este introduzca cero o un número negativo (los cuales no se tendrán en cuenta para la suma acumulativa). Al final mostrar la suma total de los números introducidos y cuántos fueron. 
	
	//Parte declarativa
	Definir num, suma, i Como Entero
	suma <- 0
	i <- 0
	Repetir
		Escribir "Escriba un número (0 o negativo para terminar): "
		Leer num
		Si num >  0 Entonces
			suma <- suma + num
			i <- i +1
		FinSi
	Hasta Que num <= 0
	
	Escribir "La suma total de todos los numeros es: ",suma
	Escribir "La cantidad total de número sumados es: ",i
	
FinAlgoritmo
