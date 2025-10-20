# service

Quarkus application module structured with the BCE (Boundary-Control-Entity) pattern. Business components organize code by domain responsibilities, with boundary layers for external interaction (JAX-RS resources), control for procedural logic, and entity for domain objects.

## Build

```bash
mvn clean package
```

## Run

```bash
mvn quarkus:dev
```
