import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class View extends JPanel {
    private final int viewWidth = 500;
    private final int viewHeight = 300;
    int xLoc;
    int yLoc;
    JFrame frame;

    public View() {


        // Set up the JFrame
        frame = new JFrame();
        frame.setBackground(Color.gray);
        frame.getContentPane().add(this, BorderLayout.CENTER);
        frame.getContentPane().setBackground(Color.gray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(viewWidth, viewHeight);
        frame.setVisible(true);
        frame.setFocusable(true);
    }

    public int getImageWidth() {
        return viewWidth;
    }

    public int getImageHeight() {
        return viewHeight;
    }

    public void update(int x, int y) {
    }

    protected void paintComponent(Graphics g) {
        // Draw the image on the frame
        g.drawImage(<image>, xLoc, yLoc, Color.gray, this);
    }
}
