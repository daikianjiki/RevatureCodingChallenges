package Week1;

/**
 * There's a great war between the even and odd numbers. Many numbers already lost their lives
 * in this war and it's your task to end this. You have to determine which group sums larger:
 * evens, or the odds. The larger group wins.
 * 
 * Create a function that takes an array of integers, sums the even and odd numbers separately,
 * then returns the difference between the sum of the even and odd numbers.
 * 
 * Examples:
 * warOfNumbers([2, 8, 7,5]) ➞ 2
 * 2 + 8 = 10
 * 7 + 5 = 12
 * 12 is larger than 10
 * So we return 12 - 10 = 2
 * 
 * warOfNumbers([12, 90, 75]) ➞ 27
 * warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168
 * 
 * Notes:
 * The given array contains only positive integers. 
 */

public class WarOfNumbers {

    public static void main(String[] args) {
        int[] warriors1= {5, 6, 7, 8};
        System.out.println("The aftermath from group 1 was: " + warOfNumbers(warriors1));

        int[] warriors2 = {10, 11, 12, 13};
        System.out.println("The aftermath in group 2 was: " + warOfNumbers(warriors2));
        
    }

    public static int warOfNumbers(int[] warriors) {

        int evenPower = 0;
        int oddPower = 0;
        int afterMath = 0;

        for (int i = 0; i < warriors.length; i++) {
            if (warriors[i] % 2 <= 0) {
                evenPower = evenPower + warriors[i];
            } else {
                oddPower = oddPower + warriors[i];
            }
        }

        System.out.println("Even's Power: " + evenPower);
        System.out.println("Odd's Power: " + oddPower);

        if(evenPower > oddPower) {
            afterMath = evenPower - oddPower;
        } else {
            afterMath = oddPower - evenPower;
        }
        return afterMath;
    }
}