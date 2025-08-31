package PracticeExercises;


public class E2_9 {
    public static void main(String[] args){
        String s = "desserts";
        StringBuilder s1 = new StringBuilder(s);
        s1 = s1.reverse();
        s = s1.toString();
        System.out.println(s);
        System.out.println("Expected: stressed");
    }
}
