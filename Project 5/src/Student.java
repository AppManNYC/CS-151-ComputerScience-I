/* 
    **********************************
    ** Matthew Allen Krieger        **
    ** mattkrieger3@gmail.com       **
    ** CS 151 / Section: 01         **
    ** Project 05                   **
    **********************************
*/


public class Student
{
    //declarations & initializations
    private String fname, lname;
    private int grade;
    private static int total=0, count=0, excellentCount=0, okCount=0, failureCount=0, excellentTotal=0, okTotal=0, failureTotal=0;
    
    //Receives 3 parameters passed from Students class
    public Student(String fname, String lname, int grade)
    {
        this.fname = fname;
        this.lname = lname;
        this.grade = grade;
         total = total + grade; //calculates sum of all grades & assigns to total variable
            count++; //calculates sum of all students & assigns to count variable
    }
    
    //get method to return count
    public static int getCount()
    {
        return count; 
        
    }
    
    //get method to return sum of excellent students
    public static int getExcellentCount()
    {
        return excellentCount;
    }
    
    //get method to return sum of ok students
    public static int getOKCount()
    {
        return okCount;
    }
    
    //get method to return sum of failure students
    public static int getFailureCount()
    {
        return failureCount;
    }
    
    //method that return average grade of all students
    public static double avg()
    {
        return (double)total/count;
    }
    
    //method to return average grade of 'excellent' students
    public static double excellentAVG()
    {
        return (double)excellentTotal/excellentCount;
    }
    
    //method to return average grade of 'ok' students
    public static double okAVG()
    {
        return (double)okTotal/okCount;
    }
    
    //method to return average grade of 'failure' students
    public static double failureAVG()
    {
        return (double)failureTotal/failureCount;
    }
    
    //mathod to categorize grades & assign totals & counts to each category
    private String readableGrade(int grade) 
    {
        //if statement to categorize, count, & total grades
        if (grade > 89) 
        {
            excellentTotal = excellentTotal + grade;
            excellentCount++;
            return "Excellent!";
            
        }
        
        else if (grade > 59)
        {
            okTotal = okTotal + grade;
            okCount++;
            return "OK";
        }
        
        else if (grade > 0)
        {
            failureTotal = failureTotal + grade;
            failureCount++;
            return "Failure";
        }
        
        else
        {
            return "Impossible";
        }
    }
    
    //to string method to return fname, lname, and grade category
    public String toString()
    {
        return fname + " " + lname + "\t" + grade + "\t" + readableGrade(grade);
    }
}

