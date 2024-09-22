
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200); // face

        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30); // left eye
        g.fillOval(135, 65, 30, 30); // right eye

        g.fillOval(50, 110, 120, 60); // mouth outline

        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30); // mouth touch-up
        g.fillOval(50, 120, 120, 40); // smile
    }
}
