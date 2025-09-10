package com.woniuxy;

public class AnimalsText {
    public static void main(String[] args) {

        Animals animal = new Animals("zs", 11, "woman");
        Cat cat = new Cat("zs", 11, "woman", "sas");
        //cat.getName();
        Animals animals = new Animals();
        Dog dag = new Dog();
        //System.out.println(animal.toString());
        //cat.toString();
        //dag.toString();

        animal.eat();
        cat.eat();
        dag.eat();
        Animals animals2 = new Cat();
        animals2.eat();
        Animals animals3 = new Dog();
        animals3.eat();

        Animals animals4 = new Animals();
        Cat cat2 = new Cat();
        animals4.eat();
        // animals4 = cat;
        animals4.eat();
//        Animals animals5 = (Cat) animals4;
//        animals5.eat();


    }
}
