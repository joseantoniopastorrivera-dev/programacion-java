# 🛒 Aplicación Java: Gestión de Productos, Clientes y Pedidos

Proyecto desarrollado en Java que permite gestionar productos, clientes y pedidos desde consola.  
Incluye funcionalidades de almacenamiento en colecciones, exportación del inventario de productos a un fichero e importación de dicho inventario a base de datos MySQL.

---

## ✅ Requisitos del ejercicio implementados

Este proyecto implementa los siguientes requisitos funcionales y técnicos:

1. **Modelado orientado a objetos**:
   - Clases bien definidas: *Producto*, *Cliente*, *Pedido*, *DetallePedido* y *Persona*.
   - Clase *Producto*:
     - Información a almacenar: *idProducto* (código numérico único), *nombre*, *precio*, *stock*
     - Operaciones:
       - Creación de objetos *producto* con valores iniciales en sus 4 atributos.  
         Si el *precio* o el *stock* son negativos, se lanza una excepción personalizada *ValorNoValidoException*, con los mensajes:
           - *"El precio no puede ser negativo"*
           - *"El stock no puede ser negativo"*
       - Métodos *getters/setters*
       - Método *reponerStock* que recibirá la cantidad de stock y lo que hará será aumentar el stock de dicho producto en la cantidad indicada. En caso de que la cantidad sea negativa, se lanza excepción personalizada *ValorNoValidoException*, con el mensaje: *"No se puede reponer una cantidad negativa"*
       - Método *vender* que venderá ciertas unidades de producto. Por tanto, se disminuirá el stock según las unidades vendidas. No se puede vender más de lo que hay y la cantidad debe ser positiva. En caso contrario se lanza excepción personalizada *ValorNoValidoException*, con los mensajes:
         - *"La cantidad a vender debe ser positiva"*
         - *"No hay suficiente stock para la venta"*
       - Método *mostrarInformacionTabulada* para mostrar la información del producto en formato tabla usando colores ANSI y alineando el contenido, como la imagen:

<p align="center">
  <img src="img\image.png" alt="Tabla productos">
</p>

   - Clase *Cliente*:
     - Información a almacenar: *cif*, *nombre*, *dirección*, *teléfono* y *persona de contacto* (su nombre, apellidos, email)
     - Operaciones: método constructor, *getters/setters* para los atributos y método *toString*
   - Clase *Pedido*:
     - Información a almacenar: *código de pedido*, el *cliente*, la *fecha* y el *detalle del pedido asociado* (es decir, la lista de los productos comprados con sus unidades)
     - El código de pedido es único y se generará internamente: *PED001, PED002, PED003*, etc. Cada vez que se inicie la aplicación los pedidos comenzarán en *PED001*
     - Operaciones: constructor, *getters/setters*
     - Operación *removeDetalle* que eliminará el producto que recibe como parámetro del detalle del pedido
     - Operación *toString* que mostrará la información del pedido tal y como se muestra a continuación:

<p align="center">
  <img src="img\image-1.png" alt="Detalle del pedido">
</p>

   - Clase *DetallePedido*: representa cada una de las líneas que tiene el pedido
     - Información a almacenar: el *producto* y sus *unidades*
     - Métodos *getters/setters* y método *toString*
   - Encapsulamiento y modularización del código.

---

2. **Gestión de la información con colecciones**:
   - Los productos, clientes y pedidos deberán almacenarse en estructuras de datos dinámicas.
   - Se deberá elegir qué colección se considera la más idónea y comentar en el interior del código las razones que justifiquen la colección utilizada.

---

3. **Menú interactivo con consola** para:

   - **Añadir productos (opción 1)**:  
        - Se solicitarán los datos de un producto y se agregarán a la colección de productos.

   - **Añadir clientes (opción 2)**:  
        - Se solicitarán todos los datos correspondientes a un cliente y se agregarán a la colección de clientes.

   - **Crear pedidos (opción 3)**:  
     - Como mínimo deberán existir un producto y un cliente.  
     - Se mostrará un listado de los clientes existentes con su nombre de empresa y CIF.  
     - El usuario deberá teclear un *CIF* válido.  
     - A continuación, se mostrará un listado de los productos disponibles en formato tabla.  
     - Aparecerán en **color rojo** aquellos productos que tengan el *stock* a 0.  
     - Se solicitará el *ID* del producto (debe ser válido) y la cantidad de unidades (que deben estar dentro del stock disponible).  
     - El usuario podrá añadir al detalle de su pedido tantos productos como necesite.

   <p align="center">
     <img src="img\image-2.png" alt="Ejemplo crear pedido">
   </p>

   - **Mostrar todos los pedidos (opción 4)** 
        - Se mostrarán todos los pedidos que hemos ido creando y almacenando en la correspondiente colección.
    <p align="center">
     <img src="img\image-3.png" alt="Ejemplo crear pedido">
   </p>

   - **Mostrar productos en formato tabulado con colores ANSI (opción 5)**  
        - Se mostrará de forma tabulada los productos 
    <p align="center">
     <img src="img\image4.png" alt="Ejemplo crear pedido">
   </p>


   - **Exportar productos a un archivo `.txt` con separadores (opción 6)**  
        - Todos los productos que tengamos en la colección almacenada se guardará en un fichero "productos_exportados.txt" dentro del directorio "files" del proyecto
        - Se almacenará la cabecera y una línea por cada producto, donde se separará cada dato con un carácter punto y coma ;

   - **Importar productos desde archivo a MySQL (opción 7)**

        - El contenido del fichero "productos_exportados.txt", si existe, se insertará en una tabla de una base de datos MySQL
        - Recuerda sintaxis SQL:
        `INSERT INTO productos (id, nombre, precio, stock)
VALUES (1, 'Teclado', 25.99, 100)
ON DUPLICATE KEY UPDATE
  nombre = VALUES(nombre),
  precio = VALUES(precio),
  stock = VALUES(stock);`
            - Si el id no existe, se inserta el nuevo producto.
            - Si el id ya existe (clave duplicada), se actualizan los campos nombre, precio y stock con los nuevos valores.

