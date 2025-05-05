# Etapa 1: Compilación
FROM maven:3.8.4-openjdk-11 AS build

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el archivo pom.xml y las dependencias en el caché de Docker
COPY pom.xml .

# Descarga las dependencias del proyecto
RUN mvn dependency:go-offline

# Copia el resto del código fuente del proyecto
COPY src ./src

# Compila la aplicación
RUN mvn package -DskipTests

# Etapa 2: Ejecución
FROM openjdk:11-jre-slim

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el archivo JAR compilado desde la etapa de compilación
COPY --from=build /app/target/tu-aplicacion.jar ./tu-aplicacion.jar

# Expone el puerto en el que la aplicación se ejecuta (ajusta según sea necesario)
EXPOSE 80

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "tu-aplicacion.jar"]