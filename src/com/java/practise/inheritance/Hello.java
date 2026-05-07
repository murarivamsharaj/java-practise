package com.java.practise.inheritance;

public class Hello {
    String name;

    public Hello(String name) {
        this.name = name;
    }

    static void main() {
        Hello hello = new Hello("bunty");
        hello.displayName();
    }

    void displayName() {
        System.out.println("What is his name :" + this.name);
    }
}
