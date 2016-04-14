package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by msi on 2016-04-14.
 */
public class MainFrame extends JFrame {

    public void init(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(800, 600));

        setVisible(true);
        setState(Frame.NORMAL);
        setVisible(true);
    }

}
