/**
 *  Setup: The code is setup to take integer input from the user. The input will be
 *  added to an ArrayList called "values" until the user enters -1.
 * 
 *  Your task:
 *  After the numbers have been collected, write code that will:
 *    1. Take an integer input from the 
 *    2. If the int passed in is 0, you should print out all the even numbers from values. 
 *       If the int passed in is 1, you should print out all the odd numbers from values. 
 *       If the number is neither 0 nor 1 then do nothing.
 *       ****************************************************
 *       For example:
 *       If the ArrayList contains [5, 4, 3, 2] and the user enters 0 for #1, you should
 *       print:
 *       4
 *       2 
 * 
 *       Why: because 4 and 2 are both even. Nothing else should print
 *       ****************************************************
 *       If the ArrayList contains [5, 4, 3, 2] and the user enters 1 for #1, you should
 *       print:
 *       5
 *       3 
 *       
 *       Why: because 5 and 3 are both even. Nothing else should print.
 *       ****************************************************
 *       If the ArrayList contains [5, 4, 3, 2] and the user enters anything other than  
 *       for #1, you should print nothing.
 * 
 */


import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();


        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            values.add(input);
        }

        System.out.println("");
        //Write your code below here

        

    }
}
