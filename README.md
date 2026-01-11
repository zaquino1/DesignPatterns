# Java Design Patterns Project

This project demonstrates common software design patterns implemented in Java, built with Maven.

## Project Structure

The project is organized into sub-packages based on the pattern category:

*   **Creational**: Patterns that deal with object creation mechanisms.
    *   `Singleton`: Ensures a class has only one instance.
    *   `Factory Method`: Defines an interface for creating an object but lets subclasses decide which class to instantiate.
*   **Structural**: Patterns that ease the design by identifying a simple way to realize relationships between entities.
    *   `Adapter`: Allows objects with incompatible interfaces to collaborate.
    *   `Decorator`: Attaches additional responsibilities to an object dynamically.
*   **Behavioral**: Patterns that identify common communication patterns between objects.
    *   `Observer`: Defines a subscription mechanism to notify multiple objects about any events that happen to the object they're observing.
    *   `Strategy`: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.

## References & Best Practices

The implementations and documentation (Best/Worst Use Cases) are based on principles from the most reliable industry-standard textbooks:

1.  **"Effective Java" by Joshua Bloch**: Considered the essential guide for modern Java development. It heavily influences the implementation details (e.g., using Enums for Singletons).
2.  **"Design Patterns: Elements of Reusable Object-Oriented Software" (The Gang of Four)**: The foundational text for design patterns.
3.  **"Head First Design Patterns"**: Known for its practical and digestible explanations of *why* and *when* to use patterns.

## How to Build and Run

1.  **Build**: `mvn clean package`
2.  **Run**: `java -cp target/design-patterns-1.0-SNAPSHOT.jar com.example.designpatterns.Main`
