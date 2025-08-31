package PracticeExercises;
import java.awt.Rectangle;

public class E2_3 {
    public static void main(String[] args){
        Rectangle r = new Rectangle(2,2,5,5);

        double width = r.getWidth();
        double height = r.getHeight();
        double area = width * height;

        System.out.println("Area is: " + area);        
        System.out.println("Expected: " + 25.0);        

    }
}
