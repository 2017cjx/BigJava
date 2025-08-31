package PracticeExercises;

public class E2_8 {
    public static void main(String[] args){
        String s = "Hello, World!";
        System.out.println(s);
        s = s.replace("e","_");
        s = s.replace("o","e");
        s = s.replace("_","o");
        System.out.println(s);
    }
}
