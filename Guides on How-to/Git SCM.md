# Git SCM Summary and Shortcuts
## 1. Introduction: Git vs. GitHub
**Git** is a distributed version control system that tracks changes in source code during software development. It is the industry standard for version control.
— Git is the most widely used version control system today (industry standard)
- A version control is a system that tracks changes to files over a period of time.

**GitHub** is a cloud-based platform that hosts Git repositories and allows developers to collaborate.

> **Note:** Git and GitHub work together to make building, securing, and storing software much easier.

## 2. Core Concepts
*   **Working Directory**: The folder on your computer where you are currently working and editing files.
*   **Staging Area (Index)**: A draft space where you prepare changes before committing them. It holds the changes you want to include in the next snapshot.
    - Think of it as a draft space that allows you to review and adjust the changes before they become part of the project's history.
    - In other words, where the changes are not definitive yet.
*   **Remote Repository**: The version of your project hosted on the internet (e.g., GitHub, GitLab) enabling collaboration.
    - A remote repository is a version of your project hosted on the internet (such as GitHub) or a network.
    - Allows multiple people such as an entire Scrum Team to collaborate by:
    - Pushing changes to the shared resource
    - Pulling changes from the shared resource
*   **Clone**: A copy of a repository created on your local machine.
*   **Pull**: The process of fetching and integrating changes from a remote repository into your local repository.
*   **Local Repository**: Your project's history stored on your computer, including all commits and branches.
*   **Commit**: A snapshot of your project's history that records the specific changes made at that point in time.
*   **Branch**: A parallel version of your project to work on features or fixes independently.
*   **Pull Request (PR)**: A proposal to merge changes from one branch into another, allowing for code review.
    -  Often used in team collaborations
    [IntelliJ IDEA. GitHub Pull Requests](https://www.youtube.com/watch?v=MoXxF3aWW8k)
*   **Push**: The process of sending changes from your local repository to a remote repository.
*   **Merge**: The process of integrating changes from one branch into another.
    -  It combines the histories of both branches, which creates a single, unified history
*   **Rebase**: The process of moving or adjusting the commit history of a branch.
*   **Fork**: A copy of a repository created by someone else.
*   **Tag**: A lightweight, immutable reference to a specific commit.
*   **Release**: A snapshot of a project's history that is ready for release.
*   **Markdown**: A lightweight markup language with plain text formatting syntax.
    - README.md files provide information about a project such as its purpose, installation instructions, and usage examples.
    - They are commonly used to explain how to use a project, provide instructions for other users, or document a project's source code.

* Create a Markdown file using the `touch Example.md` command.


## 3. First-Time Setup
Before using Git, configure your identity:
- Name and email address are used to identify you in Git commits.
*   ```bash 
    git config --global user.name "Your Name"
    ```
*   ```bash
    git config --global user.email "your.name@your-email.com"
    ```
* Check your current configuration.  
* ```bash
    git config --list
    ```

## 4. Basic Workflow
### Starting a Project
*   **Initialize a new repository**:
    ```bash
    git init
    ```
    Starts tracking changes in the current folder.
*   **Clone an existing repository**:
    ```bash
    git clone <repository-url>
    ```
    Downloads a repository from a remote source (e.g., GitHub) to your local machine.
*   **Clone this repository**:
    ```bash 
    git clone https://github.com/The-Code-Alchemist/Coding-Dojo/
    ```

### Making Changes
1.  **Check Status**:
    ```bash
    git status
    ```
    Shows changes and whether they are staged or not.
2.  **Stage Changes**:
    ```bash
    git add .
    ```
    Adds all changes from the working directory to the staging area.
3.  **Commit Changes**:
    ```bash
    git commit -m "Descriptive message about changes"
    ```
    Saves the staged changes to the local repository history.
4.  **Push Changes**:
    ```bash
    git push
    ```
    Uploads your local commits to the remote repository.

## 5. Best Practices
**What NOT to commit:**
*   IDE settings (e.g., `.idea/`, `.vscode/`).
*   System-specific files.
*   **Sensitive information**: Passwords, API keys, personal data.

Use a `.gitignore` file to automatically exclude these items.

## 6. References & Resources
### Video Tutorials
*   [Git Basics](https://www.youtube.com/watch?v=SWYqp7iY_Tc)
*   [Git and GitHub](https://www.youtube.com/watch?v=SWYqp7iY_Tc)
*   [A brief introduction to Git for beginners | Kedasha Kerr](https://www.youtube.com/watch?v=r8jQ9hVA2qs)
*   [Git Tutorial for Beginners: Learn Git in 1 Hour](https://www.youtube.com/watch?v=8JJ101D3knE&t=573s)
*   [IntelliJ IDEA: GitHub Pull Requests](https://www.youtube.com/watch?v=MoXxF3aWW8k)
*   [Unleash the Power of Git with IntelliJ IDEA](https://www.youtube.com/live/TNZgwJaVu4E)
*   [Merge Vs. Rebase](https://www.youtube.com/shorts/nzv0sbfprJo)

### Cheat Sheets
*   [GitHub Git Cheat Sheet](https://education.github.com/git-cheat-sheet-education.pdf)
*   [GitLab Git Cheat Sheet](http://about.gitlab.com/images/press/git-cheat-sheet.pdf)
*   [Atlassian Git Cheat Sheet](https://www.atlassian.com/git/tutorials/atlassian-git-cheatsheet)
*   [Free Code Camp's Git Cheat Sheet](https://www.freecodecamp.org/news/git-cheat-sheet/)

### Tools & Documentation
*   [What is Git? Our beginner’s guide to version control](https://github.blog/developer-skills/programming-languages-and-frameworks/what-is-git-our-beginners-guide-to-version-control/)  
*   [Git GUI Clients](https://git-scm.com/downloads/guis)
*   [Official Git Documentation](https://docs.github.com/en/get-started/using-git/about-git)
*   [Java Code Geeks: Git](https://examples.javacodegeeks.com/category/software-development/git/)