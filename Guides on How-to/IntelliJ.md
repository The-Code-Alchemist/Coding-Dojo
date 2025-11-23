# IntelliJ: Java and Kotlin's goto Integrated Development Environment (IDE)
## 1.1-[Download and Install IntelliJ](https://www.jetbrains.com/idea/download/)

- Suggestion to install IntelliJ into: `C:\dev\JetBrains\IntelliJ IDEA <version.number>\`
- [Get started](https://www.jetbrains.com/help/idea/getting-started.html)
- [Maven support](https://www.jetbrains.com/help/idea/maven-support.html)
- [JetBrains AI](https://www.jetbrains.com/ai/) Assistant - Supercharge your tools. Embrace new freedom.
- [IntelliJ on YouTube](https://www.youtube.com/@intellijidea)
- [JetBrains on YouTube](https://www.youtube.com/@JetBrainsTV)

## 1.2-Bring it all together and set up shop with by configuring Java, Maven, and Git
- Set up Java in IntelliJ: `File` --> `Settings --> Build, Execution, Deployment` --> `Compiler` --> `Java Compiler`
  Use the Java directory previously set up in the Maven home path such as: `C:\dev\Java\jdk-<version.number>`
- Set up Maven in IntelliJ: `File` --> `Settings` --> `Build, Execution, Deployment` --> `Build Tools` --> `Maven`
  Use the Maven directory previously set up in the Maven home path such as: `C:\dev\apache-maven-<version.number>`
  Do not use the Bundled version, unless you have a good reason to do so.
- A shortcut for opening you current Project Structure to change any setting quickly --> `CTRL + ALT + SHIFT + S`
- Learn IntelliJ's shortcuts. Access it from IntelliJ itself: `Help` --> `Keyboard Shortcuts PDF`
## 1.3-Some strongly recommended Plugins
- `File` --> `Settings` --> `Plugins`
    - [SonarQube](https://plugins.jetbrains.com/plugin/7973-sonarqube-for-ide/)
    - [Cucumber](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java/)
    - [Gherkin](https://plugins.jetbrains.com/plugin/9164-gherkin/)
    - [AI Assistant](https://plugins.jetbrains.com/plugin/22282-jetbrains-ai-assistant)
    - There's a lot more out there! Check out the Plugins section in the Settings of IntelliJ
## 1.4-Build Project vs. Rebuild Project
- `Build` --> `Build Project` is an incremental build that only builds what has changed—Skips over what has not changed
- `Build` --> `Rebuild Project` removes everything and rebuilds everything completely
## Use any IDE to suit your personal preferences
- The Coding Dojo's intention is to work out the sources using an IDE agnostic approach. However, this Coding Dojo uses IntelliJ
- After setting up Java, Maven, and Git, continue programming from an IDE of your choice.
    - The following IDEs are also suitable for developing Java code in addition to IntelliJ
    -  [Eclipse](https://eclipseide.org/)
    -  [Netbeans](https://netbeans.apache.org/front/main/index.html)
    -  [JDeveloper](https://www.oracle.com/nl/application-development/technologies/jdeveloper.html)
    -  [BlueJ](https://www.bluej.org/)
    -  [Visual Studio Code](https://code.visualstudio.com/)
- I'd recommend knowing at least one more IDE in addition to IntelliJ


# IntelliJ Summary and Shortcuts
1. Right-click on the root directory of your project folder and press `F4` to open the project settings.
   - Alternatively, you can press `Ctrl + Alt + S` to open Intellij's general settings.
   - This will open the project settings window where you can configure various aspects of your project, such as the JDK version, libraries, and modules.
   - You can also access the project settings by selecting `File` from the top menu, then `Project Structure`.
   - This is an easy way to make sure you have the correct JDK version selected for your project.
2. Some of the things you can do in the project settings:
   - You can also change the JDK version here if needed, e.g., when upgrading to a newer version of Java.
   - You can also add or remove libraries and modules from your project.
   - You can also configure the project structure, such as source and resource directories, test directories, and output directories.
   - You can also set up version control integration, such as Git or SVN, to manage your project's source code.
   - You can also configure the build tools, such as Maven or Gradle, to manage your project's dependencies and build process.
   - You can also set up code style and formatting preferences, such as indentation, line length, and naming conventions.
   - You can also configure the inspection and code analysis settings to help you identify and fix potential issues in your code.
3. Select `View` from the top menu, then `Tool Windows`, and then `Terminal` to open the terminal window.
   - Alternatively, you can press `Alt + F12` to open the terminal window.
   - Press `Ctrl + Alt + T` to open another terminal if your current terminal is already in use.
   - You can also use the terminal to run Maven commands such as `mvn clean install` or `mvn package`.
4. Select `Run`, then `Edit Configurations` to open the run configurations window.
   - This is where you can configure how your application will be run, including the main class, program arguments, and VM options.
   - You can also create multiple run configurations for different scenarios, such as running tests or debugging.

# More on IntelliJ:
1. [IntelliJ on YouTube](https://www.youtube.com/@intellijidea)
   - [Let's Get Lazy, by Venkat Subramaniam / JetBrains Technology Day for Java](https://www.youtube.com/watch?v=PICHx2at46s)