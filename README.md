# Library API

Простое REST API приложение для работы с библиотекой книг.

## Технологии

- Java 21
- Spring Boot 4.1.1
- Maven
- Docker

## Функциональность

API предоставляет информацию о книгах библиотеки.

Доступные endpoints:

- `GET /books` — получить список всех книг
- `GET /books/{id}` — получить книгу по ID
- `GET /health` — проверить состояние API

## Запуск локально

Для запуска приложения через Maven:

```bash
./mvnw spring-boot:run

## Запуск через Docker

Сборка Docker-образа:

docker build -t library-api .

Запуск контейнера:

docker run -d --name library-container -p 8080:8080 library-api

Проверка контейнера:

docker ps

Проверка API:

http://localhost:8080/books

Просмотр логов:

docker logs library-container

Остановка контейнера:

docker stop library-container
