import org.w3c.dom.css.Rect;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@SuppressWarnings("serial")
public class View extends JPanel {
    private final int viewWidth = 500;
    private final int viewHeight = 300;
    int xLoc;
    int yLoc;
    JFrame frame;
    BufferedImage image;

    public View() {


        importImage();
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
        xLoc = x;
        yLoc = y;
        frame.repaint();

    }

    protected void paintComponent(Graphics g) {
        // Draw the image on the frame
        g.drawImage(image, xLoc, yLoc, Color.gray, this);
    }
     void importImage(){
         String imgLoc = "images/clock.png";
         image  = createImage(imgLoc);

     }
    private BufferedImage createImage(String loc) {
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(new File(loc));
            return bufferedImage;
        } catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void addKeyInput(KeyListener kL){
        frame.addKeyListener(kL);
        System.out.println("Key Listener added");
    }

}

