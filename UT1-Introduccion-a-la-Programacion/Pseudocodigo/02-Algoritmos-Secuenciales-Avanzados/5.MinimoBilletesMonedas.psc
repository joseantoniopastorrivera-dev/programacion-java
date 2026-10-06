Algoritmo MinimoBilletesMonedas
	//Fecha 23 Sept
	//Autor JAPR
	//Diseñar un algoritmo que al introducir una cantidad de dinero, expresado en euros, indique cuántos billetes y monedas se pueden obtener como mínimo.
	
	//Parte declarativa
	Definir dineroReal Como Real
	Definir dineroCents, b500, b200, b100, b50, b20, b10, b5, m2, m1, m050, m020, m010, m005, m002, m001 Como Entero
	
	//Cuerpor del Algoritmo 
	Escribir"Indique la cantidad de euros y se le indicará el mínimo de billetes y monedas las cuales se pueden obtener para alcanzar dicha cantidad: "
	Leer dineroReal
	
	Si dineroReal <- 0 Entonces
		Escribir"Seleccione una cantidad de dinero distinta de cero por favor."
	sino
		dineroCents <- trunc(dineroReal * 100) //Pasar dinero a centimos
	FinSi
	//Billetes de 500
	b500 <- Trunc(dineroCents / 50000)
	dineroCents <- dineroCents mod 50000
	//Billetes de 200
	b200 <- Trunc(dineroCents / 20000)
	dineroCents <- dineroCents mod 20000
	//Billetes de 100
	b100 <- Trunc(dineroCents / 10000)
	dineroCents <- dineroCents mod 10000
	//Billetes de 50
	b50 <- Trunc(dineroCents / 5000)
	dineroCents <- dineroCents mod 5000
	//billetes de 20
	b20 <- Trunc(dineroCents / 2000)
	dineroCents <- dineroCents mod 2000
	//Billetes de 10
	b10 <- Trunc(dineroCents / 1000)
	dineroCents <- dineroCents mod 1000
	//Billetes de 5
	b5 <- Trunc(dineroCents / 500)
	dineroCents <- dineroCents mod 500
	//Monedas de 2
	m2 <- Trunc(dineroCents / 200)
	dineroCents <- dineroCents mod 200
	//Monedas de 1
	m1 <- Trunc(dineroCents / 100)
	dineroCents <- dineroCents mod 100
	//Monedas de 0,50
	m050 <- Trunc(dineroCents / 50)
	dineroCents <- dineroCents mod 50
	//Monedas de 0,20
	m020 <- Trunc(dineroCents / 20)
	dineroCents <- dineroCents mod 20
	//Monedas de 0,10
	m010 <- Trunc(dineroCents / 10)
	dineroCents <- dineroCents mod 10
	//Monedas de 0,05
	m005 <- Trunc(dineroCents / 5)
	dineroCents <- dineroCents mod 5
	//Monedas de 0,02
	m002 <- Trunc(dineroCents / 2)
	dineroCents <- dineroCents mod 2
	//Monedas de 0,01
	m001 <- dineroCents
	
	//Resultado
	Escribir "Vamos a ver la cantidad de billetes y monedas necesitamos para lograr dicha cantidad: "
	Si b500 > 0 Entonces
		Escribir b500, " billetes de 500e."
	FinSi
	Si b200 > 0 Entonces
		Escribir b200, " billetes de 200e."
	FinSi
	Si b100 > 0 Entonces
		Escribir b100, " billetes de 100e."
	FinSi
	si b50 > 0 Entonces
		Escribir b50, " billetes de 50e."
	FinSi
	si b20 > 0 Entonces
		Escribir b20, " billetes de 20e."
	FinSi
	Si b10 > 0 Entonces
		Escribir b10, " billetes de 10e."
	FinSi
	Si b5 > 0 Entonces
		Escribir b5, " billetes de 5e."
	FinSi
	Si m2 > 0 Entonces
		Escribir m2, " monedas de 2e."
	FinSi
	Si m1 > 0 Entonces
		Escribir m1, " monedas de 1e."
	FinSi
	Si m050 > 0 Entonces
		Escribir m050, " monedas de 50cnts."
	FinSi
	Si m020 > 0 Entonces
		Escribir m020, " monedas de 20cnts."
	FinSi
	Si m010 > 0 Entonces
		Escribir m010, " monedas de 10cnts."
	FinSi
	Si m005 > 0 Entonces
		Escribir m005, "monedas de 5cnts."
	FinSi
	Si m002 > 0 Entonces
		Escribir m002, " monedasd de 2cnts."
	FinSi
	Si m001 > 0 Entonces
		Escribir m001, " monedas de 1cnts."
	FinSi
FinAlgoritmo
