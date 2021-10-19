package homeworkweek7;
/*
Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
 */
import java.util.Scanner;

public class Programme1 {
    //static method
    static void number(int num) {

        if (num % 2 == 0) {
            System.out.println("Number is even number");

        } else {
            System.out.println("Number is odd number");
        }
    }

    public static void main(String[] args) {  //main method
        System.out.println("Enter Number = ");//print statement
        Scanner sca = new Scanner(System.in);//scanner class
        int no= sca.nextInt();
        sca.close();
        Programme1.number(no);
    }
}