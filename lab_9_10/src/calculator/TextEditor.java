package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TextEditor extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JLabel statusBar;

    // Menu items
    private JMenuItem openItem, saveItem, clearItem, exitItem;

    public TextEditor() {
        // Frame setup
        setTitle("Text Editor");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Text Area
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                updateStatusBar();
            }
        });
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        clearItem = new JMenuItem("Clear");
        exitItem = new JMenuItem("Exit");

        // Add menu items to menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(clearItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Add menu to menu bar
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Status Bar
        statusBar = new JLabel(" Characters: 0 | Lines: 1");
        statusBar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Add components to frame
        add(scrollPane, BorderLayout.CENTER);
        add(statusBar, BorderLayout.SOUTH);

        // Add ActionListeners
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        clearItem.addActionListener(this);
        exitItem.addActionListener(this);

        setVisible(true);
    }

    // ActionListener implementation
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openItem) {
            openFile();
        } else if (e.getSource() == saveItem) {
            saveFile();
        } else if (e.getSource() == clearItem) {
            clearText();
        } else if (e.getSource() == exitItem) {
            exitApplication();
        }
    }

    // Open File
    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                textArea.read(br, null);
                updateStatusBar();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error opening file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Save File
    private void saveFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                textArea.write(bw);
                JOptionPane.showMessageDialog(this, "File saved successfully!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Clear Text
    private void clearText() {
        textArea.setText("");
        updateStatusBar();
    }

    // Exit Application
    private void exitApplication() {
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    // Update Status Bar
    private void updateStatusBar() {
        int characters = textArea.getText().length();
        int lines = textArea.getLineCount();
        statusBar.setText(" Characters: " + characters + " | Lines: " + lines);
    }

    // Main method
    public static void main(String[] args) {
        new TextEditor();
    }
}
