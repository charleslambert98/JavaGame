import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class View extends JPanel {
    private final int viewWidth = 500;
    private final int viewHeight = 300;
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
}
