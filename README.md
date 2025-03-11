# Coding Dojo
Here's an opinionated view of what you'll need to get started as a Software Enginee.
1. Open Source and Platform Independence take the lead, since anything in this list can be used with:
    - Windows
    - macOS
    - Linux
2. This repo has been developed under Windows using the tools listed below.
3. The intention for later stages is to upgrade to newer LTS versions of Java SE as they become available and as the Coding Dojo advances.
    - The same is true for any other parts such as Maven.
    - Think of it as a living code base that matures.

Now, let's start your future-proof Software Engineering career
1. Java SE 17: Programming language for writing your programs.
    1. Download  https://www.oracle.com/nl/java/technologies/downloads/
        - Oracle has the following LTS versions of Java available: 8, 11, 17 and 21
    2. Install Java to a specific folder, for example: C:\Program Files\Java\jdk-17.0.1
    3. Set this folder as a system environment variable: JAVA_HOME
    4. Add %JAVA_HOME%\bin to your PATH system variable
    5. Make sure Java is set up properly: Use a terminal prompt or anything similar depending on your operating system.
       Windows has the PowerShell for example:
       java -version
    6. After setting up Java, you can continue programming from an IDE of your choice.
    7. Set up Java in IntelliJ: File --> Settings --> Build, Execution, Deployment --> Compiler --> Java Compiler
    - Check out Java on YouTube
    - https://www.youtube.com/@java

2. Git: Version Control to keep track of your changes. https://git-scm.com/
    -  After installing Git on your computer set up your name and e-mail (replace the placeholders with your own info)
    1. git config --global user.name “Your Name”
    2. git config --global user.email “your.name@your-email.com”
    3. You can use Git from an IDE of your choice from now on, since most modern IDEs have a built-in terminal.
    4. Git Tutorial for Beginners: Learn Git in 1 Hour https://www.youtube.com/watch?v=8JJ101D3knE&t=573s
    5. Git cheat sheet from GitHub https://education.github.com/git-cheat-sheet-education.pdf
    6. Merge Vs. Rebase https://www.youtube.com/shorts/nzv0sbfprJo

3. Maven: Build what you developed
    1. Download Maven from https://maven.apache.org/download.cgi
        - Try out artifacts, dependencies and archetypes
        - https://mvnrepository.com/
        - https://maven.apache.org/
        - https://central.sonatype.com/
    2. Extract the maven zip file to a directory of your choice such as
        - C:\dev\apache-maven-<version.number>
    3. Set MAVEN_HOME to the directory to which you extracted the Maven zip folder
       such as C:\dev\apache-maven-<version.number>
        - Add %MAVEN_HOME%\bin to system environment variables
        - Use one of the following commands to check whether Maven has been set properly.
          Use a terminal prompt or anything similar depending on your operating system. Windows has the PowerShell for example.
          Preferred:   mvn -v
          Alternative: mvn -version
    4. After setting up Maven, you can continue your repeatable builds from an IDE of your choice.
    5. Set up Maven in IntelliJ: File --> Settings --> Build, Execution, Deployment --> Build Tools --> Maven
       Use the Maven directory previously set up in the Maven home path: C:\dev\apache-maven-<version.number>
       Do not use the Bundled version, unless you have a good reason to do so.
    6. Frequently used Maven commands and their meaning:
        - mvn clean         Deletes the target directory and its generated sources
        - mvn clean verify
        - mvn compile       Compiles all source codes and recreates the deleted directories
        - mvn package       Runs compile first, also runs any unit tests and package that based on the declared packaging tag
        - mvn install       Similar to the package command, but copies it (e.g. the packaged jar, war or ear) to your local Maven repository.
            - This could be as follows under Windows   C:\Users\<UserName>\.m2\repository\
        - mvn deploy (beyond the scope of this session, but worth learning)

        - mvn clean install               Combines the clean and install Maven goals
        - mvn clean install -DskipTests   Combines the clean and install Maven goals, except the tests are skipped.

        - mvn clean test                  Executes the unit tests

        - N.B.Maven version 3.9.9 has been used within IntelliJ under Windows 11.
          At least Java SE 17 (already used in this project) will be necessary as of Maven 4.
        - Maven support from IntelliJ     https://www.jetbrains.com/help/idea/maven-support.html

4. IntelliJ: Bring it all together with Java and Kotlin's goto IDE
    - Download and Install
    - https://www.jetbrains.com/help/idea/getting-started.html
    - https://www.jetbrains.com/idea/download/
    - JetBrains YouTube Channel: https://www.youtube.com/@intellijidea
    1. The Community Edition is completely free to use.
    2. The Ultimate Edition for Professional Software Development - free to try out for 30 days.
    3. After installing either one of the versions, let's set up shop with some strongly recommended Plugins:
        - SonarQube https://plugins.jetbrains.com/plugin/7973-sonarqube-for-ide/
        - Cucumber  https://plugins.jetbrains.com/plugin/7212-cucumber-for-java/
        - Gherkin   https://plugins.jetbrains.com/plugin/9164-gherkin/
        - There's a lot more out there! Check out the Plugins section in the Settings of IntelliJ
    - N.B. Feel free to use any IDE to suit your personal preferences, such as:
        -  Eclipse: https://eclipseide.org/
        -  Visual Studio Code: https://code.visualstudio.com/

