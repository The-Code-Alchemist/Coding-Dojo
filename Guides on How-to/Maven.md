# Maven Guide
## This guide provides an overview of Maven, a build automation tool primarily for Java projects, and its commonly used commands.
### Why use Maven?
- Maven is a powerful build automation tool that simplifies the process of managing dependencies, building projects, and running tests.
- Its builds are reproducible, meaning that the same project can be built consistently across different environments.
- It provides a standardized way to define project structures, dependencies, and build processes.
- Transitive dependencies are automatically resolved, meaning that if a project depends on another library, Maven will automatically download and include all of its dependencies as well.
- Maven uses a declarative approach, allowing developers to focus on the "what" rather than the "how" of building projects. → Convention over configuration
- It integrates well with popular IDEs like IntelliJ IDEA, making it easy to manage projects and dependencies, which is the focus of this Coding Dojo.
- Maven supports a wide range of plugins and extensions, allowing developers to customize the build process to suit their needs.
- It is widely used in the Java ecosystem, making it a valuable skill for developers working with Java projects.
- Open Source and has a large community of users and contributors, ensuring ongoing support and development.

### What is Maven?
- Maven is a build automation tool primarily used for Java projects.
- It is developed and maintained by the Apache Software Foundation.
- Maven uses a project object model (POM) to define the structure and dependencies of a project.
- It provides a standardized way to manage project dependencies, build processes, and project configurations.
- Maven uses a declarative approach, allowing developers to define the desired state of the project rather than specifying how to achieve it.

### What is a POM file?
1. The POM (Project Object Model) file is the core of a Maven project.
- It is an XML file named `pom.xml` that defines the project's structure, dependencies, build configuration, and other project-related information.
- The POM file is located in the root directory of the project.
2. It contains information such as the project's group ID, artifact ID, version, packaging type, and dependencies.
- The POM file also defines the build process, including plugins and goals to be executed during the build.
- It serves as a central configuration file for the project, allowing Maven to understand how to build and manage the project.
3. The POM file can also inherit from other POM files, allowing for a hierarchical structure of project configurations.
4. BOM (Bill of Materials) is a special type of POM file that defines a set of dependencies and their versions for a project.
- It is used to manage dependencies across multiple projects and ensure consistent versions of libraries.
- A BOM file can be imported into a project's POM file to automatically include the defined dependencies and their versions.

### How to create a Maven project in IntelliJ IDEA?
1. Open IntelliJ IDEA and select "New Project" from the welcome screen or from the "File" menu.
2. Select "Maven" from the list of project types.
3. Choose the appropriate JDK version for your project.
4. Enter the GroupId, ArtifactId, and Version for your project.
   - GroupId: A unique identifier for your project, typically in reverse domain name format (e.g., `com.example`).
   - ArtifactId: The name of your project (e.g., `my-app`).
   - Version: The version of your project (e.g., `1.0-SNAPSHOT`).
5. Select the desired packaging type (e.g., JAR, WAR, etc.).
6. Click "Next" and then "Finish" to create the project.
7. IntelliJ IDEA will generate the project structure and create a `pom.xml` file in the root directory of your project.
8. You can now start adding dependencies, plugins, and other configurations to the `pom.xml` file as needed.

### How to add dependencies in Maven?
1. Open the `pom.xml` file in your Maven project.
2. Locate the `<dependencies>` section in the POM file. If it does not exist, you can create it.
```xml
    <dependencies>
        <!-- Add your dependencies here -->
    </dependencies>
```
3. Add a dependency by specifying its `groupId`, `artifactId`, and `version`. For example, to add the Apache Commons Lang library:
```xml
    <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-lang3</artifactId>
        <version>3.12.0</version>
    </dependency>
```
- Repeat this step for each dependency you want to add.
- Instead of duplicating a version number for each dependency, you can define a `<properties>` section at the top of your `pom.xml` file to manage versions centrally:
- 
```xml
<properties>
    <junit.version>5.11.4</junit.version>
    <commons-lang3.version>3.12.0</commons-lang3.version>
</properties>
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>${junit.version}</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-lang3</artifactId>
        <version>${commons-lang3.version}</version>
    </dependency>
</dependencies>
```
4. Add the scope if needed
- The scope determines the extent to which a dependency is available in the project. Maven has several predefined scopes, each with its own purpose:
- For example, to add JUnit 5 as a test dependency, you can specify the scope as `test`:
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.11.4</version>
    <scope>test</scope>
