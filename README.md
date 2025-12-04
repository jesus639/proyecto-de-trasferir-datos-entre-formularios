# proyecto-de-trasferir-datos-entre-formularios
Descripcion del proyecto
Este proyecto es una aplicacion creada en Java Forms que muestra como pasar informacion entre diferentes formularios usando un flujo simple de ventanas. Su objetivo principal es demostrar el uso de variables compartidas, eventos y comunicacion entre pantallas dentro de una aplicacion grafica.

La aplicacion esta compuesta por cinco formularios, cada uno con una funcion especifica:

1. Formulario de registro
Es la primera ventana del programa.
Incluye:
Dos campos de texto: nombre y codigo
Un boton Seguir
Cuando el usuario presiona el boton, los datos se envian al siguiente formulario.

2. Formulario de nivel
Este formulario muestra:
El nombre ingresado en el formulario anterior
Un campo de texto para escribir un nivel extra
Un ComboBox con los niveles: Nivel 1, Nivel 2 y Nivel 3
Un boton Continuar
Segun el nivel seleccionado, se decide el rango de numeros que se usaran luego en el formulario del juego.

3. Formulario del juego
Este es el formulario principal del proyecto.
Contiene:
36 botones, cada uno con un numero aleatorio oculto
Los numeros dependen del nivel elegido anteriormente:
Nivel 1: entre 1 y 36
Nivel 2: entre 1 y 100
Nivel 3: entre 1 y 1000
Cuando el usuario presiona un boton, el numero aparece y se actualizan los siguientes datos:
Puntos: suma total de los numeros descubiertos
Pares: suma de los numeros pares
Impares: suma de los numeros impares
Intentos: cantidad total de clics
Tambien incluye cuatro botones extra:
Reorganizar: reinicia todos los valores del juego
Cerrar: termina la aplicacion
Acerca de: abre un formulario con la informacion del jugador
Ver resumen: abre la ventana final del programa

4. Formulario "Acerca de"
Muestra el nombre y el codigo ingresados al inicio.
Es solo informativo y no se pueden modificar los datos.

6. Formulario de resumen
Es la ultima pantalla del proyecto. Muestra:
Nombre
Codigo
Intentos totales
Puntos obtenidos
Nivel seleccionado
Primer numero descubierto
Ultimo numero descubierto
Incluye un boton Terminar, que finaliza el programa.

Proposito del proyecto
Este proyecto fue creado con el proposito de practicar y demostrar conceptos basicos y esenciales en el desarrollo de interfaces graficas en Java, tales como:
Manejo de multiples formularios
Envio y recepcion de datos entre ventanas
Uso de eventos y botones
Generacion de numeros aleatorios
Control de estados, contadores y acumuladores
Estructura logica de un pequeño juego interactivo
Tambien sirve como ejemplo educativo para estudiantes que estan comenzando con Java Forms y quieren entender como funciona la comunicacion entre pantallas dentro de un mismo proyecto.
