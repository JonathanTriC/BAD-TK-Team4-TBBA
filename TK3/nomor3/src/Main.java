import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Programming is fun");
        JPanel panel = new JPanel(new GridBagLayout());
        JLabel label = new JLabel("Programming is fun");
        JRadioButton redButton = new JRadioButton("Red");
        JRadioButton yellowButton = new JRadioButton("Yellow");
        JRadioButton blackButton = new JRadioButton("Black");
        JRadioButton orangeButton = new JRadioButton("Orange");
        JRadioButton greenButton = new JRadioButton("Green");
        JButton leftButton = new JButton("<=");
        JButton rightButton = new JButton("=>");

        // Add radio buttons to a group
        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(redButton);
        colorGroup.add(yellowButton);
        colorGroup.add(blackButton);
        colorGroup.add(orangeButton);
        colorGroup.add(greenButton);

        // Add action listener to each radio button
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.RED);
            }
        });
        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.YELLOW);
            }
        });
        blackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.BLACK);
            }
        });
        orangeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.ORANGE);
            }
        });
        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.GREEN);
            }
        });

        // Add action listener to left and right buttons
        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (label.getX() > 10) {
                    label.setLocation(label.getX() - 10, label.getY());
                }
            }
        });
        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (label.getX() < panel.getWidth() - label.getWidth() - 10) {
                    label.setLocation(label.getX() + 10, label.getY());
                }
            }
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel.add(redButton, gbc);

        gbc.gridx = 1;
        panel.add(yellowButton, gbc);

        gbc.gridx = 2;
        panel.add(blackButton, gbc);

        gbc.gridx = 3;
        panel.add(orangeButton, gbc);

        gbc.gridx = 4;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(greenButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 5;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(label, gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(leftButton, gbc);

        gbc.gridx = 4;
        panel.add(rightButton, gbc);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
