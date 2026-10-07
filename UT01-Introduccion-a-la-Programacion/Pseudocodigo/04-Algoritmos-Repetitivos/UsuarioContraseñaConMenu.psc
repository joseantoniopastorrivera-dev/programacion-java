Algoritmo UsuarioContraseñaConMenu
	//Fecha 30 Sept
	//Usuario JAPR
	//versión mejorada del ejercicio anterior. Una vez que el usuario se ha validado se mostrará un menú: 1) Suma 2) Resta 3) Multiplica 4)Divide 5) Salir. Se realizará la operación que el usuario elija hasta que salga.

	//Parte declarativa
	Definir usuario, contraseña como Cadena
	Definir i, num Como Entero
	Definir a, b, resultado como Real
	i <- 0
	
	//Cuerpo del Algoritmo 
	Mientras i < 3 Hacer
		Escribir"Introduzca el usuario: "
		Leer usuario
		Escribir "Introduzca la contraseña: "
		Leer contraseña
		
		Si usuario = "admin" y contraseña = "1234&" Entonces
			Escribir "Acceso concedido. Bienvenido."
		Repetir 
			Escribir"---MENU---"
			Escribir "Indique una opción: "
			Escribir "1. Suma."
			Escribir "2. Resta."
			Escribir "3. Multiplicación."
			Escribir "4. División."
			Escribir "5. Salir."
			Leer num
			
			Si num >= 1 y num <= 4 Entonces
				Escribir "Escribe el primer número: "
				Leer a
				Escribir "Escribe el segundo número: "
				Leer b
			FinSi
			
			Segun num Hacer
				1: 
					resultado <- a + b
					Escribir "Resultado de la suma: ", resultado
				2:
					resultado <- a - b
					Escribir "Resultado de la resta: ", resultado
				3:
					resultado <- a * b
					Escribir "Resultado de la multiplicación: ",resultado
				4:
					resultado <- a / b
					Escribir "Resultado de la división: "
				5:
					Escribir "Saliendo del programa..."
				De Otro Modo:
					Escribir "Opción no válida."
			FinSegun
		Hasta Que num = 5
		i <- 3
	Sino 
		Escribir "Usuario o contraseña no válidos."
		i <- i + 1
	FinSi
FinMientras

Si usuario <> "admin" y contraseña <> "1234&" Entonces
	Escribir "Acceso bloqueado. Has agotado los intentos"
FinSi

FinAlgoritmo
