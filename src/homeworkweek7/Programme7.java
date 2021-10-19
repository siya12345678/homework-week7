package homeworkweek7;
/*
Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;

public class Programme7 {

    static float sa,cr;
    float Commission;
public static void getCommission(float sa){
    //useing nestedifelse to get commission rate
    if ( sa>= 50000   ) {
        cr=sa*35/100;
    }else if (sa>=30000 && sa <50000){
        cr=sa*20/100;
    }else if (sa>=20000 && sa<30000){
        cr=sa*10/100;
    }else if (sa>=10000 && sa<20000){
        cr=sa*5/100;
    }else if (sa<10000){
        cr=sa*2/100;
    }
    System.out.println("Total commission is: "+cr);
}
    public static void main(String[] args) { //main method
        Scanner cs = new Scanner (System.in);//scanner class
        System.out.println("please enter Total Sales ");
        sa=cs.nextFloat(); //scanner object
        getCommission(sa);
        cs.close();//scanner close
    }
}
