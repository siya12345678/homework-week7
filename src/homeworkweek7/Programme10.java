package homeworkweek7;
/*
10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
 */

import java.util.Scanner;

public class Programme10 {

    //instance method
    void maths(){
        int x,y,c;
        char d;
        Scanner sc = new Scanner(System.in);//scanner class
        System.out.println("Enter any number : ");//print statement
        x =sc.nextInt();
        System.out.println("Enter any number : ");
        y =sc.nextInt();
        System.out.println("Enter any Operator (-, +, /, * ): ");
        d = sc.next().charAt(0);
        sc.close();//scanner close
//if else statement
        if (d == '-'){
            c = x - y;
            System.out.println("Result = " + c);
        }else if (d == '+'){
            c = x + y;
            System.out.println("Result = " + c);
        }else if (d == '/'){
            c = x / y;
            System.out.println("Result = " + c);
        }else if (d == '*'){
            c = x * y;
            System.out.println("Result = " + c);
        }else
            System.out.println("Wrong Operator");
    }
    //main method
    public static void main(String[] args) {
        Programme10 obj=new Programme10();//object
        obj.maths();
    }





}


