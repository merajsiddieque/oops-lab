package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizApplication extends JFrame implements ActionListener {
    private JLabel questionLabel;
    private JRadioButton[] options;
    private ButtonGroup optionsGroup;
    private JButton submitButton, nextButton, finishButton;
    private int currentQuestionIndex = 0;
    private int score = 0;

    // Sample Questions and Answers
    private String[][] questions = {
            {"What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "3"},
            {"Which language is used for Android development?", "Java", "Python", "C++", "Ruby", "1"},
            {"What is 5 + 3?", "7", "8", "9", "10", "2"},
            {"Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Saturn", "2"}
    };

    public QuizApplication() {
        // Frame setup
        setTitle("Quiz Application");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Question Label
        questionLabel = new JLabel("", JLabel.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(questionLabel, BorderLayout.NORTH);

        // Options Panel
        JPanel optionsPanel = new JPanel(new GridLayout(4, 1));
        options = new JRadioButton[4];
        optionsGroup = new ButtonGroup();

        for (int i = 0; i < 4; i++) {
            options[i] = new JRadioButton();
            optionsGroup.add(options[i]);
            optionsPanel.add(options[i]);
        }
        add(optionsPanel, BorderLayout.CENTER);

        // Buttons Panel
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        submitButton = new JButton("Submit");
        nextButton = new JButton("Next");
        finishButton = new JButton("Finish");

        submitButton.addActionListener(this);
        nextButton.addActionListener(this);
        finishButton.addActionListener(this);

        buttonsPanel.add(submitButton);
        buttonsPanel.add(nextButton);
        buttonsPanel.add(finishButton);

        add(buttonsPanel, BorderLayout.SOUTH);

        // Initialize Quiz
        loadQuestion();

        nextButton.setEnabled(false);
        finishButton.setVisible(false);

        setVisible(true);
    }

    private void loadQuestion() {
        if (currentQuestionIndex < questions.length) {
            String[] currentQuestion = questions[currentQuestionIndex];
            questionLabel.setText((currentQuestionIndex + 1) + ". " + currentQuestion[0]);

            for (int i = 0; i < 4; i++) {
                options[i].setText(currentQuestion[i + 1]);
                options[i].setSelected(false);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String correctAnswer = questions[currentQuestionIndex][5];
            int selectedOption = -1;

            for (int i = 0; i < 4; i++) {
                if (options[i].isSelected()) {
                    selectedOption = i + 1;
                    break;
                }
            }

            if (selectedOption == -1) {
                JOptionPane.showMessageDialog(this, "Please select an answer!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                if (String.valueOf(selectedOption).equals(correctAnswer)) {
                    score++;
                }
                submitButton.setEnabled(false);
                nextButton.setEnabled(true);

                if (currentQuestionIndex == questions.length - 1) {
                    finishButton.setVisible(true);
                    nextButton.setEnabled(false);
                }
            }
        } else if (e.getSource() == nextButton) {
            currentQuestionIndex++;
            loadQuestion();
            submitButton.setEnabled(true);
            nextButton.setEnabled(false);
        } else if (e.getSource() == finishButton) {
            JOptionPane.showMessageDialog(this, "Quiz Finished! Your Score: " + score + "/" + questions.length, "Quiz Result", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new QuizApplication();
    }
}
