package com.java.practise;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("some sound");
        Animal[] animals = {new Cat("snoopy "), new Dog("pitbull ")};

        for (Animal a : animals) {
            a.sound();
        }
    }

    abstract void sound();

}