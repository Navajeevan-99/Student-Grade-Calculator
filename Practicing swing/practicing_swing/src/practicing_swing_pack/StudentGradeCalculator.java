package practicing_swing_pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGradeCalculator {

    // Method to create the GUI
    private static void createAndShowGUI() {
        // Create the frame
        JFrame frame = new JFrame("Student Grade Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel to hold components
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create and add components to the panel
        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel assignmentLabel = new JLabel("Assignment Score:");
        JTextField assignmentField = new JTextField();
        panel.add(assignmentLabel);
        panel.add(assignmentField);

        JLabel quizLabel = new JLabel("Quiz Score:");
        JTextField quizField = new JTextField();
        panel.add(quizLabel);
        panel.add(quizField);

        JLabel examLabel = new JLabel("Exam Score:");
        JTextField examField = new JTextField();
        panel.add(examLabel);
        panel.add(examField);

        JButton calculateButton = new JButton("Calculate Grade");
        panel.add(calculateButton);

        JLabel resultLabel = new JLabel("Final Grade:");
        JLabel gradeOutput = new JLabel("");
        panel.add(resultLabel);
        panel.add(gradeOutput);

        // Add ActionListener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get input values
                    String name = nameField.getText();
                    double assignmentScore = Double.parseDouble(assignmentField.getText());
                    double quizScore = Double.parseDouble(quizField.getText());
                    double examScore = Double.parseDouble(examField.getText());

                    // Validate the inputs are between 0 and 100
                    if (assignmentScore < 0 || assignmentScore > 100 || quizScore < 0 || quizScore > 100 || examScore < 0 || examScore > 100) {
                        JOptionPane.showMessageDialog(frame, "Scores must be between 0 and 100.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Calculate final grade (example weights: 40% assignment, 30% quiz, 30% exam)
                    double finalGrade = (assignmentScore * 0.4) + (quizScore * 0.3) + (examScore * 0.3);

                    // Display the final grade
                    gradeOutput.setText(String.format("%s's Final Grade: %.2f", name, finalGrade));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers for scores.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Display the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

