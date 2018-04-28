import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {

    private final int drawDelay = 50;
    private Action drawAction;
    private Model model;
    private View view;

    public Controller(){
        // Create new instances of Model and View
        view = new View();
        model = new Model(view.getWidth(), view.getHeight(), view.getImageWidth(), view.getImageHeight());



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
}
