package com.example.designpatterns.creational;

/**
 * <h1>Singleton Pattern</h1>
 * <p>
 * The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.
 * </p>
 *
 * <h2>Best Use Cases</h2>
 * <ul>
 *     <li><strong>Logging:</strong> A single logger instance is often sufficient and desirable to coordinate logging output.</li>
 *     <li><strong>Configuration Management:</strong> Application-wide configuration settings are best stored in a single location.</li>
 *     <li><strong>Caching:</strong> A centralized cache manager.</li>
 *     <li><strong>Thread Pools:</strong> Managing a pool of threads usually requires a single coordinator.</li>
 *     <li><strong>Hardware Interface Access:</strong> If you have a specific hardware resource (like a printer), you might want a single object managing access to avoid conflicts.</li>
 * </ul>
 *
 * <h2>Worst Use Cases</h2>
 * <ul>
 *     <li><strong>Global State Replacement:</strong> Using Singleton just to avoid passing parameters or to create global variables. This hides dependencies and makes code harder to test.</li>
 *     <li><strong>High Concurrency Bottlenecks:</strong> If the Singleton holds a mutable state that requires heavy synchronization, it can become a performance bottleneck.</li>
 *     <li><strong>Unit Testing:</strong> Singletons are notoriously difficult to mock in unit tests because they are often tightly coupled to the code that uses them.</li>
 * </ul>
 *
 * <h2>Modern Implementation (Effective Java)</h2>
 * <p>
 * The preferred way to implement a Singleton in modern Java is using an {@code enum}.
 * This approach provides serialization machinery for free, prevents multiple instantiations (even in the face of complex serialization or reflection attacks).
 * </p>
 */
public enum Singleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }
}
