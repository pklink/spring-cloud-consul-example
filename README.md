# Spring Cloud Consul Example

```
consul agent -dev -ui
mvn -f backend/pom.xml spring-boot:run
mvn -f backend/pom.xml spring-boot:run
...
mvn -f frontend/pom.xml spring-boot:run
```

* Frontend is available on http://localhost:8080/int
* Consul-UI is available on http://localhost:8500/ui
