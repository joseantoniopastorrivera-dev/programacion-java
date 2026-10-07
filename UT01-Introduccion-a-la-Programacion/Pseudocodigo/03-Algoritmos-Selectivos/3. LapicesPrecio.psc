Algoritmo LapicesPrecio
	//Fecha 23 Sept
	//Autor JAPR
	//Realice un algoritmo para determinar cuánto se debe pagar por x unidades de lápices considerando que si son 1000 o más el coste es de 0, 25; de lo contrario, el precio es de 0,75. 
	
	//Parte declarativa
	Definir lapices como entero
	
	//Cuerpo Algoritmo 
	Escribir"Indique la cantidad de lápices la cual desea comprar y se le indicará el precio que va a pagará por unidad y el total."
	Leer lapices
	
	Si lapices = 0 Entonces
		Escribir"Indique una cantidad de lápices distinta de cero para saber cuanto va a pagar por ellos."
	Sino 
		Si lapices < 1000 
			Escribir "El precio de los lápices debido a que ud está comprando menos de mil unidades es 0.75e/unidad, por tanto, ",lapices," lápices costarán: ",lapices*0.75, " euros."
		Sino 
			Escribir "El precio de los lápices debido a que ud está comprando mas de mil unidades es 0.25e/unidad, por tanto, ",lapices," lápices costarán: ",lapices*0.25, " euros."
		FinSi
	FinSi
	
FinAlgoritmo
