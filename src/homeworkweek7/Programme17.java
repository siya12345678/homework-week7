package homeworkweek7;
/*
Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Programme17 {
    public static void main(String[] args) {

            //manual input of values in array1 and array2
            int[] my_array1 = {
                    56,20,30,10,12,5,787,55,
                    33,333,0,2,25,75,69,33};

            String[] my_array2 = {
                    "London",
                    "Ascot",
                    "Oxford",
                    "Croydon",
                    "Wembley",
            };

            //Arrays to short in order

            System.out.println("Original numeric array : " + Arrays.toString(my_array1));
            Arrays.sort(my_array1);
            System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));

            System.out.println("Original string array : " + Arrays.toString(my_array2));
            Arrays.sort(my_array2);
            System.out.println("Sorted string array : " + Arrays.toString(my_array2));

        }
    }


