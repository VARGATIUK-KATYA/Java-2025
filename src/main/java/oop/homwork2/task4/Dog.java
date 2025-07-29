package oop.homwork2.task4;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        super.makeSound(); // виклик методу з батьківського класу
        System.out.println("Гав гав");
    }

}
