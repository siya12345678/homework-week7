package homeworkweek7;
/*
Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
 */

import java.util.Scanner;


public class Programme16 {
    //instance method
    void check(){
        int num;
        Scanner sca = new Scanner(System.in);//scanner class
        System.out.println("Enter Any Number : ");//print statement
        num = sca.nextInt();
      sca.close();//scanner close
        if (num>0){
            System.out.println(num+  " is positive number ");//print statement
        }else if (num<0){
            System.out.println(num+  " is negative number ");//print statement
        }else
            System.out.println(num+" is neither positive nor negative");//print statement
    }
    //main method
    public static void main(String[] args) {
        Programme16 obj = new Programme16(); //obj
        obj.check();
    }
}
