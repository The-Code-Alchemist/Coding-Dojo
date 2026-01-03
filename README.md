# Coding Dojo 🥋

**Welcome to your training ground**

- This repository is an opinionated, practical, learner-centric guide designed to launch your career as a Software Engineer.
- It focuses on **Open Source** and **Platform Independence** (Windows, macOS, Linux).
- In addition, it takes a framework-agnostic approach to learn DevOps Engineering.
- Everything here allows you to learn at your own pace.

**The Coding Dojo is a living code base** and a reference implementation of professional software engineering fundamentals.
- The Coding Dojo matures and grows over time as you learn more about Java, Maven, and IntelliJ IDEA.
- Expect updates to these tools as they become available.
- Get comfortable with sizable code bases, since you will be working with them regularly professionally.
- See it all in action to consolidate your knowledge and skills in a real-world setting.


> *The only way to decide the worth of any tutorial is to decide how well it teaches.*


**Now, let's start your future-proof DevOps Engineering career**
---

## 🚀 Quick Start
Don't wait. Get the code on your local machine right now.

*   **1. Open your terminal.**
*   **2. Clone this repository:**
    ```bash
    git clone https://github.com/The-Code-Alchemist/Coding-Dojo/
    ```

*New to Git? See the [Git Guide](Guides%20on%20How-to/Git%20SCM.md).*

---

## 🎯 Industry Baseline for Professional Software Engineering

The Coding Dojo is not a bootcamp, certification program, or framework tutorial.

It is an **opinionated, industry-aligned baseline** for people who want to work
as professional software engineers in real-world environments.

Modern software development often focuses on *what* to use:
frameworks, libraries, platforms.

The Coding Dojo focuses on *why* and *how*:
- why software is structured the way it is
- how professional teams build, version, package, and run software
- how tooling, discipline, and fundamentals scale across projects and companies

This repository deliberately avoids hype-driven technologies and instead builds
on **proven, long-lived industry standards**.

If you understand these fundamentals, you can:
- move between frameworks with confidence
- collaborate effectively in professional teams
- reason about software beyond tutorials and examples

---

### What this Dojo **is**

- A foundational training ground for professional software engineering
- Framework-agnostic and vendor-neutral by design
- Built around reproducibility, clarity, and long-term maintainability
- A **living code base** that grows with your skills

### What this Dojo **is not**

- Not a shortcut to becoming a developer
- Not a collection of isolated tutorials
- Not focused on certificates or exams
- Not optimized for speed but for understanding

Every concept must be demonstrated in code.
Every decision should be explainable.

---

### Outcome

By working through this Dojo, you build:

- A real GitHub history (not copy-paste exercises)
- A reproducible Java project using professional tooling
- Practical understanding of how software moves from code to runtime
- A portfolio that can be evaluated by engineers, not marketers

This is the baseline expected from professional software engineers.


---

## 🛠️ The Toolkit (Prerequisites)
To work in this Dojo, you need four essential tools. Install them in this order:

