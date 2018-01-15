/* 
    **********************************
    ** Matthew Allen Krieger        **
    ** mattkrieger3@gmail.com       **
    ** CS 151 / Section: 01         **
    ** Project 04                   **
    **********************************
*/


public class Project04
{
    public static void main(String[] args) //main method 
    {
        
        Die die = new Die(); //Create a  Die object 
        
        //Create a  Rational number object 
        Rational fractionOne = new Rational(die.roll(), die.roll());
        
        //Create a  Rational number object 
        Rational fractionTwo = new Rational(die.roll(), die.roll());
        
        //Create a  Rational number object 
        Rational fractionThree = new Rational(die.roll(), die.roll());
        
        System.out.println("Fraction Unreduced Rational Number (Floating point format)"); //Print label       
        
        //Print the first random rational number and  floating point equivalent
        System.out.println("       One: " + fractionOne + " (" + fractionOne.toFloat() + ")");
        
        //Print the second random rational number and  floating point equivalent
        System.out.println("       Two: " + fractionTwo + " (" + fractionTwo.toFloat() + ")");
        
        //Print the third random rational number and floating point equivalent
        System.out.println("     Three: " + fractionThree  + " (" + fractionThree.toFloat() + ")");
        System.out.println(); //blank line
        
        //Calculate the largest rational number
        Rational maximumFraction = fractionOne.findMax(fractionTwo.findMax(fractionThree));
        
        //Print the largest rational number & float equivalent
        System.out.println("       The maximum value is: " + maximumFraction + " (" + maximumFraction.toFloat() + ")");
        
        //Calculate the smallest rational number
        Rational minimumFraction = fractionOne.findMin(fractionTwo.findMin(fractionThree));
        
        //Print the smallest rational number & float equivalent
        System.out.println("       The minimum value is: " + minimumFraction + " (" + minimumFraction.toFloat() + ")");
        
        //Calculate the sum of the rational numbers
        Rational sumOfFractions = fractionOne.sum(fractionTwo.sum(fractionThree));
        
        //Reduce the calculated sum of the rational numbers 
        sumOfFractions.reduce();
        
        //Print the reduced form of the sum and its floating point equivalent
        System.out.println("    The sum of all three is: " + sumOfFractions + " (" + sumOfFractions.toFloat() + ")");
        
        //Create a Rational number object to hold the value (3/1)
        Rational averageOfFractions = new Rational(3, 1);
        
        //Calculate the average of the rational numbers by dividing their sum by 3
        averageOfFractions = sumOfFractions.quotient(averageOfFractions);
        
        //Reduce the calculated average 
        averageOfFractions.reduce();
        
        //Print the reduced form of the average and its floating point equivalent
        System.out.println("The average of all three is: " + averageOfFractions + " (" + averageOfFractions.toFloat() + ")");
    }
}
