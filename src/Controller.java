import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller {

    private final int drawDelay = 50;
    private Action drawAction;
    private Model model;
    private View view;

    public Controller(){
        // Create new instances of Model and View
        view = new View();
        model = new Model(view.getWidth(), view.getHeight(), view.getImageWidth(), view.getImageHeight());

        view.addKeyInput(new KeyInput());


        // Make our draw action update the Model and the View whenever called
        drawAction = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {

                model.updateLocationAndDirection();
                view.update(model.getX(), model.getY());



            }
        };
    }

    public void start(){
        EventQueue.invokeLater(new Runnable(){
            public void run() {
                // Creates a timer that calls our drawAction every 50 ms.
                Timer t = new Timer(drawDelay, drawAction);
                // Starts the timer.
                t.start();
            }
        });
    }




    class KeyInput implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent keyEvent) {
            int code = keyEvent.getKeyCode();
            System.out.println(code);
            if (code == 38) {
                //moveUp()
                model.move(0);
            } else if (code == 37) {
                //moveLeft()
                model.move(3);
            } else if (code == 39) {
                //moveRight
                model.move(2);
            } else if (code == 40) {
                //moveDown()
                model.move(1);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
