Algoritmo HipotenusaTriangulo
	//Fecha 22 Sept
	//Autor JAPR
	//Calcula la hipotenusa de un triangulo pidiendo la longitud de los catetos
	
	//Parte declarativa
	definir cateto1 Como Real
	definir cateto2 Como Real
	definir hipotenusa Como Real
	
	//Cuerpo de Algoritmo 
	Escribir "Vamos a calcular la hipotenusa de un triángulo. Indique la Longitud del primer cateto: "
	leer cateto1
	
	Escribir "Indique la longitud del segundo cateto: "
	leer cateto2
	
	//raiz se expresa como sqrt. Solo funciona raiz cuando es raíz cuadrada, si es cúbica ya te toca elevar a 1/3 "^(1/3)"
	hipotenusa <- raiz(cateto1^2 + cateto2^2)
	Escribir ("La hipotenusa del triangulo es: "), hipotenusa
	
FinAlgoritmo
