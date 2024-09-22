import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel {

    private int choice;  // Stores the user's choice

    // Constructor that sets the user's choice
    public Shapes(int userChoice) {
        choice = userChoice;
    }

    // Overriding paintComponent to draw shapes
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw 10 shapes based on the user's choice
        for (int i = 0; i < 10; i++) {
            switch (choice) {
                case 1: // Draw rectangles
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 2: // Draw ovals
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                default:
                    g.drawString("Invalid choice", 50, 50);
                    break;
            }
        }
    }
}
