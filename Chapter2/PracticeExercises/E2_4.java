package PracticeExercises;
import java.awt.Rectangle;

public class E2_4 {
    public static void main(String[] args){
        Rectangle r = new Rectangle(2,2,5,5);
        double width = r.getWidth() * 2;
        double height = r.getHeight() * 2;
        double perimeter = width + height;

        System.out.println(perimeter);
        System.out.println("Expected: " + 20.0);
    }
}
