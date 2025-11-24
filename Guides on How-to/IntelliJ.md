# IntelliJ IDEA: The Developer's Workshop
## Java and Kotlin's goto IDE (Integrated Development Environment)
## 1. Introduction & Setup
IntelliJ IDEA is the industry-standard Integrated Development Environment (IDE) for Java and Kotlin development. 
This guide will help you set up your environment and start your first project.

### 1.1 Installation
- **Download**: [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) (Community Edition is free; Ultimate is paid but free for students/open source).
- **Recommended Install Path**: `C:\dev\JetBrains\IntelliJ IDEA <version.number>\` (Windows).

### 1.2 Essential Configuration
Before creating a project, configure your global settings to ensure consistency.
1.  **Java (JDK)**:
    - Go to `File` > `New Projects Setup` > `Structure...` > `Platform Settings` > `SDKs`.
    - Add your installed JDK (e.g., `C:\dev\Java\jdk-<version>`).
    - For existing settings, go to `File` > `Settings` > `Project Structure` > `Project Settings` > `Project SDK`.
    - Or alternatively, go to `File` --> `Settings --> Build, Execution, Deployment` --> `Compiler` --> `Java Compiler`
2.  **Maven**:
    - Go to `File` > `New Projects Setup` > `Settings for New Projects...`.
    - Navigate to `Build, Execution, Deployment` > `Build Tools` > `Maven`.
    - Set **Maven home path** to your local installation (e.g., `C:\dev\apache-maven-<version>`).
    - For existing settings, go to `File` > `Settings` > `Build, Execution, Deployment` > `Build Tools` > `Maven`.
    - *Tip:* Avoid using the "Bundled" Maven unless necessary.
3.  **Git**:
    - Navigate to `Version Control` > `Git` in Settings (`Ctrl + Alt + S`).
    - Ensure the path to the Git executable is correct.
4.  **Run Configurations**:
    - Select `Run`, then `Edit Configurations` to open the run configurations window.
    - Where you configure how the application will be run, including the main class, program arguments, and VM options.
    - Create multiple run configurations for different scenarios, such as running tests or debugging.

- Set up Java in IntelliJ: 
  Use the Java directory previously set up in the Maven home path such as: `C:\dev\Java\jdk-<version.number>`

---

## 2. Starting Full Stack Projects
Modern Java development often involves Full Stack frameworks. IntelliJ provides wizards to bootstrap these quickly.

### 2.1 Backend Frameworks
Use `File` > `New` > `Project` to access these generators.

*   **Spring Boot (Standard for Microservices)**
    *   Select **Spring Initializr**.
    *   Choose dependencies like **Spring Web**, **Spring Data JPA**, and **PostgreSQL Driver**.
    *   *Pair with:* Angular, React, or Vue.js for the frontend.

*   **Jakarta EE (Enterprise Standard)**
    *   Select **Jakarta EE** to build large-scale, standardized enterprise applications.

*   **Cloud-Native Frameworks (Quarkus & Micronaut)**
    *   **Quarkus**: "Supersonic Subatomic Java," optimized for Kubernetes and fast startup.
    *   **Micronaut**: Modular and easily testable with low memory footprint.

### 2.2 Frontend Integration
You can develop your frontend (Angular/React/Vue.js) alongside your Java backend within IntelliJ.
*   **Multi-Module Projects**: Keep backend (`api`) and frontend (`ui`) in separate folders within the same project root.
*   **Run Configurations**: Create a "Compound" run configuration to start both the Spring Boot backend and the `npm start` script for the frontend simultaneously.

### 2.3 Database Integration
IntelliJ allows you to manage databases directly without external tools like pgAdmin or Workbench.

**Practical Use Case (Dockerized Database):**
1.  **Spin up a database** using Docker (keeps your OS clean):
    ```bash
    docker run --name my-postgres -e POSTGRES_PASSWORD=password -p 5432:5432 -d postgres
    ```
2.  **Connect in IntelliJ**:
    *   Open the **Database** tool window (`View` > `Tool Windows` > `Database`).
    *   Click `+` > **Data Source** > **PostgreSQL**.
    *   **Host**: `localhost`, **Port**: `5432`, **User**: `postgres`, **Password**: `password`.
3.  **Benefit**: You get SQL syntax highlighting and code completion for table names inside your Java code!

---

## 3. Containerization (Docker)
Containerization ensures your application runs the same way everywhere.

### 3.1 Managing Docker
*   Enable the **Docker** plugin (usually bundled).
*   Open the **Services** tool window (`Alt + 8`) to view running containers, images, and logs.

### 3.2 Dockerizing Applications (Layer-by-Layer Approach)
Instead of bundling everything into one "fat JAR," use a layered approach in your `Dockerfile` for efficient caching. If you only change your code, Docker won't need to re-download dependencies.

**Example `Dockerfile` concept:**
From your project root, create a new file called `Dockerfile`. 
Fill out the Dockerfile with the following steps:
```docker
FROM eclipse-temurin:17-jre-alpine as builder WORKDIR /application
COPY mvnw . COPY .mvn .mvn COPY pom.xml . RUN ./mvnw dependency:go-offline
COPY src src RUN ./mvnw package -DskipTests
```

---

## 4. Productivity Shortcuts & Tips

### 4.1 Essential Shortcuts
| Action | Windows/Linux | Function |
| :--- | :--- | :--- |
| **Search Everywhere** | `Double Shift` | Search for files, actions, classes, or settings. |
| **Project Structure** | `Ctrl + Alt + Shift + S` | Configure JDKs, libraries, and modules. |
| **Settings** | `Ctrl + Alt + S` | Open global IDE preferences. |
| **Terminal** | `Alt + F12` | Open the built-in command line. |
| **Run Application** | `Shift + F10` | Run the currently selected configuration. |
| **Context Actions** | `Alt + Enter` | Quick fixes, imports, and code suggestions. |
- Learn IntelliJ's shortcuts: Access it from IntelliJ itself: `Help` --> `Keyboard Shortcuts PDF`

### 4.2 Build vs. Rebuild
*   **Build Project** (`Ctrl + F9`): Incremental build. Only compiles what changed. Fast.
*   **Rebuild Project**: Cleans and compiles everything from scratch. Use this if the compiler acts strangely.

### 4.3. Additional Tips
*   **Set up code style and formatting preferences**: indentation, line length, and naming conventions.
*   **Configure the inspection and code analysis settings**: Identify and fix potential issues in your entire codebase.
---

## 5. Recommended Plugins
Supercharge IntelliJ by going to `File` > `Settings` > `Plugins`.
*   **[SonarQube](https://plugins.jetbrains.com/plugin/7973-sonarqube-for-ide/)**: Detect bugs and vulnerabilities in real-time.
*   **Key Promoter X**: Helps you learn shortcuts.
*   **Rainbow Brackets**: easier to read nested code.
*   **[Cucumber](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java/) / [Gherkin](https://plugins.jetbrains.com/plugin/9164-gherkin/)**: For BDD testing support.
*   **[JetBrains AI Assistant](https://plugins.jetbrains.com/plugin/22282-jetbrains-ai-assistant)**: Integrated AI support for coding and refactoring.
    - There's a lot more out there! Check out the Plugins section in the Settings of IntelliJ

---

## 6. Getting started with IntelliJ
  
* [IntelliJ IDEA Official Documentation](https://www.jetbrains.com/help/idea/getting-started.html)
*   - [JVM frameworks](https://www.jetbrains.com/help/idea/jvm-frameworks.html)
*   - [Spring Boot in IntelliJ](https://www.jetbrains.com/help/idea/spring-boot.html)
*   - [Jakarta EE](https://www.jetbrains.com/help/idea/java-ee.html)
*   [JetBrains YouTube Channel](https://www.youtube.com/@JetBrainsTV)
*   [Maven support](https://www.jetbrains.com/help/idea/maven-support.html)
*   [JetBrains AI](https://www.jetbrains.com/ai/)
*   [IntelliJ on YouTube](https://www.youtube.com/@intellijidea)

---

## 7. External Resources
*   [Let's Get Lazy, by Venkat Subramaniam / JetBrains Technology Day for Java](https://www.youtube.com/watch?v=PICHx2at46s)

---
