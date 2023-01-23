import java.util.Scanner;

/*
*@author 
 This program was created by Cole Stanley for CEN 4802C.
 This program outputs the Fibonacci number at the user-specified position. 
*/

//TODO: Implement JavaDoc-style formatting.

public class Fibo {
    public static void main(String[] args) {
        Fibo newFibo = new Fibo();
        System.out.print("\nGo ahead and enter the numerical position you want the Fibonacci number for: ");
        Scanner userInput = new Scanner(System.in);
        /*
         * @param long n - The position desired in the Fibonacci sequence.
         */
        long n = Long.parseLong(userInput.nextLine());
        System.out.println("\nThe Fibonacci number in position " + n + " is " + newFibo.FiboRecursion(n) + "!\n");
    }

    public long FiboRecursion(long n) {
        if (n == 0 || n == 1)
            /*
             * @return long n - Returns the value at the desired position in the Fibonacci
             * sequence.
             */
            return n;
        return FiboRecursion(n - 1) + FiboRecursion(n - 2);
    }
}