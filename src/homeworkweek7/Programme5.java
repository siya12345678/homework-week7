package homeworkweek7;
/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip                  |
|______________________________|
| Employee Id : 2564           |
| Employee Name : Jay          |
|______________________________|
| Basic Salary : 25000.0       |
| HRA 10% : 2500.0             |
| TA 8% : 2250.0               |
| DA 9% : 2000.0               |
| PF - 20& : 5000.0            |
|______________________________|
| Gross Salary : 26750.0       |
|===========================   |

 */

import java.util.Scanner;

public class Programme5 {
    public static void main(String args[]) {  //main method
        Scanner in = new Scanner(System.in);  //scanner class
        System.out.print("Enter Employee Id:");
        int empid=in.nextInt();  //scanner object
        System.out.print("Enter Employee Name: ");
        String  empname=in.next();
        System.out.print("Enter Basic Salary:");
        double bs = in.nextDouble();
       in.close();//scanner close
        double hra = 0.10 * bs;
        double ta  = 0.09 *bs;
        double da = 0.08 * bs;
        double pf = 0.20 * bs;

        double gs = bs+ da + ta;
        double gs1=gs-pf;

        System.out.println("|----------------------------------|");
        System.out.println("|           Salary Slip            |");
        System.out.println("|----------------------------------|");
        System.out.println("| Employee Id       : "+empid+"    |");
        System.out.println("| Employee Name     : "+empname+"  |");
        System.out.println("|----------------------------------|");
        System.out.println("| Basic Salary      : "+bs+"       |");
        System.out.println("| HRA 10%           : "+hra+"      |");
        System.out.println("| TA  8%            : "+ta+"       |");
        System.out.println("| DA  9%            : "+da+"       |");
        System.out.println("| PF _20&           : "+pf+"       |");
        System.out.println("|----------------------------------|");
        System.out.println("| Gross Salary      : "+gs1+"      |");
        System.out.println("|==================================|");


    }


}