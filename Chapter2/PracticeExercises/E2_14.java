package PracticeExercises;
import java.util.Random;

public class E2_14 {
    public static void main(String[] args){
        Random r = new Random();
        int steps = 200;
        double randSteps = r.nextInt(steps+1);

        double price = 10.00 + (randSteps*0.05);
        System.out.printf("$%.2f%n", price);
    }
}
