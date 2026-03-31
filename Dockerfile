# ===============================
# Stage 1: Build (Maven)
# ===============================
FROM maven:3.9.6-eclipse-temurin-21-alpine AS builder

WORKDIR /build

# Kopieer hele project (multi-module!)
COPY . .

# Build alles (incl parent, modules, etc.)
RUN mvn clean package -DskipTests


# ===============================
# Stage 2: Runtime
# ===============================
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Non-root user
RUN addgroup -S appgroup && adduser -S appuser -G appgroup

# Kopieer juiste JAR
COPY --from=builder /build/dojo-project/target/*.jar app.jar

RUN chown -R appuser:appgroup /app

USER appuser

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
