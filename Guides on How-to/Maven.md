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