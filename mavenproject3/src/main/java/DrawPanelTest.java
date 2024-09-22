
import javax.swing.JFrame;

public class DrawPanelTest {

    public static void main(String[] args) {
        // Create an instance of DrawRainbow instead of DrawPanel
        DrawRainbow panel = new DrawRainbow();
        JFrame application = new JFrame();

        // Set default close operation
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the DrawRainbow panel to the frame
        application.add(panel);

        // Set the size of the window
        application.setSize(400, 400); // Adjusted size to better display the rainbow

        // Make the window visible
        application.setVisible(true);
    }
}