</dependency>
```
- If no scope is specified, the default scope is `compile`, meaning the dependency will be available in the classpath at all times.
```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.12.0</version>
</dependency>
```
5. Save the `pom.xml` file. IntelliJ IDEA will automatically download the specified dependency and add it to your project.
- If you want to add an external dependency, you can search for it on the [Maven Central Repository](https://search.maven.org/) or other repositories.
- You can also use the Maven Dependency plugin to search for dependencies directly from IntelliJ IDEA.
- N.B. You are responsible for keeping these dependencies up to date and compatible with your project.
5. You can add multiple dependencies by repeating the `<dependency>` block within the `<dependencies>` section.

### More about dependencies
1. Q: What is a dependency in Maven? A: A dependency in Maven is a library or module that your project requires to compile, run, or test. Dependencies are defined in the `pom.xml` file and can be automatically downloaded from remote repositories.
- Some of these repositories are not public and require authentication to access.
2. Q: What is a transitive dependency? A: A transitive dependency is a dependency that is not directly declared in your project's `pom.xml` file but is required by one of your declared dependencies. Maven automatically resolves and includes these transitive dependencies in your project.

### Excluding Maven Dependencies
1. Q: How to exclude a transitive dependency in Maven? A: You can exclude a transitive dependency by adding an `<exclusions>` section within the `<dependency>` block in your `pom.xml` file. For example:
```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>my-library</artifactId>
    <version>1.0.0</version>
    <exclusions>
        <exclusion>
            <groupId>org.unwanted</groupId>
            <artifactId>unwanted-library</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```
2. Q: Why would I want to exclude a dependency? A: You might want to exclude a dependency if it causes conflicts, is not needed for your project, or if you want to use a different version of the library that is not compatible with the transitive dependency.
3. Q: How to find the dependencies of a Maven project? A: You can use the `mvn dependency:tree` command to view the dependency tree of your project, which shows all direct and transitive dependencies along with their versions. This can help you identify conflicts and understand the structure of your project's dependencies.

# Frequently used Maven commands and their meaning:
## `mvn clean` 
Deletes the `target` directory and its generated sources
- This command is used to clean the project by removing all files generated by the previous build.
- It deletes the `target` directory, which contains compiled classes, JAR files, and other build artifacts.
- It is typically the first step in the build process, as it ensures that the project is built from a clean state.
- It is useful when you want to start a new build without any leftover artifacts from previous builds.
   
## `mvn clean verify`
Runs `mvn clean` first, and runs checks to verify integrity.
- This is useful when you want to ensure that the build is clean and all tests pass before proceeding with further steps.
- It ensures that the project is built from a clean state, without any leftover artifacts from previous builds.
- It is often used in continuous integration (CI) pipelines to ensure that the codebase is in a good state before deploying or releasing.
- It can also be used to catch issues early in the development process, as it runs all tests and checks before proceeding with the build.
- It is a good practice to run this command before pushing changes to a shared repository or deploying to production.
- It is important to note that this command does not create any artifacts, it simply verifies the integrity of the project.
- The application is packaged into a JAR or WAR file, depending on the packaging type specified in the `pom.xml` file.

## `mvn compile`
Compiles all source codes and recreates the deleted directories.
- This command is used to compile the Java source code in the project.
- It processes the source files and generates the corresponding class files in the `target/classes` directory.
- It is typically the first step in the build process, as it prepares the code for further steps such as testing and packaging.
- It is important to run this command before running tests or packaging the project, as it ensures that the code is compiled and ready for execution.
- If there are any compilation errors, they will be reported, and the build will fail.
- This command does not run any tests or create any artifacts, it simply compiles the code.
- It is often used in combination with other Maven goals, such as `mvn test` or `mvn package`, to ensure that the code is compiled before running tests or packaging the project.

## `mvn package`
Runs `mvn compile` first, also runs any unit tests and `package` that based on the declared packaging tag
- This command is used to package the compiled code into a distributable format, such as a JAR, WAR, or EAR file.
- It is typically the last step in the build process, as it creates the final artifact that can be deployed or distributed.
- It runs the `mvn compile` command first to ensure that the code is compiled before packaging.

## `mvn install`       
Similar to the `mvn package` command, but copies it to your local Maven repository which could be a packaged archive .jar, .war, or .ear
- This could be as follows under Windows `C:\Users\<UserName>\.m2\repository\`
- The m2 directory is the default local repository for Maven, where it stores downloaded dependencies and built artifacts.q
- This command is used to install the packaged artifact into the local Maven repository, making it available for other projects on the same machine.
- It is typically used when you want to use the built artifact in another project without deploying it to a remote repository.
- It runs the `mvn package` command first to ensure that the artifact is built and ready for installation.
- It is often used in development workflows to test changes locally before deploying to a remote repository.
- It is important to note that this command does not deploy the artifact to a remote repository, it only installs it in the local repository.
- This command is useful when you want to test the artifact locally or share it with other developers on the same machine.
- It is also used in continuous integration (CI) pipelines to ensure that the artifact is built and installed before running tests or deploying to production.
- It is a good practice to run this command after making changes to the code or dependencies to ensure that the local repository is up to date.
- It is important to configure the local repository in the `settings.xml` file if you want to change the default location or use a different repository.
- Example configuration in `settings.xml`:
```xml
<settings>
    <localRepository>C:\another\folder\wherever\you\want\</localRepository>
