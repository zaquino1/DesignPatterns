package com.example.designpatterns.structural;

/**
 * <h1>Adapter Pattern</h1>
 * <p>
 * Converts the interface of a class into another interface the clients expect.
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 * </p>
 *
 * <h2>Best Use Cases</h2>
 * <ul>
 *     <li><strong>Legacy Code Integration:</strong> Integrating new code with legacy systems that have incompatible interfaces.</li>
 *     <li><strong>Third-Party Libraries:</strong> Wrapping a third-party library to match your application's interface requirements.</li>
 *     <li><strong>Interface Standardization:</strong> When you want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces.</li>
 * </ul>
 *
 * <h2>Worst Use Cases</h2>
 * <ul>
 *     <li><strong>Designing New Systems:</strong> If you are designing a new system from scratch, you should design the interfaces to be compatible from the start, rather than relying on adapters.</li>
 *     <li><strong>Excessive Layering:</strong> Overusing adapters can lead to a system with too many layers of indirection, making it hard to understand and debug.</li>
 * </ul>
 */
public class Adapter {

    // Target Interface
    public interface Target {
        void request();
    }

    // Adaptee
    public static class Adaptee {
        public void specificRequest() {
            System.out.println("Called specificRequest()");
        }
    }

    // Adapter
    public static class AdapterImpl implements Target {
        private Adaptee adaptee;

        public AdapterImpl(Adaptee adaptee) {
            this.adaptee = adaptee;
        }

        @Override
        public void request() {
            adaptee.specificRequest();
        }
    }
}
