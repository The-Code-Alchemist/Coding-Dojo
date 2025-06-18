# JRE, JDK, and JVM
1. JDK (Java Development Kit) is a software development kit used to develop Java applications. It includes the JRE (Java Runtime Environment), which is necessary to run Java applications, as well as development tools such as the Java compiler (`javac`), debugger, and other utilities.
   - Typically, the JDK is used by developers to write, compile, and debug Java code. It is available for various platforms, including Windows, macOS, and Linux.
   - Oracle provides the official JDK, but there are also open-source alternatives like [OpenJDK](https://openjdk.org/).
   - Open source JDKs are available from various vendors, such as [AdoptOpenJDK](https://adoptopenjdk.net/releases.html), [Amazon Corretto](https://aws.amazon.com/corretto/), [Azul Zulu](https://www.azul.com/downloads), and others.
2. JRE (Java Runtime Environment) is a part of the JDK that provides the libraries, Java Virtual Machine (JVM), and other components necessary to run Java applications. 
   - It does not include development tools like the compiler.
3. JVM (Java Virtual Machine) is an abstract machine that enables a computer to run Java programs. It interprets compiled Java bytecode and executes it on the host machine in a platform-independent manner.
   - The JVM itself is platform-dependent, but the Java bytecode can run on any device that has a compatible JVM implementation.

# Compiling and Running Java Code
1. To compile a Java program, you can use the `javac` command followed by the name of the Java file. For example:
   ```bash
   javac MyProgram.java
   ```
   This will generate a `MyProgram.class` file containing the bytecode.
2. To run the compiled Java program, you can use the `java` command followed by the name of the class (without the `.class` extension):
   ```bash
   java MyProgram
   ```
# Comments in Java
- Java supports three types of comments that can be used to annotate code, explain logic, or provide documentation. 
- Comments are ignored by the compiler and do not affect the execution of the program.
1. Single-line comments start with `//` and continue to the end of the line.
   ```java
   // This is a single-line comment
   ```
   
   A single line comment can also be used at the end of a line of code to explain that specific line:
   ```java
    int x = 10; // This is an inline comment explaining the variable x
   ```
2. Multi-line comments start with `/*` and end with `*/`. They can span multiple lines.
   ```java
    /* This is a multi-line comment
        that spans multiple lines */
    ```
3. Documentation comments start with`/**` and are used to generate documentation using tools like Javadoc. They can also span multiple lines.
   ```java
   /**
    * This is a documentation comment.
    * It can be used to describe classes, methods, and fields.
    */
   ```
N.B. Sometimes code gets commented out using `//` or `/* ... */` to temporarily disable it during development or debugging. This is a common practice to test different code paths without deleting the original code.

# Packages in Java
- Packages in Java are used to group related classes and interfaces together, providing a way to organize code and avoid naming conflicts.
- A package is a namespace that organizes a set of related classes and interfaces.
- To create a package, you use the `package` keyword at the beginning of your Java source file. For example:
```java
    package com.example.myapp;
```
- This declares that the classes in this file belong to the `com.example.myapp` package.
- To use classes from a package, you can import them using the `import` statement. For example:
```java
    import com.example.myapp.MyClass;
```
- Uniqueness of package names is important to avoid conflicts, especially when using third-party libraries. It is common to use a reverse domain name as the package name, such as `com.example.myapp`, to ensure uniqueness.

    
# Java References
## External sources
1. [The Java SE API documentation can serve as a reference (multiple versions available)](https://www.oracle.com/java/technologies/java-se-api-doc.html)
2. [Oracle Java SE Support Roadmap](https://www.oracle.com/java/technologies/java-se-support-roadmap.html)
3. [Java Language and Virtual Machine Specifications](https://docs.oracle.com/javase/specs/) Currently Java SE 17
   - [The Java® Language Specification Java SE 17 Edition](https://docs.oracle.com/javase/specs/jls/se17/jls17.pdf)
   - [The Java® Virtual Machine Specification Java SE 17 Edition](https://docs.oracle.com/javase/specs/jvms/se17/jvms17.pdf)
4. [Java Platform, SE Documentation](https://docs.oracle.com/en/java/javase/)
5. [Java SE White Papers](https://www.oracle.com/java/technologies/javase/javase-whitepapers.html)
6. Check out Java on [YouTube](https://www.youtube.com/@java) where new releases and celebrations are shown live.
7. [Java Champion Program](https://dev.java/community/jcs/)
8. [Java Ranch](https://javaranch.com/)
9. [Java Code Geeks](https://www.javacodegeeks.com/)
10. [Core Java—Coding Your Passion](https://www.codejava.net/)
11. Java Specification Requests - [JSR](https://www.jcp.org/en/jsr/overview)
12. Java Community Process - [JCP](https://jcp.org/en/home/index)
13. [Java SE at a Glance](https://www.oracle.com/java/technologies/java-se-glance.html)

# Java Frameworks
1. [Jakarta EE](https://jakarta.ee/)
   - [Payara](https://www.youtube.com/@PayaraFish) 
   - [Mastering Java Message Service: A Jakarta EE Developer's Guide](https://www.youtube.com/watch?v=QypMHZHbBkI)
   - N.B. Java EE 8 was Oracle's last release of the Java EE platform, which was then transferred to the Eclipse Foundation and renamed to Jakarta EE.
   - Jakarta EE 10 is the first version with support for Java SE 17.
   - Jakarta EE 11 will be the first version with support for Java SE 21. Older versions than Java SE 17 are not supported.
   - MicroProfile is a subset of Jakarta EE, which is designed for microservices and cloud-native applications.
2. [Springboot](https://spring.io/projects/spring-boot)
3. [Quarkus](https://quarkus.io/)
4. [Vert.x](https://vertx.io/)
   - [Vert.x by Example](https://vertx.io/docs/vertx-examples/java/)
5. [Micronaut](https://micronaut.io/)