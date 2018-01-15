/* 
    **********************************
    ** Matthew Krieger              **
    ** mattkrieger3@gmail.com       **
    ** CS 151 / Section: 01         **
    ** Project 03                   **
    **********************************
*/

import java.util.Scanner;
public class ConditionV2    /** class header */
{
    /** class body */
    public static void main (String[] args) /** method header */
    {
        int acount, pcount, dcount, p, n, f, fsum; /** declare variable */
        Scanner scan = new Scanner(System.in); /** initiate scanner */
        System.out.print("Enter either limit, abundant, deficient, perfect, or prime = value:");
        String condition = scan.next(); /** scans condition as string  */
        scan.next("="); /** scans input as condition = value */
        String value = scan.next(); /** scans integer value */
        dcount=0; /** set default value */
        acount=0;
        pcount=0;
        p=0;        

        if ((condition.equals("limit")) || (condition.equals("abundant")) || (condition.equals("deficient")) || (condition.equals("perfect")) || (condition.equals("prime"))) /** check and verifies condition */
        {
            if (Type.isInteger(value) && Integer.parseInt(value)>0)  /** checks for integer and range, int must be possitive */
            {

                System.out.println("N" + "   " + "Abundant" + " " + "Deficient" + " " + "Perfect" + " " + "Prime"); /** prints out list of different number type name s*/

                for (n=1; n>0; n++) /** infinite loop */

                {
                    fsum=0; /** factors sum =0 */

                    for (f = 1; f<= n/2; f++) /** inner loop, start of each loop */
                    if (n % f == 0) 
                        fsum = fsum + f;     /** += */
                    if ((condition.equals("limit") && n > Integer.parseInt(value)) || (condition.equals("abundant") && acount == Integer.parseInt(value)) || (condition.equals("deficient") && dcount == Integer.parseInt(value)) || (condition.equals("perfect") && pcount == Integer.parseInt(value)) || (condition.equals("prime") && p == Integer.parseInt(value)))                                             
                        break; /** break out of statement */
                    if (fsum>n)
                        acount++; /** abundant */
                    if (fsum<n)    
                        dcount++; /** dificient */
                    if(fsum==n)  
                        pcount++; /** perfect */
                    if (fsum==1)
                        p++; /** prime */
                    System.out.println(n + "   " + acount + "          " + dcount + "        " + pcount + "        " + p);    /** prints out the calculated numbers  */

                }

            }
            else
            {
                System.out.print("Not a valid range");
            }
        }
        else
        {
            System.out.print("Not a valid condition");
        }
    }    /** End of body */
}