# Future Additions to the Coding Dojo
1. Java Frameworks to consider
    1. Jakarta EE    https://jakarta.ee/
    2. Springboot    https://spring.io/projects/spring-boot
    3. Quarkus       https://quarkus.io/
2. Test your work
    1. JUnit         https://junit.org/
    2. Cucumber      https://cucumber.io/
    - How to install https://cucumber.io/docs/installation/java
    3. TestNG        https://testng.org/
    4. Arquillian    https://arquillian.org/
    5. Playwright    https://playwright.dev/
3. Automation Server
    1. Jenkins       https://www.jenkins.io/
4. CI/CD
    1. GitHub        https://github.com
    2. GitLab        https://gitlab.com
    3. Bitbucket     https://bitbucket.org/
5. Containerize
    1. Docker        https://www.docker.com/
    2. Kubernetes    https://kubernetes.io/
    3. OpenShift     https://www.redhat.com/en/technologies/cloud-computing/openshift

6. Code Quality
    1. SonarQube     https://www.sonarsource.com/products/sonarqube/
    2. Sigrid        https://www.softwareimprovementgroup.com/sigrid-software-excellence-platform/
7. Artificial Intelligence that may be able to help even further
    1. AI Assistant definitely will (IntelliJ plugin)
    2. ChatGPT       https://chatgpt.com/
    3. Copilot       https://copilot.microsoft.com/
    4. Deepseek      https://www.deepseek.com/

# Recommended courses & literature to keep going
1. Pluralsight (requires a subscription)
    1. Extensive Library - Tailor to your specific needs from an extensive library.
       https://pluralsight.com/
    2. There's a Java SE 17 Track, including Maven.
       https://app.pluralsight.com/paths/skill/java-se-17
2. Udemy Courses (No recurring payment)
    1. Courses can be purchased individually. These two are definitely worth considering:
    2. Java 21, Java 17, Java 11, Java 8 (adv.) and Spring Boot 3 by Dr. Seán Kennedy
       https://www.udemy.com/course/ocp11_from_oca8
    3. Java Masterclass 2025: 130+ Hours of Expert Lessons
       by Tim Buchalka who keeps updating the course as new LTS version of Java are released
       https://www.udemy.com/course/java-the-complete-java-developer-course/
3. Agile Manifesto: available in multiple languages
   https://agilemanifesto.org/
4. Download the Scrum Guide https://scrumguides.org/index.html
   https://scrum.org for more information
5. Agile FM Podcast - Radio for the Agile Community
    - Agile is applied beyond IT: Listen to ideas, success stories and pitfalls.
    - https://www.agile.fm/agilefm
6. Books worth considering for future reference. I expect them to stand the test of time.
    1. Head First Java, 3rd edition, ISBN 9781491910771
       Based on Java 8 - 17. Great for software maintenance purposes by revisiting older versions of Java.
    2. Learn Java with Projects, ISBN 9781837637188
       Based on Java 21
    3. Head First Git, ISBN 9781492092513
    4. Refactoring, ISBN 9780134757599
    5. Software Improvement Group
        1. Building Maintainable Software - Java edition, ISBN 9781491953525 - Get your free copy here:
           https://www.softwareimprovementgroup.com/wp-content/uploads/Building_Maintainable_Software_SIG_Java.compressed.pdf
        2. Building Maintainable Software - C# edition
        3. Building Software Teams, ISBN 9781491951774
    6. Robert "Uncle Bob" Martin
        - Have a look at his websites
        - http://cleancoder.com/
        - http://butunclebob.com/
        1. Clean Code, ISBN 9780132350884
        2. The Clean Coder, ISBN 9780137081073
        3. We, Programmers, ISBN 9780135344262
        4. Functional Design, ISBN 9780138176396
        5. Clean Architecture, ISBN 9780134494166
    7. For the Brogrammers who want to take a practical Jack of all trades approach to their full stack Software Engineering career
        1.  Bro Code              https://www.youtube.com/@BroCodez
        2.  AmigosCode            https://www.youtube.com/@amigoscode
        3.  Fireship              https://www.youtube.com/@Fireship
        4.  Programming with Mosh https://www.youtube.com/@programmingwithmosh
        5.  Coding with John      https://www.youtube.com/@CodingWithJohn
        6.  freeCodeCamp.org      https://www.youtube.com/@freecodecamp
        7.  SimpliLearn           https://www.youtube.com/@SimplilearnOfficial
        8.  JavaScript King       https://www.youtube.com/@JavaScriptKing
        9.  SuperSimpleDev        https://www.youtube.com/@SuperSimpleDev
        10. Coder Coder           https://www.youtube.com/@TheCoderCoder
        11. Your Average Tech Bro https://www.youtube.com/@YourAverageTechBro