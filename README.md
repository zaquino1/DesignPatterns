# Java Design Patterns

![Java](https://img.shields.io/badge/Java-17-orange)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![License](https://img.shields.io/badge/License-MIT-green)

A comprehensive collection of modern Java Design Patterns, implemented with best practices from industry-standard texts like *Effective Java* and *Design Patterns (GoF)*.

This repository serves as a reference for software engineers to understand **when** and **how** to apply specific patterns, highlighting both **best use cases** and **worst use cases** (anti-patterns).

## 📂 Project Structure

The project is organized by pattern category:

### 🏗 Creational Patterns
*Mechanisms for object creation that increase flexibility and reuse.*

*   **[Singleton](src/main/java/com/example/designpatterns/creational/Singleton.java)**: Ensures a class has only one instance (implemented via `enum` for thread safety).
*   **[Factory Method](src/main/java/com/example/designpatterns/creational/FactoryMethod.java)**: Delegates instantiation logic to subclasses.

### 🧱 Structural Patterns
*How to assemble objects and classes into larger structures.*

*   **[Adapter](src/main/java/com/example/designpatterns/structural/Adapter.java)**: Bridges incompatible interfaces.
*   **[Decorator](src/main/java/com/example/designpatterns/structural/Decorator.java)**: Dynamically adds responsibilities to objects (e.g., Java I/O wrappers).

### 📡 Behavioral Patterns
*Communication and assignment of responsibilities between objects.*

*   **[Observer](src/main/java/com/example/designpatterns/behavioral/Observer.java)**: Subscription mechanism for event handling.
*   **[Strategy](src/main/java/com/example/designpatterns/behavioral/Strategy.java)**: Interchangeable algorithms (avoids complex `if-else` chains).

---

## 📚 References & Philosophy

The implementations follow modern industry standards (as of 2026), drawing strictly from:

1.  **"Effective Java" by Joshua Bloch**
    *   *Key Influence*: Use of Enums for Singletons, favoring composition over inheritance.
2.  **"Design Patterns: Elements of Reusable Object-Oriented Software" (Gang of Four)**
    *   *Key Influence*: Foundational definitions and structural relationships.
3.  **"Head First Design Patterns"**
    *   *Key Influence*: Practical, real-world analogies.

## 🚀 Getting Started

### Prerequisites
*   Java JDK 17 or higher
*   Maven 3.6+ (or use your IDE's bundled Maven)

### Installation & Run

1.  **Clone the repository**
    ```bash
    git clone https://github.com/YOUR_USERNAME/design-patterns.git
    cd design-patterns
    ```

2.  **Build the project**
    ```bash
    mvn clean package
    ```

3.  **Run the demo**
    ```bash
    java -cp target/design-patterns-1.0-SNAPSHOT.jar com.example.designpatterns.Main
    ```

### Using IntelliJ IDEA
1.  Open IntelliJ IDEA.
2.  Select **File > Open** and choose the project folder.
3.  Right-click `pom.xml` and select **"Add as Maven Project"**.
4.  Run `Main.java` directly from the editor.

## 🤝 Contributing

Contributions are welcome! Please ensure any new patterns include:
1.  A clean, modern Java implementation.
2.  Javadoc explaining **Best Use Cases** and **Worst Use Cases**.

## 📄 License

This project is licensed under the MIT License.
