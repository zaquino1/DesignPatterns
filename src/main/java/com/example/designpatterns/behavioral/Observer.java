package com.example.designpatterns.behavioral;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Observer Pattern</h1>
 * <p>
 * Define a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically.
 * </p>
 *
 * <h2>Best Use Cases</h2>
 * <ul>
 *     <li><strong>Event Handling:</strong> GUI frameworks where user actions (clicks, key presses) need to trigger responses in other parts of the application.</li>
 *     <li><strong>Model-View-Controller (MVC):</strong> The View observes the Model. When the Model changes, the View updates automatically.</li>
 *     <li><strong>Publish-Subscribe Systems:</strong> Messaging systems where publishers send messages to subscribers without knowing who they are.</li>
 *     <li><strong>State Monitoring:</strong> Monitoring a system's state and triggering alerts or actions when specific conditions are met.</li>
 * </ul>
 *
 * <h2>Worst Use Cases</h2>
 * <ul>
 *     <li><strong>Complex Dependency Graphs:</strong> If observers themselves trigger updates that notify other observers, it can lead to cascading updates or infinite loops that are hard to debug.</li>
 *     <li><strong>Memory Leaks:</strong> If observers are not properly deregistered (the "Lapsed Listener Problem"), they can prevent the subject from being garbage collected.</li>
 *     <li><strong>Performance:</strong> If there are many observers or if the update logic is expensive, notifying all observers can be slow.</li>
 * </ul>
 */
public class Observer {

    // Observer Interface
    public interface ObserverInterface {
        void update(String message);
    }

    // Subject Interface
    public interface Subject {
        void registerObserver(ObserverInterface o);
        void removeObserver(ObserverInterface o);
        void notifyObservers();
    }

    // Concrete Subject
    public static class ConcreteSubject implements Subject {
        private List<ObserverInterface> observers = new ArrayList<>();
        private String message;

        @Override
        public void registerObserver(ObserverInterface o) {
            observers.add(o);
        }

        @Override
        public void removeObserver(ObserverInterface o) {
            observers.remove(o);
        }

        @Override
        public void notifyObservers() {
            for (ObserverInterface observer : observers) {
                observer.update(message);
            }
        }

        public void setMessage(String message) {
            this.message = message;
            notifyObservers();
        }
    }

    // Concrete Observer
    public static class ConcreteObserver implements ObserverInterface {
        private String name;

        public ConcreteObserver(String name) {
            this.name = name;
        }

        @Override
        public void update(String message) {
            System.out.println(name + " received message: " + message);
        }
    }
}
