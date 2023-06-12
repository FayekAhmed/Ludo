import javax.swing.JFrame;

public class BoardWindow extends JFrame {

    AWindow window;

    BoardWindow() {
        window = new AWindow();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(window);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }
}