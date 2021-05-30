package com.kodilla;

public class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void doSomething() {
        System.out.println("User's name is " + getName());
    }
}
