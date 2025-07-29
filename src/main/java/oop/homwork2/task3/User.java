package oop.homwork2.task3;

public class User {
    String name;

    public void setName(String name){
        this.name=name;
    }
    public User getThis(){
        return this;
    }
    public void display(){
        System.out.println("Name:" + name);
    }
}
