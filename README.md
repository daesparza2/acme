# acme
# Descripcion del ejercicio
The company ACME offers their employees the flexibility to work the hours they want. But due to some external circumstances they need to know what employees have been at the office within the same time frame

The goal of this exercise is to output a table containing pairs of employees and how often they have coincided in the office.

Input: the name of an employee and the schedule they worked, indicating the time and hours. This should be a .txt file with at least five sets of data. You can include the data from our examples below:

Example 1:

INPUT
RENE=MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00- 21:00
ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00
ANDRES=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00


OUTPUT:
ASTRID-RENE: 2
ASTRID-ANDRES: 3
RENE-ANDRES: 2

Example 2:

INPUT:
RENE=MO10:15-12:00,TU10:00-12:00,TH013:00-13:15,SA14:00-18:00,SU20:00-21:00
ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00

OUTPUT:
RENE-ASTRID: 3

# Ejecucion
Necesita tener instalado java en su ordenador

Para poder ejecutar el proyecto ejecute los siguientes comandos desde la terminal 

```
cd acme-master/src
javac acme/Acme.java
java acme/Acme
```
o tambien puede compilarlo desde cualquier id de programacion (en este caso el id utilizado para el desarrollo del ejercicio fue Netbeans)

# Estructura
El proyecto esta estructurado en una arquitectura mvc omitiendo las vistas debido a que la salida del mismo se muestra por consola, cuenta con una capa intermedia entre controladores y modelos denominada servicios, para la lectura del archivo data.txt utilice una la estructura definida por el patron de diseño iterator la cual esta en el paquete Utileria.

![diagrama de clases](https://user-images.githubusercontent.com/65741905/143788790-b2517a04-6c53-4833-b70a-e7cc8d626d43.jpg)

# Metodologia
Al ser un ejercicio pequeño y no tan complejo para el desarrollo del mismo me guie con el enfoque de la metodologia de desarrollo en cascada de la siguiente manera:

1. Analisando el ejercicio con el fin de identificar la funcionalidad requerida.
2. Identificando un pequeño diseño de los modelos necesarios. 
3. Implementando la logica por medio de programacion.
4. Ejecutando pequeñas pruebas hasta obtener el resultado deseado.
