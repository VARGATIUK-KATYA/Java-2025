package oop.homwork.task1;

public class test1 {
    public static void main(String[] args) {
        Animal[] animals={ new Cow(),new Pig(),new Sheep()};

        for (Animal animal: animals){
            animal.makeSound();
        }
    }

}