package Old.EmptyFrame;
import javax.swing.JFrame;

public class EmptyFrameViewer {
    public static void main(String[] args){

        // Construct an object of the JFrame class
        JFrame frame = new JFrame();

        // Set the size of the frame
        frame.setSize(300, 400);

        // Set the title of the frame
        frame.setTitle("An empty frame");

        // Set the "default close operation". When the user closes the frame,
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
