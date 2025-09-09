package PracticeExercises;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.net.MalformedURLException;

public class E1_18 {
    public static void main(String[] args) throws MalformedURLException{
        URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
        JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}