### 1. Java SE (The Language)
You need the Java Development Kit (JDK) to write programs.
*   **Download:** [Oracle JDK Downloads](https://www.oracle.com/nl/java/technologies/downloads/) (Recommended: JDK 17, 21, or 25 LTS).
*   **Verify:** Open your terminal and run `java -version` and `javac -version`.
*   **Alternatives:** [OpenJDK](https://openjdk.java.net/), [Azul Zulu](https://www.azul.com/downloads/zulu-community/).
*   **[Java References](Guides%20on%20How-to/Java%20References.md)**

### 2. Maven (The Builder)
Maven builds your project and manages libraries (dependencies).
*   **Download:** [Apache Maven](https://maven.apache.org/download.cgi).
*   **Verify:** Open your terminal and run `mvn -v`. `mvn -version` or `mvn --version`
*   **Alternatives:** [Gradle](https://gradle.org/), [Ant](https://ant.apache.org/), [SBT](https://www.scala-sbt.org/), [Bazel](https://bazel.build/).
*   **[Maven Guide](Guides%20on%20How-to/Maven.md)**

### 3. Git (The Time Machine)
Git tracks changes to your code.
*   **Download:** [Git SCM](https://git-scm.com/).
*   **Verify:** Open your terminal and run `git -v`.
*   **Useful tip:** Open a terminal in your IDE since most modern IDEs have a built-in terminal.
*   **Alternatives:** [GitHub Desktop](https://desktop.github.com/), [SourceTree](https://www.sourcetreeapp.com/), [GitKraken](https://www.gitkraken.com/).
* **[Git SCM Summary](Guides%20on%20How-to/Git%20SCM.md)**

### 4. Docker (The Container)
Docker containers package your application and all its dependencies into a standardized unit for software deployment.
*   **Download:** [Docker Desktop](https://www.docker.com/products/docker-desktop).
*   **Verify:** Open your terminal and run `docker --version`.
*   **Alternatives:** [Podman](https://podman.io/), [LXC](https://linuxcontainers.org/), [LXC-Web-Panel](https://github.com/lxc/lxc-webpanel).
*   **[Docker](Guides%20on%20How-to/Docker.md)**

### 5. IntelliJ IDEA (The Workshop)
This is the Integrated Development Environment (IDE) where you will write code.
*   **Download:** [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) (Community Edition is free).
*   **Alternatives:** [VS Code](https://code.visualstudio.com/), [Eclipse](https://eclipseide.org/).
*   **[IntelliJ IDEA](Guides%20on%20How-to/IntelliJ.md)**
*The Community Edition is completely free to use.*
*The Ultimate Edition for Professional Software Development — free to try out for 30 days with its additional features.*

---

## ⚙️ Setup & Best Practices
*This repo works on any OS, but here is a "Pro Tip" setup for Windows users to keep things organized.*

**Recommended Folder Structure:**
Instead of installing tools in random "Program Files" folders, create a centralized `dev` folder:
*   `C:\dev\Java\jdk-<version.number>`
*   `C:\dev\apache-maven-<version.number>\`
*   `C:\dev\git\`
*   `C:\dev\JetBrains\IntelliJ IDEA <version.number>`
*   `C:\dev\Docker\Docker Desktop`

**Environment Variables:**
1.  **JAVA_HOME:** Point to your JDK folder (e.g., `C:\dev\Java\jdk-<version.number>`).
2.  **MAVEN_HOME:** Point to your Maven folder (e.g., `C:\dev\apache-maven-<version.number>`).
3.  **PATH:** Add `%JAVA_HOME%\bin` and `%MAVEN_HOME%\bin` to your System `PATH`.

**Configure IntelliJ:**
1.  Open IntelliJ.
2.  Go to **File > Settings > Build, Execution, Deployment > Build Tools > Maven**.
3.  Point "Maven home path" to your installed `C:\dev\apache-maven...` folder (Try to avoid using the "Bundled" version).

---

## 📚 Reference Guides
This repo contains detailed guides on the technologies you will use. Click the links below to dive deeper:

*   **[Java References](Guides%20on%20How-to/Java%20References.md)** - Deep dive into JDK versions (8, 11, 17, 21, 25).
*   **[Maven Guide](Guides%20on%20How-to/Maven.md)** - How to build, package, and manage dependencies.
*   **[Git SCM](Guides%20on%20How-to/Git%20SCM.md)** - Version control basics.
*   **[Docker](Guides%20on%20How-to/Docker.md)** - Containerize your applications.
*   **[IntelliJ IDEA](Guides%20on%20How-to/IntelliJ.md)** - Shortcuts and setup tips.

---

## 🧠 The Software Engineering Mindset
Coding is only part of the job. How you work matters.

**Agile & Scrum**
- Most modern teams work in "Sprints" using [Agile](https://agilemanifesto.org/) and [Scrum](https://scrum.org).
- [Agile/Scrum References](Guides%20on%20How-to/Agile,%20Scrum,%20Kanban%20and%20Lean%20Six%20Sigma%20References.md)
- [The Agile Manifesto](https://agilemanifesto.org/)
  - We are uncovering better ways of developing software by doing it and helping others do it.
      Through this work we have come to value:
    - Individuals and interactions over processes and tools.
    - Working software over comprehensive documentation.
    - Customer collaboration over contract negotiation.
    - Responding to change over following a plan.
    - That is, while there is value in the items on the right, we value the items on the left more.
- In addition to Agile and Scrum, Kanban and Lean Six Sigma can also be combined

**Recommended Learning**
*   [Books and Video Courses](Guides%20on%20How-to/Books%20and%20Video%20Course%20Recommendations.md)

** Preliminary Overview of Future Additions to the Coding Dojo**
*   [List of upcoming tools and techniques](Guides%20on%20How-to/Future%20Work.md)
---
