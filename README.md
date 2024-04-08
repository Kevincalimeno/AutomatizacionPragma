# Automatización Pragma
Reto automatización web con patrón de screenplay

Este repositorio alojado en Github contiene una automatización de pruebas web para un sitio de compras en línea llamado DEMOBLAZE.

La automatización ha sido diseñada utilizando el patrón Screenplay para asegurar un código limpio y mantenible y se han respetado los principios SOLID.

La automatización utiliza Java y Gradle como herramienta de construcción.

La automatización incluye pruebas para los principales flujos de trabajo de la aplicación, que incluyen iniciar sesión en la aplicación, agregar un artículo al carrito de compra y verificar el carrito de compras.

La estructura del proyecto es clara y fácil de entender. Hay un paquete de tests que contiene todas las clases de prueba, un paquete de tasks que contiene todas las clases de tareas que se utilizan en la prueba y un paquete de questions que contiene todas las clases que se utilizan para obtener información de la aplicación.

Para ejecutar las pruebas de esta automatización, sigue los siguientes pasos:

Paso a paso:

Descarga el repositorio desde Github.

Abre una terminal y navega hasta la carpeta raíz del proyecto.

Ejecuta el comando ./gradlew clean test para compilar el proyecto y ejecutar todas las pruebas.

# Si la ejecución por comando no funciona puedes ejecutar manualmente desde el archivo DemoBlaze.feature (src/test/resources/features/DemoBlaze.feature) y ejecutar la linea 4 desde dentro la Feature. 

Observa los resultados de las pruebas en la terminal.

Opcionalmente, puedes generar un informe de pruebas detallado ejecutando el comando ./gradlew aggregate.

Con estos pasos podrás descargar la automatización de pruebas web alojada en Github, compilarla y ejecutarla utilizando Gradle.

La automatización iniciará sesión en la aplicación, agregará un articulo celular Samsung al carrito de compra, y verificará el carrito de compras, asegurando que el proceso de agregar productos al carrito esté funcionando correctamente.
