public class demoClass
{
    private String CGPA;
    
    int roll;
    String name;
    String dept;
    
    public demoClass()
    {
        roll = 38;          // initializing values.
        name = "Jibon";
        dept = "CSE";
    }
    
    public void setCGPA(String cgpa)
    {
        this.CGPA = cgpa;
    }
    
    public String getCGPA()
    {
        return CGPA;
    }
    
    public static void main(String[] args) 
    {
        demoClass student1 = new demoClass();   // calls the instructor
        
        System.out.println("Student Roll: " + student1.roll);
        System.out.println("Student Name: " + student1.name);
        System.out.println("Student Dept: " + student1.dept + "\n");
        
        student1.setCGPA("3.7");
        
        System.out.println("Student CGPA: "+ student1.getCGPA() + "\n");
    }
}
