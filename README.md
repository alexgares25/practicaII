
# Reserva de Vuelos
## Índice
  1. [Introducción](#introducción)
  2. [Manual de Instalación](#manual-de-instalación)
  3. [Manual de Uso](#manual-de-uso)






## Introducción
Bienvenido al sistema de gestión de Vuelos realizado por Alejandro(alexgares),una aplicacion diseñada con Java la cual consiste en añadir vuelos y que te muestre los vuelos disponibles.Este sistema podria ser usado por ejemplo por una AeroLinea.

En este sistema puedes añadir un vuelo indicando el número de vuelo el Origen de vuelo y el Destino de vuelo con su respectivo precio.


## Manual de Instalación
Sigue estos pasos para **instalar** el programa:

### 1.Primero descargarse el código fuente

      git pull https://github.com/alexgares25/reservas_vuelos.git

### 2.Compilar el codigo fuente.

Para ello debes entrar en la carpeta del código fuente una vez este descargado

  ```cd reservas_vuelos```

Una vez dentro compilaremos el codigo

  ```find src -name "*.java" | xargs javac -cp bin -d bin```
  
## Manual de Uso
Aquí hay algunas operaciones comunes que puedes realizar con el programa:

### -Añadir un nuevo Vuelo:

    java cp bin java -cp bin puntoEntrada.Principal añadir numerovuelo Origen Destino Precio

Ejemplo para añadir un nuevo vuelo: 

    java cp bin java -cp bin puntoEntrada.Principal añadir 7889 Valencia Madrid 150

Este comando crea un nuevo vuelo con los datos: Número de Vuelo = 7889, Origen = Valencia, Destino = Madrid, Precio = 150€.

### -Mostrar Vuelos disponilbles:

    java cp bin java -cp bin puntoEntrada.Principal mostrar
    
  Este es el resultado al ejecutar el comando:
  
  ```Numero de vuelo:#7889 -Origen:Valencia -Destino:Madrid -Precio:150€```
    
### -Para obtener ayuda ejecuta este comando:

    java cp bin java -cp bin puntoEntrada.Principal ayuda


