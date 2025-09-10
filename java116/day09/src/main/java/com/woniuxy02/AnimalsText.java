package com.woniuxy02;

public class AnimalsText {
    public static void main(String[] args) {

        Animals animal = new Animals("zs", 11, "woman");
        Cat cat = new Cat("zs", 11, "woman", "sas");
        cat.getName();
        Animals animals = new Animals();
        Dog dag = new Dog();
        System.out.println(animal.toString());
        cat.toString();
        dag.toString();

    }
}
