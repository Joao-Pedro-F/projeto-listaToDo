# Estágio 1: Build (Compilação)
# Usamos o Maven com Java 21 para compilar o projeto
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Copia os arquivos do projeto para dentro do container
COPY . .

# Executa o build do Maven pulando os testes para ser mais rápido
RUN mvn clean package -DskipTests

# Estágio 2: Runtime (Execução)
# Aqui usamos a imagem oficial do Java 25 que você quer
FROM eclipse-temurin:25-jdk
WORKDIR /app

# Copia o arquivo .jar gerado no estágio anterior
# O asterisco (*) garante que ele pegue o arquivo mesmo que a versão mude
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta padrão
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]