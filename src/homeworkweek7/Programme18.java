package homeworkweek7;
/*
Write a Java program to sum values of an array.
 */

import java.util.Scanner;

public class Programme18 {
    //manual input of values in array
    public static void main(String[] args) {
        int array[] = {4,5,9,8,6,5,2,1,9,2};
        int sum = 0;
        // arrays in loop to add values in variable sum
        for (int i : array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
    }
