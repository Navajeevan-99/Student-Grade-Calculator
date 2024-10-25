package practicing_swing_pack;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class addtest implements ActionListener {

    JFrame frame;
    JFrame[] frame2;
    JLabel label;
    JButton button;
    JPanel panel;
    JLabel[] pl;
    JButton[] pb;
    ImageIcon pi, image;
    int n;

    addtest() {
        n = 1;
        frame = new JFrame();
        label = new JLabel();
        panel = new JPanel();
        button = new JButton();

        frame.setTitle("Students Grade Calculator");
        frame.setSize(1280, 720);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        image = new ImageIcon("Icon.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0x123456));

        ImageIcon plus = new ImageIcon("plus.png");
        Image pl = plus.getImage();
        Image rpl = pl.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        plus.setImage(rpl);
        button.setIcon(plus);
        button.setBounds(0, 0, 50, 50);
        button.setBackground(new Color(0x123959));
        button.setBorder(BorderFactory.createLineBorder(new Color(0x123959), 0));
        button.addActionListener(this);
        label.add(button);
        panel.add(label);
        panel.setLayout(null);
        frame.setLayout(null);
        label.setText("Add Test");
        label.setFont(new Font("Sanserif", Font.BOLD, 12));
        label.setForeground(Color.WHITE);
        label.setBounds(50, 50, 50, 50);
        frame.add(panel);
        panel.setPreferredSize(new Dimension(1180, 620));
        panel.setBounds(50, 25, 1180, 620);
        panel.setBackground(new Color(0x123450));
        label.setBounds(10, 10, 100, 150);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            pi = new ImageIcon("paper.png");
            Image pi2 = pi.getImage();
            pi2 = pi2.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            pi.setImage(pi2);
            pl = new JLabel[n];
            pb = new JButton[n];
            frame2 = new JFrame[n];  // Initialize the array based on new `n` value

            int x = 10;
            int y = 10;
            for (int i = 0; i < n; i++) {
                pl[i] = new JLabel();
                pb[i] = new JButton();
                pb[i].setIcon(pi);
                pb[i].setBorder(BorderFactory.createLineBorder(new Color(0x123959), 0));
                pb[i].setBackground(new Color(0x123959));
                pl[i].add(pb[i]);
                
                final int index = i;  // Define `index` variable for inner class
                pb[i].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        openTestFrame(index);
                    }
                });

                String s = "Test " + (i + 1);
                pl[i].setText(s);
                pl[i].setForeground(Color.WHITE);
                panel.add(pl[i]);
                pl[i].setBounds(x, y, 50, 150);
                pb[i].setBounds(0, 0, 50, 50);
                x += 60;
            }
            panel.revalidate();
            label.setLocation(x + 5, y);
            panel.repaint();
            n++;
        }
    }

    // Separate method to handle opening of each test frame
    private void openTestFrame(int testIndex) {
        frame2[testIndex] = new JFrame();  // Initialize each frame in array
        frame.dispose();

        frame2[testIndex].setVisible(true);
        frame2[testIndex].setSize(1280, 720);
        frame2[testIndex].setLayout(null);
        frame2[testIndex].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2[testIndex].getContentPane().setBackground(new Color(0x123456));

        JButton back = new JButton("Back");  // Create a unique back button for each frame
        back.setBounds(1190, 650, 70, 30);
        
        // Back button logic to close this frame and return to main frame
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame2[testIndex].dispose();
                frame.setVisible(true);
            }
        });

        frame2[testIndex].add(back);
        frame2[testIndex].setTitle("Test " + (testIndex + 1));
        frame2[testIndex].setIconImage(image.getImage());
    }
}

public class Main1 {
    public static void main(String[] args) {
        new addtest();
    }
}
