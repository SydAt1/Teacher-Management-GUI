    import javax.swing.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.ArrayList;
    import java.awt.Font;
    import java.awt.*;
    
    public class TeacherGUI{
        private ArrayList<Teacher> teachersList = new ArrayList<>();
        private JFrame lecturerFrame;
        private JFrame tutorFrame;
        private JFrame navigationFrame;
    
    public TeacherGUI() {
            createLecturerFrame();
            createTutorFrame();
            createNavigationFrame();
        }   
        
    public void ButtonProperties(JButton button) {
        button.setBackground(Color.decode("#008080"));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setFocusPainted(false);
    }
    
    
private void createLecturerFrame() {
        lecturerFrame = new JFrame("Lecturer Frame");
        lecturerFrame.setSize(1920, 1080); //standard resolution of screens, should be increased or decreased according to what screen is used
        lecturerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        lecturerFrame.setLocationRelativeTo(null);
        lecturerFrame.setLayout(null); // Using absolute positioning
        
        JLabel headerLabel = new JLabel("Lecturer Form");
        Font headerFont = new Font("Arial", Font.BOLD, 48);
        headerLabel.setFont(headerFont);
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setBounds(500, 220, 900, 60);
        lecturerFrame.add(headerLabel); // Add to the background label
        
        // Set background color
        Color backgroundColor = new Color(0xC7E4C5); 
        lecturerFrame.getContentPane().setBackground(backgroundColor);
    
        // Create panel for labels and text fields
        JPanel panel = new JPanel();
        panel.setBounds(400, 300, 1000, 550) ; // Adjusted position and size
        panel.setBackground(Color.WHITE);
        panel.setLayout(null); // Use absolute positioning for components
        
        //setting font style and size
        Font labelFont = new Font("Arial", Font.BOLD, 20);
        
        //initializing all the JLabels and JTextfields
        JLabel idLabel, nameLabel, addressLabel, workingTypeLabel, employmentStatusLabel, gradedScoreLabel,
                departmentLabel, yearsOfExperienceLabel;
        JTextField idField, nameField, addressField, workingTypeField, employmentStatusField, gradedScoreField,
                departmentField, yearsOfExperienceField;
                
        // Labels
        idLabel = new JLabel("ID:");
        idLabel.setFont(labelFont);
        nameLabel = new JLabel("Name:");
        nameLabel.setFont(labelFont);
        addressLabel = new JLabel("Address:");
        addressLabel.setFont(labelFont);
        workingTypeLabel = new JLabel("Working Type:");
        workingTypeLabel.setFont(labelFont);
        employmentStatusLabel = new JLabel("Employment Status:");
        employmentStatusLabel.setFont(labelFont);
        gradedScoreLabel = new JLabel("Graded Score:");
        gradedScoreLabel.setFont(labelFont);
        departmentLabel = new JLabel("Department:");
        departmentLabel.setFont(labelFont);
        yearsOfExperienceLabel = new JLabel("Years of Experience:");
        yearsOfExperienceLabel.setFont(labelFont);
    
        // Text fields
        idField = new JTextField();
        nameField = new JTextField();
        addressField = new JTextField();
        workingTypeField = new JTextField();
        employmentStatusField = new JTextField();
        gradedScoreField = new JTextField();
        departmentField = new JTextField();
        yearsOfExperienceField = new JTextField();
        
        // Set bounds for labels and text fields within the panel
        idLabel.setBounds(10, 20, 80, 30);
        idField.setBounds(240, 20, 200, 30);
        nameLabel.setBounds(10, 70, 80, 30);
        nameField.setBounds(240, 70, 200, 30);
        addressLabel.setBounds(10, 120, 150, 30);
        addressField.setBounds(240, 120, 200, 30);
        workingTypeLabel.setBounds(10, 170, 150, 30);
        workingTypeField.setBounds(240, 170, 200, 30);
        employmentStatusLabel.setBounds(10, 220, 200, 30);
        employmentStatusField.setBounds(240, 220, 200, 30);
        gradedScoreLabel.setBounds(10, 270, 150, 30);
        gradedScoreField.setBounds(240, 270, 200, 30);
        departmentLabel.setBounds(10, 320, 150, 30);
        departmentField.setBounds(240, 320, 200, 30);
        yearsOfExperienceLabel.setBounds(10, 370, 210, 30);
        yearsOfExperienceField.setBounds(240, 370, 200, 30);
        
        // Load the image
        ImageIcon imageIcon = new ImageIcon("lecturer.jpg");
            // Resize the image
        Image scaledImage = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create a JLabel with the scaled image
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(600, 70, 300, 300); // Set the bounds to position and size the image
        panel.add(imageLabel);
        
        // Button to add lecturer
        JButton addLecturerButton = new JButton("Add Lecturer");
        addLecturerButton.setBounds(120, 420, 220, 60); // Set bounds for button
        ButtonProperties(addLecturerButton);
        
        // Button to clear fields
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(420, 420, 220, 60); // Set bounds for button
        ButtonProperties(clearButton);  // Apply same aesthetic adjustments
    
          // Button to grade assignments
        JButton gradeButton = new JButton("Grade Assignments");
        gradeButton.setBounds(720, 420, 220, 60); // Set bounds for button
        ButtonProperties(gradeButton);  // Apply same aesthetic adjustments
        
        // Button to go back
        JButton back = new JButton("Back");
        back.setBounds(0, 490, 333, 60);
        ButtonProperties(back);// Apply same aesthetic adjustments
    
        // Button to display
        JButton display = new JButton("Display");
        display.setBounds(333, 490, 333, 60);
        ButtonProperties(display); // Apply same aesthetic adjustments
    
        // Button to go to Tutor frame
        JButton goToTutor = new JButton("Go To Tutor");
        goToTutor.setBounds(666, 490, 333, 60);
        ButtonProperties(goToTutor); // Apply same aesthetic adjustments
        
        
        panel.add(clearButton);
        panel.add(gradeButton);
        panel.add(back);
        panel.add(goToTutor);
        panel.add(display);
    
    
        // Add components to the panel
        panel.add(idLabel);
        panel.add(idField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(workingTypeLabel);
        panel.add(workingTypeField);
        panel.add(employmentStatusLabel);
        panel.add(employmentStatusField);
        panel.add(gradedScoreLabel);
        panel.add(gradedScoreField);
        panel.add(departmentLabel);
        panel.add(departmentField);
        panel.add(yearsOfExperienceLabel);
        panel.add(yearsOfExperienceField);
        panel.add(addLecturerButton);
    
        // Add panel to the frame
        lecturerFrame.add(panel);
    
        // Action listener for add lecturer button
    addLecturerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Check if text fields are empty
                    String emptyFields = "";
                    if (idField.getText().isEmpty()) {
                        emptyFields += "ID, ";
                    }
                    if (nameField.getText().isEmpty()) {
                        emptyFields += "Name, ";
                    }
                    if (addressField.getText().isEmpty()) {
                        emptyFields += "Address, ";
                    }
                    if (workingTypeField.getText().isEmpty()) {
                        emptyFields += "Working Type, ";
                    }
                    if (employmentStatusField.getText().isEmpty()) {
                        emptyFields += "Employment Status, ";
                    }   
                    if (gradedScoreField.getText().isEmpty()) {
                        emptyFields += "Graded Score, ";
                    }
                    if (departmentField.getText().isEmpty()) {
                        emptyFields += "Department, ";
                    }
                    if (yearsOfExperienceField.getText().isEmpty()) {
                        emptyFields += "Years of Experience, ";
                    }
                    // If any of the fields are empty, it's name is stored in emptyFields and they are displayed accordingly
                    if (!emptyFields.isEmpty()) {
                        emptyFields = emptyFields.substring(0, emptyFields.length() - 2); // To remove the last comma and space
                        JOptionPane.showMessageDialog(lecturerFrame, "Please fill in the following fields: " + emptyFields + ".", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    // Get values from text fields
                    int id = Integer.parseInt(idField.getText());
                    String name = nameField.getText();
                    String address = addressField.getText();
                    String workingType = workingTypeField.getText();
                    String employmentStatus = employmentStatusField.getText();
                    int gradedScore = Integer.parseInt(gradedScoreField.getText());
                    String department = departmentField.getText();
                    int yearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());
                    
                    if (id < 0 || id > 999) {
                        JOptionPane.showMessageDialog(lecturerFrame, "Teacher ID must be between 0 and 999.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                    }
                    
                    if (gradedScore < 0 || gradedScore > 100) {
                        JOptionPane.showMessageDialog(lecturerFrame, "Graded score must be between 0 and 100.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                    }
                    
                    if (yearsOfExperience < 0 || yearsOfExperience > 50) {
                        JOptionPane.showMessageDialog(lecturerFrame, "Years of experience must be between 0 and 50.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                    }
                    
                    for (Object teacherObj : teachersList) {
                        Teacher teacher = (Teacher) teacherObj;
                        if (teacher.getTeacherID() == id && teacher instanceof Lecturer ) {
                            JOptionPane.showMessageDialog(lecturerFrame, "Lecturer with ID " + id + " already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                    // Create Lecturer object and add to the list
                    Lecturer lecturer = new Lecturer(id, name, address, workingType, employmentStatus, gradedScore, department, yearsOfExperience);
                    teachersList.add(lecturer);
                    JOptionPane.showMessageDialog(lecturerFrame, "Lecturer added successfully!");
                } 
                catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(lecturerFrame, "Please enter valid values.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // Action listener for clear button
    clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                int confirm = JOptionPane.showConfirmDialog(lecturerFrame, "Are you sure you want to clear all fields?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                          idField.setText("");
                          nameField.setText("");
                          addressField.setText("");
                          workingTypeField.setText("");
                          employmentStatusField.setText("");
                          departmentField.setText("");
                          yearsOfExperienceField.setText("");
                          gradedScoreField.setText("");
                    }
            }
        });
    
    gradeButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
                int id = Integer.parseInt(idField.getText());
                int gradedScore = Integer.parseInt(gradedScoreField.getText()); // Assigning the value to the instance variable
                String department = departmentField.getText();
                int yearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());
    
                for (Object teacherObj : teachersList) {
                    Teacher teacher = (Teacher) teacherObj;
                    if (teacher.getTeacherID() == id && teacher instanceof Lecturer) {
                        Lecturer lecturer = (Lecturer) teacher;
                        lecturer.gradeAssignment(gradedScore, department, yearsOfExperience);// Get the graded assignment
                        String grade = ""; // the setGradedScore in the Lecturer class was of void return type, since it couldn't be changed to string here, including the whole logic to display the grade
                        if (gradedScore >= 70) {
                            grade = "A";
                        } else if (gradedScore >= 60) {
                            grade = "B";
                        } else if (gradedScore >= 50) {
                            grade = "C";
                        } else if (gradedScore >= 40) {
                            grade = "D";
                        } else {
                            grade = "E";
                        }
                        String message = "Assignments graded successfully!\n\nGrade: " + grade;
                        JOptionPane.showMessageDialog(lecturerFrame, message, "Assignment Grading Result", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }
                JOptionPane.showMessageDialog(lecturerFrame, "Invalid Teacher ID or Teacher is not a Lecturer.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(lecturerFrame, "Please enter valid values." , "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });
    
        display.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
                int id = Integer.parseInt(idField.getText());
                // Search for the teacher with the given ID
                for (Object teacherObj : teachersList) {
                    Teacher teacher = (Teacher) teacherObj;
                    if (teacher.getTeacherID() == id) {
                        // Determine the class of the teacher and display information accordingly
                        if (teacher instanceof Lecturer) {
                            // Display information for Lecturer
                            Lecturer lecturer = (Lecturer) teacher;
                            String lecturerInfo = "Lecturer ID: " + lecturer.getTeacherID() + "\n" +
                                                  "Name: " + lecturer.getTeacherName() + "\n" +
                                                  "Address: " + lecturer.getAddress() + "\n" +
                                                  "Working Type: " + lecturer.getWorkType() + "\n" +
                                                  "Department: " + lecturer.getDepartment() + "\n" +
                                                  "Employment Status: " + lecturer.getEmploymentStatus() + "\n" +
                                                  "Years of Experience: " + lecturer.getYearsOfExperience();
                            JOptionPane.showMessageDialog(lecturerFrame, lecturerInfo, "Lecturer Information", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(lecturerFrame, "Teacher ID: " + teacher.getTeacherID() + " is not a Lecturer.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        return; 
                    }
                }
                // If the loop finishes without finding the teacher, display an error message
                JOptionPane.showMessageDialog(lecturerFrame, "Teacher with ID " + id + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(lecturerFrame, "Please enter a numeric Teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });
    
        goToTutor.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tutorFrame.setVisible(true);
                    lecturerFrame.setVisible(false);
            }
        });
        
        back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    navigationFrame.setVisible(true);
                    lecturerFrame.setVisible(false);
            }
        });
        lecturerFrame.setVisible(false); // Frame isn't visible initially and should be called
    }
    
    
private void createTutorFrame() {
            tutorFrame = new JFrame("Tutor Frame");
            tutorFrame.setSize(1920, 1080);
            tutorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tutorFrame.setLocationRelativeTo(null);
            tutorFrame.setLayout(null);
        
            JLabel headerLabel = new JLabel("Tutor Form");
            Font headerFont = new Font("Arial", Font.BOLD, 48);
            headerLabel.setFont(headerFont);
            headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
            headerLabel.setBounds(500, 150, 900, 60);
            tutorFrame.add(headerLabel); // Add to the background label
    
            // Set background color
            Color backgroundColor = new Color(0xC7E4C5); 
            tutorFrame.getContentPane().setBackground(backgroundColor);
    
            // Create panel for labels and text fields
            JPanel panel1 = new JPanel();
            panel1.setBounds(450, 220, 1000, 680); // Adjusted position and size
            panel1.setBackground(Color.WHITE);
            panel1.setLayout(null); // Use absolute positioning for components
    
            // Setting font style and size
            Font labelFont = new Font("Arial", Font.BOLD, 20);
            
            JLabel idLabel, nameLabel, addressLabel, workingTypeLabel, employmentStatusLabel, workingHoursLabel, yearsOfExperienceLabel,
                salaryLabel,specializationLabel, academicsLabel, performanceIndexLabel;
            JTextField idField, nameField, addressField, workingTypeField, employmentStatusField, workingHoursField, yearOfExperienceField,
                salaryField, specializationField, academicsField, performanceIndexField;
    
            // Labels
            idLabel = new JLabel("ID:");
            idLabel.setFont(labelFont);
            nameLabel = new JLabel("Name:");
            nameLabel.setFont(labelFont);
            addressLabel = new JLabel("Address:");
            addressLabel.setFont(labelFont);
            workingTypeLabel = new JLabel("Working Type:");
            workingTypeLabel.setFont(labelFont);
            employmentStatusLabel = new JLabel("Employment Status:");
            employmentStatusLabel.setFont(labelFont);
            workingHoursLabel = new JLabel("Working Hours:");
            workingHoursLabel.setFont(labelFont);
            yearsOfExperienceLabel = new JLabel("Years of Experience:");
            yearsOfExperienceLabel.setFont(labelFont);
            salaryLabel = new JLabel("Salary:");
            salaryLabel.setFont(labelFont);
            specializationLabel = new JLabel("Specialization:");
            specializationLabel.setFont(labelFont);
            academicsLabel = new JLabel("Academic Qualification:");
            academicsLabel.setFont(labelFont);
            performanceIndexLabel = new JLabel("Performance Index:");
            performanceIndexLabel.setFont(labelFont);
            
            // Text fields
            idField = new JTextField();
            nameField = new JTextField();
            addressField = new JTextField();
            workingTypeField = new JTextField();
            employmentStatusField = new JTextField();
            workingHoursField = new JTextField();
            salaryField = new JTextField();
            specializationField = new JTextField();
            academicsField = new JTextField();
            performanceIndexField = new JTextField();
            
    
            // Set bounds for labels and text fields within the panel
            idLabel.setBounds(10, 20, 100, 30);
            idField.setBounds(260, 20, 200, 30);
            nameLabel.setBounds(10, 70, 100, 30);
            nameField.setBounds(260, 70, 200, 30);
            addressLabel.setBounds(10, 120, 150, 30);
            addressField.setBounds(260, 120, 200, 30);
            workingTypeLabel.setBounds(10, 170, 150, 30);
            workingTypeField.setBounds(260, 170, 200, 30);
            employmentStatusLabel.setBounds(10, 220, 250, 30);
            employmentStatusField.setBounds(260, 220, 200, 30);
            workingHoursLabel.setBounds(10, 270, 150, 30);
            workingHoursField.setBounds(260, 270, 200, 30);
            salaryLabel.setBounds(10, 320, 250, 30);
            salaryField.setBounds(260, 320, 200, 30);
            specializationLabel.setBounds(10, 370, 150, 30);
            specializationField.setBounds(260, 370, 200, 30);
            academicsLabel.setBounds(10, 420, 259, 30);
            academicsField.setBounds(260, 420, 200, 30);
            performanceIndexLabel.setBounds(10, 470, 250, 30);
            performanceIndexField.setBounds(260, 470, 200, 30);
    
            // Load the image
            ImageIcon imageIcon = new ImageIcon("tutor.jpg");
            // Resize the image
            Image scaledImage = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            // Creating a JLabel with a scaled image
            JLabel imageLabel = new JLabel(scaledIcon);
            imageLabel.setBounds(600, 70, 300, 300); // Set the bounds to position and size the image
            panel1.add(imageLabel);
    
            // Button to add tutor
            JButton addTutorButton = new JButton("Add Tutor");
            addTutorButton.setBounds(120, 530, 220, 60); 
            ButtonProperties(addTutorButton);
    
            // Button to clear fields
            JButton clearButton = new JButton("Clear");
            clearButton.setBounds(420, 530, 220, 60); 
            ButtonProperties(clearButton); 
    
            // Button to grade assignments
            JButton salaryButton = new JButton("Set Salary");
            salaryButton.setBounds(720, 530, 220, 60); // Set bounds for button
            ButtonProperties(salaryButton);  // Apply same aesthetic adjustments
    
            // Button to go back
            JButton back = new JButton("Back");
            back.setBounds(0, 620, 250, 60);
            ButtonProperties(back);// Applying aesthetic adjustments
    
            // Button to display
            JButton display = new JButton("Display");
            display.setBounds(250, 620, 250, 60);
            ButtonProperties(display); // Applying aesthetic adjustments
            
            JButton removeButton = new JButton("Remove Tutor");
            removeButton.setBounds(500, 620, 250, 60);
            ButtonProperties(removeButton);
            
            // Button to go to Tutor frame
            JButton goToLecturer = new JButton("Go To Lecturer");
            goToLecturer.setBounds(750, 620, 250, 60);
            ButtonProperties(goToLecturer); // Apply same aesthetic adjustments
    
            panel1.add(clearButton);
            panel1.add(salaryButton);
            panel1.add(back);
            panel1.add(goToLecturer);
            panel1.add(display);
            panel1.add(addTutorButton);
            panel1.add(removeButton);
    
            // Add the components to the panel
            panel1.add(idLabel);
            panel1.add(idField);
            panel1.add(nameLabel);
            panel1.add(nameField);
            panel1.add(addressLabel);
            panel1.add(addressField);
            panel1.add(workingTypeLabel);
            panel1.add(workingTypeField);
            panel1.add(employmentStatusLabel);
            panel1.add(employmentStatusField);
            panel1.add(workingHoursLabel);
            panel1.add(workingHoursField);
            panel1.add(salaryLabel);
            panel1.add(salaryField);
            panel1.add(specializationLabel);
            panel1.add(specializationField);
            panel1.add(academicsLabel);
            panel1.add(academicsField);
            panel1.add(performanceIndexLabel);
            panel1.add(performanceIndexField);
    
    //button to add the tutor to the teacherslist array list         
    addTutorButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
            // Check if text fields are empty
            // Check if text fields are empty
                    String emptyFields = "";
                    if (idField.getText().isEmpty()) {
                        emptyFields += "ID, ";
                    }
                    if (nameField.getText().isEmpty()) {
                        emptyFields += "Name, ";
                    }
                    if (addressField.getText().isEmpty()) {
                        emptyFields += "Address, ";
                    }
                    if (workingTypeField.getText().isEmpty()) {
                        emptyFields += "Working Type, ";
                    }
                    if (employmentStatusField.getText().isEmpty()) {
                        emptyFields += "Employment Status, ";
                    }   
                    if (workingHoursField.getText().isEmpty()) {
                        emptyFields += "Working Hours, ";
                    }
                    if (salaryField.getText().isEmpty()) {
                        emptyFields += "Salary, ";
                    }
                    if (specializationField.getText().isEmpty()) {
                        emptyFields += "Specialization, ";
                    }
                    if (academicsField.getText().isEmpty()) {
                        emptyFields += "Specialization, ";
                    }
                    if (performanceIndexField.getText().isEmpty()) {
                        emptyFields += "Performance Index, ";
                    }
                    
                    // If any of the fields are empty, it's name is stored in emptyFields and they are displayed accordingly
                    if (!emptyFields.isEmpty()) {
                        emptyFields = emptyFields.substring(0, emptyFields.length() - 2); // To remove the last comma and space
                        JOptionPane.showMessageDialog(lecturerFrame, "Please fill in the following fields: " + emptyFields + ".", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String address = addressField.getText();
            String workingType = workingTypeField.getText();
            String employmentStatus = employmentStatusField.getText();
            int workingHours = Integer.parseInt(workingHoursField.getText());
            double salary = Double.parseDouble(salaryField.getText());
            String specialization = specializationField.getText();
            String academicQualifications = academicsField.getText();
            int performanceIndex = Integer.parseInt(performanceIndexField.getText());
            
            for (Object teacherObj : teachersList) {
                        Teacher teacher = (Teacher) teacherObj;
                        if (teacher instanceof Tutor && teacher.getTeacherID() == id) {
                            JOptionPane.showMessageDialog(lecturerFrame, "Tutor with ID " + id + " already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
            
            if (id < 0 || id > 999) {
                        JOptionPane.showMessageDialog(tutorFrame, "Teacher ID must be between 0 and 999.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                    }
                    
            if (performanceIndex < 0 || performanceIndex > 10) {
                        JOptionPane.showMessageDialog(tutorFrame, "Performance Index must be between 0 and 9.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                    }
                    
            if (workingHours < 10 || workingHours > 50) {
                        JOptionPane.showMessageDialog(tutorFrame, "Working Hours must be between 10 and 50.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                    }
            
            if (salary < 10000 || salary > 100000) {
                        JOptionPane.showMessageDialog(tutorFrame, "Salary must be between 10000 and 100000.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                    }
                    
            // Create a new Tutor object
            Tutor tutor = new Tutor(id, name, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualifications, performanceIndex);

            // Add the new Tutor object to the teachersList
            teachersList.add(tutor);

            // Show success message
            JOptionPane.showMessageDialog(tutorFrame, "Tutor added successfully!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(tutorFrame, "Please enter valid numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
});
    //button to display the information that was added into the arraylist through the add tutor button
display.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
                int id = Integer.parseInt(idField.getText());
                // Search for the teacher with the given ID
                for (Object teacherObj : teachersList) {
                    Teacher teacher = (Teacher) teacherObj;
                    if (teacher.getTeacherID() == id) {
                        // Determine the class of the teacher and display information accordingly
                        if (teacher instanceof Tutor) {
                            // Display information for Lecturer
                            Tutor tutor = (Tutor) teacher;
                            String tutorInfo = "Tutor ID: " + tutor.getTeacherID() + "\n" +
                                                  "Name: " + tutor.getTeacherName() + "\n" +
                                                  "Address: " + tutor.getAddress() + "\n" +
                                                  "Working Type: " + tutor.getWorkType() + "\n" +
                                                  "Employment Status: " + tutor.getEmploymentStatus() + "\n" +
                                                  "Working Hours: " + tutor.getWorkHours() + "\n" +
                                                  "Salary: " + tutor.getSalary() + "\n" +
                                                  "Specialization: " + tutor.getSpecialization() + "\n" +
                                                  "Academic Qualifications: " + tutor.getAcademicQualifications() + "\n" +
                                                  "Performance Index: " + tutor.getPerformanceIndex();
                            JOptionPane.showMessageDialog(tutorFrame, tutorInfo, "Tutor Information", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(tutorFrame, "Teacher ID: " + teacher.getTeacherID() + " is not a Tutor.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        return; 
                    }
                }
                // If the loop finishes without finding the teacher, display an error message
                JOptionPane.showMessageDialog(lecturerFrame, "Teacher with ID " + id + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(lecturerFrame, "Please enter a numeric Teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });
    
    //button to access the lecturer frame directly from the tutor frame
            goToLecturer.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tutorFrame.setVisible(false);
                    lecturerFrame.setVisible(true);
            }
        });
        
        //when conditions are met and this button is pressed the salary of the tutor is updated
        salaryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(idField.getText());
                    double newSalary = Double.parseDouble(salaryField.getText());
                    int newPerformanceIndex = Integer.parseInt(performanceIndexField.getText());
                for (Object teacherObj : teachersList) {
                    Teacher teacher = (Teacher) teacherObj;
                    if (teacher.getTeacherID() == id && teacher instanceof Tutor) {
                        Tutor tutor = (Tutor) teacher;
                        double oldSalary = tutor.getSalary(); // Retrieve old salary
                        tutor.setSalary(newSalary, newPerformanceIndex);
                        // Showing the appraised salary of Tutor in a dialogue box
                        JOptionPane.showMessageDialog(tutorFrame, "Salary of Tutor set successfully.\nOld Salary: " + oldSalary + "\nNew Salary: " + tutor.getSalary());
                        return;
                    }
                }
            JOptionPane.showMessageDialog(tutorFrame, "Invalid Teacher ID or Teacher is not a Tutor.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(tutorFrame, "Please enter valid numeric values.");
        }
    }
});
        
        //back button method
            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    navigationFrame.setVisible(true);
                    tutorFrame.setVisible(false);
            }
        });
        //clear button method
            clearButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent f) {
                int confirm = JOptionPane.showConfirmDialog(lecturerFrame, "Are you sure you want to clear all fields?", "Confirmation", JOptionPane.YES_NO_OPTION);
                 if (confirm == JOptionPane.YES_OPTION) {                      
                  idField.setText("");
                  nameField.setText("");
                  addressField.setText("");
                  workingTypeField.setText("");
                  employmentStatusField.setText("");
                  workingHoursField.setText(""); 
                  salaryField.setText("");
                  specializationField.setText("");
                  academicsField.setText("");
                  performanceIndexField.setText("");
                }
            }
        });
            removeButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(lecturerFrame, "Are you sure you want to remove the Tutor?", "Confirmation", JOptionPane.YES_NO_OPTION);
                 if (confirm == JOptionPane.YES_OPTION) {
                   try {
                    int id = Integer.parseInt(idField.getText());
                    Teacher teacherToRemove = null;
                    for (Object teacherObj : teachersList) {
                        Teacher teacher = (Teacher) teacherObj;
                        if (teacher.getTeacherID() == id && teacher instanceof Tutor) {
                            teacherToRemove = teacher;
                            break;
                        }
                    }
                    if (teacherToRemove != null) {
                        teachersList.remove(teacherToRemove);
                        JOptionPane.showMessageDialog(tutorFrame, "Tutor removed successfully!");
                    } else {
                        JOptionPane.showMessageDialog(tutorFrame, "Invalid Teacher ID or Teacher is not a Tutor.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(tutorFrame, "Please enter a valid values for ID.", "Error", JOptionPane.ERROR_MESSAGE);
                } 
            }
        }
        });
            // Add panel to the frame
            tutorFrame.add(panel1);
    
            tutorFrame.setVisible(false); // Set frame visible
    }
    
private void createNavigationFrame() {
        navigationFrame = new JFrame("Navigation Frame");
        navigationFrame.setSize(1920, 1080); // Increase the width
        navigationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        navigationFrame.setLayout(null);
        navigationFrame.setLocationRelativeTo(null);
        
        // Set background color
        Color backgroundColor = new Color(0xC7E4C5); // Create color object with the specified RGB value
        navigationFrame.getContentPane().setBackground(backgroundColor);
        
        JLabel headerLabel = new JLabel("Welcome to Teacher Management System");
        Font headerFont = new Font("Arial", Font.BOLD, 48);
        headerLabel.setFont(headerFont);
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setBounds(420, 200, 1000, 60);
        navigationFrame.add(headerLabel); // Add to the background label
            
        // Create a JPanel for the button area
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(450, 300, 900, 500); // Adjusted position and size
        buttonPanel.setBackground(Color.decode("#A2A49E"));
        buttonPanel.setLayout(null); // We'll use absolute positioning for buttons
    
        // Create buttons
        JButton lecturerButton = new JButton("Add Lecturer");
        JButton tutorButton = new JButton("Add Tutor");
        JButton about = new JButton("About");
    
        // Set positions and dimensions for buttons within the panel
        lecturerButton.setBounds(80, 80, 200, 70);
        tutorButton.setBounds(80, 200, 200, 70);
        about.setBounds(80, 320, 200, 70);
    
        // Add buttons to the panel
        buttonPanel.add(lecturerButton);
        buttonPanel.add(tutorButton); 
        buttonPanel.add(about);
        
        // Add panel to the frame
        navigationFrame.add(buttonPanel);
        
        // Load the image
         ImageIcon imageIcon = new ImageIcon("icon1.png");
            // Resize the image
        Image scaledImage = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Create a JLabel with the scaled image
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(600, 70, 300, 300); // Set the bounds to position and size the image
        buttonPanel.add(imageLabel);
    
        
        // Set button properties
        ButtonProperties(lecturerButton);
        ButtonProperties(tutorButton);
        ButtonProperties(about);
    
    
        // ActionListener for lecturerButton
        lecturerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lecturerFrame.setVisible(true);
                navigationFrame.setVisible(false);
            }
        });
        tutorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tutorFrame.setVisible(true);
                navigationFrame.setVisible(false);
            }
        });
        // Add action listener for the about button
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String aboutInfo = "Islington College Teacher Management System\n"
                                  + "Intuitive GUI that accepts user data for teachers\n"
                                  + "Stores the data and processes them according to the user\n"
                                  + "Developed by Siddhartha Singh";
            JOptionPane.showMessageDialog(navigationFrame, aboutInfo, "About", JOptionPane.INFORMATION_MESSAGE);
        }
    });
        navigationFrame.setVisible(true);
    }
        /*
         All the classes:
         Tutor Frame, 
         Lecturer Frame and the navigation frame are called by the main method
         */
        public static void main(String[] args) {
            new TeacherGUI();
        }
    }
