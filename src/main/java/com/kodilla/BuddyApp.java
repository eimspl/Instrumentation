package com.kodilla;

import java.util.stream.Stream;

public class BuddyApp {

    public static void main(String[] args) {

        String[] names = {"Anna", "Tomasz", "Andrzej", "Jacek", "Ewa", "Krzysztof", "Irena", "Magdalena", "Wojciech", "Teresa"};

        Stream.of(names).sorted()
                .map(User::new)
                .forEach(User::doSomething);
    }

}