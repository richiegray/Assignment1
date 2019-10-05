
package assignment1;

// the scanner lets you get input from the user
import java.util.Scanner;
// this is imorted to limit the number of decimal places displayed
import java.text.DecimalFormat;
public class Assignment1 {

    
    public static void main(String[] args) {
        
        System.out.println("***************************************************************");
        System.out.println("* This is a program to conver degrees in Celsius -> Farenheit *");
        System.out.println("***************************************************************");
        //we are calling the use of the scanner and naming it input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Celsius to be converted into Farenheit: ");
        //first we ask the user what degree in C they want converted
        //we use double so they can use decimal points and make it equal the users input
        double celsius = input.nextDouble();
        
       //this is the math formula for converting C to F
        double F = celsius * 1.8 + 32;
        
        //F = Math.round(F*100)/100; this is another way to round the decimal places
        System.out.println("You entered: " + celsius + " degrees C");
        System.out.print("This converts to ");
        //buy using the decimal format we just display to 4 places the back end saves all the data
        //if we want two places just change the (0.0000") to (0.00")
        System.out.println((new DecimalFormat("0.0000").format(F))+ " degrees F");
        
    }
    
    
}
