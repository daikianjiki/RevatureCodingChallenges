package Week4;

/**
 * Give an alphanumeric string made of digits and lower
 * case Latin characters only, find the sum of all the digit
 * characters in the string.
 * 
 * Input:
 *  - The first line of the input contains an integer T
 * denoting the number of test cases. Then T test cases follow.
 *  - Each test case is described with a single line
 * containing a string S, the alphanumeric string.
 * 
 * Output:
 *  - For each test case, output a single line containing
 * the sum of all the digit characters in that string.
 */

public class ProcessingAString {

    public static void main(String[] args) {
        String str = "ab1231da";
        System.out.println("The sum of the numbers in the string is: " + processingAString(str));

    }
    public static int processingAString(String str) {
        int sumOfDigits = 0;
        for(int i = 0; i < str.length(); i++) {
            if( Character.isDigit(str.charAt(i))) {
                sumOfDigits += Character.getNumericValue(str.charAt(i));
            }
        }
        return sumOfDigits;
    }
    
    
}
