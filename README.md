# Vertrags-Service

Ein Mikroservice, um Verträge zu managen, gebaut mit **Java** und **Spring Boot**.

## Features

- CRUD-Funktionalitäten für Verträge
- Datenbankintegration mit PostgreSQL
- Containerisierung mit Docker
- Moderne RESTful API

## Voraussetzungen

- **Java 17** oder höher
- **Maven** (zum Bauen des Projekts)
- **PostgreSQL** (für die Datenbank)
- **Docker** (optional, zur Containerisierung)

## Installation

### 1. Repository klonen
```bash
git clone https://github.com/Tayfun-dev/vertrags-service.git
cd vertrags-service
```
### 2. Abhängigkeiten installieren
```bash
mvn clean install
```
### 3. Datenbank konfigurieren
Bearbeite die Datei src/main/resources/application.properties und füge deine Datenbankzugangsdaten hinzu:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/vertragsdb
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
```
### 4. Anwendung starten
```bash
mvn spring-boot:run
```
### 5. API testen
Nach dem Start der Anwendung ist die API unter http://localhost:8080 verfügbar.
Beispielendpunkt:
```HTTP
GET /contracts
```
### Docker-Unterstützung
1. Docker-Image erstellen
```bash
docker build -t vertrags-service .
```
2. Container starten
```bash
docker run -p 8080:8080 vertrags-service
```
### API-Endpunkte

GET /contracts: Dieser Endpunkt gibt eine Liste aller vorhandenen Verträge zurück. Du kannst ihn verwenden, um alle Verträge in der Datenbank abzurufen.

POST /contracts: Mit diesem Endpunkt kannst du einen neuen Vertrag erstellen, indem du die Vertragsdetails im Anfrage-Body übermittelst.








