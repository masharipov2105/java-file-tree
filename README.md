# Java File Tree


**Java File Tree** - A Java-based command-line tool that recreates the Unix/Windows `tree` command by recursively traversing a given directory and printing its file structure in a tree-like format, built with Java 17, Maven, and tested with JUnit.

---


## About the project

A command-line tool written in Java that recreates the behavior of the popular Unix/Windows `tree` command. Given a directory path as input, the program recursively traverses the file system and prints the folder structure in a visual, tree-like format directly to the terminal. This project was created as a personal exercise to strengthen my skills in Java, recursion, file I/O, and Maven-based project management, and it is intended for learning and experimentation purposes.

- Recursively traverses directories and all of their subdirectories.
- Displays the file system in a clear, tree-like visual structure.
- Uses Java's built-in File class for file system access.
- Works cross-platform on both Windows and Linux.

---


## Features

| Function | Description |
|----------|-------------|
| Print tree structure | Recursively traverses a given directory and prints its contents in a tree-like visual format. |
| Accept directory path | Takes a directory path as input from the user via the command line. |
| List subdirectories | Detects and displays all subdirectories inside the given path. |
| List files | Detects and displays all files inside the given path. |

---


## Project objective

The main objective of this project is to recreate the functionality of the popular Unix/Windows `tree` command using Java, while strengthening my practical skills in recursion, file I/O, and Maven-based project management.

- Practice and master recursion in Java by traversing nested directory structures.
- Gain hands-on experience with Java's File class and the file system API.
- Learn how to manage a Java project using Maven, including dependencies and build lifecycle.

---


## Technologies

| Technology | Version | Objective |
|------------|---------|-----------|
| Java  |  17  |  Core programming language used to build the tool. |
| Maven  |  3.9.6  |  Build automation and dependency management. |
| JUnit  |  5.10.1  |  Unit testing of core functionality. |

---


## Installation and Execution

### Windows
```cmd
 git clone https://github.com/masharipov2105/java-file-tree.git

 cd java-file-tree

 mvn clean package

 java -jar target/java-file-tree-1.0-SNAPSHOT.jar "C:\path\to\directory"

```
---


### Linux/Mac
```bash
 git clone https://github.com/masharipov2105/java-file-tree.git

 cd java-file-tree

 mvn clean package

 java -jar target/java-file-tree-1.0-SNAPSHOT.jar /path/to/directory

```
---


## Project view

![Home](https://raw.githubusercontent.com/masharipov2105/java-file-tree/refs/heads/main/screenshots/p1.png)

---


## Project Structure

```cmd
java-file-tree/
├── screenshots/
│   └── p1.png
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── masharipov2105/
│   │   │           └── systems/
│   │   │               ├── util/
│   │   │               │   └── TreeGenerator.java
│   │   │               └── Main.java
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── masharipov2105/
│       │           └── systems/
│       │               ├── util/
│       │               │   └── TreeGeneratorTest.java
│       │               └── MainTest.java
│       └── resources/
│           ├── example-tree/
│           │   ├── level1-a/
│           │   │   ├── level2-a/
│           │   │   │   ├── level3-a/
│           │   │   │   │   └── file6.txt
│           │   │   │   └── file5.txt
│           │   │   ├── level2-b/
│           │   │   │   └── file7.txt
│           │   │   ├── file3.txt
│           │   │   └── file4.md
│           │   ├── level1-b/
│           │   │   ├── level2-c/
│           │   │   │   ├── file10.txt
│           │   │   │   └── file9.txt
│           │   │   └── file8.txt
│           │   ├── file1.txt
│           │   └── file2.pdf
│           └── result.txt
├── target/
│   ├── classes/
│   │   └── com/
│   │       └── masharipov2105/
│   │           └── systems/
│   │               ├── util/
│   │               │   └── TreeGenerator.class
│   │               └── Main.class
│   ├── generated-sources/
│   │   └── annotations/
│   └── maven-status/
│       └── maven-compiler-plugin/
│           └── compile/
│               └── default-compile/
│                   ├── createdFiles.lst
│                   └── inputFiles.lst
├── pom.xml
└── README.md
```
---


## License

This project is open source and licensed under the MIT License, which allows anyone to freely use, modify, and distribute the code with proper attribution.

---


## Author

- Github : [masharipov2105](https://github.com/masharipov2105)

- Telegram : [masharipov2105](https://t.me/masharipov2105)

- Gmail : masharipov2105@gmail.com