</settings>
```
## `mvn deploy`
- Runs the `mvn install` command first to ensure that the artifact is built and installed in the local Maven repository.
- It then uploads the packaged artifact to the specified remote repository, making it available for other projects to use.
- This command is used to deploy the packaged artifact to a remote repository, such as a corporate or public Maven repository.
- It is typically used in continuous integration (CI) pipelines to automate the deployment process.
- It is important to configure the remote repository in the `pom.xml` file or in the Maven settings file (`settings.xml`) before running this command.
- Example configuration in `pom.xml`:
```xml
<distributionManagement>
    <repository>
        <id>my-repo</id>
        <url>https://my-repo.example.com/maven2</url>
    </repository>
    <snapshotRepository>
        <id>my-snapshot-repo</id>
        <url>https://my-repo.example.com/maven2-snapshots</url>
    </snapshotRepository>
</distributionManagement>
```

## `mvn clean install`               
Combines the `clean` and `install` Maven goals
## `mvn clean install -DskipTests`
Combines the `clean` and `install` Maven goals, except the tests are skipped.
## `mvn clean test`
- This command is used to run the unit tests in the project.
- It runs the tests defined in the `src/test/java` directory and reports the results.
- It is typically used to verify that the code is working as expected and to catch any issues early in the development process.
- It is often used in combination with other Maven goals, such as `mvn compile` or `mvn package`, to ensure that the code is compiled and ready for testing.
- If there are any test failures, they will be reported, and the build will fail.


Daisy-chaining these commands together is a common practice in Maven projects to ensure that the project is built, tested, and packaged correctly.
- For example, you can run `mvn clean install` to clean the project, compile the code, run tests, and package the project into a JAR or WAR file.
- This ensures that the project is in a good state before deploying or releasing it.
- It is important to note that Maven commands can be combined and customized based on the specific needs of the project.


## References
[Working With Maven in IntelliJ IDEA](https://www.youtube.com/watch?v=pt3uB0sd5kY)
[The Apache Foundation](https://apache.org/) maintains the Maven project, which is a build automation tool primarily for Java projects. It can also be used to manage dependencies and project configurations.
[Apache Commons](https://commons.apache.org/)