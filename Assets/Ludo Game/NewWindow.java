import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NewWindow implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Click to roll");

    NewWindow() {
        button.setBounds(100, 160, 200, 40);
        button.setFocusable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @override
    public void ActionListener(ActionListener e) {
        
    }
}