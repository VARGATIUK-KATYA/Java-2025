package oop.homwork2.task5;

public class Student1 extends Person {
    String group;
    public Student1(String name, String group) {
        super(name);
        this.group=group;
    }

    public void showInfo(){
        System.out.println(" Name : "+ name);
        System.out.println(" Group: "+ group);
    }
}
