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