//Question 3
//creating the sub-class Tutor
class Tutor extends Teacher
{
    //creating attributes
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    //adding constructors
    //constructor 
    public Tutor(int teacherID, String teacherName, String address, String workingType, String employmentStatus, int workHours, double salary, String specialization,String academicQualifications, int performanceIndex)
    {
        //calling the attributes from the super class (Teacher)
        super(teacherID, teacherName, address, workingType, employmentStatus);
        //calling the setter method for workHours
        super.setWorkHours(workHours);
        //referring to the instance variables of the class Tutor
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }
    //making accessor methods for all attributes in Tutor
    public double getSalary()
    {
        return this.salary;
    }
    public String getSpecialization()
    {
        return this.specialization;
    }
    public String getAcademicQualifications()
    {
        return this.academicQualifications;
    }
    public int getPerformanceIndex()
    {
        return this.performanceIndex;
    }
    //To set salary according to certification
    public void setSalary (double salary, int performanceIndex)
    {
        if (performanceIndex >=5 & getWorkHours() > 20) {
            if (performanceIndex >=5 && performanceIndex <=7)
            {
                this.salary = salary + 0.05 * salary; //using "this.salary" here refers to the instance variable
            }
            else if (performanceIndex >=8 && performanceIndex <=9) //if the performanceIndex is between 8 and 9
            {
                this.salary = salary + 0.10 * salary;
            }
            else  //for performanceIndex above 9
            {
                this.salary = salary + 0.2 * salary;
            }
            this.isCertified = true;
            }
        else {
            System.out.println("Teacher is not certified for appraisal");
            }
        }
    //Method to remove the tutor if the isCertified returns false
    public void removeTutor()
    {
        /*checking if the teacher isCertified
         The program will get false for isCertified even if the teacher meets the conditions for 
         certification if this method is run before Salary
         */
        if (!isCertified) //! inverts the boolean data
        {
            System.out.println("Tutor is not certified; all the attributes will be removed.");
            this.salary = 0;
            this.specialization = "";
            this.academicQualifications = "";
            this.performanceIndex = 0;
        }
        else 
        {
            System.out.println("The tutor is certified");
        }
    }
    //Method that displays the informations of Tutor
    @Override//Specifying the compiler that this method overrides the method of the superclass
    public void Display() {
        if (!isCertified) {
            System.out.println("Tutor not certified yet. Displaying details from the Teacher class.");
            super.Display();
        } else {
            super.Display();
            System.out.println("Tutor's Salary: " + salary);
            System.out.println("Tutor's Specialization: " + specialization);
            System.out.println("Tutor's Academic Qualification: " + academicQualifications);
            System.out.println("Tutor's Performance Index: " + performanceIndex);
            
        }
    }
}

