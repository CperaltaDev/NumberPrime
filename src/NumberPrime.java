import java.util.Scanner;

/**
 * Program that validates whether an integer is prime or not.
 */

public class NumberPrime {
	
	/** 
	 * method that receives the input and checks whether it belongs to a prime number or not
	 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     // Prompt user for input
        
        System.out.print("Enter a positive Integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " No Is Number Prime.");
        } else {
            boolean isPrime = isPrime(number);
            if (isPrime) {
                System.out.println(number + " Is Number Prime.");
            } else {
                System.out.println(number + " Not Is Nmuber Prime.");
            }
        }
        
        scanner.close();
    }
    
    /**
     * Checks if a number is prime.
     * @param number The number to check.
     * @return true if the number is prime, false otherwise.
     */

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


