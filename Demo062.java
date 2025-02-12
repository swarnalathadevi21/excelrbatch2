public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 10;
        System.out.println("Prime numbers between 1 and " + limit + " are:");

        for (int i = 2; i <= limit; i++) {  // Start from 2 as 1 is not a prime number
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {  // Check divisibility up to half of i
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}