//Question 1
class Teacher 
{
    private int teacherID;
    private String teacherName;
    private String address;
    private String workType;
    private String employmentStatus;
    private int workHours;
    //mentioning the five constructors
    public Teacher(int teacherID, String teacherName, String address, String workType, String employmentStatus){
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.address = address;
        this.workType = workType;
        this.employmentStatus = employmentStatus;
    }
    //assigning all the attributes with their specific accessor method
    public int getTeacherID() 
    {
        return this.teacherID;
    }
    public String getTeacherName() 
    {
        return this.teacherName;
    }
    public String getAddress() 
    {
        return this.address;
    }
    public String getWorkType()
    {
        return this.workType;
    }
    public String getEmploymentStatus()
    {
        return this.employmentStatus;
    }
    public int getWorkHours() 
    {
        return this.workHours;
    }
    //creating a setter method for the work hours 
    public void setWorkHours(int workHours)
    {
        this.workHours = workHours;
    }
    //using method to display the attributes
    public void Display() 
    { 
        System.out.println("Teacher's ID: " + teacherID);
        System.out.println("Teacher's Name: " + teacherName);
        System.out.println("Teacher's Address: " + address);
        System.out.println("Teacher's workType: " + workType);
        System.out.println("Teacher's Employment Status: " + employmentStatus);
        
        if (workHours > 0) 
        {
            System.out.println("Teacher's working hours is: " + workHours);
        }
        else {
            System.out.println("Teacher's working hours is: not assigned");
        }
    }
}

 