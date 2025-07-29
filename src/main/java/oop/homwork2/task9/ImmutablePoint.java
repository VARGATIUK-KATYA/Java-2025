package oop.homwork2.task9;

public class ImmutablePoint {
    final int x;
    final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void  print(){
        System.out.println("Print:"+ x);
        System.out.println("Print:"+ y);
    }
}
