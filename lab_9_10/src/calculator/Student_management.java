package calculator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Student_management extends JFrame implements ActionListener {
    // Components
    private JTextField idField, nameField, ageField, genderField, departmentField;
    private JButton addButton, updateButton, deleteButton, viewButton;
    private JTable studentTable;
    private DefaultTableModel tableModel;

    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/student_db";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";

    public Student_management() {
        // Frame setup
        setTitle("Student Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Form Panel
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createTitledBorder("Student Details"));

        formPanel.add(new JLabel("Student ID:"));
        idField = new JTextField();
        formPanel.add(idField);

        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Age:"));
        ageField = new JTextField();
        formPanel.add(ageField);

        formPanel.add(new JLabel("Gender:"));
        genderField = new JTextField();
        formPanel.add(genderField);

        formPanel.add(new JLabel("Department:"));
        departmentField = new JTextField();
        formPanel.add(departmentField);

        // Button Panel
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 10, 10));
        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        viewButton = new JButton("View");

        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(viewButton);

        // Add ActionListeners
        addButton.addActionListener(this);
        updateButton.addActionListener(this);
        deleteButton.addActionListener(this);
        viewButton.addActionListener(this);

        // Table Panel
        tableModel = new DefaultTableModel(new String[]{"Student ID", "Name", "Age", "Gender", "Department"}, 0);
        studentTable = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(studentTable);

        // Add panels to frame
        add(formPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(tableScrollPane, BorderLayout.SOUTH);

        setVisible(true);
    }

    // ActionListener implementation
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            addStudent();
        } else if (e.getSource() == updateButton) {
            updateStudent();
        } else if (e.getSource() == deleteButton) {
            deleteStudent();
        } else if (e.getSource() == viewButton) {
            viewStudents();
        }
    }

    // Add Student
    private void addStudent() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            String sql = "INSERT INTO students (student_id, name, age, gender, department) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(idField.getText()));
            stmt.setString(2, nameField.getText());
            stmt.setInt(3, Integer.parseInt(ageField.getText()));
            stmt.setString(4, genderField.getText());
            stmt.setString(5, departmentField.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student added successfully!");
            clearFields();
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error adding student: " + ex.getMessage());
        }
    }

    // Update Student
    private void updateStudent() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            String sql = "UPDATE students SET name=?, age=?, gender=?, department=? WHERE student_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nameField.getText());
            stmt.setInt(2, Integer.parseInt(ageField.getText()));
            stmt.setString(3, genderField.getText());
            stmt.setString(4, departmentField.getText());
            stmt.setInt(5, Integer.parseInt(idField.getText()));
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student updated successfully!");
            clearFields();
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error updating student: " + ex.getMessage());
        }
    }

    // Delete Student
    private void deleteStudent() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            String sql = "DELETE FROM students WHERE student_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(idField.getText()));
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student deleted successfully!");
            clearFields();
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error deleting student: " + ex.getMessage());
        }
    }

    // View Students
    private void viewStudents() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            String sql = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            tableModel.setRowCount(0); // Clear the table
            while (rs.next()) {
                tableModel.addRow(new Object[]{
                        rs.getInt("student_id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("department")
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error fetching students: " + ex.getMessage());
        }
    }

    // Clear form fields
    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        ageField.setText("");
        genderField.setText("");
        departmentField.setText("");
    }

    // Main method
    public static void main(String[] args) {
        new Student_management();
    }
}
