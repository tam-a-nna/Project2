
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {

    public static void main(String[] args) {
        // Ask the user to choose between rectangles and ovals
        String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles, 2 to draw ovals:");

        // Input validation and handling
        int choice = 0;
        try {
            choice = Integer.parseInt(input);
            if (choice != 1 && choice != 2) {
                throw new NumberFormatException("Invalid input");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter 1 for rectangles or 2 for ovals.");
            System.exit(1);
        }

        // Create a panel with the user's choice
        Shapes panel = new Shapes(choice);

        // Create a new JFrame
        JFrame application = new JFrame();

        // Set the default close operation
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the panel to the frame
        application.add(panel);

        // Set the frame size
        application.setSize(400, 400); // Increased size for better visibility

        // Make the frame visible
        application.setVisible(true);
    }
}
