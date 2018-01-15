/* 
    **********************************
    ** Matthew Allen Krieger        **
    ** mattkrieger3@gmail.com       **
    ** CS 151 / Section: 01         **
    ** Project 06                   **
    **********************************
*/

public class Student 
{
    //declaration statements
    private String firstName, lastName;
    private int grade;
    
    //student constructor
    public Student (String firstName, String lastName, int grade) //three variables passed
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public int getGrade() //getGrade method
    {
        return grade; //returns integer variable grade
    }

    //method to classify students with "ok" grades
    public static void getOKStudents(Student[] arrStudents, int num)
    {               
        System.out.println("OK Students: ");
        for(int i = 0; i < num; i++) //for loop to allow each array element to be analyzed
        {
            int grade = arrStudents[i].getGrade(); //extracts grade from  array element

            if (grade > 59 && grade < 90)  //if statement to analyze array element to see if it falls into range for "OK"
            {
                System.out.println(arrStudents[i]); //prints students whose grades fit "OK" category
            }
        }
        System.out.println();
    }
    
    //method to print students with highest & lowest grades
    public static void getHighestLowestGrade(Student[] arrStudents, int num)
    {   
        int highest = 0;
        int lowest = 100;
        Student high = arrStudents[0];
        Student low = arrStudents[0];
        //declaration statements

        //for statement to calculate highest & lowest grades
        for (int index = 0; index < num; index++)
        {   
            if (arrStudents[index].getGrade() > highest)
            {
            highest = arrStudents[index].getGrade();
            high = arrStudents[index];
            }
            else if (arrStudents[index].getGrade() < lowest)
            {
                lowest = arrStudents[index].getGrade();
                low = arrStudents[index];
            }
        }
        System.out.println("Student with the highest grade: " + high);//prints student with highest grade
        System.out.println("Student with the lowest grade: " + low); //prints student with lowest grade

    }

    public static void getExcellentStudents(Student[] arrStudents, int num)
    {               
        System.out.println("Excellent Students: ");
        for(int i = 0; i < num; i++) //for loop to allow each array element to be analyzed
        {
            int grade = arrStudents[i].getGrade();//extracts grade from  array element

            if (grade > 89) //if statement to analyze array element to see if it falls into range for "Excellent"
            {                    
                System.out.println(arrStudents[i].toString());//prints students whose grades fit "Excellent" category
            }
        }
        System.out.println();
    }


    public static void getFailStudents(Student[] arrStudents, int num)
    {     
        System.out.println("Failure Students: ");
        for(int i = 0; i < num; i++) //for loop to allow each array element to be analyzed
        {
            int grade = arrStudents[i].getGrade();//extracts grade from  array element

            if (grade < 60) //if statement to analyze array element to see if it falls into range for "Fail"
            {
                System.out.println(arrStudents[i]);//prints students whose grades fit "Fail" category
            }
        }
        System.out.println();
    }

    public static void getAverageGrade(Student[] arrStudents, int num)
    {
        int totalGrade = 0; double averageGrade = 0;
        for(int i = 0; i < num; i++) //for loop to allow each array element to be analyzed
        {
            int grade = arrStudents[i].getGrade();//extracts grade from  array element
            totalGrade = totalGrade + grade; //adds student grade to sum of all grades (totalGrade)
        }
        averageGrade = totalGrade/num; //divides sum of all grades by number of students and assigns to variable
        System.out.println("Average grade: " + averageGrade); //Prints average grade
    }
        
    
    //to-string method
    public String toString()
    {
        return firstName + " " + lastName + " " + grade;
    }


}
