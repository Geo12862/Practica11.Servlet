# Practica11.Servlet 
## Calculadora Hipotecaria
Simulaciones de hipotecas con, Java, Servlet, Html, CSS y JS de apoyo con servidor Tomcat

### Creamos este proyecto utilizando el IDE Eclipse
1. Tenemos 2 carpetas dentro del proyecto dinámico:
  - CalculadoraService: donde están los archivos Java
  - CalculadoraServlet: donde está nuestro archivo Servlet principal
2. En la carpeta "webapp" disponemos de 3 archivos html y 1 archivo JS
  - index.html
  - login.html
  - register.html
  - main.js

## Imagenes
### Prueba Calculadora:
![Imagen de calculadora](https://github.com/Geo12862/Practica11.Servlet/blob/main/imagenesServlet/Calculo.jpeg)

### Prueba Reultado:
![Imagen de resultado](https://github.com/Geo12862/Practica11.Servlet/blob/main/imagenesServlet/Resultado.jpeg)


## TODO:
- [x] La aplicación debe permitir calcular la cuota que se pagará mensualmente a partir de un capital, un interés y un plazo dado.
- [ ] La aplicación permitirá visualizar el cuadro de amortización si el usuario así lo solicita.
- [ ] La aplicación debe permitir a un usuario registrarse en la aplicación y obtener así un usuario y un password asociado a él que le permitirán estar identificado en la aplicación.
- [ ] Un usuario identificado debe poder ver las simulaciones de hipotecas que se han realizado en la aplicación junto con la fecha y hora en que la realizó. Las almacenaremos en una tabla de la base de datos de la aplicación.
- [ ] Si un usuario identificado lo desea debe poder volver a simular una hipoteca sin necesidad de introducir los datos, simplemente seleccionando la simulación de entre los que ya ha realizado.
- [ ] Se deben albergar los errores como errores en un archivo llamado AppHipoteques.txt.
- [ ] Se debe albergar como debug en un archivo llamado AppHipoteques.txt todas las simulaciones que se realicen tanto de un usuario identificado como si no. Debe incluir la fecha, hora, IP, nombre de usuario y los datos de la simulación de la hipoteca (importe, interés y meses).
- [ ] Poner Registro en index.html
- [x] DB Calculo Hipoteca
- [x] DB Usuarios
- [ ] Debe eliminarse del servidor tomado las aplicaciones desplegadas pordefecto.
- [ ] Tienes que desplegar la aplicación creada en la raíz de las URL del servidor tomcat.
