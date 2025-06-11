# Frequently used Maven commands and their meaning:
## `mvn clean` 
   Deletes the target directory and its generated sources
   
## `mvn clean verify`
Runs `mvn clean` first, and runs checks to verify integrity

## `mvn compile`
Compiles all source codes and recreates the deleted directories

## `mvn package`
Runs `mvn compile` first, also runs any unit tests and package that based on the declared packaging tag

## `mvn install`       
Similar to the `mvn package` command, but copies it to your local Maven repository 
which could be a packaged archive  .jar, .war or .ear
- This could be as follows under Windows `C:\Users\<UserName>\.m2\repository\`
## `mvn deploy`
Beyond the scope of this session, but worth learning --> will be revisited as the Coding Dojo gets refined

## `mvn clean install`               
Combines the `clean` and `install` Maven goals
## `mvn clean install -DskipTests`
Combines the `clean` and `install` Maven goals, except the tests are skipped.
## `mvn clean test`
Executes the unit tests


## Scopes in Maven

The scope determines the extent to which a

No explicit scope defaults to the compile scope

### JUnit 5 Example
Scope limited to the tests alone
```
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.11.4</version>
    <scope>test</scope>
</dependency>
```

## Excluding Maven Dependencies

coming soon


## References
[Working With Maven in IntelliJ IDEA](https://www.youtube.com/watch?v=pt3uB0sd5kY)
[The Apache Foundation](https://apache.org/) maintains the Maven project, which is a build automation tool primarily for Java projects. It can also be used to manage dependencies and project configurations.
[Apache Commons](https://commons.apache.org/)