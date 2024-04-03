# Patrones de desarrollo de software (caso práctico)

## Introducción

A continuación encontrará la descripción de una aplicación a desarrollar. La
idea es que ésta le permita aplicar los conceptos dictados hasta ahora en el
curso. Esta aplicación puede ser desarrollada en grupos de máximo dos personas y
puede ser objeto de sustentación según sea requerido. En tal caso la nota será
la emitida por la sustentación. Además ambos integrantes deben estar en total
capacidad de sustentar el trabajo.


## Ejercicio 1

En la primera parte del ejercicio usted dejará listas todas las partes que
necesita para el desarrollo de este trabajo. Lo primero será instalar la
aplicación __SQLite__, un manejador de bases de datos muy simple. Desde su
navegador vaya el [este enlace](https://www.sqlite.org/) y proceda con la
descarga e instalación del paquete.

Este es el momento de bajar una base de datos artificial que nos servirá de
muestra para nuestra aplicación. En [este enlace](https://www.kaggle.com/datasets/atanaskanev/sqlite-sakila-sample-database)
encontrará la descarga de __archive.zip__ que contiene los scripts de
instalación de la base de datos. Después de descomprimir el archivo ejecute los
siguientes comandos en una terminal. Aquí se asume que usted está en el mismo directorio de los archivos descomprimidos.

```shell
$ sqlite3 sqlite-sakila.db
sqlite> select * from film;
```

La primera línea abre la base de datos y deja un prompt para insertar comandos
en SQL. La segunda lista todo el contenido de la tabla _film_. Si no sale ningún
tipo de error y por el contrario en la pantalla queda un listado significa que
todo va bien.

Ahora es hora de acceder a la base de datos usando Java. Con este archivo usted también tiene copia de los últimos drivers de `sqlite` y un archivo de ejemplo llamado `Sample.java`. Lo que debe hacer entonces es:

> javac Sample.java
> java -classpath ".:sqlite-jdbc-3.45.2.0.jar:slf4j-api-1.7.36.jar" Sample

Si todo ha salido bien hasta ahora debería tener una salida en la terminal con:

```shell
name = leo
id = 1
name = yui
id = 2
```

Ahora probaremos todo junto, la base de datos que descargó y su acceso desde
_Java_.

```shell
$ javac Sakila.java
$ java -classpath ".:sqlite-jdbc-3.45.2.0.jar:slf4j-api-1.7.36.jar" Sakila
```

Si puede ver una lista de títulos como resultado de lo anterior significa que todo está listo.