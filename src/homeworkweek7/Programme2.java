package homeworkweek7;
/*
Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */

import java.util.Scanner;

public class Programme2 {
    //instance method
    public void year(int yr) {
        if ((yr % 4 == 0) && (yr % 100 != 0) || (yr % 400 == 0)) {
            System.out.println(yr + " is a Leap Year");//print statement
        } else {
            System.out.println(yr + " is a not Leap Year");//print statement
        }
    }

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner class
        System.out.println("Enter Year");//print statement
        int a = scanner.nextInt();//scanner object
        scanner.close();//scanner close
        Programme2 jin = new Programme2();
        jin.year(a);

    }
}

