package practicing_swing_pack;

import javax.swing.*;
import java.awt.*;

public class ImageIconArrayDisplay {
    public static void main(String[] args) {
        // Create a JFrame to display the images
        JFrame frame = new JFrame("ImageIcon Array Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        
        // Create a JPanel with a GridLayout to display multiple images
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3)); // Adjust rows and columns as needed

        // Create an array to store ImageIcon objects
        ImageIcon[] iconArray = new ImageIcon[3];

        // Initialize the ImageIcon array with image paths
        iconArray[0] = new ImageIcon("paper.png");
        iconArray[1] = new ImageIcon("paper.png");
        iconArray[2] = new ImageIcon("paper.png");

        // Loop through the array and add each ImageIcon to a JLabel, then to the panel
        for (ImageIcon icon : iconArray) {
            JLabel label = new JLabel();
            label.setIcon(icon);
            panel.add(label);
        }

        // Add the panel to the frame and make it visible
        frame.add(panel);
        frame.setVisible(true);
    }
}