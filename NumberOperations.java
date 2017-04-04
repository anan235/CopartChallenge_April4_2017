/**
 * Created by Lakshmi on 4/4/2017.
 * Problem: Convert String to Integer (Simple) (10 points)
 */
public class NumberOperations {
    public static void main(String[] args) {

        // Set input from another function or from arguments
        String input = "431";

        // Call getInteger function
        int result = getInteger(input);
        System.out.println(result);
    }

    // Build integer from string
    static int getInteger(String input){
        // String to map from char to integer through string index value
        String numMap = "0123456789";

        // Initializations
        int result = 0;
        int size = input.length();

        // Loop through input string
        for (int i = size; i > 0; i -= 1) {

            // Get char that has to be converted
            char numberC = input.charAt(size - i);
            // Convert char to int
            int numberI = numMap.indexOf(numberC);

            // Assign correct decimal place before adding to result
            int factor = (int)Math.pow(10, i - 1);
            result += factor * numberI;
        }
        return result;
    }
}
