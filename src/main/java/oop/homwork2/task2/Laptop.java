package oop.homwork2.task2;

public class Laptop {
    String brand;
    double  price;


    public Laptop (String brand, double price){
        this.brand=brand;
        this.price=price;
    }
    public void showInfo(){
        System.out.println("Price" + brand);
        System.out.println("Price: $"+ price);
    }
}
