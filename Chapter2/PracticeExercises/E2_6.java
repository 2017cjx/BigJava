package PracticeExercises;
import java.awt.Rectangle;

public class E2_6 {
    public static void main(String[] args){
        Rectangle box = new Rectangle(5,10,20,30);
        box.add(0,0);
        System.out.println(box.getX());
        System.out.println("Expected: 0");
        System.out.println(box.getY());
        System.out.println("Expected: 0");
        System.out.println(box.getWidth());
        System.out.println("Expected: 25");
        System.out.println(box.getHeight());
        System.out.println("Expected: 40");
    }
}
