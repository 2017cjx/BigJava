package PracticeExercises;

public class E2_2 {
    public static void main(String[] args){
        String s = "  abcdefg  ";

        String s1 = s;
        s1 = s1.trim();
        System.out.println(s1);

        String s2 = s;
        s2 = s2.replace(" ","");
        System.out.println(s2);
    }
}
