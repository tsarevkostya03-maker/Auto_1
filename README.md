# Автотесты для API

[![CI](https://github.com/tsarevkostya03-maker/Auto_1/actions/workflows/ci.yml/badge.svg)](https://github.com/tsarevkostya03-maker/Auto_1/actions/workflows/ci.yml)

## Описание
Проект с автотестами для API тестирования.

## Запуск тестов локально
```bash
# Запустить сервис
java -jar artifacts/app-mbank.jar &

# Запустить тесты
./gradlew test
