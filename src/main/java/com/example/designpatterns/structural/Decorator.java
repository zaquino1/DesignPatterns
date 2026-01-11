package com.example.designpatterns.structural;

/**
 * <h1>Decorator Pattern</h1>
 * <p>
 * Attaches additional responsibilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 * </p>
 *
 * <h2>Best Use Cases</h2>
 * <ul>
 *     <li><strong>Dynamic Behavior Extension:</strong> When you need to add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects.</li>
 *     <li><strong>Avoiding Class Explosion:</strong> When extension by subclassing is impractical. Sometimes a large number of independent extensions are possible and would produce an explosion of subclasses to support every combination.</li>
 *     <li><strong>UI Components:</strong> Adding borders, scrollbars, or other visual effects to UI components (e.g., Java Swing).</li>
 *     <li><strong>I/O Streams:</strong> Java's I/O library is a classic example (e.g., new BufferedReader(new FileReader("file.txt"))).</li>
 * </ul>
 *
 * <h2>Worst Use Cases</h2>
 * <ul>
 *     <li><strong>Identity Dependence:</strong> Decorators change the object identity. If your code relies on object identity (==), decorators can break it.</li>
 *     <li><strong>Complexity:</strong> A system with many small decorators can be hard to learn and debug. It can be difficult to understand the final behavior of an object that has been wrapped many times.</li>
 *     <li><strong>Initial Configuration:</strong> Constructing a heavily decorated object can be verbose and error-prone without a builder or factory.</li>
 * </ul>
 */
public class Decorator {

    // Component
    public interface Component {
        void operation();
    }

    // Concrete Component
    public static class ConcreteComponent implements Component {
        @Override
        public void operation() {
            System.out.println("ConcreteComponent operation");
        }
    }

    // Decorator
    public static abstract class DecoratorBase implements Component {
        protected Component component;

        public DecoratorBase(Component component) {
            this.component = component;
        }

        @Override
        public void operation() {
            component.operation();
        }
    }

    // Concrete Decorator
    public static class ConcreteDecoratorA extends DecoratorBase {
        public ConcreteDecoratorA(Component component) {
            super(component);
        }

        @Override
        public void operation() {
            super.operation();
            addedBehavior();
        }

        private void addedBehavior() {
            System.out.println("ConcreteDecoratorA added behavior");
        }
    }
}
