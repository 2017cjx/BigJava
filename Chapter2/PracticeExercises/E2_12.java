package PracticeExercises;
import java.awt.Color;
import javax.swing.JFrame;

public class E2_12 {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        Color c = Color.RED;
        c = c.darker();
        c = c.darker();
        frame.getContentPane().setBackground(c);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
