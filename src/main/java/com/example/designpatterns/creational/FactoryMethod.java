package com.example.designpatterns.creational;

/**
 * <h1>Factory Method Pattern</h1>
 * <p>
 * Defines an interface for creating an object, but lets subclasses decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.
 * </p>
 *
 * <h2>Best Use Cases</h2>
 * <ul>
 *     <li><strong>Frameworks:</strong> When a framework needs to standardize the architectural model for a range of applications, but allows for individual applications to define their own domain objects.</li>
 *     <li><strong>Decoupling:</strong> When a class can't anticipate the class of objects it must create.</li>
 *     <li><strong>Extensibility:</strong> When you want to provide a library of products that users can extend.</li>
 * </ul>
 *
 * <h2>Worst Use Cases</h2>
 * <ul>
 *     <li><strong>Simple Object Creation:</strong> If the object creation logic is simple and unlikely to change, using a factory method adds unnecessary complexity.</li>
 *     <li><strong>Switching Implementations at Runtime:</strong> While possible, other patterns like Strategy or Abstract Factory might be better suited if the primary goal is runtime switching rather than subclass-driven creation.</li>
 * </ul>
 */
public class FactoryMethod {

    // Product Interface
    public interface Product {
        void use();
    }

    // Concrete Products
    public static class ConcreteProductA implements Product {
        @Override
        public void use() {
            System.out.println("Using Product A");
        }
    }

    public static class ConcreteProductB implements Product {
        @Override
        public void use() {
            System.out.println("Using Product B");
        }
    }

    // Creator
    public static abstract class Creator {
        public abstract Product factoryMethod();

        public void someOperation() {
            Product product = factoryMethod();
            product.use();
        }
    }

    // Concrete Creators
    public static class ConcreteCreatorA extends Creator {
        @Override
        public Product factoryMethod() {
            return new ConcreteProductA();
        }
    }

    public static class ConcreteCreatorB extends Creator {
        @Override
        public Product factoryMethod() {
            return new ConcreteProductB();
        }
    }
}
