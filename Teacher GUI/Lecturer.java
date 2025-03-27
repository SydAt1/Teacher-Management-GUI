//Question 2
//Creating Lecturer class, a subclass of Teacher
class Lecturer extends Teacher
{
    private String Department;
    private int YearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    //adding constructors
    public Lecturer(int teacherID, String teacherName, String address, String workingType, String employmentStatus, int workHours, String department, int YearsOfExperience)
    {
        super(teacherID, teacherName, address, workingType, employmentStatus); //calling the superclass constructor from the five parameters in class Teacher
        // Call superclass setter method to set working hours
        super.setWorkHours(workHours);
        //instances of the attributes of the Lecturer subclass
        this.Department = department;
        this.YearsOfExperience = YearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
    }
    //accessor method to get instance variable of Department
    public String getDepartment(){
        return this.Department;
    }
    //accessor method to get instance variable of YearsOfExperience
    public int getYearsOfExperience(){
        return this.YearsOfExperience;
    }
    //creating mutator method for gradedScore
    public void setGradedScore(int gradedScore){
         this.gradedScore = gradedScore;
        }
    //Method to grade the assignments
    public void gradeAssignment(int gradedScore, String Department, int YearsOfExperience) 
    {
         // the teacher grades the assignment only if the assignment is not already graded and the teacher has 5 years or more experience
        if (!hasGraded && YearsOfExperience >= 5 && this.Department.equals(Department)) {
            if (gradedScore >= 70) {
                System.out.println("Grade A"); 
            } 
            else if (gradedScore >= 60) {
                System.out.println("Grade B");
            } 
            else if (gradedScore >= 50) {
                System.out.println("Grade C");
            } 
            else if (gradedScore >= 40) {
                System.out.println("Grade D");
            } 
            else {
                System.out.println("Grade E"); // Assign E for less than 40
            }
            hasGraded = true;
            System.out.println("Assignment Graded Successfully!");
        } else {
            System.out.println("Assignment cannot be graded. Either already graded or conditions not met.");
        }
    }
        //creating a display method to display the information of the lecturer class
        @Override //Specifying the compiler that this method overrides the method of the superclass
        public void Display()
        {
            //calling the superclass(Teacher) in the display method
            super.Display();
            
            //Display Department, and Years of Experience for the lecturer class
            System.out.println("Department: " + Department);
            System.out.println("Years of Experience: " + YearsOfExperience);      
            
            //If the score is graded display the gradedScore and if not graded print a message
            if (hasGraded) 
            {
                System.out.println("Graded Score : " + gradedScore);
            }
            else {
                System.out.println("NOT GRADED YET");
            }
        }
}
    

