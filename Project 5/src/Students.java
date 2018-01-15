/* 
    **********************************
    ** Matthew Allen Krieger        **
    ** mattkrieger3@gmail.com       **
    ** CS 151 / Section: 01         **
    ** Project 05                   **
    **********************************
*/


import java.util.Scanner;
import java.io.*;

public class Students
{
    
    public static void main (String[] args) throws IOException
    {   
        //declarations & initializations
        String first_name, last_name;
        int grade, total=0, count=0;
        double average;
        Scanner fileInput = new Scanner(new File("students.txt"));
        
        // while statement to extract first_name, last_name, & grade from input (.txt file)
        while (fileInput.hasNext())
        {
            first_name = fileInput.next();
            last_name = fileInput.next();
            grade = fileInput.nextInt();
            
            //creates student object utilizing first_name, last_name, and grade
            Student st = new Student(first_name, last_name, grade);
            
            //prints 'st' object which prints each students first name, last name, grade, and grade category
            System.out.println(st);
           
        }
        
        //prints number of overall students & overall average
        System.out.println("There are " + Student.getCount() + " students with average grade " + Student.avg());
        
        //prints number of excellent students & their average
        System.out.println("There are " + Student.getExcellentCount() + " students with average grade " + Student.excellentAVG());
        
        //prints number of ok students & their average
        System.out.println("There are " + Student.getOKCount() + " students with average grade " + Student.okAVG());
        
        //prints number of failure students & their average
        System.out.println("There are " + Student.getFailureCount() + " students with average grade " + Student.failureAVG());
    }
}

