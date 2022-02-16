package base;
import java.util.Scanner;
public class Main
{
    /**
     * # Lab Four
     * ---
     * <p>
     * For this lab we're going to be making and using a bunch of functions.
     * <p>
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    public static void main(String[] args)
    {
        // Give me an example of you using switch case.
        Scanner sc = new Scanner(System.in);

        System.out.println("what is your favorite month (number form): ");
        int month = sc.nextInt();
        String monthString;
        switch (month)
        {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "Febuary";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid number";
        }
        System.out.println("Your favorite month is " + monthString);
        sc.close();
        
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("...");
        }    

// Give me an example of you using a for loop 
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("This is software development #" + i);
        }
        // Give me an example of you using a while loop
        int i= 0;
        while (i < 15)
        {
            System.out.println("This is " + i + "My Name is Hodo Duale!");
            i++;
        }
    
    }
}    
    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */
    
    
        System.out.println("Choose a number from the list to count: ");
        Scanner sc = new Scanner(System.in);
        String[] array1 = {"2", "3", "5", "2", "3", "6", "7", "8", "2"};
        sc.close();
        
    
        

    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */

    int Summation =  
    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */


  
