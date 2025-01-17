import java.util.Scanner;

public class CreativityXIX { 

    public static void main(String[] args) {
        /* Write a Java program that can take a positive integer greater than 2 as input 
        * and write out the number of times one must repeatedly divide this number by 2 
        * before getting a value less than 2.
        */
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter positive integer greater than 2");
        int myInteger = myScanner.nextInt();

        if (myInteger > 2) {
            // integer is positive 
            int numberOfTimes = myInteger/2 - 1; // subtract 1 from the final answer


            System.out.println("\n "+numberOfTimes + "\t times");
        }
        
    }
    
}