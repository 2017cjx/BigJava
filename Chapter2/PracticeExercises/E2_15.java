package PracticeExercises;
import java.awt.Point;

public class E2_15 {
    public static void main(String[] args){
        Point p1 = new Point(3, 4);
        Point p2 = new Point(-3,-4);

        double distance = p1.distance(p2);
        System.out.printf("%.2f%n",distance);
        System.out.println("Expected: 10");
    }
}
