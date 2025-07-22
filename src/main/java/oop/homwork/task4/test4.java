package oop.homwork.task4;

public class test4 {
    public static void main(String[] args) {
        Person[] people={ new Student(),new Teacher(), new Artist()};
        for (Person person:people){
            person.introduce();
        }
    }
}
