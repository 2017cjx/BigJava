package PracticeExercises;

public class E2_7 {
    public static void main(String[] args){
        String s = "Mississippi";
        s = s.replace("i","!");
        s = s.replace("s","$");
        System.out.println(s);
        System.out.println("Expected: M!$$!$$!pp!");
    }
}
