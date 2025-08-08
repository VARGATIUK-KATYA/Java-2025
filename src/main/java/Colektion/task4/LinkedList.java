package Colektion.task4;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> linkedList=new java.util.LinkedList<>();
        linkedList.add("middle");

        linkedList.addFirst("start");
        linkedList.addLast("end");


        System.out.println(linkedList);

    }
}
