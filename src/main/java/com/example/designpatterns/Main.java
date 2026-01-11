package com.example.designpatterns;

import com.example.designpatterns.creational.Singleton;
import com.example.designpatterns.creational.FactoryMethod;
import com.example.designpatterns.structural.Adapter;
import com.example.designpatterns.structural.Decorator;
import com.example.designpatterns.behavioral.Observer;
import com.example.designpatterns.behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Patterns Demo");
        System.out.println("====================");

        // Creational Patterns
        System.out.println("\n--- Singleton ---");
        Singleton.INSTANCE.doSomething();

        System.out.println("\n--- Factory Method ---");
        FactoryMethod.Creator creatorA = new FactoryMethod.ConcreteCreatorA();
        creatorA.someOperation();

        // Structural Patterns
        System.out.println("\n--- Adapter ---");
        Adapter.Adaptee adaptee = new Adapter.Adaptee();
        Adapter.Target target = new Adapter.AdapterImpl(adaptee);
        target.request();

        System.out.println("\n--- Decorator ---");
        Decorator.Component component = new Decorator.ConcreteComponent();
        Decorator.Component decorated = new Decorator.ConcreteDecoratorA(component);
        decorated.operation();

        // Behavioral Patterns
        System.out.println("\n--- Observer ---");
        Observer.ConcreteSubject subject = new Observer.ConcreteSubject();
        Observer.ConcreteObserver observer1 = new Observer.ConcreteObserver("Observer 1");
        Observer.ConcreteObserver observer2 = new Observer.ConcreteObserver("Observer 2");
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.setMessage("Hello World!");

        System.out.println("\n--- Strategy ---");
        Strategy.Context context = new Strategy.Context(new Strategy.AddStrategy());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        context.setStrategy(new Strategy.MultiplyStrategy());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
