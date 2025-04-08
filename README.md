# Board Manager
Início do Projeto de gerenciamento de quadros com Spring Boot e PostgreSQL no bootcamp Digital Innovation One (DIO). 
Projeto baseado na aula de estudo oferecido pela plataforma, restando alguns ajustes.

## 🚀 Tecnologias Utilizadas
- Java 21
- Gradle
- PostgreSQL
- Docker e Docker Compose

## 📦 Para Rodar o Projeto

1. 🔄 Limpar e compilar o projeto:
```bash
./gradlew clean build
```

2. 🐳 Subir os containers com Docker Compose:
```bash
docker-compose up -d
```

3. ✅ Verificar se o banco está rodando:
```bash
docker ps
```

## ▶️ Para rodar o .JAR da aplicação Java

Após o build, rode:

```bash
java -jar build/libs/app.jar
```

A aplicação se conectará automaticamente ao container do banco PostgreSQL.