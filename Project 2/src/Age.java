/* 
    **********************************
    ** Matthew Krieger              **
    ** mattkrieger3@gmail.com       **
    ** CS 151 / Section: 01         **
    ** Project 02                   **
    **********************************
*/

import java.util.Scanner;
public class Age{
    /** class body */
    public static void main (String[] args) /** method header */
    {
        String mob, yob;
        Scanner scan = new Scanner(System.in); /**Instantiate a Scanner object*/
        String record = "", firstName, lastName; /**declaring string record */
        int  months, years, monthsLived; /** declaring integer variables */
        final int CurrentMonth = 1;  /** declaring integer that should not be changed*/
        final int CurrentYear = 2018; /** declaring integer that should not be changed*/
        Type type = new Type();  /** declaring new object*/

        System.out.print("Please enter your first name, last name seperated by blank: ");  /** prompts user to enter first and last name seperated by space):" */ 
        firstName = scan.next();  /**Reads or scans user input first name */
        lastName = scan.next();   /**Reads or scans user input last name */

        System.out.print("Enter Month of Birth: "); /** prompts user to enter month of birth */

        mob = scan.next();  /**Reads or scans user input integer(month of birth) */
        if (type.isInteger(mob) && Integer.parseInt(mob)> 0 && Integer.parseInt(mob) < 13) 
        {
            /** If user input integer is bigger than 0 and less than 13, system will print and prompts user to enter year of Birth */
            System.out.print("Enter Year of Birth: ");
            yob = scan.next(); /**Reads or scans user input integer(year of birth) */
            if (type.isInteger(yob) && Integer.parseInt(yob)> 0 && Integer.parseInt(yob) < 2017) /** If user input integer is bigger than 1899 and less than 2017, system will calculate how old the user are */
            {
                monthsLived = CurrentMonth + CurrentYear * 12 - Integer.parseInt(mob) - Integer.parseInt(yob) * 12;
                months = monthsLived % 12;  /** Remainder from integer division( how old in months) */
                years = monthsLived / 12;   /** Integer division of user age(how old in years) */   
                if (years>65) /** If user age(years) is bigger than 65, system will print the "name of user, you are x years and x month old, You are a senior */
                {
                    System.out.println(firstName + " " + lastName + "," + "You are " + years + " years and " + months +" months old" + ","  + "You are a senior");
                }
                if (years<66 && years>17) /** If user age(years) is less than 66 and bigger than 17, system will print the "name of user, you are x years and x month old, You are an adult */
                {
                    System.out.println(firstName + " " + lastName + "," + "You are " + years + " years and " + months +" months old" + ","  + "You are an adult");
                }
                if (years<18) /** If user age(years) is less than 18, system will print the "name of user, you are x years and x month old, You are a kid */
                {
                    System.out.println(firstName + " " + lastName + "," + "You are " + years + " years and " + months +" months old" + ","  + "You are a legally NOT an adult");

                }
                if (Integer.parseInt(mob) == CurrentMonth)
                {
                    System.out.println(firstName + " " + lastName + ", " + "Happy birthday!");
                }
            }   
            else  /** If user input integer is NOT bigger than 1899 and less than 2017, system will print "Wrong year of Birth" and stop */
                System.out.println("Wrong year of Birth"); 

        }
        else
        /** If user input integer is NOT bigger than 0 and less than 13, system will print "Wrong Month of Birthday" and stop */
        {
            System.out.println("Wrong Month of Birthday");
        }

        /** end of class body */
    }

}