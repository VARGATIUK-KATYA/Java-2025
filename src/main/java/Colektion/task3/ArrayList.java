package Colektion.task3;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList <String> list = new java.util.ArrayList<>();
        list.add("dog");
        list.add("cat");
        list.add("mouse");
        list.add("cat");

        // 2. Пошук індексу першого "cat"
        int index = list.indexOf("cat");

        // 3. Видалення першого "cat"
        if (index != -1) {
            list.remove(index);
        }
        // 4. Вивід оновленого списку
        System.out.println(list);
    }
}
