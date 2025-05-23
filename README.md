# Coding Dojo
Here's an opinionated view of what you'll need to get started as a Software Engineer.
1. Open Source and Platform Independence take the lead, since anything in this list can be used with:
    - Windows
      - Suggestion: It's worthwhile to install Java, Maven, Git and IntelliJ into a centralized directory such as `C:\dev\` to access all your development tools more efficiently.
    - macOS
    - Linux
2. This repo has been developed under Windows using the tools listed below.
    - Clone this [Coding Dojo GitHub repository](https://github.com/The-Code-Alchemist/Coding-Dojo/) and see for yourself!
    `git clone https://github.com/The-Code-Alchemist/Coding-Dojo/`
3. The intention for later stages is to upgrade to newer LTS versions of Java SE as they become available and as the Coding Dojo advances.
    - The same is true for any other parts such as Maven, IntelliJ IDEA, etc.
    - Think of it as a living code base that matures and grows.
4. More aspects of DevOps Engineering is to be added to The Coding Dojo in addition to the basics of
   - [Java](Guides%20on%20How-to/Java%20References.md)
   - [Git](Guides%20on%20How-to/Git%20SCM.md)
   - [Maven](Guides%20on%20How-to/Maven.md)
   - [IntelliJ](Guides%20on%20How-to/IntelliJ.md)

Now, let's start your future-proof DevOps Engineering career
## 1 - Java Standard Edition (SE) - A programming language for writing your programs
1. Oracle has the multiple LTS versions of Java SE available: 8, 11, 17, 21, 25 (upcoming), and beyond. [Download a JDK of your choice here](https://www.oracle.com/nl/java/technologies/downloads/)     
   "free to use in production and free to redistribute, at no cost, under the [Oracle No-Fee Terms and Conditions](https://www.oracle.com/downloads/licenses/no-fee-license.html) 
2. Install Java to a specific folder, for example: 
   ### `C:\dev\Java\jdk-17.0.1`
3. Set this folder as a system environment variable: `JAVA_HOME`
4. Add `%JAVA_HOME%\bin` to your `PATH` system variable
5. Make sure Java is set up properly and execute these commands:
   ### `java -version`
   Shows the version of your Java Virtual Machine (JVM)
   ### `javac -version`
   Shows the version of your Java Development Kit (JDK)
6. [Java References](Guides%20on%20How-to/Java%20References.md)

## 2 - Git: Version Control to keep track of your changes
1. [Install Git](https://git-scm.com/) and use your command-line to verify which version you have installed
### `git -v` shows you the operating system and version number of Git
You can now use Git from the command-line
- Useful tip: Open a terminal in your IDE since most modern IDEs have a built-in terminal. 
- How to do it using [IntelliJ](Guides%20on%20How-to/IntelliJ.md)
2. Set up your name and e-mail by replacing the placeholders with your own information
### `git config --global user.name “Your Name”`
### `git config --global user.email “your.name@your-email.com”`
3. Clone the [Coding Dojo Git repository](https://github.com/The-Code-Alchemist/Coding-Dojo/) from GitHub to get started
### Click on the URL to see it on GitHub
### Or clone directly from the command-line `git clone https://github.com/The-Code-Alchemist/Coding-Dojo/`
4. [Git, GitHub and Gitlab references](Guides%20on%20How-to/Git%20SCM.md)

## 3 - Maven: Build what you developed and keep dependency versions up-to-date
1. [Download Maven](https://maven.apache.org/download.cgi)
    - Try out artifacts, dependencies and archetypes
    - https://mvnrepository.com/
    - https://maven.apache.org/
    - https://central.sonatype.com/
2. Extract the maven zip file to a directory of your choice such as
    - `C:\dev\apache-maven-<version.number>`
3. Set MAVEN_HOME to the directory to which you extracted the Maven zip folder
   such as `C:\dev\apache-maven-<version.number>`
    - Add `%MAVEN_HOME%\bin` to your `PATH` system variable
    - Use one of the following commands to check whether Maven has been set properly such as the correct version number. 
    - Use a terminal such as Windows has the PowerShell for example or something similar 
    - Make sure Maven is set up properly and execute one of these commands
      Preferred:   
      ### `mvn -v`
      Alternative: 
      ### `mvn -version`
4. After setting up Maven, you can continue your repeatable builds with or without an IDE
   How to do it using [IntelliJ](Guides%20on%20How-to/IntelliJ.md)

- N.B. Maven version 3.9.9 has been used within IntelliJ under Windows 11.
  At least Java SE 17 will be necessary as of Maven 4 (already part of this project).

## 4 - IntelliJ: Java and Kotlin's goto Integrated Development Environment (IDE)
### 4.1 - [Download and Install IntelliJ](https://www.jetbrains.com/idea/download/)
  - The Community Edition is completely free to use.
  - The Ultimate Edition for Professional Software Development - free to try out for 30 days with it additional features.
  - Suggestion to install IntelliJ into: `C:\dev\JetBrains\IntelliJ IDEA <version.number>\`
- [Get started](https://www.jetbrains.com/help/idea/getting-started.html)
- [Maven support](https://www.jetbrains.com/help/idea/maven-support.html)
- [JetBrains AI](https://www.jetbrains.com/ai/) Assistant - Supercharge your tools. Embrace new freedom.
- [IntelliJ on YouTube](https://www.youtube.com/@intellijidea)
- [JetBrains on YouTube](https://www.youtube.com/@JetBrainsTV)

### 4.2 - Bring it all together and set up shop with by configuring Java, Maven and Git
  - Set up Java in IntelliJ: `File` --> `Settings --> Build, Execution, Deployment` --> `Compiler` --> `Java Compiler`
      Use the Java directory previously set up in the Maven home path such as: `C:\dev\Java\jdk-<version.number>`
  - Set up Maven in IntelliJ: `File` --> `Settings` --> `Build, Execution, Deployment` --> `Build Tools` --> `Maven`
      Use the Maven directory previously set up in the Maven home path such as: `C:\dev\apache-maven-<version.number>`
      Do not use the Bundled version, unless you have a good reason to do so.
  - A shortcut for opening you current Project Structure to change any setting quickly --> `CTRL + ALT + SHIFT + S`
  - Learn IntelliJ's shortcuts. Access it from IntelliJ itself: `Help` --> `Keyboard Shortcuts PDF`
### 4.2 - Some strongly recommended Plugins
  - `File` --> `Settings` --> `Plugins`
      - [SonarQube](https://plugins.jetbrains.com/plugin/7973-sonarqube-for-ide/)
      - [Cucumber](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java/)
      - [Gherkin](https://plugins.jetbrains.com/plugin/9164-gherkin/)
      - [AI Assistant](https://plugins.jetbrains.com/plugin/22282-jetbrains-ai-assistant)
      - There's a lot more out there! Check out the Plugins section in the Settings of IntelliJ
### 4.3 Build Project vs. Rebuild Project
  - `Build` --> `Build Project` is an incremental build that only builds what has changed 
        - Skips over what has not changed
  - `Build` --> `Rebuild Project` removes everything and rebuilds everything completely
### Use any IDE to suit your personal preferences
  - The Coding Dojo's intention is to work out the sources using an IDE agnostic approach, however this Coding Dojo uses IntelliJ
  - After setting up Java, Maven and Git, continue programming from an IDE of your choice. 
    - The following IDEs are also suitable for developing Java code in addition to IntelliJ
    -  [Eclipse](https://eclipseide.org/)
    -  [Netbeans](https://netbeans.apache.org/front/main/index.html)
    -  [JDeveloper](https://www.oracle.com/nl/application-development/technologies/jdeveloper.html)
    -  [BlueJ](https://www.bluej.org/)
    -  [Visual Studio Code](https://code.visualstudio.com/)
  - I'd recommend knowing at least one more IDE in addition to IntelliJ

## 5 - Agile, Scrum and other frameworks to combine with
As a Software or DevOps engineer, your most likely setup will be in a Scrum Team, so have a look at the following sources
1. [The Agile Manifesto](https://agilemanifesto.org/) - available in multiple languages
   - We are uncovering better ways of developing software by doing it and helping others do it.
   Through this work we have come to value:
   1. Individuals and interactions over processes and tools
   2. Working software over comprehensive documentation
   3. Customer collaboration  over contract negotiation
   4. Responding to change over following a plan
   That is, while there is value in the items on the right, we value the items on the left more.
   [Principles Behind the Agile Manifesto](https://agilemanifesto.org/principles.html)  
   
2. [Click here](Guides%20on%20How-to/Agile%20Scrum%20and%20Kanban%20References.md) for additional references about 
   1. Agile
   2. Scrum
   3. Kanban
   4. Lean Six Sigma

## 6 - Recommended courses & literature to keep going
- Work in progress: here's [a preliminary overview](Guides%20on%20How-to/Books%20and%20Video%20Course%20Recommendations.md)

## 7 - Future Additions to the Coding Dojo
- [An overview](Guides%20on%20How-to/Future%20Work.md) of upcoming tools and techniques 