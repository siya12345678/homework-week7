package homeworkweek7;
/*
Write a Java program to test if an array contains a specific value.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Programme20 {
         static int number_input;
        //static method
        static void test(){

            Integer[] Array_numbers = {1, 2, 3, 4, 6, 5, 7, 8};
             {

                 if (Arrays.asList(Array_numbers).contains(number_input)) {
                    System.out.println("is a Specific Value");//print statement
                } else {
                    System.out.println("Not in the array!");//print statement


                }
            }
        }
        //main method
        public static void main (String[]args){
           Scanner scanner = new Scanner(System.in);//scanner class
            System.out.println("Enter a Specific number:");//print statement
            number_input = scanner.nextInt();
            scanner.close();//scanner close
            Programme20.test();

        }

    }

