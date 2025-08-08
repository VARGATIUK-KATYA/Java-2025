package Colektion.task2;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list=new java.util.ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // 3. Вставка елемента 15 на позицію 1
        list.add(1, 15);

        // 4. Заміна значення на позиції 2 на 25
        list.set(2, 25);

        // 5. Вивід списку
        System.out.println(list);
    }
}
