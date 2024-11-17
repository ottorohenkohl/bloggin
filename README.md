# Bloggin

[![pipeline status](http://lab.ottorohenkohl.de/entwicklung/java/bloggin/badges/main/pipeline.svg)](http://lab.ottorohenkohl.de/entwicklung/java/bloggin/-/commits/main) [![coverage report](http://lab.ottorohenkohl.de/entwicklung/java/bloggin/badges/main/coverage.svg)](http://lab.ottorohenkohl.de/entwicklung/java/bloggin/-/commits/main) [![Latest Release](http://lab.ottorohenkohl.de/entwicklung/java/bloggin/-/badges/release.svg)](http://lab.ottorohenkohl.de/entwicklung/java/bloggin/-/releases)

Das **Bloggin** backend ist die serverseitige Komponente für das Bloggin CMS. Als **modulares Multi-Module Maven-Projekt** aufgebaut, folgt es einer **strikten Architektur** für eine flexible, erweiterbare und gut wartbare Codebasis.

## 1. Projektbeschreibung

Das Backend für Bloggin ist hochgradig modular und basiert auf **Quarkus**. Ziel ist es, eine flexible, skalierbare und wartbare Backend-Struktur für das CMS bereitzustellen, die verschiedene CMS-Funktionalitäten durch REST-APIs ermöglicht. Die Architektur trennt Verantwortlichkeiten strikt und stellt sicher, dass Services und Geschäftslogik unabhängig von REST-Implementationen bleiben.

### Architekturüberblick

Die Architektur ist stark modularisiert und durch eine klare Abhängigkeitshierarchie strukturiert. Die zentrale Geschäftslogik liegt im **Domain-Modul**, das die Module **Service**, **Transfer**, **Repository** und **Model** umfasst. Ein Überblick über die wesentlichen Module und ihre Rollen:

- **Domain-Modul**: Definiert die Geschäftslogik und stellt die zentrale Funktionalität bereit, unterteilt in:
    - **Service**: Stellt die Business-Logik bereit und greift auf die Repositories und Modelle zu. Services erhalten DTOs und geben sie zurück, sind jedoch unabhängig von REST-Ressourcen.
    - **Transfer**: Beinhaltet Mapper, die mithilfe von **MapStruct** DTOs und Entitäten umwandeln. Die Mapper erlauben eine rekursive Umwandlung komplexer Entitätsstrukturen mithilfe der Repositories.
    - **Repository**: Enthält die Datenzugriffsschicht für die persistente Speicherung und den Abruf von Daten.
    - **Model**: Definiert die Datenmodelle und -beziehungen. Die Sichtbarkeit wird durch eine nach Features gegliederte Package-Struktur gesteuert. Services eines Features sehen nur die Repositories und Models desselben Features.

- **Ressource-Modul**: Definiert die REST-Endpunkte und ist der Einstiegspunkt der Anwendung. Es hat Zugriff auf die Services und DTOs in **Transfer**. Die Konfigurationsdatei `application.properties` ist hier hinterlegt.

- **Exception-Modul**: Beinhaltet zentrale Exception-Handler für die Fehlerbehandlung und ist an das Ressource-Modul angebunden, ohne direkte Abhängigkeit zur Domain.

## 2. Installation/Einrichtung

### Grundlegende Voraussetzungen

Um das Projekt lokal auszuführen, wird ein PostgreSQL-Datenbankserver benötigt, der standardmäßig auf `localhost:5432` unter folgenden Einstellungen erreichbar sein sollte:

- **Datenbankname**: `quarkus`
- **Benutzername**: `quarkus`
- **Passwort**: `quarkus`

Diese Standardeinstellungen können durch Anpassen der `application.properties` im Ressource-Modul geändert werden, falls eine andere Datenbank oder andere Zugangsdaten genutzt werden sollen.

### Starten im Entwicklungsmodus

Das Bloggin-Backend kann im Entwicklungsmodus gestartet werden, um Hot-Reloading und andere Entwicklertools zu nutzen:

```bash
./mvnw quarkus:dev
```

Im Entwicklungsmodus läuft der Server standardmäßig unter `localhost:8080`. Das **Swagger-UI** ist über `http://localhost:8080/q/swagger-ui` zugänglich und zeigt eine Übersicht aller verfügbaren REST-API-Endpunkte an. Hier lassen sich alle verfügbaren APIs testen und Dokumentationen einsehen.

## 3. Nutzung/Beispiele

Das Backend stellt REST-APIs bereit, die die Inhalte und Strukturen des Bloggin CMS steuern. Verschiedene bewährte Java-Technologien kommen zum Einsatz, darunter:

- **Quarkus RESTEasy** für die Implementierung und Verwaltung der REST-APIs.
- **Jackson** für die JSON-Serialisierung und -Deserialisierung.
- **Hibernate ORM und Validator** zur Verwaltung und Validierung der Entitäten.
- **MapStruct** für die automatische Umwandlung zwischen DTOs und Entitäten, einschließlich rekursiver Mappings über Repositories.

### Beispiel: Abfrage und Verwaltung von Ressourcen

Um Ressourcen über die API zu testen oder Datenstrukturen und -antworten einzusehen, können Sie das Swagger-UI nutzen, das alle implementierten REST-Ressourcen vollständig dokumentiert.

1. **Swagger öffnen**: Besuchen Sie [http://localhost:8080/q/swagger-ui](http://localhost:8080/q/swagger-ui).
2. **Endpunkt aufrufen**: Wählen Sie den gewünschten Endpunkt aus und führen Sie die Anfrage direkt über die Benutzeroberfläche aus.
3. **Antwort überprüfen**: Die JSON-Antworten zeigen die entsprechenden DTO-Formate an, und Fehlermeldungen werden durch die Exception-Handler aufbereitet.

### Datenbankwechsel

Standardmäßig wird PostgreSQL verwendet, aber jede JDBC-kompatible Datenbank kann eingebunden werden, indem der entsprechende JDBC-Treiber in den `pom.xml`-Dateien und die Einstellungen in `application.properties` angepasst werden.

### Container Images

Container-Images werden in der **Docker-Registry unter `ctr.ottorohenkohl.de`** abgelegt. Diese sind unter den GitLab-Releases einsehbar und für verschiedene Umgebungen bereitgestellt.

## 4. Weiterführende Links

- [Quarkus Dokumentation](https://https://quarkus.io/guides/) – Detaillierte Anleitungen und Konfigurationsoptionen für Quarkus.
- [MapStruct](https://mapstruct.org/) – Weitere Informationen zur Mapper-Bibliothek.
- [Hibernate](https://hibernate.org/) – Details zum ORM und Validierungsframework.