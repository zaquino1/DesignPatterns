package com.example.designpatterns.behavioral;

/**
 * <h1>Strategy Pattern</h1>
 * <p>
 * Define a family of algorithms, encapsulate each one, and make them interchangeable.
 * Strategy lets the algorithm vary independently from clients that use it.
 * </p>
 *
 * <h2>Best Use Cases</h2>
 * <ul>
 *     <li><strong>Multiple Algorithms:</strong> When you have multiple ways to perform a specific task (e.g., sorting, compression, payment processing) and want to switch between them at runtime.</li>
 *     <li><strong>Avoiding Conditionals:</strong> Replacing complex conditional statements (if-else or switch) that select an algorithm with a polymorphic dispatch.</li>
 *     <li><strong>Testing:</strong> Easily swapping out complex logic with mock implementations for testing.</li>
 * </ul>
 *
 * <h2>Worst Use Cases</h2>
 * <ul>
 *     <li><strong>Simple Logic:</strong> If the algorithms are very simple and unlikely to change or expand, the overhead of creating interfaces and classes might be overkill.</li>
 *     <li><strong>Client Awareness:</strong> The client must be aware of the differences between strategies to select the appropriate one.</li>
 *     <li><strong>Communication Overhead:</strong> The strategy interface must be generic enough to support all strategies, which might lead to passing unused parameters to some strategies.</li>
 * </ul>
 */
public class Strategy {

    // Strategy Interface
    public interface StrategyInterface {
        int execute(int a, int b);
    }

    // Concrete Strategies
    public static class AddStrategy implements StrategyInterface {
        @Override
        public int execute(int a, int b) {
            return a + b;
        }
    }

    public static class SubtractStrategy implements StrategyInterface {
        @Override
        public int execute(int a, int b) {
            return a - b;
        }
    }

    public static class MultiplyStrategy implements StrategyInterface {
        @Override
        public int execute(int a, int b) {
            return a * b;
        }
    }

    // Context
    public static class Context {
        private StrategyInterface strategy;

        public Context(StrategyInterface strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(StrategyInterface strategy) {
            this.strategy = strategy;
        }

        public int executeStrategy(int a, int b) {
            return strategy.execute(a, b);
        }
    }
}
