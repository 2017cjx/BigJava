package Chapter1.PracticeExercises;

public class E1_4 {
    public static void main(String[] args){
        int balance = 1000;
        double interestRate = 1.05;
        for(int i = 1; i <= 3; i++){
            System.out.println("Year " + i + ": " + balance);
            balance *= interestRate;
        }
    }
}
