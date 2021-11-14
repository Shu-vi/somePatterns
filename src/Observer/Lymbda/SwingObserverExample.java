package Observer.Lymbda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Title");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JButton button = new JButton("Should I do it?");
        frame.add(button);

        button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event -> System.out.println("Come on, do it!"));

        frame.setVisible(true);
    }

}
