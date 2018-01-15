/* 
    **********************************
    ** Matthew Allen Krieger        **
    ** mattkrieger3@gmail.com       **
    ** CS 151 / Section: 01         **
    ** Project 04                   **
    **********************************
*/


public class Die
{
   private final int MAX = 6;  // maximum face value

   private int faceValue;  // current value showing on the die


   //  Constructor: Sets the initial face value.

   public Die()
   {
      faceValue = 1; //Initializes the face value to "1"
   }


   //  Rolls the die & returns the result.
 
   public int roll()
   {
      faceValue = (int)(Math.random() * MAX) + 1; //Set the face value of the die to a random integer in [1,6]

      return faceValue; //Return face value
   }


   //  Face value mutator.

   public void setFaceValue (int value)
   {
      faceValue = value; //Mutates  face value into integer parameter
   }

 
   //  Face value accessor.
   public int getFaceValue()
   {
      return faceValue; //Returns  face value
   }


   //  Returns a string representation
   public String toString()
   {
      String result = Integer.toString(faceValue); //Converts the face value integer into a string 

      return result; //Returns string 
   }
}
