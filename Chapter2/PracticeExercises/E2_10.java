package PracticeExercises;
import java.awt.Color;
import javax.swing.JFrame;

public class E2_10 {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        Color c = new Color(50, 100, 150);
        c = c.brighter();
        frame.getContentPane().setBackground(c);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
