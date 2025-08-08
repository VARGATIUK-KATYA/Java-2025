package Colektion.task5;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> linkedList=new java.util.LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");

     String first=linkedList.getFirst();
     String last=linkedList.getLast();

     String second=linkedList.get(1);

        System.out.println("Перший: "+ first);
        System.out.println(" Останій: "+ last);
        System.out.println(" За індеком 1: "+ second);
    }
}
