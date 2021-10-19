package homeworkweek7;

import java.util.Scanner;
/*
Write a java program to input any number and find out if it’s odd or even
 */

public class Programme6 {
    public static void main(String[] args) {

        //Create an object of scanner class
            Scanner input = new Scanner(System.in);
            int num;  //Declare a variable
            System.out.println("Enter a number:");
            num = input.nextInt();
            input.close();//scanner close

            if ( num % 2 == 0 ) //if any number divided by 2 is even number
                System.out.println("The entered number is even");
            else // else odd number
                System.out.println("The entered number is odd");
        }
    }

