/* 
    **********************************
    ** Matthew Allen Krieger        **
    ** mattkrieger3@gmail.com       **
    ** CS 151 / Section: 01         **
    ** Project 06                   **
    **********************************
*/

import java.util.*;
import java.io.*;
//import statement

public class Main 
{ //main class delimiter


    public static void main (String[] args) throws IOException //main method delimiter
    {   //main class delimiter
        int i = 0; //declaration statements
        Student[] arrStudents = new Student[100]; //declares arrStudents object

        Scanner fileInput = new Scanner(new File("students.txt")); //gets input from .txt file

        //loads array with input from .txt file
        while (fileInput.hasNext()) 
        {             
            String firstName = fileInput.next();
            String lastName = fileInput.next();
            int grade = fileInput.nextInt();

            arrStudents[i] = new Student(firstName, lastName, grade);
            i++;
        }  


    Student.getExcellentStudents(arrStudents, i); //call method and pass array & integer
    Student.getOKStudents(arrStudents, i); //call method and pass array & integer
    Student.getFailStudents(arrStudents, i); //call method and pass array & integer
    System.out.println(); 
    System.out.println("Total Number of Students: " + i); //Prints number of students
    Student.getAverageGrade(arrStudents, i); //call method and pass array & integer
    Student.getHighestLowestGrade(arrStudents, i); //call method and pass array & integer


} //main method delimiter
}//main class delimiter


