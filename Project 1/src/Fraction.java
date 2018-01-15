/* 
    **********************************
    ** Matthew Krieger              **
    ** mattkrieger3@gmail.com       **
    ** CS 151 / Section: 01         **
    ** Project 01                   **
    **********************************
*/

import java.util.Scanner;

class Fraction  
{
    public static void main (String[] args) {    
        int number1, denominator1, number2, denominator2, int1, int2, int3, int4, remainder1, remainder2, remainder3, remainder4;  /** declaring integer variables */
        Scanner scan = new Scanner(System.in);  /**Instantiate a Scanner object*/
        int resultnum, resultnum1, resultnum2, resultnum3, resultden, resultden1, resultden2, resultden3;  /** Declaring integer variables of fraction equations*/

        /**Reads or scans user input fraction (integer / interger)*/
        System.out.print("Enter a fraction (integer / integer):");     
        number1 = scan.nextInt();
        scan.next("/");
        denominator1 = scan.nextInt();

        /**Reads or scans user input fraction (integer / interger)*/
        System.out.print("Enter another fraction (integer / integer): "); 
        number2 = scan.nextInt();
        scan.next("/");
        denominator2 = scan.nextInt();


        System.out.println("Result as fraction and mixed number");
        resultnum = number1*denominator2 + number2*denominator1; /** addition */
        resultnum1 = number1*denominator2 - number2*denominator1; /** subtraction */
        resultnum2 = number1*number2; /** multiplication */
        resultnum3 = number1*denominator2; /** division */
        resultden = denominator1*denominator2;  /** numerator of (+,-,*) */
        resultden1 = denominator1*number2; /** numerator of division */

        /** Compute the Quotient (the whole number) by Integer Division */
        int1 = resultnum / resultden; 
        int2 = resultnum1 / resultden;
        int3 = resultnum2 / resultden;
        int4 = resultnum3 / resultden1;
        
        /** Compute the Remainder (the numerator of the proper fraction) */
        remainder1 = resultnum % resultden; 
        remainder2 = resultnum1 % resultden;
        remainder3 = resultnum2 % resultden;
        remainder4 = resultnum3 % resultden;
        
        /** Displays Fractional Results */
        System.out.println(number1 + "/" + denominator1 + " + " + number2 + "/" + denominator2 + " = " + resultnum + "/" + resultden + " = " + int1 + " " + remainder1 + "/" + resultden);
        System.out.println(number1 + "/" + denominator1 + " - " + number2 + "/" + denominator2 + " = " + resultnum1 + "/" + resultden + " = " + int2 + " " + remainder2 + "/" + resultden);
        System.out.println(number1 + "/" + denominator1 + " * " + number2 + "/" + denominator2 + " = " + resultnum2 + "/" + resultden + " = " + int3 + " " + remainder3 + "/" + resultden);
        System.out.println(number1 + "/" + denominator1 + " / " + number2 + "/" + denominator2 + " = " + resultnum3 + "/" + resultden1 + " = " + int4 + " " + remainder4 + "/" + resultden1);

        /** Compute the decimal (floating point) value of fractions */
        System.out.println("Result as floating point number");
        float sum, difference, product, remainder, input1, input2 ; /** Declaring float variables */
        input1 = number1/(float)denominator1; /** user input fraction in decimal */
        input2 = number2/(float)denominator2;
        sum = number1/(float)denominator1 + number2/(float)denominator2;   /** sum of two user inputs in decimal */
        difference = number1/(float)denominator1 - number2/(float)denominator2; /** difference of two user inputs in decimal */
        product = number1/(float)denominator1 * number2/(float)denominator2;   /** product of two user inputs in decimal */
        remainder = number1/(float)denominator1 / number2*denominator2;        /** quotient of two user inputs in decimal */
        
        /** Displays Decimal Results */
        System.out.println(input1 + " " + "+" + " " + input2 + " " + "=" + " " + sum);
        System.out.println(input1 + " " + "-" + " " + input2 + " " + "=" + " " + difference);
        System.out.println(input1 + " " + "*" + " " + input2 + " " + "=" + " " + product);
        System.out.println(input1 + " " + "/" + " " + input2 + " " + "=" + " " + remainder);
    }
}
