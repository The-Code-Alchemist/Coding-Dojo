# Coding-Dojo
Here's an opinionated view of what you'll need to get started. 
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

2. Git: Version Control to keep track of your changes. https://git-scm.com/
   -  After installing Git on your computer set up your name and e-mail (replace the placeholders with your own info)
   1. git config --global user.name “Your Name”
   2. git config --global user.email “your.name@your-email.com”
   3. You can use Git from an IDE of your choice from now on, since most modern IDEs have a built-in terminal.

3. Maven: Build what you developed
   1. Download Maven from https://maven.apache.org/download.cgi
   2. Extract the maven zip file to a directory of your choice such as 
      - C:\Program Files\apache-maven-<version.number>
   3. Set MAVEN_HOME to the directory to which you extracted the Maven zip folder 
      such as C:\apache-maven-<version.number>
      - Add %MAVEN_HOME%\bin to system environment variables
      - Use one of the following commands to check whether Maven has been set properly. 
      Use a terminal prompt or anything similar depending on your operating system. Windows has the PowerShell for example. 
      Preferred:   mvn -v
      Alternative: mvn -version
   4. After setting up Maven, you can continue your repeatable builds from an IDE of your choice.
   5. Set up Maven in IntelliJ: File --> Settings --> Build, Execution, Deployment --> Build Tools --> Maven
      Use the Maven directory previously set up in the Maven home path: C:\apache-maven-<version.number>
      Do not use the Bundled version, unless you have a good reason to do so.

   - N.B.Maven version 3.8.4 has been used within IntelliJ under Windows 11. 
   At least Java SE 17 (already used in this project) will be necessary as of Maven 4.
    
4. IntelliJ: Bring it all together with Java and Kotlin's goto IDE
   -  https://www.jetbrains.com/idea/download/
   1. The Community Edition is completely free to use.
   2. The Ultimate Edition for Professional Software Development - free to try out for 30 days.
   3. After installing either one of the versions, let's set up shop
   -  N.B. Feel free to use any IDE to suit your personal preferences, such as:
     -  Eclipse: https://eclipseide.org/
     -  Visual Studio Code: https://code.visualstudio.com/






Recommended courses & literature to keep going
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
5. Books worth considering for future reference. I expect them to stand the test of time.
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
      1. Clean Code, ISBN 9780132350884
      2. The Clean Coder, ISBN 9780137081073
      3. We, Programmers, ISBN 9780135344262
      4. Functional Design, ISBN 9780138176396 
      5. Clean Architecture, ISBN 9780134494166