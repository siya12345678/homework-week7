package homeworkweek7;
/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Programme8 {
    //static method
    public static void city(char c){

        ArrayList<String> alist = new ArrayList<String>();
        //   ArrayList<String> alist2=new ArrayList<String>();
        alist.add("Ahmedabad");
        alist.add("Bavnagar");
        alist.add("Changa");
        alist.add("Dantali");
        alist.add("Enchur");
        alist.add("Faridabad");

      // nestedifelse getting city name
        if( c=='a')
        {
            System.out.println(alist.get(0));
        }else if(c=='b')
        {
            System.out.println(alist.get(1));
        }else if(c=='c')
        {
            System.out.println(alist.get(2));
        }else if(c=='d')
        {
            System.out.println(alist.get(3));
        }else if(c=='e')
        {
            System.out.println(alist.get(4));
        }else if(c=='f')
        {
            System.out.println(alist.get(5));
        }else
        {
            System.out.println("invalid");
        }

    }
    public static void main(String[] args) { //main method
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Character");
        char c = in.next().charAt(0);
        city(c);
        in.close();//scanner close

    }

}
