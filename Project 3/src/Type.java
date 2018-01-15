/* 
    **********************************
    ** Matthew Krieger              **
    ** mattkrieger3@gmail.com       **
    ** CS 151 / Section: 01         **
    ** Project 03                   **
    **********************************
*/

public class Type
{

  public static boolean isInteger(String s)
  {  
    try
    {
        Integer.parseInt(s);  
        return true;  
    }  
    catch(NumberFormatException e)  
    {  
        return false;  
    }  
  }
  
  public static boolean isDouble(String s)
  {  
    try
    {
        Double.parseDouble(s);  
        return true;  
    }  
    catch(NumberFormatException e)  
    {  
        return false;  
    }  
  }
  
}