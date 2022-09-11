import javax.swing.*;
import java.awt.*;

public class SwingCounter extends JFrame {

    private int count = 0;

    public SwingCounter() {
        final int WINDOW_WIDTH = 310;
        final int WINDOW_HEIGHT = 100;

        setTitle("Swing Counter");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        add(new JLabel("Counter"));

        JTextField textField = new JTextField(count + "", 10);

        add(textField);

        JButton button = new JButton("Count");
        button.addActionListener(e -> {
            ++count;
            textField.setText(count + "");
        });

        add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingCounter();
    }
}
