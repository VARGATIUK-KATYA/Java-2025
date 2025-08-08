package Colektion.ArrayList.task1;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> list =new java.util.ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        System.out.println("Список: "+ list);

        if (list.contains("banana")){
            System.out.println("Список містить banana");
        } else {
            System.out.println("Список не містить banana ");
        }
    }
}
