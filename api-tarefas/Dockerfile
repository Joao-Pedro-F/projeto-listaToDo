# Estágio 1: Build (Compilação)
# Usamos o Maven com a JDK 21 para compilar o projeto
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Copia os arquivos do seu projeto para dentro do container
COPY . .

# Executa o comando para gerar o arquivo .jar (ignorando os testes)
RUN mvn clean package -DskipTests

# Estágio 2: Runtime (Execução)
# Usamos apenas a JRE/JDK 21 para rodar, deixando a imagem leve
FROM eclipse-temurin:21-jdk
WORKDIR /app

# Copia o arquivo .jar gerado no estágio anterior
# O uso do asterisco (*) garante que ele encontre o arquivo independente do nome exato
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta 8080 (padrão do Spring Boot)
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]