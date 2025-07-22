package oop.homwork.task2;

public class test2 {
    public static void main(String[] args) {
        Workable[] workables={ new Teacher(),new Doctor(),new Builder()};
        for (Workable workable:workables){
            workable.work();
        }
    }
}
