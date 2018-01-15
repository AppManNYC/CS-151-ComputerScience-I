/* 
    **********************************
    ** Matthew Allen Krieger        **
    ** mattkrieger3@gmail.com       **
    ** CS 151 / Section: 01         **
    ** Project 04                   **
    **********************************
*/

//Class definition - Represents and manipulates rational numbers
class Rational
{
    private int numerator; //Declare the integer variable to contain this rational number's numerator
    private int denominator; //Declare the integer variable to contain this rational number's denominator
    
    //Rational number object constructor
    public Rational(int a, int b)
    {
        numerator = a; //Assigns the first specified parameter as this rational number's numerator
        denominator = b; //Assigns the second specified parameter as this rational number's denominator
    }
    
    //Reduce this rational number to its lowest terms
    public void reduce()
    {
        //Given this rational number's numerator and denominator, assign their common divisor, returned by the "gcd" method, to "divisor"
        int divisor = gcd(numerator, denominator);
        
        //Calculate the reduced form of the numerator by dividing the existing numerator by the common divisor
        numerator = numerator / divisor;
        
        //Calculate the reduced form of the denominator by dividing the existing denominator by the common divisor
        denominator = denominator / divisor;
    }
    
    //Calculate and return the greatest divisor common to the two given integer parameters
    private int gcd(int commonDivisor, int testDivisor)
    {
        //Declare the integer variable which will hold the calculated remainder of each division
        int newRemainder;
        
        //Begin a while loop to calculate the greatest common divisor
        while (testDivisor > 0) //Continue the loop until the next divisor to be tested is less than or equal to 0
        {
            //Calculate the remainder resulting from dividing the first divisor by the second
            newRemainder = commonDivisor % testDivisor;
            
            //Overwrite the first divisor with the second divisor
            commonDivisor = testDivisor;
            
            //Assign the calculated remainder as the next divisor to be tested
            testDivisor = newRemainder;
        }
        
        //Having calculated the greatest common divisor, return that value
        return commonDivisor;
    }
    
    //Calculate and return the sum of this rational number and the specified rational number object parameter
    public Rational sum(Rational givenRational)
    {
        //Declare integer variables to hold the numerator and denominator of the calculated sum
        int sumNumerator, sumDenominator;
        
        //Calculate the denominator of the sum -> (a/b) + (c/d) = (a*d + c*b)/(b*d)
        sumDenominator = denominator * givenRational.getDenominator(); //(b*d)
        
        //Calculate the numerator of the sum -> (a/b) + (c/d) = (a*d + c*b)/(b*d)
        sumNumerator = numerator * givenRational.getDenominator() + givenRational.getNumerator() * denominator; //(a*d) + (c*b)
        
        //Return the calculated sum as a new rational number object
        return new Rational(sumNumerator, sumDenominator);
    }
    
    //Calculate and return the quotient of this rational number and the specified rational number object parameter
    public Rational quotient(Rational givenRational)
    {
        //Declare integer variables to hold the numerator and denominator of the calculated quotient
        int quotientNumerator, quotientDenominator;
        
        //Calculate the numerator of the quotient -> (a/b) / (c/d) = (a*d)/(b*c)
        quotientNumerator = numerator * givenRational.getDenominator(); //(a*d)
        
        //Calculate the denominator of the quotient -> (a/b) / (c/d) = (a*d)/(b*c)
        quotientDenominator = denominator * givenRational.getNumerator(); //(b*c)
        
        //Return the calculated quotient as a new rational number object
        return new Rational(quotientNumerator, quotientDenominator);
    }
    
    //Determine which of the two specified rational numbers has the greatest value
    public Rational findMax(Rational givenRational)
    {
        //With common denominators, if this rational number's numerator is greater than or equal to the given rational number's...
        if ((numerator * givenRational.getDenominator()) >= (givenRational.getNumerator() * denominator))
        {
            //Return this rational number
            return this;
        }
        else
        {
            //Otherwise, return the given rational number
            return givenRational;
        }
    }
    
    //Determine which of the two specified rational numbers has the least value
    public Rational findMin(Rational givenRational)
    {
        //With common denominators, if this rational number's numerator is less than or equal to the given rational number's...
        if ((numerator * givenRational.getDenominator()) <= (givenRational.getNumerator() * denominator))
        {
            //Return this rational number
            return this;
        }
        else
        {
            //Otherwise, return the given rational number
            return givenRational;
        }
    }
    
    //Accesses this rational number's numerator
    public int getNumerator()
    {
        return numerator;
    }
    
    //Accesses this rational number's denominator
    public int getDenominator()
    {
        return denominator;
    }
    
    //Mutates the value of this rational number from a fraction (a/b) to a single decimal value and returns that decimal value
    public float toFloat()
    {
        return (float) numerator / denominator;
    }
    
    //Accesses this rational number's numerator and denominator and returns them as a string literal (a/b)
    public String toString()
    {
        return numerator + "/" + denominator;
    }
}
