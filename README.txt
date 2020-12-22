Este proyecto fue generado para la prueba tecnica de ingreso a Qvision.

Para su ejecución adecuada se requiere que en las variables de entorno del sistema operativo se encuentre configuradas
las siguientes:

* JAVA_HOME (se agrega la ruta en la que se tiene instalado el jdk)
* MAVEN_HOME (se agrega la ruta donde se encuentra instalado apache maven)
* En la variable Path se deben incluir de la siguiente manera %JAVA_HOME%\bin, %GRADLE_HOME%\bin y se debe agregar la
  ruta donde se encuentran almacenados los drivers de los diferentes navegadores a usar en las pruebas,
  ejemplo : C:\BrowserDrivers.

Para cambiar el navegador sobre el cual se ejecutara la prueba, se debre abrir el archivo del proyecto  serenity.properties
y allí modificar el nombre del navegador a utilizar, ejemplo: webdriver.driver=chrome, webdriver.driver=firefox.

Para ejecutar desde la pantalla de comandos el proyecto, se realiza con el siguiente comando:
*gradlew clean test aggregate
con dicho comando se generara de igualmanera el reporte de serenity en la carpeta del proyecto
\target\site\serenity/index.html

Autor: Cristian Mesa
email: mesa.cristian@gmail.com

