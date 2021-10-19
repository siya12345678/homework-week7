package homeworkweek7;
/*Write a Java program which input any number between 1 to 7 and it print The Days
name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
*/

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class Programme13 {
    static void no(){
        int day = 0;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Week contains 1 to 7 days");

        }
            }
            public static void main(String[] args) {
                Scanner day = new Scanner(System.in);
                System.out.println("Enter Day Number = ");
                String days = day.nextLine();
                day.close();//scanner close
                Programme13.no();
        }

    }

