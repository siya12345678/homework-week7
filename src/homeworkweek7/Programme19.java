package homeworkweek7;
/*
Write a Java program to calculate the average value of array elements.
 */

import java.util.Scanner;

public class Programme19 {
    //instance method
    void elements(){

        System.out.println("How many numbers you want to enter ? ");//print statement
        Scanner sca = new Scanner(System.in);//scanner class//scanner class
        int a = sca.nextInt();
          sca.close();//scanner close
        int[] b = new int[a];
        int total = 0;
        for (int c=0; c<b.length; c++){
            System.out.println("Enter Elements No."+(c+1)+": ");//print statement
            b[c] = sca.nextInt();
        }sca.close();
        for(int c=0; c<b.length; c++){
            total = total+b[c];
        }
        double average = total / b.length;
        System.out.format("The average is : %.3f", average);//print statement
    }
    //main method
    public static void main(String[] args) {
        Programme19 vra = new Programme19();//object
        vra.elements();

    }

    }


