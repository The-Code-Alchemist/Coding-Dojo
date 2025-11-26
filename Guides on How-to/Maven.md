Here is a beginner-friendly guide to Apache Maven,to help you get started immediately.

# 🚀 Quick Start Guide to Apache Maven
* Build what you developed and keep dependency versions up to date

## What is Maven?
Think of Maven as the "manager" for your Java project. It is a build automation tool that handles the heavy lifting so you can focus on coding.

**Why you need it:**
*   **Dependency Management:** It automatically downloads libraries (like JUnit or Apache Commons) so you don't have to manually manage JAR files.
*   **Standard Structure:** It uses a standard folder structure, so any Java developer can look at your project and understand where the code and tests live.
*   **Reproducibility:** It ensures the project builds exactly the same way on your machine, your colleague's machine, and the server.
*   **Convention over Configuration:** You tell Maven *what* you want (declarative), not *how* to do it.

---

## 1. The Heart of the Project: `pom.xml`
Every Maven project has a file named `pom.xml` (Project Object Model) in its root folder. This is the blueprint of your project.

It defines **who you are** using three coordinates:
*   **GroupId:** Your unique ID (usually reverse domain, e.g., `com.codealchemists`).
*   **ArtifactId:** The name of your project (e.g., `my-app`).
*   **Version:** The current version (e.g., `1.0-SNAPSHOT`).
    *   *Tip:* `SNAPSHOT` means "work in progress." Never deploy a snapshot to production.
*   **Effective POM:** The combination of your `pom.xml` and the default settings from Maven.
    *   A complete POM that has all the inherited settings from settings.xml, Maven itself, plugins, and anything you define yourself.*
    *   Essentially what Maven runs inside your application.
    *   Add an example later
---

## 2. How to Create a Project (IntelliJ IDEA)
Since Maven integrates perfectly with IntelliJ IDEA, setting up is easy:
1.  Select **New Project** > **Maven**.
2.  Choose your JDK.
3.  Enter your **GroupId**, **ArtifactId**, and **Version**.
4.  Click **Finish**.

IntelliJ will generate the folder structure and the `pom.xml` file for you.

---

## 3. Managing Libraries (Dependencies)
This is Maven's superpower. If you need a library, you don't download it manually. You "declare" it in your `pom.xml`.

**How to add a library:**
Inside the `<dependencies>` section of your POM file, add the library's coordinates. Maven will download it from the "Central Repository" automatically.

```xml
<dependencies>
    <!-- Example: Adding Apache Commons -->
    <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-lang3</artifactId>
        <version>3.12.0</version>
    </dependency>
</dependencies>
```
*   **IntellJ's shortcut for adding a dependency is `Ctrl + Shift + A`.
Dependencies are the libraries that your project depends on.

**Key Concepts:**
*   **Transitive Dependencies:** If your library depends on *another* library, Maven downloads that one too automatically.
*   **Scope:** You can limit when a library is used.
    *   `test`: Only available during testing (e.g., JUnit).
    *   `compile`: Available everywhere (default).
*   **Exclusions:** If a library brings in something you don't want, you can explicitly exclude it using the `<exclusion>` tag.

---

## 4. Essential Maven Commands/Goals
You run these commands to tell Maven what to do with your project. You can run these from the terminal or the "Maven" tab in IntelliJ.

| Command                | What it does                                                                                                                    |
|:-----------------------|:--------------------------------------------------------------------------------------------------------------------------------|
| `mvn clean`            | **Housekeeping.** Deletes the `target` folder (where compiled files live) to ensure a fresh build.                              |
| `mvn validate`         | **Validation.** Checks the project is set up correctly and all necessary files are present.                                     |
| `mvn compile`          | **Translation.** Turns your `.java` source code into `.class` files.                                                            |
| `mvn test`             | **Verification.** Runs all unit tests found in `src/test/java`.                                                                 |
| `mvn test-compile`     | **Verification.** Compiles all unit tests found in `src/test/java`.                                                             |
| `mvn integration-test` | **Verification.** Runs integration tests (tests that involve multiple components or systems).                                   |
| `mvn site:stage`       | **Verification.** Runs all unit tests found in `src/test/java` and generates a report in `target/site/staging`.                 |
| `mvn site`             | **Documentation.** Generates documentation for your project (e.g., Javadocs).                                                   |
| `mvn site:deploy`      | **Publishing.** Generates documentation and deploys it to a remote server (like GitHub Pages).                                  |
| `mvn verify`           | **Verification.** Runs all verification phases (test, integration-test, site) and ensures the build is ready for deployment.    |
| `mvn package`          | **Boxing up.** Compiles code, runs tests, and packages the result into a JAR or WAR file.                                       |
| `mvn install`          | **Local Sharing.** Packages the project and puts it in your local repository (`.m2` folder) so other local projects can use it. |
| `mvn javadoc:jar`      | **Documentation.** Generates Javadocs for your project and packages them into a JAR file.                                       |
| `mvn javadoc:javadoc`  | **Documentation.** Generates Javadocs for your project                                                                          |
| `mvn deploy`           | **Publishing.** Uploads your artifact to a remote server (like a corporate repository) for others to use.                       |

### The "Pro" Workflow: Daisy-Chaining
You rarely run just one command. It is common practice to chain them to ensure a safe build.

**The most common daisy-chain commands used by developers:**
> `mvn clean install`
> `mvn clean verify`
Refine this daisy-chain command: -P test means the test profile will run
> `mvn clean validate compile test test-compile package -P test`

This deletes old files (`clean`), compiles the code, runs the tests, packages the JAR, and saves it to your local machine (`install`).

**To run quickly without testing:**
> `mvn clean install -DskipTests`
*(Use with caution! Only do this if you know your changes don't break anything.)*

---

## 5. Troubleshooting
*   **Dependency Tree:** If you have conflicts, run `mvn dependency:tree` to see exactly which libraries are pulling in which transitive dependencies.
*   **Repositories:** Maven downloads files from the internet (Central Repository) to your computer. 
* It stores them in a local folder (usually `~/.m2/repository`). 
* `~/.m2/repository` is the default location for Maven to store artifacts and dependencies.
* Artifacts are the compiled code of your project.
* If a download fails, checking this folder or your internet connection is a good first step.

## 6. Overriding
*   Example of a local repository`C:\Users\<user-name>\.m2\repository` that can be overridden.
*   These settings can be overridden in your IDE such as [IntelliJ](/Guides%20on%20How-to/IntelliJ.md)
*   You can also override settings in your `pom.xml` file or in your `.m2/settings.xml` file.

## External Resources
*   [Maven | IntelliJ IDEA Documentation](https://www.jetbrains.com/help/idea/maven.html)
*   [Working With Maven in IntelliJ IDEA](https://www.youtube.com/watch?v=pt3uB0sd5kY)

