# =========================
# STAGE 1: Build
# =========================
FROM maven:3.9.6-eclipse-temurin-21-alpine AS builder

WORKDIR /build

# Copy full multi-module project
COPY . .

# Build entire project
RUN mvn clean package -DskipTests

# =========================
# STAGE 2: Runtime
# =========================
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copy Spring Boot jar (dojo-project)
COPY --from=builder /build/dojo-project/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