---

4. **Validaciones de entrada del usuario**:
   - Se controlan rangos y tipos en la entrada numérica.
   - Validación del *email*: Se utiliza una expresión regular para comprobar que el formato del correo electrónico sea válido. Se descartan entradas vacías o que no tengan estructura tipo *usuario@dominio.com*
   - Validaciones del *teléfono*: El teléfono debe ser un número formado por 9 dígitos, comenzando por 6, 7 o 9 (válido en España). No se permiten letras ni separadores.
   - Validación del *CIF*: El patrón recomendado es `^[A-HJNPQRSUVW][0-9]{7}[0-9A-J]$`, el cual asegura que el CIF comience por una letra que identifica el tipo de entidad (como A para sociedades anónimas, B para sociedades limitadas, G para asociaciones, etc.), seguida de 7 dígitos numéricos y finalizando con un carácter de control que puede ser un número o una letra entre A y J.

---

5. **Excepciones personalizadas**:
   - Clase *ValorNoValidoException* para controlar los errores de cantidades no correctas para los precios o stock de los productos.
   - Control de errores en consola con mensajes amigables y en color.

---

6. **Generación automática de códigos**:
   - Los pedidos se identifican con un código único generado automáticamente.
   - Los productos y clientes no pueden repetirse.

---

7. **Exportación de productos a archivo `.txt`**:
   - Separados por `;` para facilitar la lectura posterior.
   - Cabecera y formato legible y alineado.

---

8. **Importación de productos desde archivo a base de datos MySQL**:
   - Se conecta usando JDBC con usuario *admin* y contraseña *Password1234*.
   - Inserta productos o los actualiza si ya existen (mediante *ON DUPLICATE KEY UPDATE*).
   - Se verifica la existencia del archivo antes de intentar importar.

---

9. **Uso de colores ANSI en consola**:

| Color       | Uso                             | Código ANSI      |
|-------------|----------------------------------|------------------|
| Azul        | Títulos, encabezados             | `\u001B[34m`     |
| Verde       | Confirmaciones o mensajes OK     | `\u001B[32m`     |
| Rojo        | Mensajes de error o advertencia  | `\u001B[31m`     |
| Negrita     | Cabeceras resaltadas             | `\u001B[1m`      |
| Reset       | Volver a color por defecto       | `\u001B[0m`      |

---

10. **Documentación completa en Javadoc**:
   - Como mínimo, se ha documentado toda la clase *Producto*.

---


## 📁 Estructura del proyecto

- Debes crear un proyecto Java (opción No Tools o Maven)
- Se debe organizar en paquetes las clases. Por ejemplo:

```
├── files/
│   ├── script_bd.sql               # Fichero creación de la BD
│   └── productos_exportados.txt    # Fichero de exportación
│   └── ...   
src/

├── excepciones/
│   └── ValorNoValidoException.java
│   └── ...   
├── modelo/
│   ├── Cliente.java
│   ├── Producto.java
│   └── ...   
├── servicios/
│   ├── GestorProducto.java
│   └── ...   
├── utilidades/
│   └── Utilidades.java             # Fichero para lectura por consola
└── AppPedidos.java                 # Clase principal con el método main
```
---

## ⚙️ Requisitos técnicos

- Java 17 o superior  
- Visual Studio Code con extensión de Java  
- MySQL 8+  
- Conector JDBC (`mysql-connector-j-8.x.x.jar` en la carpeta `/lib`)  
- Base de datos llamada *tiendaonline* con tabla *productos*

---

## 🛠 Preparar base de datos

```sql
CREATE DATABASE IF NOT EXISTS tiendaonline;
USE tiendaonline;

CREATE TABLE IF NOT EXISTS productos (
    id INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DOUBLE NOT NULL CHECK (precio >= 0),
    stock INT NOT NULL CHECK (stock >= 0)
);

CREATE USER IF NOT EXISTS 'admin'@'localhost' IDENTIFIED BY 'Password1234';
GRANT ALL PRIVILEGES ON tiendaonline.* TO 'admin'@'localhost';
FLUSH PRIVILEGES;