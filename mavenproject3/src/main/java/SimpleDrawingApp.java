import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class SimpleDrawingApp extends JPanel {

    private int shapeChoice;
    private Color colorChoice;

    public SimpleDrawingApp(int shapeChoice, Color colorChoice) {
        this.shapeChoice = shapeChoice;
        this.colorChoice = colorChoice;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(colorChoice);

        switch (shapeChoice) {
            case 1:
                drawCircle(g);
                break;
            case 2:
                drawBeautifulFlower(g);
                break;
            default:
                g.drawString("Invalid choice!", 50, 50);
                break;
        }
    }

    private void drawCircle(Graphics g) {
        g.drawOval(100, 100, 200, 200);
        g.drawString("This is a circle", 150, 330);
    }

    private void drawBeautifulFlower(Graphics g) {
        int centerX = 200;
        int centerY = 200;
        int petalWidth = 80;
        int petalHeight = 120;

        // Draw 8 petals around the center
        for (int i = 0; i < 360; i += 45) {
            int x = (int) (centerX + 80 * Math.cos(Math.toRadians(i)) - petalWidth / 2);
            int y = (int) (centerY + 80 * Math.sin(Math.toRadians(i)) - petalHeight / 2);
            g.fillOval(x, y, petalWidth, petalHeight);
        }

        // Draw the flower's center
        g.setColor(Color.YELLOW);
        g.fillOval(centerX - 50, centerY - 50, 100, 100);

        // Add a decorative border to the center
        g.setColor(Color.ORANGE);
        g.drawOval(centerX - 50, centerY - 50, 100, 100);

        // Draw a string to indicate it's a flower
        g.setColor(colorChoice);
        g.drawString("This is a beautiful flower", 130, 350);
    }

    public static void main(String[] args) {
        String shapeInput = JOptionPane.showInputDialog("Enter 1 to draw a circle, 2 to draw a beautiful flower:");
        int shapeChoice = Integer.parseInt(shapeInput);

        String colorInput = JOptionPane.showInputDialog("Enter 1 for red, 2 for pink:");
        Color colorChoice = null;

        if (colorInput.equals("1")) {
            colorChoice = Color.RED;
        } else if (colorInput.equals("2")) {
            colorChoice = Color.PINK;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid color choice! Defaulting to red.");
            colorChoice = Color.RED;
        }

        JFrame frame = new JFrame("Simple Drawing App");
        SimpleDrawingApp panel = new SimpleDrawingApp(shapeChoice, colorChoice);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
