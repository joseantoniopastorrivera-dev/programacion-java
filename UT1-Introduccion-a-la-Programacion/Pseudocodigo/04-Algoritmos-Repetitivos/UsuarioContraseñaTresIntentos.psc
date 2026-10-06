Algoritmo UsuarioContraseñaTresIntentos
	//Fecha 30 Sept
	//Autor JAPR
	//Para acceder a una aplicación se deberá escribir el nombre de usuario admin y la contraseña 1234&. Hasta que el usuario no escriba la contraseña correcta o haya agotado 3 intentos se le solicitará el user y password.

	//Parte declarativa
	Definir usuario, contraseña como Cadena
	Definir i Como Entero
	i <- 0
	
	//Cuerpo del Algoritmo 
	Mientras i < 3 Hacer
		Escribir "Escriba usuario: "
		Leer usuario
		Escribir "Escriba contraseña: "
		Leer contraseña
		Si usuario = "admin" y contraseña = "1234&" Entonces
			Escribir "Acceso concedido. Bienvenido."
			i <- 3
		SiNo
			Escribir"Usuario o contraseña incorrecto. Le quedan ",2 - i," intentos."
			i <- 1 + i
		FinSi
	FinMientras
	
	
	Si usuario <> "admin" y contraseña <> "1234&" Entonces
		Escribir "Acceso bloqueado. Ha agotado los intentos posibles."
	FinSi
	
FinAlgoritmo
